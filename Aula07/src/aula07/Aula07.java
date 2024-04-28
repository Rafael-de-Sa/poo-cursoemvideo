/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class Aula07 {

    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 1.75f, 68.9f, 31, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 29, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 1.65f, 80f, 35, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 1.93f, 81.6f, 28, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 1.7f, 119.3f, 37, 5, 4, 3);
        l[5] = new Lutador("Nerdard", "EUA", 1.81f, 105.7f, 30, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();

    }
}
