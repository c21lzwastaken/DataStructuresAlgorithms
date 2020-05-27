public class NetflixMovieApp {
    public static void main(String[] args) {

        NetflixMovie firstmovie = new NetflixMovie("Megamind - Return of the Mind", 96, 23, 115821, "PG");

        NetflixMovie lastmovie  = firstmovie;
        firstmovie.setAfter(new NetflixMovie("Snakes on a Train XXI: Amtrak Apocalypse", 108, 103, 92, "R"));
        firstmovie.getAfter().setAfter(new NetflixMovie("Fast and Furious: Tokyo Racer: Fury Road", 193, 37, 989,"G"));

        /*

        firstmovie.name = "Megamind - Return of the Mind";
        firstmovie.length = 96;
        firstmovie.rating = "PG";
        firstmovie.score = 23;
        firstmovie.scorenum = 115821;

        firstmovie.after.name = "Snakes on a Train XXI: Amtrak Apocalypse";
        firstmovie.after.rating = "R";
        firstmovie.after.length = 108;
        firstmovie.after.score = 103;
        firstmovie.after.scorenum = 92;

        firstmovie.after.after.name = "Fast and Furious: Tokyo Racer: Fury Road";
        firstmovie.after.after.rating = "G";
        firstmovie.after.after.length = 193;
        firstmovie.after.after.score = 37;
        firstmovie.after.after.scorenum = 989;

        firstmovie.after.after.after.name = "Tom Clancy's Titanic";
        firstmovie.after.after.after.rating = "M";
        firstmovie.after.after.after.length = 338;
        firstmovie.after.after.after.score = 110;
        firstmovie.after.after.after.scorenum = 1732844;

        lastmovie.name = "Star Wars: Episode II - Attack of the Clones";

         */
    }
}
