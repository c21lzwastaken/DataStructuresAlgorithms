public class NetflixMovie {
    private String name;
    private int length;
    private int score;
    private int scorenum;
    private String rating;
    private NetflixMovie after;
    private boolean last;

    public NetflixMovie(String names, int length, int score, int scorenum, String rating){
        this.name=names;
        this.length=length;
        this.score=score;
        this.scorenum=scorenum;
        this.rating=rating;
    }

    public NetflixMovie getAfter() {
        return after;
    }

    public void setAfter(NetflixMovie a) {
        this.after = a;
    }

    public void addtoQueue(NetflixMovie a, NetflixMovie b){

    }
}
