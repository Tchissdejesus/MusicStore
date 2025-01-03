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
public class Cd extends Artigo {
    protected ArrayList<String> interpretes;
    protected String editora ;
    protected int numeroDisco;
    protected Date dataLancamento;

    public ArrayList<String> getInterpretes() {
        return interpretes;
    }

    public String getEditora() {
        return editora;
    }

    public int getNumeroDisco() {
        return numeroDisco;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tema getTema() {
        return tema;
    }
    

    public Cd(ArrayList<String> interpretes, String editora, int numeroDisco, Date dataLancamento, String titulo, entidade.Tema tema) {
        super(titulo, tema);
        this.interpretes = interpretes;
        this.editora = editora;
        this.numeroDisco = numeroDisco;
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Cd{" + "interpretes=" + interpretes + ", editora=" + editora + ", numeroDisco=" + numeroDisco + ", dataLancamento=" + dataLancamento + '}';
    }
  



    



    

   
    
    
}
