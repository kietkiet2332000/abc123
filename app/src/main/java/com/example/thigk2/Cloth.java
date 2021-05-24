package com.example.thigk2;

public class Cloth {
    private int anh;
    private  String name;
    private int price;
    

    public Cloth(int anh, String name, int price) {
        this.anh = anh;
        this.name = name;
        this.price = price;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
