package com.api.test;

/**
 * Created by Orlo on 2/19/2017.
 */
public class Company
{
    private String catchPhrase;

    private String name;

    private String bs;

    public String getCatchPhrase ()
    {
        return catchPhrase;
    }

    public void setCatchPhrase (String catchPhrase)
    {
        this.catchPhrase = catchPhrase;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getBs ()
    {
        return bs;
    }

    public void setBs (String bs)
    {
        this.bs = bs;
    }

    @Override
    public String toString()
    {
        return "\n catchPhrase = "+catchPhrase+"\n name = " +name+"\n bs = " +bs+"]";
    }
}
