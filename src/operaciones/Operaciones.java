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

    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado;
        }else{
            return resultado+1;
        }
         /**
         * @param <a> : guarda un valor de tipo entero
         * @param <b> : guarda un valor de tipo entero
         * @param <resultado> : guarda la suma de la variable a y la variable b como un valor de tipo entero
         * @return : devuelve la variable resultado
         */
    }

    public int mayor(int a, int b) {
        if(a>b){
            return a;
        }else if(b>a){
            return b;
        }else{
            return a;
        }
         /**
         * @param <a> : guarda un valor de tipo entero
         * @param <b> : guarda un valor de tipo entero
         * @return : devuelve una de las dos variables
         */
    }

   
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[i];
        }
        return sum;
         /**
         * @param <numeros> : guarda valores de tipo entero
         * @param <sum> : guarda un valor de tipo entero
         * @return : devuelve la variable sum
         */
    }
    
}
