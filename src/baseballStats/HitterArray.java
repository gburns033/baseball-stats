package baseballStats;

import java.util.ArrayList;

public class HitterArray {

	private ArrayList<Hitter> hitters = new ArrayList<Hitter>();
	
	public HitterArray() {
		this.hitters = new ArrayList<Hitter>();
	}
	
	public void addHitter(Hitter h) { hitters.add(h); }
	public Hitter getHitter(int i) { return hitters.get(i); }
}
