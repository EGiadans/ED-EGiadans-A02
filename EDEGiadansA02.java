/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.egiadans.a02;

/**
 *
 * @author Eduardo
 */
public class EDEGiadansA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vector = {10,20,30,20};
        int resultado = sumaVector(vector,vector.length-1);
        System.out.println("Resultado: "+resultado);
        
        /*
        int num = factorial(5);
        System.out.println("El factorial de 5 es: "+num);
        */
        /*
        int [] vector = {1,2,3,4};
        int resultado = multipVector(vector,vector.length-1);
        System.out.println("Resultado: "+resultado);
        */
    }
    public static int sumaVector(int[] v, int n){
        if (n == 0){
            return v[n];
        } else {
            System.out.println("Posicion: "+n);
             return sumaVector(v ,n-1) + v[n];   
        }
    }
    
    public static int factorial (int n){
        if (n == 0){
            return 1;
        } else {
            System.out.println(n);
            return n*factorial(n-1);
        }
    }
    
    public static int multipVector(int[] v, int n) {
        if (n == 0){
            return v[n];
        } else {
            System.out.println("Posicion: "+n);
            return multipVector(v,n-1)*v[n];
        }        
    }
}
//Metodo es satatic dentro de una clase, el metodo puede ser llamado a traves de la clase
//evitando instancias de objetos JAVA