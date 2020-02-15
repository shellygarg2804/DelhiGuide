package com.example.delhiguide;

// a class to store information about one list item

public class item {
    private String mname="";
    private String mLocation="";
    private String mopening_hours="";
    private int mimageresourseid=-1;
    // constructor for items not storing image
    public item(String name, String location, String openinghrs)
    {
       this.mname=name;
        this.mLocation=location;
        this.mopening_hours=openinghrs;
    }
    // for object storing images
    public item(String name, String location, String openinghrs, int imageresourceid)
    {
        this.mname=name;
        this.mLocation=location;
        this.mopening_hours=openinghrs;
        this.mimageresourseid=imageresourceid;
    }

    // returning specific information
    public int getMimageresourseid() {
        return mimageresourseid;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getMname() {
        return mname;
    }

    public String getMopening_hours() {
        return mopening_hours;
    }
}
