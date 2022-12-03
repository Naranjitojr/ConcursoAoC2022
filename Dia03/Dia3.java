package dia3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Dia3 {

	public static void main(String[] args) {
		System.out.println(rucksack());
		System.out.println(rucksack3());
	}

	public static int rucksack() {
		int result = 0;
		List<Character> coincidentes = new ArrayList<Character>();
		try (BufferedReader b = new BufferedReader(new FileReader("./src/dia3/Dia3"))) {
			String cadena = "";
			while ((cadena = b.readLine()) != null) {
				char[] chars = cadena.toCharArray();
				Set<Character> ruck = new HashSet<Character>();
				for (int i = 0; i < chars.length / 2; i++) {
					for (int j = chars.length / 2; j < chars.length; j++) {
						if (chars[i] == chars[j])
							ruck.add(chars[i]);
					}
				}
				Iterator<Character> it = ruck.iterator();
				while (it.hasNext()) {
					coincidentes.add(it.next());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < coincidentes.size(); i++) {
			if (coincidentes.get(i) > 96)
				result += (coincidentes.get(i) - 96);
			else if (coincidentes.get(i) > 64)
				result += (coincidentes.get(i) - 38);
		}
		return result;
	}

	public static int rucksack3() {
		int result = 0;
		List<Character> coincidentes = new ArrayList<Character>();
		try (BufferedReader b = new BufferedReader(new FileReader("./src/dia3/Dia3"))) {
			String cadena1 = "";
			String cadena2 = "";
			String cadena3 = "";
			while ((cadena1 = b.readLine()) != null) {
				Set<Character> ruck = new HashSet<Character>();
				List<Character> ruck12 = new ArrayList<Character>();
				cadena2 = b.readLine();
				cadena3 = b.readLine();
				char[] chars1 = cadena1.toCharArray();
				char[] chars2 = cadena2.toCharArray();
				char[] chars3 = cadena3.toCharArray();
				for (int i = 0; i < chars1.length; i++) {
					for (int j = 0; j < chars2.length; j++) {
						if (chars1[i] == chars2[j])
							ruck12.add(chars1[i]);
					}
				}
				for(int i = 0; i < chars3.length; i++) {
					if(ruck12.contains(chars3[i]))
						ruck.add(chars3[i]);
				}
				Iterator<Character> it = ruck.iterator();
				while (it.hasNext()) {
					coincidentes.add(it.next());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
		for (int i = 0; i < coincidentes.size(); i++) {
			if (coincidentes.get(i) > 96)
				result += (coincidentes.get(i) - 96);
			else if (coincidentes.get(i) > 64)
				result += (coincidentes.get(i) - 38);
		}
		return result;
	}
}
