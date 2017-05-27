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
public class Leite extends BebidaDecorator {
    
    
    public Leite(Bebida bebida) {
       super(bebida);
    }

    @Override
    public String getDescricao() {
        return " Leite " + super.getDescricao() ;
    }

    @Override
    public float getCusto() {
        return 3 + super.getCusto();
    }

    @Override
    public float getCaloria() {
        return 50 + super.getCaloria();
    }

}
