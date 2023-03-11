package controllers;

public class Product {
    final String base = "https://therichpost.com/testjsonapi/product/";
     int min = 1;
     int max = 9;
    final int randNum = (int) (Math.random() * ++max) + min;
    public String generateURL() {
        return base + randNum;
    }

}
