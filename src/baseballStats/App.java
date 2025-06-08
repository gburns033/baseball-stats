package baseballStats;

import java.text.DecimalFormat;

public class App {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.000");
		
		Hitter hitter = new Hitter(264, 235, 74, 51, 19, 0, 4, 22);
		
		System.out.println(df.format(hitter.calculateBattingAverage()));
		System.out.println(df.format(hitter.calculateOnBasePercent()));
		System.out.println(df.format(hitter.calculateSluggingPercent()));
		System.out.println(df.format(hitter.calculateOPS()));
	}
}
