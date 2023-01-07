package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File result = new File(args[0]);

        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList(args).subList(1, args.length));
        Collections.sort(strings);

        ArrayList<FileInputStream> fis = new ArrayList<>();
        for(String s: strings){
            fis.add(new FileInputStream(s));
        }

        try(ZipInputStream zis = new ZipInputStream(new SequenceInputStream(Collections.enumeration(fis)))){
            while (true) {
                ZipEntry entry = zis.getNextEntry();
                if (entry == null) break;

                try (OutputStream os = new BufferedOutputStream(new FileOutputStream(result))) {
                    final int bufferSize = 1024;
                    byte[] buffer = new byte[bufferSize];
                    for (int readBytes; (readBytes = zis.read(buffer, 0, bufferSize)) > -1; ) {
                        os.write(buffer, 0, readBytes);
                    }
                    os.flush();
                }
            }
        }
    }
}