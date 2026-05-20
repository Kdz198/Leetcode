import os
import re
import subprocess


# ─────────────────────────────────────────────
# Helpers
# ─────────────────────────────────────────────

SPECIAL_CASES = {
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


def clean_problem_name(filename: str) -> str:
    name = filename.replace(".java", "")
    cleaned = re.sub(r"(?<!^)(?=[A-Z])", " ", name)
    return SPECIAL_CASES.get(cleaned, cleaned)


def get_file_creation_date(filepath: str) -> str:
    """Return the date (YYYY-MM-DD) the file was first committed to git."""
    try:
        result = subprocess.run(
            ["git", "log", "--follow", "--format=%as", "--diff-filter=A", "--", filepath],
            capture_output=True, text=True, check=True
        )
        lines = result.stdout.strip().splitlines()
        return lines[-1] if lines else "—"
    except Exception:
        return "—"


def count_java_files(folder: str) -> int:
    if not os.path.exists(folder):
        return 0
    return len([f for f in os.listdir(folder) if f.endswith(".java")])


def generate_table(folder: str) -> str:
    if not os.path.exists(folder):
        return "*No problems solved in this category yet.*\n"

    files = sorted([f for f in os.listdir(folder) if f.endswith(".java")])
    if not files:
        return "*No problems solved in this category yet.*\n"

    rows = [
        "| # | Problem | Date Solved | Solution |",
        "|:-:|---------|:-----------:|:--------:|",
    ]
    for i, file in enumerate(files, start=1):
        name = clean_problem_name(file)
        path = f"{folder}/{file}".replace("\\", "/")
        date = get_file_creation_date(path)
        rows.append(f"| {i} | {name} | `{date}` | [Java]({path}) |")

    return "\n".join(rows) + "\n"


# ─────────────────────────────────────────────
# README builder
# ─────────────────────────────────────────────

def update_readme():
    easy_table   = generate_table("src/Easy")
    medium_table = generate_table("src/Medium")
    hard_table   = generate_table("src/Hard")

    easy_count   = count_java_files("src/Easy")
    medium_count = count_java_files("src/Medium")
    hard_count   = count_java_files("src/Hard")
    total        = easy_count + medium_count + hard_count

    filled = min(total // 10, 20)
    bar    = "█" * filled + "░" * (20 - filled)

    stats_table = "\n".join([
        "| 🟢 Easy | 🟡 Medium | 🔴 Hard | 🏁 Total |",
        "|:-------:|:---------:|:-------:|:--------:|",
        f"| {easy_count} | {medium_count} | {hard_count} | **{total}** |",
    ])

    progress_block = f"```\n{bar}  {total} solved\n```"

    getting_started = "\n".join([
        "## 🚀 Getting Started",
        "",
        "```bash",
        "# Clone the repo",
        "git clone https://github.com/Kdz198/Leetcode.git",
        "cd Leetcode",
        "```",
        "",
        "Navigate to `src/Easy`, `src/Medium`, or `src/Hard` and open any `.java` file.",
        "Each file is self-contained and can be compiled with:",
        "",
        "```bash",
        "javac src/Easy/TwoSum.java",
        "```",
    ])

    sections = [
        "# 🧩 LeetCode Solutions",
        "> Documenting my journey through algorithmic problem-solving.\n> All solutions are written in **Java**.",
        "---",
        "## 📊 Progress",
        progress_block,
        stats_table,
        "---",
        "## 🟢 Easy",
        easy_table,
        "---",
        "## 🟡 Medium",
        medium_table,
        "---",
        "## 🔴 Hard",
        hard_table,
        "---",
        getting_started,
        "---",
        "## 🤝 Contributing\n\nFound a better solution? Open a PR or raise an issue — all ideas welcome!",
        "---",
        '<div align="center">\n\nMade with ☕ by [Kdz198](https://github.com/Kdz198) · Auto-updated by GitHub Actions 🤖\n\n</div>',
    ]

    content = "\n\n".join(sections) + "\n"

    with open("README.md", "w", encoding="utf-8") as f:
        f.write(content)

    print(f"✅ README.md updated! Total: {total} problems ({easy_count}E / {medium_count}M / {hard_count}H)")


if __name__ == "__main__":
    update_readme()