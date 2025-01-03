/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicstore;

import entidade.Cd;
import entidade.Login;
import entidade.Tema;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tchis
 */
public class MusicStore {

    static ArrayList<Tema> arrayThemes = new ArrayList<>();
    static ArrayList<Cd> arrayCd = new ArrayList<>();

    public static void acessSistem() {
        System.out.println("---------------------------------------------------------------------------------------------------------- ");
        System.out.println("                                  #Bem-Vindo A Melhor Loja Discográfica Do País#                            ");
        System.out.println("                                               1 «-Login- »                            ");
        System.out.println("                                               0 «-Logout- »                                     ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("                       Escolhe a opção que deseja :");
    }

    public static void servicoDisponivel() {
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
        System.out.print(" Escolhe a opção que deseja :");
    }

    public static void menuArtigos() {
        System.out.println("");
        System.out.println(" 1 - Inserir Artigos ");
        System.out.println(" 2 - Alterar Artigos ");
        System.out.println(" 3 - Apagar Artigos ");
        System.out.println(" 0 - Voltar ...");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print(" Escolhe a opção que deseja :");
    }

    public static void menuTipoArtigos() {
        System.out.println("                                     1 - CD'S  ");
        System.out.println("                                     2 - DVD's ");
        System.out.println("                                3 - Livros Discos de Vinil");
        System.out.println("                                     0 - Voltar ...");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print(" Escolha O Artigo Que Deseja Inserir :");
    }

    public static void menuInterpretes() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" 1 - Inserir Intérpretes ");
        System.out.println(" 2 - Alterar Intérpretes ");
        System.out.println(" 3 - Apagar Intérpretes ");
        System.out.println(" 0 - Voltar ...");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("Escolhe a opção que deseja :");
    }

    public static Tema searchTheme(String tema, ArrayList<Tema> listauser) {
        for (Tema auxproc : listauser) {
            if (tema.equals(auxproc.nome)) {
                return auxproc;
            }
        }
        return null;
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
                            servicoDisponivel();
                            op2 = leitura.nextInt();
                            switch (op2) {
                                case 0:
                                    System.out.println(" Voltar....");
                                    break;
                                case 1:
                                    System.out.println(" -------------------------1-Inserir Novos Temas--------------------------------- ");
                                    int control = 1;
                                    String nameTheme;
                                    int id;
                                    do {
                                        System.out.print("Digite o nome do Tema:");
                                        leitura.nextLine();
                                        nameTheme = leitura.nextLine();
                                        // criação de um objecto Tema
                                        Tema theme = new Tema(nameTheme);
                                        //inserir o objecto num arraylist
                                        theme.inserirTemas(theme, arrayThemes);
                                        System.out.println("");
                                        System.out.print("Inserir mais? sim(1)/não(0):");
                                        control = leitura.nextInt();

                                    } while (control != 0);

                                    break;
                                case 2:
                                    System.out.println(" ---------------------------------2-Artigos---------------------------------------");
                                    int opA;
                                    String themeArtigo;
                                    do {
                                        menuArtigos();
                                        opA = leitura.nextInt();
                                        switch (opA) {
                                            case 1:
                                                int op4;
                                                do {
                                                    menuTipoArtigos();
                                                    op4 = leitura.nextInt();
                                                    switch (op4) {
                                                        case 1:
                                                            System.out.println("                        Inserir CD'S            ");
                                                            try {
                                                                System.out.println(" Digite o título do Cd :");
                                                                String titleCd = leitura.next();
                                                                System.out.println(" Digite o nome da Editora :");
                                                                String nameEditora = leitura.next();
                                                                System.out.println(" Digite o nome do Intreprete  :");
                                                                String nameInterprete = leitura.next();
                                                                ArrayList<String> interpreteCd = new ArrayList();
                                                                interpreteCd.add(nameInterprete);
                                                                System.out.println(" Digite o numero/quant de Discos  :");
                                                                int numDisco = leitura.nextInt();
                                                                //
                                                                leitura.nextLine();
                                                                System.out.println(" Digite a Data  YYYY-MM-DD :");
                                                                String dataString = leitura.nextLine();
                                                                // Convertere a String em date 
                                                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                                                Date data = sdf.parse(dataString);
                                                                System.out.println("Digite o tema para o CD");
                                                                String themeCd = leitura.next();
                                                                Tema aprov = searchTheme(themeCd, arrayThemes);
                                                                if (aprov != null) {
                                                                    System.out.println("Digite o preço de cada Cd :");
                                                                    double preco = leitura.nextDouble();
                                                                    Cd cd = new Cd(interpreteCd, nameEditora, data, titleCd, aprov, numDisco, preco);
                                                                    System.out.println(cd);
                                                                    arrayCd.add(cd);
                                                                    System.out.println("CD Registado Com Sucesso...");
                                                                } else {
                                                                    System.out.println("O Tema Digitado Não Existe...");
                                                                }
                                                            } catch (Exception e) {
                                                                System.out.println("Erro ao processar a data " + e.getMessage());
                                                            }
                                                            break;
                                                        case 2:

                                                            break;
                                                        case 3:
                                                            break;
                                                        default:
                                                            System.out.println(" A Opção Escolhida Para O Tipo De Artigo É Inválida");
                                                            break;
                                                    }
                                                } while (op4 != 0);
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
                                    System.out.println("-----------------------------3-Intérpretes----------------------------------------- ");
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
