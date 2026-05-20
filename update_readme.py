import os
import re

def clean_problem_name(filename):
    # Xóa đuôi .java
    name = filename.replace('.java', '')
    # Tự động thêm khoảng trắng giữa các từ viết hoa (CamelCase -> Clean Words)
    # Ví dụ: TwoSum -> Two Sum, FindFirstAndLastPosition -> Find First And Last Position
    cleaned = re.sub(r'(?<!^)(?=[A-Z])', ' ', name)

    # Một số trường hợp đặc biệt có thể tối ưu thủ công nếu muốn
    special_cases = {
        "Buy And Sell Stock": "Best Time to Buy and Sell Stock",
        "Index Of First Occurence": "Index of First Occurrence",
        "Length Of Last Word": "Length of Last Word",
        "Remove Duplicated Sorted Array": "Remove Duplicates from Sorted Array",
        "Reverse Vowels Of A String": "Reverse Vowels Of A String",
        "Intersection Of Two Arrays": "Intersection Of Two Arrays",
        "Intersection Of Two Arrays I I": "Intersection Of Two Arrays II",
        "Reverse Words In A String I I I": "Reverse Words In A String III",
        "Maximum Product Of Three Numbers": "Maximum Product Of Three Numbers",
        "Largest Number At Least Twice of Others": "Largest Number At Least Twice of Others",
        "Pow Xn": "Pow(x, n)",
        "Sqrt X": "Sqrt(x)"
    }
    return special_cases.get(cleaned, cleaned)

def generate_markdown_table(folder_path):
    if not os.path.exists(folder_path):
        return ""

    # Lấy danh sách các file .java và sắp xếp theo thứ tự alphabet
    files = sorted([f for f in os.listdir(folder_path) if f.endswith('.java')])

    if not files:
        return "| Problem Name | Code |\n|---|---|\n"

    table_lines = [
        "| Problem Name | Code |",
        "|---|---|"
    ]

    for file in files:
        prob_name = clean_problem_name(file)
        # Tạo đường dẫn tương đối đúng chuẩn Markdown (dùng dấu / thay vì \\ trên Windows)
        relative_path = f"{folder_path}/{file}".replace("\\", "/")
        table_lines.append(f"| {prob_name} | [{file}]({relative_path}) |")

    return "\n".join(table_lines) + "\n"

def update_readme():
    readme_path = "README.md"
    if not os.path.exists(readme_path):
        print("Không tìm thấy file README.md!")
        return

    # Quét các thư mục bài tập
    easy_table = generate_markdown_table("src/Easy")
    medium_table = generate_markdown_table("src/Medium")
    hard_table = generate_markdown_table("src/Hard")

    # Đếm số lượng bài
    easy_count = len([f for f in os.listdir("src/Easy") if f.endswith('.java')]) if os.path.exists("src/Easy") else 0
    medium_count = len([f for f in os.listdir("src/Medium") if f.endswith('.java')]) if os.path.exists("src/Medium") else 0
    hard_count = len([f for f in os.listdir("src/Hard") if f.endswith('.java')]) if os.path.exists("src/Hard") else 0
    total_count = easy_count + medium_count + hard_count

    # Tạo bảng thống kê mới
    stats_table = f"""| Difficulty | Number of Problems |
|------------|--------------------|
| Easy       | {easy_count}                 |
| Medium     | {medium_count}                 |
| Hard       | {hard_count}                 |

Total Problems Solved: **{total_count}**"""

    # Đọc nội dung README hiện tại
    with open(readme_path, "r", encoding="utf-8") as f:
        content = f.read()

    # Hàm helper để thay thế nội dung giữa các cặp thẻ bằng regex
    def replace_section(full_text, marker_name, new_content):
        pattern = rf"(<!-- {marker_name}:START -->)[\s\S]*?(<!-- {marker_name}:END -->)"
        # Đảm bảo giữ lại các tag comment cố định ở hai đầu
        replacement = rf"\1\n{new_content}\n\2"
        return re.sub(pattern, replacement, full_text)

    # Cập nhật từng section một
    content = replace_section(content, "STATS", stats_table)
    content = replace_section(content, "EASY", easy_table)
    content = replace_section(content, "MEDIUM", medium_table)
    content = replace_section(content, "HARD", hard_table)

    # Ghi ngược lại vào file README.md
    with open(readme_path, "w", encoding="utf-8") as f:
        f.write(content)

    print(f"🎉 Đã tự động cập nhật README.md thành công! Tổng số bài: {total_count}")

if __name__ == "__main__":
    update_readme()