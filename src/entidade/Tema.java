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
public class Tema {

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tema(String nome) {
        this.nome = nome;
    }

    public Tema() {
    }

    // Metodo para inserir  um tema em um arraylist
    public void inserirTemas(Tema aux, ArrayList<Tema> listauser) {
        listauser.add(aux);
        System.out.print("Inserido com Sucesso \n");
    }

    // Metodo para imprimir o arraylist de temas 
    public void impremirTemas(ArrayList<Tema> listauser) {
        for (Tema aux : listauser) {
            System.out.println("--------------------------------------------------");
            System.out.println(" Nome: " + aux.nome);
            System.out.println("--------------------------------------------------");

        }
    }

}
