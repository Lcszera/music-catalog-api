package service;

import domain.Genre;
import repository.GenreRepository;
import java.util.List;

public class GenreService {

    private GenreRepository repository = new GenreRepository();

    public void createGenre(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Genre can't be null");
        }

        repository.save(genre);
    }

    public List<Genre> listAllGenres() {
        return repository.findAll();
    }

    public Genre getGenreById(Long id) {
        Genre genre = repository.findById(id);

        if (genre == null) {
            throw new RuntimeException("Genre not found");
        }

        return genre;
    }

    public void deleteGenre (Long id) {
        Genre genre = repository.findById(id);

        if (genre == null) {
            throw new RuntimeException("Can't be deleted. Genre not found");
        }

        repository.deleteById(id);
    }

    public Genre getGenreByName(String name) {
        Genre genre = repository.findByName(name);

        if (genre == null) {
            throw new RuntimeException("Genre not found");
        }

        return genre;
    }

}
