package repository;

import domain.Album;
import java.util.ArrayList;
import java.util.List;

public class AlbumRepository {

    private List<Album> albums = new ArrayList<>();

        public void save (Album album) {
            albums.add(album);
        }

        public List<Album> findAll() {
            return albums;
        }

        public Album findById(Long id) {
            for (Album album : albums) {
                if (album.getId().equals(id)) {
                    return album;
                }
            }
            return null;
        }

        public void deleteById(Long id) {
            albums.removeIf(album -> album.getId().equals(id));
        }

}
