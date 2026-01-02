package application;

import domain.Genre;
import service.AlbumService;
import service.ArtistService;
import service.GenreService;
import domain.Album;
import domain.Artist;
import java.util.List;

public class MusicAppService {

    private final AlbumService albumService;
    private final ArtistService artistService;
    private final GenreService genreService;

    public MusicAppService (AlbumService albumService, ArtistService artistService, GenreService genreService) {
        this.albumService = albumService;
        this.artistService = artistService;
        this.genreService = genreService;

    }

    public List<Album> findAlbumsByArtist (Long artistId) {
        return albumService.getAlbumsByArtist(artistId);
    }

    public List<Album> findAlbumsByGenreAndYear (Long genreId, int year) {
        return albumService.getAlbumsByGenreAndYear(genreId, year);
    }

    public Artist findArtist (Long artistId) {
        return artistService.getArtistById(artistId);
    }

}
