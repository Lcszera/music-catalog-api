package repository;

import domain.Artist;
import java.util.ArrayList;
import java.util.List;

public class ArtistRepository {

    private List<Artist> artists = new ArrayList<>();

        public void save(Artist artist) {
            artists.add(artist);
        }

    public List<Artist> findAll() {
        return artists;
    }

    public Artist findById(Long id) {

            for (Artist artist : artists) {
                if (artist.getId().equals(id)) {
                    return artist;
                }
            }
            return null;
    }

    public void deleteById(Long id) {
            artists.removeIf(artist -> artist.getId().equals(id));
    }

    public Artist findByName(String name) {
            for (Artist artist : artists) {
                if (artist.getName().equalsIgnoreCase(name)) {
                    return artist;
                }
            }

            return null;
    }

}
