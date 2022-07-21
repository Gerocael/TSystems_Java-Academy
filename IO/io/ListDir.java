package io;

import java.io.File;

public class ListDir {
    public static void main(String[] args) {
        File dir = new File(".");

        if (dir.isDirectory()) {
            System.out.println("Listing of: " + dir.getAbsolutePath());

            //List directory
            for (String fileName : dir.list()) {
                System.out.println("  " + fileName);
            }
        } else {
            System.err.printf("File %s is not directory", dir);
        }
    }

//    private static void listDir(String path) {
//        System.out.println(path);
//        File dir = new File(path);
//        if(dir.isDirectory()){
//            for(String filename : dir.list()){
//                System.out.println(filename + path);
//            }
//        }
//    }
}
