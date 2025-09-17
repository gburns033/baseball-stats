package baseballStats;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Hitter {
	
	HashMap<String, Integer> hitterStats = new HashMap<String, Integer>();

	public Hitter() {
		hitterStats.put("plateAppearances", 0);
		hitterStats.put("atBats", 0);
		hitterStats.put("runs", 0);
		hitterStats.put("hits", 0);
		hitterStats.put("singles", 0);
		hitterStats.put("doubles", 0);
		hitterStats.put("triples", 0);
		hitterStats.put("homeruns", 0);
		hitterStats.put("rbi", 0);
		hitterStats.put("walks", 0);
		hitterStats.put("stolenBases", 0);
		hitterStats.put("caughtStealing", 0);
	}

	public Hitter(int plateAppearances, int atBats, int runs, int hits, int singles, int doubles, 
				  int triples, int homeruns, int rbi, int walks, int sb, int cs) {
		hitterStats.put("plateAppearances", plateAppearances);
		hitterStats.put("atBats", atBats);
		hitterStats.put("runs", runs);
		hitterStats.put("hits", hits);
		hitterStats.put("singles", singles);
		hitterStats.put("doubles", doubles);
		hitterStats.put("triples", triples);
		hitterStats.put("homeRuns", homeruns);
		hitterStats.put("rbi", rbi);
		hitterStats.put("walks", walks);
		hitterStats.put("stolenBases", sb);
		hitterStats.put("caughtStealing", cs);
	}

	public void setPlateAppearances(int plateAppearances) {
		hitterStats.put("plateAppearances", plateAppearances);
	}

	public void setAtBats(int atBats) {
		hitterStats.put("atBats", atBats);
	}
	
	public void setruns(int runs) {
		hitterStats.put("runs", runs);
	}

	public void sethits(int hits) {
		hitterStats.put("hits", hits);
	}

	public void setsingles(int singles) {
		hitterStats.put("singles", singles);
	}

	public void setdoubles(int doubles) {
		hitterStats.put("doubles", doubles);
	}

	public void settriples(int triples) {
		hitterStats.put("triples", triples);
	}

	public void setHomeruns(int homeruns) {
		hitterStats.put("homeRuns", homeruns);
	}
	
	public void setrbi(int rbi) {
		hitterStats.put("rbi", rbi);
	}

	public void setwalks(int walks) {
		hitterStats.put("walks", walks);
	}
	
	public void setStolenBases(int sb) {
		hitterStats.put("stolenBases", sb);
	}
	
	public void setCaughtStealing(int cs) {
		hitterStats.put("caughtStealing", cs);
	}
	
	public int getPlateAppearances() {
		return hitterStats.get("plateAppearances");
	}

	public int getAtBats() {
		return hitterStats.get("atBats");
	}
	
	public int getruns() {
		return hitterStats.get("runs");
	}

	public int gethits() {
		return hitterStats.get("hits");
	}

	public int getsingles() {
		return hitterStats.get("singles");
	}

	public int getdoubles() {
		return hitterStats.get("doubles");
	}

	public int gettriples() {
		return hitterStats.get("triples");
	}

	public int getHomeruns() {
		return hitterStats.get("homeRuns");
	}
	
	public int getrbi() {
		return hitterStats.get("rbi");
	}

	public int getwalks() {
		return hitterStats.get("walks");
	}
	
	public int getStolenBases() {
		return hitterStats.get("stolenBases");
	}
	
	public int getCaughtStealing() {
		return hitterStats.get("caughtStealing");
	}

	public float calculateBattingAverage() {
		int hits = hitterStats.get("hits");
		int atBats = hitterStats.get("atBats");
		
		return (float)hits / atBats;
	}
	
	public float calculateOnBasePercent() {
		int hits = hitterStats.get("hits");
		int walks = hitterStats.get("walks");
		int plateAppearances = hitterStats.get("plateAppearances");
		
		return (float)(hits + walks) / plateAppearances;
	}
	
	public float calculateSluggingPercent() {
		int singles = hitterStats.get("singles");
		int doubles = hitterStats.get("doubles");
		int triples = hitterStats.get("triples");
		int homeruns = hitterStats.get("homeRuns");
		int atBats = hitterStats.get("atBats");
		
		return (float)(singles + (doubles * 2) + (triples * 3) + (homeruns * 4)) / atBats;
	}
	
	public float calculateOPS() {
		return calculateSluggingPercent() + calculateOnBasePercent();
	}
	
	public void printSlashLine() {
		DecimalFormat df = new DecimalFormat("#.000");
		
		System.out.printf("Slash line: " + df.format(calculateBattingAverage()) + "/" + df.format(calculateOnBasePercent()) + "/" + df.format(calculateSluggingPercent()));
		System.out.println();
	}
	
	public float calculateStolenBasePercent() {
		int sb = hitterStats.get("stolenBases");
		int cs = hitterStats.get("caughtStealing");
		return (float)sb / (sb + cs);
	}
}
