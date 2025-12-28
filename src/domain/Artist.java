package domain;

public class Artist {

    private Long id;
    private String name;
    private String country;
    private Genre genre;

    public Artist(Long id, String name, String country, Genre genre) {

        this.id = id;
        this.name = name;
        this.country = country;
        this.genre = genre;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return id != null && id.equals(artist.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
