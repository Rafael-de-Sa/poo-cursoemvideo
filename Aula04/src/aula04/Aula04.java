/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author rafae
 */
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarela");//Criando o objeto com o construtor
        c1.status();

        Caneta c2 = new Caneta("KKK", 1.5f, "Laranja");
        c2.status();

        /*
        c1.setModelo("BIC");
        //c1.modelo = ("BIC");

        c1.setPonta(0.5f); // por ser Float tem que por o f na frente
        //c1.ponta = 0.5f; - Não funciona por ser privado

        //Acesso a informação utilizando o get, por serem atributos privados
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c1.status();
         */
    }
}
