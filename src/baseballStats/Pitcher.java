package baseballStats;

public class Pitcher {

    private float ip;
    private int g;
    private int gs;
    private int h;
    private int r;
    private int er;
    private int hr;
    private int bb;
    private int so;

    public Pitcher() {
        this(0.0f, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Pitcher(float ip, int g, int gs, int h, int r, int er,
                   int hr, int bb, int so) {
        this.ip = ip;
        this.g = g;
        this.gs = gs;
        this.h = h;
        this.r = r;
        this.er = er;
        this.hr = hr;
        this.bb = bb;
        this.so = so;
    }
    
    public float getInningsPitched() { return ip; }
    public void setInningsPitched(float ip) { this.ip = ip; }

    public int getGames() { return g; }
    public void setGames(int g) { this.g = g; }

    public int getGamesStarted() { return gs; }
    public void setGamesStarted(int gs) { this.gs = gs; }

    public int getHits() { return h; }
    public void setHits(int h) { this.h = h; }

    public int getRuns() { return r; }
    public void setRuns(int r) { this.r = r; }

    public int getEarnedRuns() { return er; }
    public void setEarnedRuns(int er) { this.er = er; }

    public int getHomeRuns() { return hr; }
    public void setHomeRuns(int hr) { this.hr = hr; }

    public int getWalks() { return bb; }
    public void setWalks(int bb) { this.bb = bb; }

    public int getSo() { return so; }
    public void setSo(int so) { this.so = so; }
    public int getStrikeouts() { return so; }
    public void setStrikeouts(int so) { this.so = so; }
}