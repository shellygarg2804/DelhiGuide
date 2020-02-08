package com.example.delhiguide;

public class item {
    private String mname="";
    private String mLocation="";
    private String mopening_hours="";
    private int mimageresourseid=-1;

    public item(String name, String location, String openinghrs)
    {
       this.mname=name;
        this.mLocation=location;
        this.mopening_hours=openinghrs;
    }

    public item(String name, String location, String openinghrs, int imageresourceid)
    {
        this.mname=name;
        this.mLocation=location;
        this.mopening_hours=openinghrs;
        this.mimageresourseid=imageresourceid;
    }

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
