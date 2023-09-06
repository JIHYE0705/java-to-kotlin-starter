package com.lecture.lec13;

public class JavaHouse {
    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public class LivingRoom {
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        public double getArea() {
            return area;
        }
    }
}
