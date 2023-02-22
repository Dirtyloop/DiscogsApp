package com.komfortcieplny;

public class Artist {
    private long id;
    private String name;
    private String profile;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "<h1>Artist</h1><br>" +
                "Id: " + id + "<br>" +
                "Name: <b>" + name  + "</b><br>"  +
                "Profile: " + profile;
    }
}
