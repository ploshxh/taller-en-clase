package taller_en_clase;

public class punto1 {

	public static void main(String[] args) {
		
		// a) hacer una matriz 23x23, llamarla aleatoriamente de numeros
		
		//se define el tamaño de la matriz 
		
		int row = 23;
		int column = 23;
		
		int[] [] matriz = new int [row] [column];
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < column; j++) {
				
				System.out.println("La fila: " +i );
				System.out.println("La columna: " +j );
				matriz [i] [j] = (int) (Math.random());
				System.out.println("la matriz" + matriz [i] [j] + "En cada posicion");
				
				
			}
			
		}
		
        for (int x = 0; x < row; x++) {
        
          for (int y = 0; y < column; y++) {
        	  
        	  System.out.println(matriz [x] [y] + "  ");
          }
          
          System.out.println("\n");
        }
		
		// b) sumar y guardar tosdos los numeros en una variable de tipo float 
        
      
        float resultado = suma(matriz);
        System.out.println("La suma de los numeros de la matriz es:" + resultado);
        
        
         // c) Calcular el factoriaL del numero entero del paso b
        
        int factorial = 0 ;
        
        
        
		
		
	}
   
     public static int suma(int matriz [] [] ) {
    	 
    	 int suma =0;
    	 for (int i = 0; i < matriz.length; i++) {
    		 
    		 for(int j = 0; j < matriz.length; j++) {
    			 suma += matriz[i] [j];
    		 }
    	 }
    	 
    	 return suma;
     }

