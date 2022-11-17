package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        TableInterface e;

        TableInterfaceWrapper(TableInterface e){
            this.e = e;
        }

        @Override
        public void setModel(List rows) {
            e.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return e.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            e.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}