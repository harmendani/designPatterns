/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeshop;

/**
 *
 * @author harmendani
 */
public class Cafe extends Bebida {

    public Cafe() {
 
    }

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public float getCusto() {
        return (float) 1.5;
    }

    @Override
    public float getCaloria() {
        return 50;
    }

}
