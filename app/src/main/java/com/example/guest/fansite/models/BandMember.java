package com.example.guest.fansite.models;

/**
 * Created by Guest on 10/21/15.
 */
public class BandMember {
    private String mName;
    private String mBandRole;
    private String mDescription;
    private int mImage;

    public BandMember(String name, String bandRole, String description, int image){
        mName = name;
        mBandRole = bandRole;
        mDescription = description;
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getBandRole() {
        return mBandRole;
    }

    public void setBandRole(String bandRole) {
        mBandRole = bandRole;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }
}
