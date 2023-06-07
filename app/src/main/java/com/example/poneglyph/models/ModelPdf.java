package com.example.poneglyph.models;

public class ModelPdf {

    String uid, id, title, description, categoryId, url;
    long timestamp, viewsCount, downloadsCount;
    boolean favorite;

    public ModelPdf() {
    }

    public ModelPdf(String uid, String id, String title, String description, String categoryId, String url, long timestamp, long viewsCount, long downloadsCount, boolean favorite) {
        this.uid = uid;
        this.id = id;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.url = url;
        this.timestamp = timestamp;
        this.viewsCount = viewsCount;
        this.downloadsCount = downloadsCount;
        this.favorite = favorite;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setViewsCount(long viewsCount) {
        this.viewsCount = viewsCount;
    }

    public void setDownloadsCount(long downloadsCount) {
        this.downloadsCount = downloadsCount;
    }

    public String getUid() {
        return uid;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getUrl() {
        return url;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getViewsCount() {
        return viewsCount;
    }

    public long getDownloadsCount() {
        return downloadsCount;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
