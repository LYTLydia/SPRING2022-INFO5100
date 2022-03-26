package com.company;

public class Main {

    public static void main(String[] args) {
        Camera camera = Camera.getInstance();

        camera.setCameraName("Canon");
        System.out.println(camera.getCameraName());

    }
}
