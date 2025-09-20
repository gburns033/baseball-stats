package baseballStats;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class DataLoader {
	public DataLoader() { }
	
	public static Hitter loadHitterData(Gson gson) {
		try (FileReader r = new FileReader("hitter.json")) {
			Hitter h = gson.fromJson(r, Hitter.class);
			return h;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new Hitter();
	}

	public static void saveHitterData(Hitter h, Gson gson) {
		try (FileWriter w = new FileWriter("hitter.json")) {
			gson.toJson(h, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Pitcher loadPitcherData(Gson gson) {
		try (FileReader r = new FileReader("pitcher.json")) {
			Pitcher p = gson.fromJson(r, Pitcher.class);
			return p;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new Pitcher();
	}
	
	public static void savePitcherData(Pitcher p, Gson gson) {
		try (FileWriter w = new FileWriter("pitcher.json")) {
			gson.toJson(p, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
