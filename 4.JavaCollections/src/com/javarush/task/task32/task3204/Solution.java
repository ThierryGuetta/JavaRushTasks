package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        //ByteArrayOutputStream password = getPassword();
        //System.out.println(password.toString());
        System.out.println(getPassword());
    }

    public static ByteArrayOutputStream getPassword() throws IOException {
        //num 48-57
        //lower case 97-122
        //upper case 65-90

        byte[] password = new byte[8];

        fillPass(password);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(password);
        return baos;

    }

    static void fillPass(byte[] password) {

        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;

        for (int i = 0; i < password.length; i++) {
            int rnd = 1 + (int) (Math.random() * 3);
            switch (rnd) {
                case 1: {
                    password[i] = (byte) (48 + (int) (Math.random() * 10));
                    check1 = true;
                    break;
                }
                case 2: {
                    password[i] = (byte) (97 + (int) (Math.random() * 26));
                    check2 = true;
                    break;
                }
                case 3: {
                    password[i] = (byte) (65 + (int) (Math.random() * 26));
                    check3 = true;
                    break;
                }
            }
        }
        if (!check1 || !check2 || !check3) {
            fillPass(password);
        }
    }
}

