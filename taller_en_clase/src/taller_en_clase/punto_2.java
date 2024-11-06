public class punto_2 {
	public static void main(String[] args) {
		
		//Ahora se crean las 2 matrices 
        int [] [] matri = new int [23] [23];
        int [] [] matro = new int [23] [23];
        
        
        //Ahora se procede a llenar las 2 matrices con numeros random
        
		for (int i = 0; i < 23; i++) {
			
			for (int j = 0; j < 23; j++) {
				System.out.println("La fila: " + i );
				System.out.println("La columna: " + j);
				matri [i] [j] = (int) (Math.random()*10);
				System.out.println("La matriz " + matri [i] [j] + " En cada posición");
			}
			
		}
		
		 System.out.println("\n");
		 System.out.println("La matriz 1 llena se ve asi:  ");
		 
		//Se llama el metodo que imprime la matriz
		 System.out.println(imprimir(matri));
		 
		 System.out.println("\n");
		 System.out.println("La matriz 2 llena se ve asi:  ");
		 System.out.println(imprimir(matri));
		 

		
		//Procedemos a hacer la suma de las matrices 
		
		int suma1 = suma(matri);
		int suma2 = suma(matro);
		float result = suma1+suma2;
		System.out.println("La suma de los numeros de la matriz 1 y 2 es:  " + result);

		//Utilizamos la funcion para poder calcular el factorial del resultado anterior
		
		System.out.println("EL factorial es: " + Factorial(result));
		
		
		
		
		
		
	}
	
	//Se crea un metodo que permita la suma de las matrices
	public static int suma(int matriz[] []) {
		
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
           
            for(int j = 0; j < matriz.length; j++) {
            	suma += matriz[i] [j];
            }
            
        }
        return suma;
	}
	
		//Esta funcion calcula el factorial de cualquier numero
		public static int Factorial(float n) {
			
		    int factorial = 1;
		    for (int i = 1; i <= n; ++i) {
		      factorial *= i;
		    }
		    return factorial;
		  }
 
		//metodo para poder imprimir las matrices
		public static int imprimir( int matriz[] []) {
			for (int x = 0; x < 23; x++) {
				
				for (int y = 0; y < 23; y++) {
					
					System.out.print(matriz [x] [y] + "  ");
				}
				
				System.out.println("\n");
			}
			return 0;
		 
		}
}