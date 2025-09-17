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
    
    public float getIp() { return ip; }
    public void setIp(float ip) { this.ip = ip; }

    public int getG() { return g; }
    public void setG(int g) { this.g = g; }

    public int getGs() { return gs; }
    public void setGs(int gs) { this.gs = gs; }

    public int getH() { return h; }
    public void setH(int h) { this.h = h; }

    public int getR() { return r; }
    public void setR(int r) { this.r = r; }

    public int getEr() { return er; }
    public void setEr(int er) { this.er = er; }

    public int getHr() { return hr; }
    public void setHr(int hr) { this.hr = hr; }

    public int getBb() { return bb; }
    public void setBb(int bb) { this.bb = bb; }

    public int getSo() { return so; }
    public void setSo(int so) { this.so = so; }
}