package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String zip = (args[1]);
        String file = (args[0]);

        HashMap<String, ByteArrayOutputStream> hashMap = new HashMap<>();

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zip))) {

            ZipEntry zipEntry;
            while ((zipEntry = zis.getNextEntry()) != null) {
                if (!zipEntry.getName().endsWith(Paths.get(file).getFileName().toString())) {
                    byte[] bytes = new byte[1024];
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    int c;
                    while((c = zis.read(bytes)) > 0){
                        baos.write(bytes,0, c);
                    }
                    hashMap.put(zipEntry.getName(), baos);
                    zis.closeEntry();
                }
            }

            try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zip))) {
                for (Map.Entry<String, ByteArrayOutputStream> entry : hashMap.entrySet()) {
                    zos.putNextEntry(new ZipEntry(entry.getKey()));
                    zos.write(entry.getValue().toByteArray());
                    zos.closeEntry();
                }
                ZipEntry zipEntry1 = new ZipEntry("new/" + Paths.get(file).getFileName().toString());
                zos.putNextEntry(zipEntry1);
                Files.copy(Paths.get(file), zos);
                zos.closeEntry();
            }
        }
    }
}