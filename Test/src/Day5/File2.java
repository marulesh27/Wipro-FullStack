package Day5;

import java.io.File;
import java.io.FilenameFilter;

public class File2 {
    public static void main(String a[]) {
        File file = new File("C:\\Users\\Hp\\Documents");

        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".py")) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        if (list != null) {
            for (String f : list) {
                System.out.println(f);
            }
        } else {
            System.out.println("Directory not found or cannot be accessed.");
        }
    }
}

