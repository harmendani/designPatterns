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
public class Chocolate extends BebidaDecorator{

    @Override
    public String getDescricao() {
        return " Chocolate " + super.getDescricao();
    }

    @Override
    public float getCusto() {
        return 10 + super.getCusto();
    }

    @Override
    public float getCaloria() {
       return 70 + super.getCaloria();
    }

    public Chocolate(Bebida bebida) {
        super(bebida);
    }
    
}
