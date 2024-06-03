package table;
import java.util.Random;
public class RandomTable {
	public static void main(String[] args) {
		
        String[] encabezados = {"ID", "Nombre", "Edad"};
        
       
        String[] nombres = {"Juan", "Ana", "Luis", "Carlos", "Maria"};
        
        
        Random random = new Random();
        
       
        int numFilas = 5;
        
        
        String[][] tabla = new String[numFilas + 1][3];
        
        
        for (int i = 0; i < encabezados.length; i++) {
            tabla[0][i] = encabezados[i];
        }
        
        for (int i = 1; i <= numFilas; i++) {
            tabla[i][0] = String.valueOf(i); // ID
            tabla[i][1] = nombres[random.nextInt(nombres.length)]; 
            tabla[i][2] = String.valueOf(random.nextInt(50) + 18); 
        }
        
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
