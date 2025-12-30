package service;

import domain.Album;
import repository.AlbumRepository;
import java.util.List;

public class AlbumService {

    private AlbumRepository repository = new AlbumRepository();

    public void createAlbum(Album album) {
        if (album == null) {
            throw new IllegalArgumentException("Album can't be null");
        }

        repository.save(album);
    }

    public List<Album> listAllAlbums() {
        return repository.findAll();
    }

    public Album getAlbumById(Long id) {
        Album album = repository.findById(id);

        if (album == null) {
            throw new RuntimeException("Album not found");
        }

        return album;
    }

    public void deleteAlbum (Long id) {
        Album album = repository.findById(id);

        if (album == null) {
            throw new RuntimeException("Can't be deleted. Album not found.");
        }

        repository.deleteById(id);
    }

    public Album getAlbumByName(String name) {
        Album album = repository.findByName(name);

        if (album == null) {
            throw new RuntimeException("Album not found");
        }

        return album;
    }

    public List<Album> getAlbumsByArtist(Long artistId) {
        List<Album> albums = repository.findByArtistId(artistId);

        if (albums.isEmpty()) {
            throw new RuntimeException("No albums found for this artist");
        }

        return albums;
    }

}
