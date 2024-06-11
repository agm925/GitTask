package table;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
public class RandomTable {
	public static void main(String[] args) {
		
		 // Encabezados de la tabla
        String[] encabezados = {"ID", "Nombre", "Edad", "Ciudad"};
        
        // Nombres para la columna "Nombre"
        String[] nombres = {"Juan", "Ana", "Luis", "Carlos", "Maria"};
        
        // Ciudades para la columna "Ciudad"
        String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao"};
        
        // Crear un objeto Random para generar valores aleatorios
        Random random = new Random();
        
        // Número de filas de la tabla (excluyendo los encabezados)
        int numFilas = 5;
        
        // Matriz para almacenar la tabla
        String[][] tabla = new String[numFilas][4];
        
        // Llenar las filas con datos aleatorios
        for (int i = 0; i < numFilas; i++) {
            tabla[i][0] = String.valueOf(i + 1); // ID
            tabla[i][1] = nombres[random.nextInt(nombres.length)]; // Nombre aleatorio
            tabla[i][2] = String.valueOf(random.nextInt(50) + 18); // Edad aleatoria entre 18 y 67
            tabla[i][3] = ciudades[random.nextInt(ciudades.length)]; // Ciudad aleatoria
        }
        
       
        Arrays.sort(tabla, new Comparator<String[]>() {
            @Override
            public int compare(String[] fila1, String[] fila2) {
                return fila1[1].compareTo(fila2[1]); 
            }
        });
        
        
        for (String encabezado : encabezados) {
            System.out.print(encabezado + "\t");
        }
        System.out.println();
        
        /
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
