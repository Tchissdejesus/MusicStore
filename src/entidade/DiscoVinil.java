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
public class DiscoVinil extends Artigo {

    protected ArrayList<String> interpretes;
    protected String editora;
    protected int numeroDisco;
    protected Date dataLançamento;
    protected TipoDiscoVinil tipo;

    public DiscoVinil(ArrayList<String> interpretes, String editora, int numeroDisco, Date dataLançamento, TipoDiscoVinil tipo, String titulo, entidade.Tema Tema) {
        super(titulo, Tema);
        this.interpretes = interpretes;
        this.editora = editora;
        this.numeroDisco = numeroDisco;
        this.dataLançamento = dataLançamento;
        this.tipo = tipo;
    }


    
    
}
