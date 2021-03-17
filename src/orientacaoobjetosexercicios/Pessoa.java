/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjetosexercicios;

/**
 *
 * @author roger
 */
public class Pessoa {

    private double peso = 0;

    public Pessoa(double pesoInicial) {

        this.peso = pesoInicial;
    }

    public double getPeso() {
        return peso;
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

}
