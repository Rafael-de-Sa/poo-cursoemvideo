/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

import java.util.Random;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class Luta implements ILuta {
    
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;
    
    @Override
    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        this.setDesafiante(desafiante);
        this.setDesafiado(desafiado);

        /*Pode ser marcada somente por lutadores da mesma categoria.
        *O desafiado e desafiante devem ser jogadores diferentes.
        *Só pode ser se for aprovada.
        *Só pode ter como resultado a vitória de um lutador ou empate.
         */
        if (this.desafiante.getCategoria().equals(this.desafiado.getCategoria()) && this.desafiante != this.desafiado) {
            this.aprovada = true;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    
    @Override
    public void lutar() {
        if (this.isAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);

            switch (vencedor) {
                case 0 -> {
                    //Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    //Desafiado Ganhou
                    System.out.println(this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    //Desafiante Ganhou
                    System.out.println(this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
                default ->
                    System.out.println("Resultado Inválido");
            }
            
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }
    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiante() {
        return desafiante;
    }
    
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public int getRounds() {
        return rounds;
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public boolean isAprovada() {
        return aprovada;
    }
    
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
