package dia4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Dia4 {

	public static void main(String[] args) {
		System.out.println(overlap());
		System.out.println(rangeOverlap());
	}

	public static int overlap() {
		int result = 0;
		try (BufferedReader b = new BufferedReader(new FileReader("./src/dia4/Dia4"))) {
			String cadena = "";
			while ((cadena = b.readLine()) != null) {
				String[] pair = cadena.split(",");
				String[] elf1 = pair[0].split("-");
				String[] elf2 = pair[1].split("-");
				if(Integer.parseInt(elf1[0]) <= Integer.parseInt(elf2[0]) && Integer.parseInt(elf1[1]) >= Integer.parseInt(elf2[1]))
					result++;
				else if(Integer.parseInt(elf2[0]) <= Integer.parseInt(elf1[0]) && Integer.parseInt(elf2[1]) >= Integer.parseInt(elf1[1]))
					result++;
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static int rangeOverlap() {
		int result = 0;
		try (BufferedReader b = new BufferedReader(new FileReader("./src/dia4/Dia4"))) {
			String cadena = "";
			while ((cadena = b.readLine()) != null) {
				String[] pair = cadena.split(",");
				String[] elf1 = pair[0].split("-");
				String[] elf2 = pair[1].split("-");
				if(Integer.parseInt(elf2[0]) <= Integer.parseInt(elf1[1]) && Integer.parseInt(elf2[0]) >= Integer.parseInt(elf1[0]))
					result++;
				else if(Integer.parseInt(elf1[0]) <= Integer.parseInt(elf2[1]) && Integer.parseInt(elf1[0]) >= Integer.parseInt(elf2[0]))
					result++;
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
