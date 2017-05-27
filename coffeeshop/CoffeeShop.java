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
public class CoffeeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializa Bebida Base
        Bebida bebida = new Cafe();
        System.out.println(bebida.getDescricao() + " = R$" + bebida.getCusto() + " com " + bebida.getCaloria() + " Calorias");

        //Decorando1
        bebida = new Rum(bebida);
        System.out.println(bebida.getDescricao() + " = R$" + bebida.getCusto() + " com " + bebida.getCaloria() + " Calorias");

        //Decorando2
        bebida = new Leite(bebida);
        System.out.println(bebida.getDescricao() + " = R$" + bebida.getCusto() + " com " + bebida.getCaloria() + " Calorias");

        // Decorando 3
        bebida = new Chocolate(bebida);
        System.out.println(bebida.getDescricao() + " = R$" + bebida.getCusto() + " com " + bebida.getCaloria() + " Calorias");
    }

}
