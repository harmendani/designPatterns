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
public class BebidaDecorator extends Bebida {
    
    Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao();
    }

    @Override
    public float getCusto() {
       return this.bebida.getCusto() ;
    }

    @Override
    public float getCaloria() {
       return this.bebida.getCaloria();
    }
   

    
    
}
