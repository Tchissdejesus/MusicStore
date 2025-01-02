/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicstore;

import entidade.Login;
import entidade.Tema;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tchis
 */
public class MusicStore {

    static ArrayList<Tema> arrayThemes = new ArrayList<>();

    public static void acessSistem() {
        System.out.println("---------------------------------------------------------------------------------------------------------- ");
        System.out.println("                                  #Bem-Vindo A Melhor Loja Discográfica Do País#                            ");
        System.out.println("                                               1 «-Login- »                            ");
        System.out.println("                                               0 «-Logout- »                                     ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("                       Escolhe a opção que deseja :");
    }

    public static void menuLogin() {
        System.out.println("---------------------------«- Serviços Disponíveis -»-----------------------------------");
        System.out.println("");
        System.out.println(" 1 - Inserir Novos Temas ");
        System.out.println(" 2 - Inserir,Alterar e Apagar Artigos ");
        System.out.println(" 3 - Inserir,Alterar e Apagar Intérpretes ");
        System.out.println(" 4 - Actualizar o Stock e as Vendas dos Artigos  ");
        System.out.println(" 5 - Actualizar o Preço dos Artigos ");
        System.out.println(" 6 - Efectuar vários tipos de consultas ");
        System.out.println(" 0 - Voltar ");
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("                       Escolhe a opção que deseja :");
    }

    public static void menuArtigos() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" 1 - Inserir Artigos ");
        System.out.println(" 2 - Alterar Artigos ");
        System.out.println(" 3 - Apagar Artigos ");
        System.out.println(" 0 - Voltar ...");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("                       Escolhe a opção que deseja :");
    }

    public static void menuInterpretes() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" 1 - Inserir Intérpretes ");
        System.out.println(" 2 - Alterar Intérpretes ");
        System.out.println(" 3 - Apagar Intérpretes ");
        System.out.println(" 0 - Voltar ...");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("                       Escolhe a opção que deseja :");
    }

    public static boolean searchTheme(String tema, ArrayList<Tema> listauser) {
        for (Tema auxproc : listauser) {
            if (tema == auxproc.nome) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner leitura = new Scanner(System.in);
        int op;
        int op2;
        do {
            acessSistem();
            op = leitura.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------------------------Login-------------------------------------");
                    System.out.print("Digite o seu nome:");
                    String name = leitura.next();
                    System.out.print("Digite a sua senha:");
                    String key = leitura.next();
                    Login acess = new Login(name, key);
                    boolean loginVerific = acess.login(name, key);
                    if (loginVerific == true) {
                        do {
                            menuLogin();
                            op2 = leitura.nextInt();
                            switch (op2) {
                                case 1:
                                    System.out.println(" --------------------------Inserir Novos Temas--------------------------------- ");
                                    int control = 1;
                                    String nameTheme;
                                    int id;
                                    do {
                                        System.out.print("Digite o nome do Tema:");
                                        leitura.nextLine();
                                        nameTheme = leitura.nextLine();
                                        id = gerador.nextInt(1000) + 1;
                                        // criação de um objecto Tema
                                        Tema theme = new Tema(id, nameTheme);
                                        //inserir o objecto num arraylist
                                        theme.inserirTemas(theme, arrayThemes);
                                        System.out.println("");
                                        System.out.print("Inserir mais? sim(1)/não(0):");
                                        control = leitura.nextInt();
                                    } while (control != 0);
                                    break;
                                case 2:
                                    System.out.println(" ----------------------------------Artigos---------------------------------------");
                                    int opA;
                                    do {
                                        menuArtigos();
                                        opA = leitura.nextInt();
                                        switch (opA) {
                                            case 1:
                                                System.out.println(" 1 - Inserir Artigos ");
                                                System.out.println("Digite o Tema para o Artigo");
                                                String themeArtigo = leitura.next();
                                                boolean teste = searchTheme(themeArtigo, arrayThemes);
                                                if (teste == true) {
                                                    int op4;
                                                    do {
                                                        System.out.println(" Artigos Como :");
                                                        System.out.println(" 1 - CD'S  ");
                                                        System.out.println(" 2 - DVD's ");
                                                        System.out.println(" 3 - Livros Discos de Vinil");
                                                        System.out.println(" Escolha O Artigo Que Deseja Inserir :");
                                                        op4 = leitura.nextInt();
                                                        switch (op4) {
                                                            case 1:  
                                                                break;
                                                            case 2:
                                                                break;
                                                            case 3:
                                                                break;
                                                            default: System.out.println(" A Opção Escolhida Para O Tipo De Arigo É Inválida");
                                                                break;
                                                        }
                                                    } while (op4 != 0);
                                                } else {
                                                    System.out.println("Esse Tema Não Está Registado...");
                                                }

                                                break;
                                            case 2:
                                                System.out.println(" 2 - Alterar Artigos ");
                                                break;
                                            case 3:
                                                System.out.println(" 3 - Apagar Artigos ");
                                                break;
                                            default:
                                                System.out.println(" A Opção Escolhida Para O Artigo É Inválida");
                                                break;
                                        }
                                    } while (opA != 0);
                                    break;
                                case 3:
                                    System.out.println("------------------------------ Intérpretes----------------------------------------- ");
                                    int opI;
                                    do {
                                        menuArtigos();
                                        opI = leitura.nextInt();
                                        switch (opI) {
                                            case 1:
                                                System.out.println(" 1 - Inserir Intérpretes ");
                                                break;
                                            case 2:
                                                System.out.println(" 2 - Alterar Intérpretes ");
                                                break;
                                            case 3:
                                                System.out.println(" 3 - Intérpretes ");
                                                break;
                                            default:
                                                System.out.println("A Opção Escolhida Para O Intérpretes É Inválida ");
                                                break;

                                        }
                                    } while (opI != 0);
                                    break;
                                case 4:
                                    System.out.println(" 4 - Actualizar o Stock e as Vendas dos Artigos  ");
                                    break;
                                case 5:
                                    System.out.println(" 5 - Actualizar o Preço dos Artigos ");
                                    break;
                                case 6:
                                    System.out.println(" 6 - Efectuar vários tipos de consultas ");
                                    break;
                                default:
                                    System.out.println("A Opção Escolhida Para Os Serviços Dispóniveis É Invalida ");
                                    break;
                            }
                        } while (op2 != 0);

                    } else {
                        System.out.println("Nome ou Senha Errada. Tente novamente");
                    }
                    break;
                case 0:
                    System.out.println("Terminando a Secção...");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        } while (op != 0);
    }
}
