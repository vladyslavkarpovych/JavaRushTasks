package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface aTI;

        public TableInterfaceWrapper(TableInterface aTableInterface) {
            this.aTI = aTableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            aTI.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return aTI.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            aTI.setHeaderText(newHeaderText);
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