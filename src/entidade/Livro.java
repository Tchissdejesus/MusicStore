/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tchis
 */
public class Livro extends Artigo {

    protected ArrayList<String> autores;
    protected String coleccao;
    protected String editora;
    protected Date anoDeEdicao;

    public Livro(ArrayList<String> autores, String coleccao, String editora, Date anoDeEdicao, String titulo, entidade.Tema Tema) {
        super(titulo, Tema);
        this.autores = autores;
        this.coleccao = coleccao;
        this.editora = editora;
        this.anoDeEdicao = anoDeEdicao;
    }

}
