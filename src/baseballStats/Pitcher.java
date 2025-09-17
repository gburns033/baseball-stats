package baseballStats;

import java.util.HashMap;

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
}
