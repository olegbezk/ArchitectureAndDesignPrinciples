package com.udemy.training.creational.singleton;

public class Downloader {

    private Downloader() {
    }

    private static Downloader downloader;

    public static Downloader getInstance() {
        if (downloader == null) {
            downloader = new Downloader();
        }
        return Downloader.downloader;
    }

    // lazy
    public void startDownloading() {
        System.out.println("Start downloading.");
    }
}
