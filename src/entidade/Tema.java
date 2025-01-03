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

    // Metodo que verifica se o nome do Tema já existe no arraylist
    public int existenciaTema(Tema aux, ArrayList<Tema> listauser) {
        int cont = -1;
        for (Tema tema : listauser) {
            ++cont;
            if (tema.getNome().equals(aux.getNome())) {
                return cont;
            }
        }
        return -1;
    }

    // Metodo para inserir  um tema novo em um arraylist
    public void inserirTemas(Tema aux, ArrayList<Tema> listauser) {
        if (existenciaTema(aux, listauser) == -1) {
            listauser.add(aux);
            System.out.print("Inserido com Sucesso \n");
        } else {
            System.out.println("Tema Já Existe...");
        }
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
