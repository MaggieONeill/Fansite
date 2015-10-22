package com.example.guest.fansite.models;

/**
 * Created by Guest on 10/21/15.
 */
public class BandMember {
    private String mName;
    private String mBandRole;
    private String mBandMemberBioInfo;
    private int mImage;

    public BandMember(String name, String bandRole, String bandMemberBioInfo, int image){
        mName = name;
        mBandRole = bandRole;
        mBandMemberBioInfo = bandMemberBioInfo;
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

    public String getBandMemberBioInfo() {
        return mBandMemberBioInfo;
    }

    public void setBandMemberBioInfo(String bandMemberBioInfo) {
        mBandMemberBioInfo = bandMemberBioInfo;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

}
