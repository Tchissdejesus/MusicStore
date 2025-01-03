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
    protected Tema tema ;
 
    public Artigo(String titulo, Tema Tema) {
        this.titulo = titulo;
        this.tema = Tema;
    }

    public Artigo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema Tema) {
        this.tema = Tema;
    }
    @Override
    public String toString() {
        return "Artigo{" + "titulo=" + titulo + ", Tema=" + tema + '}';
    }
    
    
}
