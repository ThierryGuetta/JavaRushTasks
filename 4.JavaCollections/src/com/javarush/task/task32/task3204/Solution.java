package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* 
Генератор паролей
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            baos.write(newFilledPass());
        } catch (IOException e) {
            System.out.println("Фигня переделывай");
        }
        return baos;

    }

    public static byte[] newFilledPass() {
        byte[] password = new byte[8];

        password[0] = (byte) (48 + (int) (Math.random() * 10));
        password[1] = (byte) (97 + (int) (Math.random() * 26));
        password[2] = (byte) (65 + (int) (Math.random() * 26));

        for (int i = 3; i < password.length; i++) {
            switch (1 + (int) (Math.random() * 3)) {
                case 1: {
                    password[i] = (byte) (48 + (int) (Math.random() * 10));
                    break;
                }
                case 2: {
                    password[i] = (byte) (97 + (int) (Math.random() * 26));
                    break;
                }
                case 3: {
                    password[i] = (byte) (65 + (int) (Math.random() * 26));
                    break;
                }
            }
        }
        return password;
    }
}

