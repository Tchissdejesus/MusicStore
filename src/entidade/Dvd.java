/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.ArrayList;

/**
 *
 * @author tchis
 */
public class Dvd extends Artigo {

    protected ArrayList<String> actores;
    protected String estudio;
    protected int numeroDiscos;
    protected String lingua;
    protected int zona;
    protected String cor;

    public Dvd(ArrayList<String> actores, String estudio, int numeroDiscos, String lingua, int zona, String cor, String titulo, entidade.Tema Tema) {
        super(titulo, Tema);
        this.actores = actores;
        this.estudio = estudio;
        this.numeroDiscos = numeroDiscos;
        this.lingua = lingua;
        this.zona = zona;
        this.cor = cor;
    }

}
