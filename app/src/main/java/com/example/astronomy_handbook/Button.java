package com.example.astronomy_handbook;

public class Button {

    private String mText;
    private int mImage;


    public Button(String button_text, int image) {
        mText = button_text;
        mImage = image;
    }

    public String getText() {
        return mText;
    }

    public int getImage() {
        return mImage;
    }
}
