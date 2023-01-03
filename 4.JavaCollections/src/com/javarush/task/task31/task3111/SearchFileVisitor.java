package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName = null;
    private String partOfContent = null;
    private int minSize = -1;
    private int maxSize = -1;
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return this.foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        if (this.partOfName != null) {
            if (!file.getFileName().toString().contains(this.partOfName)) {
                return FileVisitResult.CONTINUE;
            }
        }

        if (this.minSize != -1) {
            if (this.minSize > content.length) {
                return FileVisitResult.CONTINUE;
            }
        }

        if (this.maxSize != -1) {
            if (this.maxSize < content.length) {
                return FileVisitResult.CONTINUE;
            }
        }

        if (this.partOfContent != null) {
            boolean check = false;
            List<String> list = Files.readAllLines(file);
            for (String s : list) {
                if (s.contains(this.partOfContent)) {
                    check = true;
                    break;
                }
            }
            if (!check) return FileVisitResult.CONTINUE;
        }

        foundFiles.add(file);
        return super.visitFile(file, attrs);
    }
}
