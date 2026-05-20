import os
import re


def clean_problem_name(filename):
    name = filename.replace(".java", "")
    cleaned = re.sub(r"(?<!^)(?=[A-Z])", " ", name)

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
        "Sqrt X": "Sqrt(x)",
    }
    return special_cases.get(cleaned, cleaned)


def count_java_files(folder_path):
    if not os.path.exists(folder_path):
        return 0
    return len([f for f in os.listdir(folder_path) if f.endswith(".java")])


def generate_markdown_table(folder_path):
    if not os.path.exists(folder_path):
        return ""

    files = sorted([f for f in os.listdir(folder_path) if f.endswith(".java")])

    if not files:
        return "*No problems solved in this category yet.*\n"

    rows = ["| Problem Name | Code |", "|---|---|"]
    for file in files:
        prob_name = clean_problem_name(file)
        path = f"{folder_path}/{file}".replace("\\", "/")
        rows.append(f"| {prob_name} | [{file}]({path}) |")

    return "\n".join(rows) + "\n"


def update_readme():
    easy_table  = generate_markdown_table("src/Easy")
    medium_table = generate_markdown_table("src/Medium")
    hard_table  = generate_markdown_table("src/Hard")

    easy_count   = count_java_files("src/Easy")
    medium_count = count_java_files("src/Medium")
    hard_count   = count_java_files("src/Hard")
    total_count  = easy_count + medium_count + hard_count

    # Build README sections separately to avoid f-string / markdown conflicts
    header = "# Leetcode Solutions 🏆"

    intro = (
        "Welcome to my Leetcode solutions repository! "
        "This is where I document my journey through solving algorithmic challenges on Leetcode. "
        "All solutions are implemented in **Java**."
    )

    stats_table = "\n".join([
        "## 📊 Statistics",
        "",
        "| Difficulty | Number of Problems |",
        "|------------|--------------------|",
        f"| Easy       | {easy_count}       |",
        f"| Medium     | {medium_count}     |",
        f"| Hard       | {hard_count}       |",
        "",
        f"Total Problems Solved: **{total_count}**",
    ])

    how_to_use = "\n".join([
        "## 📌 How to Use",
        "",
        "1. Clone the repository:",
        "",
        "```bash",
        "git clone https://github.com/Kdz198/Leetcode.git",
        "```",
        "",
        "2. Navigate to the respective folder (`src/Easy`, `src/Medium`, `src/Hard`) "
        "to view the solution for a specific problem.",
        "3. Compile and run the Java files to test the solutions.",
    ])

    contributing = "\n".join([
        "## 💡 Contributing",
        "",
        "Contributions are welcome! "
        "If you have a more optimal solution or find any issues, "
        "feel free to open a pull request or an issue.",
    ])

    copyright_section = "## 📜 Copyright\n\nCopyright © 2026 [Kdz198]."

    sections = [
        header,
        intro,
        "---",
        stats_table,
        "---",
        "## Easy Problems",
        easy_table,
        "---",
        "## Medium Problems",
        medium_table,
        "---",
        "## Hard Problems",
        hard_table,
        "---",
        how_to_use,
        "---",
        contributing,
        "---",
        copyright_section,
    ]

    content = "\n\n".join(sections) + "\n"

    with open("README.md", "w", encoding="utf-8") as f:
        f.write(content)

    print(f"🎉 README.md updated successfully! Total problems: {total_count}")


if __name__ == "__main__":
    update_readme()