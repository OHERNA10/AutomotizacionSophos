package com.sophos.Capacitacion.Nivel1Clase2;


import java.util.Scanner;

public class Clase3 {

	public static void main( String[] args )
    {
        System.out.println( "Verificar si una persona ya es mayor de edad!" );
    
        Scanner Dato = new Scanner(System.in);
        
        int edad;
        System.out.println( "Digita tu Edad" );
              
       edad = Dato.nextInt();
        
    	   if (edad>=18) {
    		   System.out.println( "Es Mayor de edad" );
    	   }
    	   
    	   else {
    		   
    		   System.out.println( "Es Menor de edad" );
    	   }
    		   
    	   
    
    }
	
	
	
	
			
}



