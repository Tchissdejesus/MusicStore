/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author tchis
 */
public class Artigo {

    protected String titulo;
    protected Tema tema;
    protected int numArtigo;
    protected double preco;
    protected int artigovendido;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public int getNumArtigo() {
        return numArtigo;
    }

    public void setNumArtigo(int numArtigo) {
        this.numArtigo = numArtigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getArtigovendido() {
        return artigovendido;
    }

    public void setArtigovendido(int artigovendido) {
        this.artigovendido = artigovendido;
    }

    public Artigo(String titulo, Tema tema, int quant, double preco) {
        this.titulo = titulo;
        this.tema = tema;
        this.numArtigo = quant;
        this.preco = preco;
        this.artigovendido = 0;
    }

}
