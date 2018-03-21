/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.de.cadenas;

/**
 *
 * @author pedro
 */
public class ManejoDeCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char letra='a'; 
        String cadena="Esto es una cadena";
        String cadena1, cadena2, cadena3;
        cadena1="Hola";
        cadena2=" Mundo";
        
        //Uso de charAt
        if(cadena.charAt(2)=='t'){
            System.out.println("El tercer valor de la cadena es t");
        }

        //Uso de length
        System.out.println(cadena.length());
        
        
        //uso de charAt con String de longitud desconocida
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)=='s'){
                System.out.println("La letra en la posicion "+i+" es una s");
            }
        }
        
        //Concatenacion de String
        cadena3=cadena1+cadena2;
        System.out.println(cadena3);
        
        cadena3=cadena1+" Mundo";
        System.out.println(cadena3);
        
        //Uso de indexOf
        System.out.println(cadena.indexOf("t"));
        
        
        //Uso de upperCase y lowerCase
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());

        //Uso de replace
        cadena=cadena.replace('e', 'l');
        System.out.println(cadena);
        
        //Uso de split
        cadena="pedrisqui14@gmail.com";
        String[] cadena5=cadena.split("@");
        for(int i=0; i<cadena5.length;i++){
            System.out.println(cadena5[i]);
        }
        
    }
    
}
