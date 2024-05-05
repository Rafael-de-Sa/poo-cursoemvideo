/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Pedro", 22, "M");
        pessoa[1] = new Pessoa("Maria", 25, "F");

        livro[0] = new Livro("Aprendendo Java", "José da Silva", 300, pessoa[0]);
        livro[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, pessoa[1]);
        livro[2] = new Livro("Maria Candido", "José da Silva", 800, pessoa[0]);

        livro[0].abrir();
        livro[0].folhear(100);
        livro[0].avancarPag();

        System.out.println(livro[0].detalhes());

        System.out.println(livro[1].detalhes());

    }
}
