package com.kchaste.design.builder;

/**
 * <p>
 *    'builder-design' builder house
 * </p>
 * @author KChaste Sun
 */
public class House {

    /**
     * simple attribute
     */
    private String houseName;
    private String houseSize;

    public House(){
        System.out.println("init");
    }
    public House(Builder builder){
        this.houseName = builder.houseName;
        this.houseSize = builder.houseSize;
    }

    public static class Builder{
        private String houseName;
        private String houseSize;

        public Builder houseName(String houseName){
            this.houseName = houseName;
            return this;
        }
        public Builder houseSize(String houseSize){
            this.houseSize = houseSize;
            return this;
        }
        public House builder(){
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "houseName='" + houseName + '\'' +
                ", houseSize='" + houseSize + '\'' +
                '}';
    }
}
