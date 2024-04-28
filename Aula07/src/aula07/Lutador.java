/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class Lutador implements ILutador {

    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(float peso) {
        if (peso <= 52.5) {
            this.categoria = "Inválido";
        }
        if (peso > 52.5 && peso <= 70.3) {
            this.categoria = "Leve";
        }
        if (peso > 70.3 && peso <= 83.9) {
            this.categoria = "Médio";
        }
        if (peso > 83.9 && peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }

    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;

        this.setCategoria(this.getPeso());

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.println("É um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, float altura, float peso, int idade, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

}
