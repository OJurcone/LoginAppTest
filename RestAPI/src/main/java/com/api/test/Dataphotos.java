package com.api.test;

/**
 * Created by Orlo on 2/19/2017.
 */
public class Dataphotos
{
    private String id;

    private String title;

    private String albumId;

    private String thumbnailUrl;

    private String url;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getAlbumId ()
    {
        return albumId;
    }

    public void setAlbumId (String albumId)
    {
        this.albumId = albumId;
    }

    public String getThumbnailUrl ()
    {
        return thumbnailUrl;
    }

    public void setThumbnailUrl (String thumbnailUrl)
    {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "id = "+id+"\ntitle = "+title+"\nalbumId = "+albumId+"\nthumbnailUrl = "+thumbnailUrl+"\nurl = "+url+"]";
    }
}
