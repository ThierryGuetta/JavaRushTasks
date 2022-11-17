package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream aos;

    QuestionFileOutputStream(AmigoOutputStream aos) {
        this.aos = aos;
    }

    @Override
    public void flush() throws IOException {
        aos.flush();
    }

    @Override
    public void write(int b) throws IOException {
        aos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        aos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        aos.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("Д")) aos.close();
    }
}

