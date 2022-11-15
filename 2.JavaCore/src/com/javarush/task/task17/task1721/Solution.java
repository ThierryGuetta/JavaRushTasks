package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        Solution s = new Solution();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br2 = new BufferedReader(new FileReader(br.readLine()));
            BufferedReader br3 = new BufferedReader(new FileReader(br.readLine()));

            while (br2.ready()) {
                allLines.add(br2.readLine());
            }
            while (br3.ready()) {
                forRemoveLines.add(br3.readLine());
            }
            br.close();
            br2.close();
            br3.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        s.joinData();
    }


    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

