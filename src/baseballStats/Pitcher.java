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

    public int getStrikeouts() { return so; }
    public void setStrikeouts(int so) { this.so = so; }
    
    public float calculateERA() { return 9 * (er / convertIP(ip)); }
    
    public float calculateWHIP() { return (bb + h) / convertIP(ip); }
    
    public float calculateH9() { return (h / convertIP(ip)) * 9; }
    
    public float calculateHR9() { return (hr / convertIP(ip)) * 9; }
    
    public float calculateBB9() { return (bb / convertIP(ip)) * 9; }
    
    public float calculateSO9() { return (so / convertIP(ip)) * 9; }
    
    public void printStats() {
    	System.out.printf(
    		    "Innings Pitched: %.1f\nERA: %.2f\nWHIP: %.3f\nH/9: %.1f\nHR/9: %.1f\nBB/9: %.1f\nSO/9: %.1f\n",
    		    ip,
    		    calculateERA(),
    		    calculateWHIP(),
    		    calculateH9(),
    		    calculateHR9(),
    		    calculateBB9(),
    		    calculateSO9()
    		);
    }
    
    private float convertIP(float ip) {
    	float realIP = ip % 1;
    	
    	if (realIP == 0.1) {
    		return (float) ((ip - 0.1) + .333);
    	} else if (realIP == 0.2) {
    		return (float) ((ip - 0.2) + .667);
    	} 
    	
    	return ip;
    }
}