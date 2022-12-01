import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dia1{
	
	public static void main(String[] args) {
		System.out.println(selectMaxCalories());
		System.out.println(select3MaxCalories());
	}

	public static int selectMaxCalories(){
		int result = 0;
		try(BufferedReader b = new BufferedReader(new FileReader("./Dia01/Dia1"))){
			String cadena;
			int aux = 0;
			while((cadena = b.readLine()) != null) {
				if(!cadena.equals("")) {
					aux += Integer.parseInt(cadena);
				}
				else {
					if(aux > result)
						result = aux;
					aux = 0;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static int select3MaxCalories(){
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		try(BufferedReader b = new BufferedReader(new FileReader("./Dia01/Dia1"))){
			String cadena;
			int aux = 0;
			while((cadena = b.readLine()) != null) {
				if(!cadena.equals("")) {
					aux += Integer.parseInt(cadena);
				}
				else {
					if(aux > result1) {
						result3 = result2;
						result2 = result1;
						result1 = aux;
					}
					else if(aux > result2) {
						result3 = result2;
						result2 = aux;
					}
					else if(aux > result3) {
						result3 = aux;
					}
					aux = 0;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return result1 + result2 + result3;
	}
}