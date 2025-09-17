package baseballStats;

import java.text.DecimalFormat;

public class Hitter {

    private int plateAppearances;
    private int atBats;
    private int runs;
    private int hits;
    private int singles;
    private int doubles;
    private int triples;
    private int homeruns;
    private int rbi;
    private int walks;
    private int stolenBases;
    private int caughtStealing;

    public Hitter() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Hitter(int plateAppearances, int atBats, int runs, int hits,
                  int singles, int doubles, int triples, int homeruns,
                  int rbi, int walks, int stolenBases, int caughtStealing) {
        this.plateAppearances = plateAppearances;
        this.atBats = atBats;
        this.runs = runs;
        this.hits = hits;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeruns = homeruns;
        this.rbi = rbi;
        this.walks = walks;
        this.stolenBases = stolenBases;
        this.caughtStealing = caughtStealing;
    }
    
    public int getPlateAppearances() { return plateAppearances; }
    public void setPlateAppearances(int plateAppearances) { this.plateAppearances = plateAppearances; }

    public int getAtBats() { return atBats; }
    public void setAtBats(int atBats) { this.atBats = atBats; }

    public int getRuns() { return runs; }
    public void setRuns(int runs) { this.runs = runs; }

    public int getHits() { return hits; }
    public void setHits(int hits) { this.hits = hits; }

    public int getSingles() { return singles; }
    public void setSingles(int singles) { this.singles = singles; }

    public int getDoubles() { return doubles; }
    public void setDoubles(int doubles) { this.doubles = doubles; }

    public int getTriples() { return triples; }
    public void setTriples(int triples) { this.triples = triples; }

    public int getHomeruns() { return homeruns; }
    public void setHomeruns(int homeruns) { this.homeruns = homeruns; }

    public int getRbi() { return rbi; }
    public void setRbi(int rbi) { this.rbi = rbi; }

    public int getWalks() { return walks; }
    public void setWalks(int walks) { this.walks = walks; }

    public int getStolenBases() { return stolenBases; }
    public void setStolenBases(int stolenBases) { this.stolenBases = stolenBases; }

    public int getCaughtStealing() { return caughtStealing; }
    public void setCaughtStealing(int caughtStealing) { this.caughtStealing = caughtStealing; }

    public float calculateBattingAverage() {
        return (atBats > 0) ? (float) hits / atBats : 0.0f;
    }

    public float calculateOnBasePercent() {
        return (plateAppearances > 0) ? (float) (hits + walks) / plateAppearances : 0.0f;
    }

    public float calculateSluggingPercent() {
        return (atBats > 0) ?
            (float) (singles + (doubles * 2) + (triples * 3) + (homeruns * 4)) / atBats
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
        int attempts = stolenBases + caughtStealing;
        return (attempts > 0) ? (float) stolenBases / attempts : 0.0f;
    }
}
