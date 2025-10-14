package baseballStats;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class DataLoader {
	public DataLoader() { }
	
	public static HitterArray loadHitterData(Gson gson) {
		try (FileReader r = new FileReader("hitter.json")) {
			HitterArray h = gson.fromJson(r, new TypeToken<ArrayList<Hitter>>() {}.getType());
			return h;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new HitterArray();
	}

	public static void saveHitterData(HitterArray h, Gson gson) {
		try (FileWriter w = new FileWriter("hitter.json")) {
			gson.toJson(h, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static PitcherArray loadPitcherData(Gson gson) {
		try (FileReader r = new FileReader("pitcher.json")) {
			PitcherArray p = gson.fromJson(r, new TypeToken<ArrayList<Pitcher>>() {}.getType());
			return p;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new PitcherArray();
	}
	
	public static void savePitcherData(PitcherArray p, Gson gson) {
		try (FileWriter w = new FileWriter("pitcher.json")) {
			gson.toJson(p, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
