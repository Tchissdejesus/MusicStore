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
    protected Tema Tema;
 
    public Artigo(String titulo, Tema Tema) {
        this.titulo = titulo;
        this.Tema = Tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tema getTema() {
        return Tema;
    }

    public void setTema(Tema Tema) {
        this.Tema = Tema;
    }
    
    
}
