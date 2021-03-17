/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjetosexercicios;

import com.sun.org.apache.bcel.internal.generic.IFEQ;

/**
 *
 * @author roger
 */
public class Comida {

    private double peso = 0;

    public void setPeso(double peso) {
        if (peso > 0) {

            this.peso = peso;
        }
    }

    public double getPeso() {
        return peso;
    }

}
