package com.example.nairobitour;

public class Experience {
    private int mReferenceImage;
    private String mName;

    public Experience(int referenceImage,String name){
        mReferenceImage = referenceImage;
        mName = name;
    }

    public int getReferenceImage(){
        return mReferenceImage;
    }

    public String getName(){
        return mName;
    }
}
