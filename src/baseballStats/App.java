package baseballStats;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import com.google.gson.Gson;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Gson gson = new Gson();
		//DecimalFormat df = new DecimalFormat("#.000");
		Scanner scanner = new Scanner(System.in);
		
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
			int choice;

			System.out.println(
					"Pick an option: \n"
					+ "1. Load hitter\n"
					+ "2. Save a new hitter");
			
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				hitter = loadHitterData(gson);
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

				hitter = new Hitter(plateAppearances, atBats, runs, hits, hits - (doubles + triples), doubles, triples,
						homeRuns, rbi, walks, sb, cs);
				break;
			default:
			}
		}
		
		hitter.printSlashLine();
		saveHitterData(hitter, gson);

		scanner.close();
	}

	private static Hitter loadHitterData(Gson gson) {
		try (FileReader r = new FileReader("hitter.json")) {
			Hitter h = gson.fromJson(r, Hitter.class);
			return h;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new Hitter();
	}

	private static void saveHitterData(Hitter h, Gson gson) {
		try (FileWriter w = new FileWriter("hitter.json")) {
			gson.toJson(h, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
