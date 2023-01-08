package com.javarush.task.task31.task3107;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Null Object Pattern
*/

public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            Path path = Paths.get(pathToFile);
            boolean hidden = Files.isHidden(path);
            boolean executable = Files.isExecutable(path);
            boolean directory = Files.isDirectory(path);
            boolean writable = Files.isWritable(path);

            fileData = new ConcreteFileData(hidden, executable, directory, writable);
        } catch (IOException n) {
            fileData = new NullFileData(n);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
