package com.youtube.maratonajava.ZZDoptional.dominio;

import java.util.Objects;

public class Manga {

    private Integer id;
    private String title;
    private int chapters;

    public Manga() {}

    public Manga(Integer id, String title, int chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return chapters == manga.chapters && Objects.equals(id, manga.id) && Objects.equals(title, manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, chapters);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
}
