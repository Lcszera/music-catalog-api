import domain.Album;
import domain.Artist;
import domain.Genre;
import service.AlbumService;
import service.ArtistService;
import service.GenreService;

public class Main {

    public static void main(String[] args) {

        ArtistService artistService = new ArtistService();
        AlbumService albumService = new AlbumService();
        GenreService genreService = new GenreService();

            Genre rock = new Genre(1L, "Rock");
            Genre hardRock = new Genre(2L, "Hard Rock");
            Genre heavyMetal = new Genre(3L, "Heavy Metal");

            Artist artist1 = new Artist(1L, "Linkin Park", "California", rock);
            Artist artist2 = new Artist(2L, "XYZ", "France", hardRock);
            Artist artist3 = new Artist(3L, "Iron Maiden", "England", heavyMetal);

            Album album1 = new Album(1L, "Hybrid Theory", 2001, artist1);
            Album album2 = new Album(2L, "XYZ", 1989, artist2);
            Album album3 = new Album(3L, "Killers", 1981, artist3);

                genreService.createGenre(rock);
                genreService.createGenre(hardRock);
                genreService.createGenre(heavyMetal);

                artistService.createArtist(artist1);
                artistService.createArtist(artist2);
                artistService.createArtist(artist3);

                albumService.createAlbum(album1);
                albumService.createAlbum(album2);
                albumService.createAlbum(album3);

                    System.out.println("=== Artists ===");
                        artistService.listAllArtists().forEach(System.out::println);

                    System.out.println("=== Albums ===");
                        albumService.listAllAlbums().forEach(System.out::println);

                    System.out.println("=== Genres ===");
                        genreService.listAllGenres().forEach(System.out::println);

        System.out.println(albumService.getAlbumByName("Hybrid Theory"));

    }
}