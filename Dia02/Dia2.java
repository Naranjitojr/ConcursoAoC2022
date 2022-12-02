package dia2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dia2 {
	public static void main(String[] args) {
		System.out.println(PPT());
		System.out.println(PPT2());
	}

	public static int PPT(){
		int result = 0;
		try(BufferedReader b = new BufferedReader(new FileReader("./src/dia2/Dia2"))){
			String cadena = "";
			while((cadena = b.readLine()) != null) {
				char op = cadena.charAt(0);
				char me = cadena.charAt(2);
				switch(me){
					case 'X':
						if(op == 'A')
							result += 4;
						else if (op == 'B')
							result += 1;
						else
							result += 7;
						break;
					case 'Y':
						if(op == 'A')
							result += 8;
						else if (op == 'B')
							result += 5;
						else
							result += 2;
						break;
					case 'Z':
						if(op == 'A')
							result += 3;
						else if (op == 'B')
							result += 9;
						else
							result += 6;
						break;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static int PPT2(){
		int result = 0;
		try(BufferedReader b = new BufferedReader(new FileReader("./src/dia2/Dia2"))){
			String cadena = "";
			while((cadena = b.readLine()) != null) {
				char op = cadena.charAt(0);
				char me = cadena.charAt(2);
				switch(me){
					case 'X':
						if(op == 'A')
							result += 3;
						else if (op == 'B')
							result += 1;
						else
							result += 2;
						break;
					case 'Y':
						if(op == 'A')
							result += 4;
						else if (op == 'B')
							result += 5;
						else
							result += 6;
						break;
					case 'Z':
						if(op == 'A')
							result += 8;
						else if (op == 'B')
							result += 9;
						else
							result += 7;
						break;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return result;
	}
}
