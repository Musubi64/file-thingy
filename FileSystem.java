import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

/** Supplied support code. Use the five public methods. */
public class FileSystem {
    /** The path of the toy filesystem's top folder. */
    public static String root() {
        return "toy-filesystem/home";
    }

    /** Number of immediate items in folder. Does not count nested items. */
    public static int count(String folder) {
        return itemsIn(folder).size();
    }

    /** One immediate item's path. Valid numbers: 0 through count(folder) - 1. */
    public static String item(String folder, int number) {
        return itemsIn(folder).get(number).getPath().replace(File.separatorChar, '/');
    }

    public static boolean isFolder(String path) {
        return new File(path).isDirectory();
    }

    /** True only for a regular file whose name ends with lowercase .txt. */
    public static boolean isTextFile(String path) {
        return new File(path).isFile() && path.endsWith(".txt");
    }

    // Implementation below this line is supplied. Students do not need arrays
    // or collections. Each item() call above returns ONE String.
    // Items use alphabetical name order. Keep the tree unchanged while running.
    private static ArrayList<File> itemsIn(String folder) {
        File directory = new File(folder);
        File[] entries = directory.listFiles();
        if (entries == null) {
            throw new IllegalArgumentException("Cannot open folder: " + folder
                    + ". Run from the repository's top folder.");
        }
        ArrayList<File> items = new ArrayList<File>();
        for (File entry : entries) {
            // Git needs this placeholder to preserve an empty folder.
            if (!entry.getName().equals(".gitkeep")) {
                items.add(entry);
            }
        }
        items.sort(Comparator.comparing(File::getName));
        return items;
    }
}
