/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class ProjetoYoutube {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
        g[1] = new Gafanhoto("Creuza", "F", 12, "creuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[0], v[2]);
        vis[3] = new Visualizacao(g[1], v[0]);
        vis[3].avaliar(87f);
        vis[4] = new Visualizacao(g[1], v[0]);

        System.out.println(v[0].getAvaliacao());//1
        System.out.println(v[0].toString());
    }

}
