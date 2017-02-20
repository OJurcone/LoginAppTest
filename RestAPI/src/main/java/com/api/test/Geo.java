package com.api.test;

/**
 * Created by Orlo on 2/19/2017.
 */
public class Geo
{
    private String lng;

    private String lat;

    public String getLng ()
    {
        return lng;
    }

    public void setLng (String lng)
    {
        this.lng = lng;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "\n  lng = "+lng+"\n  lat = "+lat+"";
    }
}
