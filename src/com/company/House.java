package com.company;

interface Builder{
    void setHouseType(HouseType type);
    void setFoundation(int foundation);
    void setWalls(int walls);
    void setDoors(int doors);
    void setWindows(int windows);
    void setRoof(int roof);
}
class HouseBuilder implements Builder{

    private HouseType type;
    private int foundation;
    private int walls;
    private int doors;
    private int windows;
    private int roof;

    public void setHouseType(HouseType type){
        this.type = type;
    }

    @Override
    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }

    @Override
    public void setWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setRoof(int roof) {
        this.roof = roof;
    }

    public House getResult(){
        return new House(type, foundation, walls, doors, windows, roof);
    }
}

class HouseManualBuilder implements Builder{
    private HouseType type;
    private int foundation;
    private int walls;
    private int doors;
    private int windows;
    private int roof;


    @Override
    public void setHouseType(HouseType type) {
        this.type = type;
    }

    @Override
    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }

    @Override
    public void setWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setRoof(int roof) {
        this.roof = roof;
    }

    public Manual getResult(){
        return new Manual(type, foundation, walls, doors, windows, roof);
    }
}

public class House {
    private final HouseType houseType;
    private final int foundation;
    private final int walls;
    private final int doors;
    private final int windows;
    private final int roof;
    private double cash = 0;

    public House(HouseType houseType, int foundation, int walls, int doors, int windows, int roof){
        this.houseType = houseType;
        this.foundation = foundation;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
    }

    public HouseType getHouseType(){
        return houseType;
    }

    public int getFoundation() {
        return foundation;
    }

    public int getWalls(){
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getRoof() {
        return roof;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}

class Manual{
    private final HouseType houseType;
    private final int foundation;
    private final int walls;
    private final int doors;
    private final int windows;
    private final int roof;

    public Manual(HouseType houseType, int foundation, int walls, int doors, int windows, int roof){
        this.houseType = houseType;
        this.foundation = foundation;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
    }

    public String print(){
        String information = "";
        information += "Type of a house: " + houseType +"\n";
        information += "Foundation: " + foundation + "\n";
        information += "Walls: " + walls + "\n";
        information += "Doors: " + doors + "\n";
        information += "Windows: " + windows + "\n";
        information += "Roof: " + roof + "\n";
        return information;
    }

}

enum HouseType{
    REGULAR_HOUSE, SMALL_CASTLE, PALACE
}

class Director{
    public void constructRegularHouse(Builder builder){
        builder.setHouseType(HouseType.REGULAR_HOUSE);
        builder.setFoundation(50);
        builder.setWalls(4);
        builder.setDoors(4);
        builder.setWindows(4);
        builder.setRoof(1);
    }

    public void constructSmallCastle(Builder builder){
        builder.setHouseType(HouseType.SMALL_CASTLE);
        builder.setFoundation(80);
        builder.setWalls(8);
        builder.setDoors(8);
        builder.setWindows(8);
        builder.setRoof(2);
    }

    public void constructPalace(Builder builder){
        builder.setHouseType(HouseType.PALACE);
        builder.setFoundation(150);
        builder.setWalls(15);
        builder.setDoors(15);
        builder.setWindows(15);
        builder.setRoof(5);
    }
}
