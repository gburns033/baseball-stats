package baseballStats;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.000");
		Scanner scanner = new Scanner(System.in);
		
		int plateAppearances;
		int atBats;
		int runs;
		int hits;
		int doubles;
		int triples;
		int homeRuns;
		int walks;
		int sb;
		int cs;
		
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
		
		System.out.println("Enter walks: ");
		walks = scanner.nextInt();
		
		System.out.println("Enter stolen bases: ");
		sb = scanner.nextInt();
		
		System.out.println("Enter caught stealing: ");
		cs = scanner.nextInt();
		
		Hitter hitter = new Hitter(plateAppearances, atBats, runs, hits, hits - (doubles + triples), doubles, triples, homeRuns, walks, sb, cs);
		
		System.out.println(df.format(hitter.calculateBattingAverage()));
		System.out.println(df.format(hitter.calculateOnBasePercent()));
		System.out.println(df.format(hitter.calculateSluggingPercent()));
		System.out.println(df.format(hitter.calculateOPS()));
		System.out.println(df.format(hitter.calculateStolenBasePercent()));
		
		scanner.close();
	}
}
