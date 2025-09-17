package baseballStats;

import java.text.DecimalFormat;

public class Hitter {

    private int pa;
    private int ab;
    private int r;
    private int h;
    private int singles;
    private int doubles;
    private int triples;
    private int hr;
    private int rbi;
    private int bb;
    private int sb;
    private int cs;

    public Hitter() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Hitter(int pa, int ab, int r, int h,
                  int singles, int doubles, int triples, int hr,
                  int rbi, int bb, int sb, int cs) {
        this.pa = pa;
        this.ab = ab;
        this.r = r;
        this.h = h;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.hr = hr;
        this.rbi = rbi;
        this.bb = bb;
        this.sb = sb;
        this.cs = cs;
    }
    
    public int getPlateAppearances() { return pa; }
    public void setPlateAppearances(int pa) { this.pa = pa; }

    public int getAtBats() { return ab; }
    public void setAtBats(int ab) { this.ab = ab; }

    public int getRuns() { return r; }
    public void setRuns(int r) { this.r = r; }

    public int getHits() { return h; }
    public void setHits(int h) { this.h = h; }

    public int getSingles() { return singles; }
    public void setSingles(int singles) { this.singles = singles; }

    public int getDoubles() { return doubles; }
    public void setDoubles(int doubles) { this.doubles = doubles; }

    public int getTriples() { return triples; }
    public void setTriples(int triples) { this.triples = triples; }

    public int getHomeRuns() { return hr; }
    public void setHomeRuns(int hr) { this.hr = hr; }

    public int getRbi() { return rbi; }
    public void setRbi(int rbi) { this.rbi = rbi; }

    public int getWalks() { return bb; }
    public void setWalks(int bb) { this.bb = bb; }

    public int getStolenBases() { return sb; }
    public void setStolenBases(int sb) { this.sb = sb; }

    public int getCaughtStealing() { return cs; }
    public void setCaughtStealing(int cs) { this.cs = cs; }

    public float calculateBattingAverage() {
        return (ab > 0) ? (float) h / ab : 0.0f;
    }

    public float calculateOnBasePercent() {
        return (pa > 0) ? (float) (h + bb) / pa : 0.0f;
    }

    public float calculateSluggingPercent() {
        return (ab > 0) ?
            (float) (singles + (doubles * 2) + (triples * 3) + (hr * 4)) / ab
            : 0.0f;
    }

    public float calculateOPS() {
        return calculateSluggingPercent() + calculateOnBasePercent();
    }

    public void printSlashLine() {
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.printf("Slash line: %s/%s/%s%n",
                df.format(calculateBattingAverage()),
                df.format(calculateOnBasePercent()),
                df.format(calculateSluggingPercent()));
    }

    public float calculateStolenBasePercent() {
        int attempts = sb + cs;
        return (attempts > 0) ? (float) sb / attempts : 0.0f;
    }
}
