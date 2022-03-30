package model;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private int id;
    private ArrayList<Livros> livros;

    public Biblioteca(String nome, int id){
        this.id = id;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLivros(ArrayList<Livros> livros) {
        this.livros = livros;
    }

    public ArrayList<Livros> getLivros() {
        return livros;
    }

    public String lista(){
        String saida = "nome: " + nome +
                "\nId: " + id +"\n"
                + "Titulos: \n";
        for (int i =0; i<livros.size();i++){
            saida += livros.get(i).getTitulo() + livros.get(i).getEditora() +"\n";
        }
        return saida;
    }

}
