/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class Cachorro extends Lobo {

    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");
    }

    public void rosnar() {
        System.out.println("Rosnando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if ("toma comida".equals(frase) || "Olá".equals(frase)) {
            this.emitirSom();
            this.abanarRabo();
        } else {
            this.rosnar();
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            this.abanarRabo();
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            this.abanarRabo();
            this.emitirSom();
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            this.abanarRabo();
        } else {
            this.rosnar();
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                this.abanarRabo();
            } else {
                this.emitirSom();
            }
        }
    }

}
