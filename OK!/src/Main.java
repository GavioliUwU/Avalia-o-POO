import model.Biblioteca;
import model.Livros;

import java.util.ArrayList;

public class Main {
        public static void main(String[]args){

            Biblioteca senai = new Biblioteca("senai", 1);
            ArrayList<Livros> livro = new ArrayList<Livros>();
            livro.add(new Livros("Sonho de uma noite de verao","a"));
            livro.add(new Livros("Hamlet","a"));
            livro.add(new Livros("Romeu e Julieta", "a"));
            livro.add(new Livros("Megera domada", "a"));
            livro.add(new Livros("Macbeth", "a"));
           senai.setLivros(livro);
            System.out.println(senai.lista());

            Biblioteca estadual = new Biblioteca("estadual",2);
            ArrayList<Livros> livro2 = new ArrayList<Livros>();
            livro2.add(new Livros("Bruxa mais fada", "a"));
            livro2.add(new Livros("O jardim dos elfos", "a"));
            livro2.add(new Livros("O caçador de bruxas", "a"));
            livro2.add(new Livros("A Dama de Prata", "a"));
            livro2.add(new Livros("A hora do encantamento", "a"));

            estadual.setLivros(livro2);
            System.out.println(estadual.lista());


        }



}
