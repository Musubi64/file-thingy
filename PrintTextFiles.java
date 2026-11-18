public class PrintTextFiles {
    // Complete this method. Print the path of every .txt file in folder
    // and all its subfolders. Use recursion. Print one path per line.
    public static void printTextFiles(String folder) {
        // This starter visits only the immediate items in ONE folder.
        for (int i = 0; i < FileSystem.count(folder); i++) {
            String path = FileSystem.item(folder, i);
            System.out.println(path);
        }
    }

    // Supplied launch code. You do not need to change or study String[] today.
    public static void main(String[] args) {
        printTextFiles(FileSystem.root());
    }
}
