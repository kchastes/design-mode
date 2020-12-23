package com.kchaste.design.property;


/**
 * @author KChaste Sun
 */
public class House implements Property{

    private String name;
    private String color;

    public House(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public House() {
    }

    /**
     * Shallow clone
     * @return clone instance
     */
    @Override
    public Property clone() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
