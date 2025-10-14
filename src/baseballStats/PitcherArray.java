package baseballStats;

import java.util.ArrayList;

public class PitcherArray {

    private ArrayList<Pitcher> pitchers;

    public PitcherArray() {
        this.pitchers = new ArrayList<Pitcher>();
    }

    public void addPitcher(Pitcher p) { 
        pitchers.add(p); 
    }

    public Pitcher getPitcher(int i) { 
        return pitchers.get(i); 
    }

    public void printPitchers() {
        for (int i = 0; i < pitchers.size(); i++) {
            pitchers.get(i).printStats();
        }
    }
}
