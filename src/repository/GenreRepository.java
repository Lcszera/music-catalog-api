package repository;

import domain.Genre;
import java.util.ArrayList;
import java.util.List;

public class GenreRepository {

    private List<Genre> genres = new ArrayList<>();

        public void save (Genre genre) {
            genres.add(genre);
        }

        public List<Genre> findAll() {
            return genres;
        }

        public Genre findById(Long id) {
            for (Genre genre : genres) {
                if (genre.getId().equals(id)) {
                    return genre;
                }
            }
            return null;
        }

        public void deleteById(Long id) {
            genres.removeIf(genre -> genre.getId().equals(id));
        }

        public Genre findByName(String name) {
            for (Genre genre : genres) {
                if (genre.getName().equalsIgnoreCase(name)) {
                    return genre;
                }
            }

            return null;
        }

}
