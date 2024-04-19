/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopratico;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class ExemploPratico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ContaBanco c1 = new ContaBanco(124, "cc", "Rafael");
        c1.dados();
        c1.sacar(5);
        c1.dados();
        c1.pagarMensal();
        c1.dados();
    }

}
