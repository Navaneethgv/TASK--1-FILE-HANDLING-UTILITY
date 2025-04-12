# TASK--1-FILE-HANDLING-UTILITY

*Company*:Codtech It solutions

*Intern Id*:CT04WE92

*Domain*:Java

*Duration*:4 weeks

*Mentor*:NEELA SANTHOSH

# Java File Handling Internship Tasks

A collection of Java programs demonstrating basic file operations (create, read, write, append, modify, and check properties).

## 📋 Files Overview

### 1. FileCreation.java
- **Purpose**: Creates a new file (`Files.txt`) if it doesn't exist.
- **Key Methods**: `File.createNewFile()`
- **Output**: Confirms file creation or detects existing file.

### 2. Write.java
- **Purpose**: Writes text (`"welcome to the java programming"`) to `Files.txt`.
- **Key Classes**: `FileWriter`
- **Output**: Success message or error if writing fails.

### 3. append.java
- **Purpose**: Appends new text (`"\nCurrently Learning a fileHandling"`) to the file.
- **Key Feature**: Uses `FileWriter` with `append=true` flag.
- **Output**: Success message or append error.

### 4. read.java
- **Purpose**: Reads and prints the contents of `Files.txt`.
- **Key Classes**: `Scanner`, `File`
- **Output**: File contents or read error.

### 5. ModifyTextFile.java
- **Purpose**: Replaces all occurrences of `"programming"` with `"Language"`.
- **Key Process**:
  1. Reads file line-by-line using `BufferedReader`
  2. Performs string replacement
  3. Writes modified content back using `BufferedWriter`
- **Output**: Success message or modification errors.

### 6. FileProperties.java
- **Purpose**: Checks and displays file metadata.
- **Key Methods**:
  - `file.exists()`
  - `file.getName()`
  - `file.getPath()`
  - `file.canRead()`
  - `file.canWrite()`
- **Output**: File properties or "File does not exist".

### 7. Files.txt
- Sample text file that gets modified by the programs.

## 🚀 How to Use

1. **Compile & Run**:
   ```bash
   javac <filename>.java && java <filename>

   *output*:

   ![Image](https://github.com/user-attachments/assets/4d78fc3e-0aea-4977-9d05-ec6dd9a7bbec)
