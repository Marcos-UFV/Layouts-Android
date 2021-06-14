package com.example.swipeviews;

import java.util.ArrayList;
import java.util.List;

public class MyModel {
    String title,description,date;
    int image;

    public MyModel(String title, String description, String date, int image) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.image = image;
    }

    public static ArrayList<MyModel> loadCards(){
        ArrayList<MyModel> myModelList = new ArrayList<>();
        myModelList.add(new MyModel("Title 1","Description 1","01/01/01",R.drawable.brochure));
        myModelList.add(new MyModel("Title 2","Description 2","02/02/02",R.drawable.namecard));
        myModelList.add(new MyModel("Title 3","Description 3","03/03/03",R.drawable.poster));
        myModelList.add(new MyModel("Title 4","Description 4","04/04/04",R.drawable.sticker));
        myModelList.add(new MyModel("Title 5","Description 5","05/05/05",R.drawable.ic_launcher_foreground));
        return myModelList;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
