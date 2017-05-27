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
public class Rum extends BebidaDecorator {

    public Rum(Bebida bebida) {
       super(bebida);
    }

    @Override
    public String getDescricao() {
     return" Rum " + super.getDescricao() ;
    }

    @Override
    public float getCusto() {
         
        return 5 + super.getCusto();
    }

    @Override
    public float getCaloria() {
        return 25 + super.getCaloria();
    }
}
