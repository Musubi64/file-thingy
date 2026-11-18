# Recursion filesystem warmup

Complete `printTextFiles(String folder)` in `PrintTextFiles.java`.
Print each lowercase `.txt` file's full path once. Include every subfolder.
Use recursion. Keep the supplied API unchanged. No arrays are needed.

Select **Use this template > Open in a codespace**. Edit the method and save.
Run from the repository's top folder:

```sh
javac FileSystem.java PrintTextFiles.java
java PrintTextFiles | tee output.txt
```

Record the first two and last two paths from `output.txt`. Estimate the total number of paths printed.

| API call | Result |
|---|---|
| `FileSystem.root()` | Top folder's path |
| `FileSystem.count(folder)` | Number of immediate items |
| `FileSystem.item(folder, i)` | One item's path, starting at item 0 |
| `FileSystem.isFolder(path)` | Whether the item is a folder |
| `FileSystem.isTextFile(path)` | Whether the item is a lowercase `.txt` file |

Items use alphabetical name order. Empty folders have count 0.
The handout shows a partial view of this same filesystem. `...` marks omitted entries.

Record your run and explanation on the handout. Submit only the handout.
No code upload, new repository, commit or push is required.
