public class Flower {
    private final String flowerColor;
    private final String originCountry;
    private float price;
    private final int lifeSpan;
    private final String flowerName;

    public Flower(String name, String color, String originCountry, float price) {
        this (name,color,originCountry,price,1);
    }



    public Flower(String name, String color, String originCountry, float price, int lifeSpan) {
        if (name == null || name == "") {
            this.flowerName = "Неизвестный цветок";
        } else {
            this.flowerName = name;
        }

        if (color == null || color == "") {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = color;
        }
        if (originCountry == null || originCountry == "") {
            this.originCountry = "Молдова";
        } else {
            this.originCountry = originCountry;
        }

        if (price <= 0) {
            this.price = 1;
        } else {
            this.price = price;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public float getPrice() {
        return price;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", price=" + price +
                ", lifeSpan=" + lifeSpan +
                ", flowerName='" + flowerName + '\'' +
                '}';
    }
}