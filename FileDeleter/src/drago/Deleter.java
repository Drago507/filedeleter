package drago;

import java.io.*;

public class Deleter {

    public static void deleteFiles(String directory, String extension) {
        ExtensionFilter filter = new ExtensionFilter(extension);
        File dir = new File(directory);

        String[] list = dir.list(filter);
        File file;
        if (list.length == 0) return;

        for (int i = 0; i < list.length; i++) {
            //file = new File(directory + list[i]);
            file = new File(directory, list[i]);
            System.out.println(file + "  deleted : " + file.delete());
        }
    }
}
