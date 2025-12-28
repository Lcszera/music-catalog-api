package domain;

public class Album {

    private Long id;
    private String title;
    private int releaseYear;
    private Artist artist;

    public Album(Long id, String title, int releaseYear, Artist artist) {

        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.artist = artist;

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Album album = (Album) obj;
        return id != null && id.equals(album.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
