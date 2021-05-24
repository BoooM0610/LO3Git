/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/** 
 * @version 1
 * @author edu
 */
public class Operaciones {
    /**
     * El metodo sumaPar guarda la suma de a + b en una variable resulado
     * @param a  guarda un valor de tipo entero
     * @param b  guarda un valor de tipo entero
     * @return  devuelve la variable resultado
     */

    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado;
        }else{
            return resultado+1;
        }
         
    }
    /**
     * @param a  guarda un valor de tipo entero
     * @param b  guarda un valor de tipo entero
     * @return  devuelve una de las dos variables
     */

    public int mayor(int a, int b) {
        if(a>b){
            return a;
        }else if(b>a){
            return b;
        }else{
            return a;
        }
         
    }
    /**
     * Se guarda en una variable sum, la suma de cada uno de los valores de numeros
     * @param numeros  guarda valores de tipo entero
     * @return  devuelve la variable sum
    */

   
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[i];
        }
        return sum;
        
    }
    
}
