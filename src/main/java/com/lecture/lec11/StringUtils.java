package com.lecture.lec11;

public abstract class StringUtils {
    private StringUtils() {

    }
    public boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
