package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String zipPath = args[1];
        String filePath = args[0];

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipPath));
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath, true))) {

            ArrayList<ZipEntry> zipEntries = new ArrayList<>();

            ZipEntry zipEntry;
            while ((zipEntry = zis.getNextEntry()) != null) {
                if (!zipEntry.getName().equals("new/" + Paths.get(filePath).getFileName())) {
                    System.out.println(zipEntry.getName());
                    zipEntries.add(zipEntry);
                }
            }
            zis.closeEntry();
            zipEntries.add(new ZipEntry("new/" + Paths.get(filePath).getFileName()));

            for (ZipEntry z : zipEntries) {
                zos.putNextEntry(z);
            }
            zos.closeEntry();
        }
    }
}
