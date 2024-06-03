package table;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
public class RandomTable {
	public static void main(String[] args) {
		
        String[] encabezados = {"ID", "Nombre", "Edad"};
        
        
        String[] nombres = {"Juan", "Ana", "Luis", "Carlos", "Maria"};
        
        
        Random random = new Random();
        
        
        int numFilas = 5;
        
        
        String[][] tabla = new String[numFilas][3];
        
      
        for (int i = 0; i < numFilas; i++) {
            tabla[i][0] = String.valueOf(i + 1); // ID
            tabla[i][1] = nombres[random.nextInt(nombres.length)]; 
            tabla[i][2] = String.valueOf(random.nextInt(50) + 18); 
        }
        
        
        Arrays.sort(tabla, new Comparator<String[]>() {
            @Override
            public int compare(String[] fila1, String[] fila2) {
                return Integer.compare(Integer.parseInt(fila1[2]), Integer.parseInt(fila2[2]));
            }
        });
        
        for (String encabezado : encabezados) {
            System.out.print(encabezado + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
