package baseballStats;

public class Hitter {
	private int plateAppearances;
	private int atBats;
	private int hits;
	private int singles;
	private int doubles;
	private int triples;
	private int homeRuns;
	private int walks;

	public Hitter() {
		this.plateAppearances = 0;
		this.atBats = 0;
		this.hits = 0;
		this.singles = 0;
		this.doubles = 0;
		this.triples = 0;
		this.homeRuns = 0;
		this.walks = 0;
	}

	public Hitter(int plateAppearances, int atBats, int hits, int singles, int doubles, int triples, int homeRuns, int walks) {
		this.plateAppearances = plateAppearances;
		this.atBats = atBats;
		this.hits = hits;
		this.singles = singles;
		this.doubles = doubles;
		this.triples = triples;
		this.homeRuns = homeRuns;
		this.walks = walks;
	}


	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	public void setPlateAppearances(int plateAppearances) {
		this.plateAppearances = plateAppearances;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public void setSingles(int singles) {
		this.singles = singles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}

	public void setWalks(int walks) {
		this.walks = walks;
	}

	public int getAtBats() {
		return this.atBats;
	}

	public int getPlateAppearances() {
		return this.plateAppearances;
	}

	public int hits() {
		return this.hits;
	}

	public int getSingles() {
		return this.singles;
	}

	public int getDoubles() {
		return this.doubles;
	}

	public int getTriples() {
		return this.triples;
	}

	public int getHomeRuns() {
		return this.homeRuns;
	}

	public int getWalks() {
		return this.walks;
	}

	public float calculateBattingAverage() {
		return (float)hits / atBats;
	}
	
	public float calculateOnBasePercent() {
		return (float)(hits + walks) / plateAppearances;
	}
	
	public float calculateSluggingPercent() {
		return (float)(singles + (doubles * 2) + (triples * 3) + (homeRuns * 4)) / atBats;
	}
	
	public float calculateOPS() {
		return calculateSluggingPercent() + calculateOnBasePercent();
	}
}
