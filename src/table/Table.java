package table;

public class Table {
	public static void main(String [] args) {
		String[][] tabla = {
	            {"ID", "Nombre", "Edad"},
	            {"1", "Juan", "25"},
	            {"2", "Ana", "30"},
	            {"3", "Luis", "28"}
	        };

	        
	        for (int i = 0; i < tabla.length; i++) {
	            for (int j = 0; j < tabla[i].length; j++) {
	                System.out.print(tabla[i][j] + "\t");
	            }
	            System.out.println();
	        }
	}
}
