package org.core_java.constructorDemo;

public class Color {
    int colorId;
    String color;
    String colorShade;

    Color() {
    }

    Color(int id, String color) {
        this.colorId = id;
        this.color = color;
    }

    Color(int id, String color, String shade) {
        this.colorId = id;
        this.color = color;
        this.colorShade = shade;
    }

    public void getColorDetails() {
        System.out.println("Color id:" + colorId + ",Color Name:" + color + ",Color Shade:" + colorShade);
    }

    public static void main(String[] args) {
        Color c = new Color();
        c.getColorDetails();
        c = new Color(10, "blue");
        c.getColorDetails();
        c = new Color(10, "Red", "Dark red");
        c.getColorDetails();
    }
}
