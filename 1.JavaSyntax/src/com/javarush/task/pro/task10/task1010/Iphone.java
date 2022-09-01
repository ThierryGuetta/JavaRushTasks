package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Iphone)) return false;
        Iphone iphone = (Iphone) obj;
        if (!Objects.equals(this.model, iphone.model)) return false;
        if (!Objects.equals(this.color, iphone.color)) return false;
        if (this.price != iphone.price) return false;
        else return true;
    }

    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + price;
        return result;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
        System.out.println(iphone1.hashCode() == iphone2.hashCode());
    }
}
