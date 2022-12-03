package com.transteven.multiplaylist.playlist.model;


public class Playlist {
    private Long id;
    private String website;
    private String type;

    public Playlist(Long id,
                    String website,
                    String type) {
        this.id = id;
        this.website = website;
        this.type = type;
    }
    public Playlist(String website,
                    String type) {
        this.website = website;
        this.type = type;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "id=" + id +
                ", website='" + website + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

