package com.hasan.exam;

public class ListModel {
    String title;
    String description;

    public ListModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescp() {
        return description;
    }

    public void setDescp(String descp) {
        this.description = descp;
    }
}
