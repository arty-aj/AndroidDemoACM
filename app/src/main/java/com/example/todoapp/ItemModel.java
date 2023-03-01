package com.example.todoapp;

public class ItemModel {
    String title;
    String description;

    public ItemModel(String item, String description){
        this.description = description;
        this.title = item;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
