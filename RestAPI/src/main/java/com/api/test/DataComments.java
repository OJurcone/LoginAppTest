package com.api.test;

/**
 * Created by Orlo on 2/19/2017.
 */
public class DataComments
{
    private String id;

    private String body;

    private String email;

    private String name;

    private String postId;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getBody ()
    {
        return body;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPostId ()
    {
        return postId;
    }

    public void setPostId (String postId)
    {
        this.postId = postId;
    }

    @Override
    public String toString()
    {
        return "id = "+id+"\nbody = "+body+"\nemail = "+email+"\nname = "+name+"\npostId = "+postId+"";
    }


}

