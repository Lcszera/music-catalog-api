package service;

import domain.Artist;
import repository.ArtistRepository;
import repository.GenreRepository;

import java.util.List;

public class ArtistService {

    private ArtistRepository repository = new ArtistRepository();

    public void createArtist(Artist artist) {
        if (artist == null) {
            throw new IllegalArgumentException("Artist can't be null");
        }

        repository.save(artist);
    }

    public List<Artist> listAllArtists() {
        return repository.findAll();
    }

    public Artist getArtistById(Long id) {
        Artist artist = repository.findById(id);

        if (artist == null) {
            throw new RuntimeException("Artist not found");
        }

        return artist;
    }

    public void deleteArtist (Long id) {
        Artist artist = repository.findById(id);

        if (artist == null) {
            throw  new RuntimeException("Can't be deleted. Artist not found");
        }

        repository.deleteById(id);
    }

    public Artist getArtistByName (String name) {
        Artist artist = repository.findByName(name);

        if (artist == null) {
            throw new RuntimeException("Artist not found");

        }

        return artist;
    }

}
