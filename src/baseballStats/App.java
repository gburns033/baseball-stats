package baseballStats;

import com.google.gson.Gson;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Gson gson = new Gson();
		// DecimalFormat df = new DecimalFormat("#.000");
		Scanner scanner = new Scanner(System.in);
		HitterArray hitters = new HitterArray();
		PitcherArray pitchers = new PitcherArray();
		boolean running = true;

		while (running) {
			System.out.println("Pick an option: \n" + "1. Hitter\n" + "2. Pitcher\n" + "3. Quit");
			int choice1 = scanner.nextInt();

			if (choice1 == 1) {
				Hitter hitter = null;
				int plateAppearances;
				int atBats;
				int runs;
				int hits;
				int doubles;
				int triples;
				int homeRuns;
				int rbi;
				int walks;
				int sb;
				int cs;

				while (hitter == null) {
					int choice2;

					System.out.println("Pick an option: \n" + "1. Load hitter\n" + "2. Save a new hitter");

					choice2 = scanner.nextInt();

					switch (choice2) {
					case 1:
						hitters = DataLoader.loadHitterData(gson);
						break;
					case 2:
						System.out.println("Enter plate appearances: ");
						plateAppearances = scanner.nextInt();

						System.out.println("Enter at-bats: ");
						atBats = scanner.nextInt();

						System.out.println("Enter runs: ");
						runs = scanner.nextInt();

						System.out.println("Enter hits: ");
						hits = scanner.nextInt();

						System.out.println("Enter doubles: ");
						doubles = scanner.nextInt();

						System.out.println("Enter triples: ");
						triples = scanner.nextInt();

						System.out.println("Enter home runs: ");
						homeRuns = scanner.nextInt();

						System.out.println("Enter RBIs: ");
						rbi = scanner.nextInt();

						System.out.println("Enter walks: ");
						walks = scanner.nextInt();

						System.out.println("Enter stolen bases: ");
						sb = scanner.nextInt();

						System.out.println("Enter caught stealing: ");
						cs = scanner.nextInt();

						hitter = new Hitter(plateAppearances, atBats, runs, hits, hits - (doubles + triples), doubles,
								triples, homeRuns, rbi, walks, sb, cs);
						hitters.addHitter(hitter);
						
						break;
					default:
					}
				}

				hitter.printSlashLine();
				DataLoader.saveHitterData(hitters, gson);
			} else if (choice1 == 2) {
				Pitcher pitcher = null;
				float ip;
				int g;
				int gs;
				int h;
				int r;
				int er;
				int hr;
				int bb;
				int so;

				while (pitcher == null) {
					int choice2;

					System.out.println("Pick an option: \n" + "1. Load pitcher\n" + "2. Save a new pitcher");

					choice2 = scanner.nextInt();

					switch (choice2) {
					case 1:
						pitchers = DataLoader.loadPitcherData(gson);
						break;
					case 2:
						System.out.println("Enter innings pitched: ");
						ip = scanner.nextFloat();

						System.out.println("Enter games: ");
						g = scanner.nextInt();

						System.out.println("Enter games started: ");
						gs = scanner.nextInt();

						System.out.println("Enter hits: ");
						h = scanner.nextInt();

						System.out.println("Enter runs: ");
						r = scanner.nextInt();

						System.out.println("Enter earned runs: ");
						er = scanner.nextInt();

						System.out.println("Enter home runs: ");
						hr = scanner.nextInt();

						System.out.println("Enter walks: ");
						bb = scanner.nextInt();

						System.out.println("Enter strikeouts: ");
						so = scanner.nextInt();

						pitcher = new Pitcher(ip, g, gs, h, r, er, hr, bb, so);
						pitchers.addPitcher(pitcher);
						break;
					default:
					}
				}

				pitcher.printStats();
				DataLoader.savePitcherData(pitchers, gson);
			} else if (choice1 == 3) {
				scanner.close();
				running = false;
			}
		}
		
		hitters.printHitters();
		pitchers.printPitchers();
	}
}
