package com.komfortcieplny;

public class Release {
    private long id;
    private int year;
    private String title;
    private String artists_sort;
    private  String country;

    public long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public String getArtists_sort() {
        return artists_sort;
    }

    @Override
    public String toString() {
        return "<h1>Release</h1><br>" +
                "Id: " + id + "<br>" +
                "Title: <b>" + title +  "</b><br>" +
                "Artists: <b>" + artists_sort +  "</b><br>" +
                "Country: " + country + "<br>" +
                "Year: " + year;
    }
}
