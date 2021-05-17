/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import static batalhanaval.Tabelas.tabela1;
import static batalhanaval.Tabelas.tabela2;
import static batalhanaval.Tabelas.tabelaResposta1;
import static batalhanaval.Tabelas.tabelaResposta2;
import java.util.Scanner;
/**
 *
 * @author Casa
 */
public class BatalhaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        String jogador1[][] = new String[15][15];
        String jogador2[][] = new String[15][15];
        String tabelaResposta1[][] = new String[15][15];
        String tabelaResposta2[][] = new String[15][15];
        int linha = 0, coluna = 0, barcos = 0;
        boolean correto = false;
        
        //Preenchendo as casas com um espaço vazio
        for (int L = 0; L < jogador1.length; L++){//L de linha
            for (int C = 0; C < jogador1.length; C++){//C de coluna
                jogador1[L][C] = "     ";
                jogador2[L][C] = "     ";
                tabelaResposta1[L][C] = "     ";
                tabelaResposta2[L][C] = "     ";
            }
        }
        
        
        /*
        for (int i = 0; i < jogador1.length; i++){
            jogador1[1][i] = "     ";
            jogador2[1][i] = "     ";
            tabelaResposta1[1][i] = "     ";
            tabelaResposta2[1][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[2][i] = "     ";
            jogador2[2][i] = "     ";
            tabelaResposta1[2][i] = "     ";
            tabelaResposta2[2][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[3][i] = "     ";
            jogador2[3][i] = "     ";
            tabelaResposta1[3][i] = "     ";
            tabelaResposta2[3][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[4][i] = "     ";
            jogador2[4][i] = "     ";
            tabelaResposta1[4][i] = "     ";
            tabelaResposta2[4][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[5][i] = "     ";
            jogador2[5][i] = "     ";
            tabelaResposta1[5][i] = "     ";
            tabelaResposta2[5][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[6][i] = "     ";
            jogador2[6][i] = "     ";
            tabelaResposta1[6][i] = "     ";
            tabelaResposta2[6][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[7][i] = "     ";
            jogador2[7][i] = "     ";
            tabelaResposta1[7][i] = "     ";
            tabelaResposta2[7][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[8][i] = "     ";
            jogador2[8][i] = "     ";
            tabelaResposta1[8][i] = "     ";
            tabelaResposta2[8][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[9][i] = "     ";
            jogador2[9][i] = "     ";
            tabelaResposta1[9][i] = "     ";
            tabelaResposta2[9][i] = "     ";
        }
        for (int i = 0; i < jogador1.length; i++){
            jogador1[10][i] = "     ";
            jogador2[10][i] = "     ";
            tabelaResposta1[10][i] = "     ";
            tabelaResposta2[10][i] = "     ";
        }*/
        tabela1(jogador1);
        //Jogador 1 montando sua tabela
        System.out.println("\n\n-JOGADOR 1--\n");
        
        //1 barco de 4 casas
        while (correto == false){
            System.out.println("-Insira um barco de 4 casas");
            System.out.print("linha: ");
            linha = leia.nextInt();
            System.out.print("Coluna: ");
            coluna = leia.nextInt();
            
            if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                System.out.println("--------------------------------------------");
                System.out.println("Essa linha ou coluna não existe!");
                System.out.println("--------------------------------------------");
            } else {
                correto = true;
            }
        }
        correto = false;
        if (coluna > 7){
            jogador1[linha][coluna] = "Barco";
            jogador1[linha][coluna-1] = "Barco";
            jogador1[linha][coluna-2] = "Barco";
            jogador1[linha][coluna-3] = "Barco";
        } else {
            jogador1[linha][coluna] = "Barco";
            jogador1[linha][coluna+1] = "Barco";
            jogador1[linha][coluna+2] = "Barco";
            jogador1[linha][coluna+3] = "Barco";
        }
        

        System.out.println("Seu barco ficou aqui:");
        tabela1(jogador1);

        //2 barcos de 3 casas
        while (barcos < 2){
            while (correto == false){
                System.out.println("\n\nInsira o " + (barcos+1) + "° barco de 3 casas");
                System.out.print("linha: ");
                linha = leia.nextInt();
                System.out.print("Coluna: ");
                coluna = leia.nextInt();
                
                if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa linha ou coluna não existe!");
                    System.out.println("--------------------------------------------");
                } else {
                    correto = true;
                }
            }
            correto = false;
            if (coluna > 8){
                
                if ((jogador1[linha][coluna].equals("Barco")) ||
                        (jogador1[linha][coluna-1].equals("Barco")) || 
                        (jogador1[linha][coluna-2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");

                } else if((linha == 10)){
                        if ((jogador1[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                                (jogador1[linha-1][coluna].equals("Barco")) ||
                                (jogador1[linha-1][coluna-1].equals("Barco")) ||
                                (jogador1[linha-1][coluna-2].equals("Barco")) ||
                                (jogador1[linha-1][coluna-3].equals("Barco")) ||
                                (jogador1[linha][coluna+1].equals("Barco")) ||
                                (jogador1[linha][coluna-3].equals("Barco"))){
                            System.out.println("--------------------------------------------");
                            System.out.println("Exite um barco em torno da casa selecionada!");
                            System.out.println("--------------------------------------------");
                        } else {
                            jogador1[linha][coluna] = "Barco";
                            jogador1[linha][coluna-1] = "Barco";
                            jogador1[linha][coluna-2] = "Barco";

                            System.out.println("Seu barco ficou aqui:");
                            tabela1(jogador1);

                            barcos++;
                        }
                
                } else if((linha == 1)){
                        if ((jogador1[linha][coluna+1].equals("Barco")) ||
                                (jogador1[linha][coluna-3].equals("Barco")) ||
                                (jogador1[linha+1][coluna+1].equals("Barco")) ||
                                (jogador1[linha+1][coluna].equals("Barco")) ||
                                (jogador1[linha+1][coluna-1].equals("Barco")) ||
                                (jogador1[linha+1][coluna-2].equals("Barco")) ||
                                (jogador1[linha+1][coluna-3].equals("Barco"))) {
                            System.out.println("--------------------------------------------");
                            System.out.println("Exite um barco em torno da casa selecionada!");
                            System.out.println("--------------------------------------------");
                        } else {
                            jogador1[linha][coluna] = "Barco";
                            jogador1[linha][coluna-1] = "Barco";
                            jogador1[linha][coluna-2] = "Barco";

                            System.out.println("Seu barco ficou aqui:");
                            tabela1(jogador1);

                            barcos++;
                        }
                    
                } else if((jogador1[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador1[linha-1][coluna].equals("Barco")) ||
                        (jogador1[linha-1][coluna-1].equals("Barco")) ||
                        (jogador1[linha-1][coluna-2].equals("Barco")) ||
                        (jogador1[linha-1][coluna-3].equals("Barco")) ||
                        (jogador1[linha][coluna+1].equals("Barco")) ||
                        (jogador1[linha][coluna-3].equals("Barco")) ||
                        (jogador1[linha+1][coluna+1].equals("Barco")) ||
                        (jogador1[linha+1][coluna].equals("Barco")) ||
                        (jogador1[linha+1][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna-2].equals("Barco")) ||
                        (jogador1[linha+1][coluna-3].equals("Barco"))) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                
                } else {
                    jogador1[linha][coluna] = "Barco";
                    jogador1[linha][coluna-1] = "Barco";
                    jogador1[linha][coluna-2] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela1(jogador1);
        
                    barcos++;
                }
            } else {
                if ((jogador1[linha][coluna].equals("Barco")) ||
                        (jogador1[linha][coluna+1].equals("Barco")) || 
                        (jogador1[linha][coluna+2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");
                
                } else if ((linha == 10)){
                    if ((jogador1[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                            (jogador1[linha-1][coluna].equals("Barco")) ||
                            (jogador1[linha-1][coluna+1].equals("Barco")) ||
                            (jogador1[linha-1][coluna+2].equals("Barco")) ||
                            (jogador1[linha-1][coluna+3].equals("Barco")) ||
                            (jogador1[linha][coluna+3].equals("Barco")) ||
                            (jogador1[linha][coluna-1].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador1[linha][coluna] = "Barco";
                        jogador1[linha][coluna+1] = "Barco";
                        jogador1[linha][coluna+2] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela1(jogador1);

                        barcos++;
                    }
                    
                } else if ((linha == 1)){
                    if ((jogador1[linha][coluna+3].equals("Barco")) ||
                            (jogador1[linha][coluna-1].equals("Barco")) ||
                            (jogador1[linha+1][coluna-1].equals("Barco")) ||
                            (jogador1[linha+1][coluna].equals("Barco")) ||
                            (jogador1[linha+1][coluna+1].equals("Barco")) ||
                            (jogador1[linha+1][coluna+2].equals("Barco")) ||
                            (jogador1[linha+1][coluna+3].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador1[linha][coluna] = "Barco";
                        jogador1[linha][coluna+1] = "Barco";
                        jogador1[linha][coluna+2] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela1(jogador1);

                        barcos++;
                    }
                    
                } else if ((jogador1[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador1[linha-1][coluna].equals("Barco")) ||
                        (jogador1[linha-1][coluna+1].equals("Barco")) ||
                        (jogador1[linha-1][coluna+2].equals("Barco")) ||
                        (jogador1[linha-1][coluna+3].equals("Barco")) ||
                        (jogador1[linha][coluna+3].equals("Barco")) ||
                        (jogador1[linha][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna].equals("Barco")) ||
                        (jogador1[linha+1][coluna+1].equals("Barco")) ||
                        (jogador1[linha+1][coluna+2].equals("Barco")) ||
                        (jogador1[linha+1][coluna+3].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                
                } else {
                    jogador1[linha][coluna] = "Barco";
                    jogador1[linha][coluna+1] = "Barco";
                    jogador1[linha][coluna+2] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela1(jogador1);
                    
                    barcos++;
                }
            }            
        }
        barcos = 0;

        //3 barcos de 2 casas
        while (barcos < 3){
            while (correto == false){
                System.out.println("\n\nInsira o " + (barcos+1) + "° barco de 2 casas");
                System.out.print("linha: ");
                linha = leia.nextInt();
                System.out.print("Coluna: ");
                coluna = leia.nextInt();
                if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa linha ou coluna não existe!");
                    System.out.println("--------------------------------------------");
                } else {
                    correto = true;
                }
            }
            correto = false;
            
            if (coluna > 9){
                if ((jogador1[linha][coluna].equals("Barco")) || 
                        (jogador1[linha][coluna-1].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");
                
                } else if (linha == 10){
                    if ((jogador1[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador1[linha-1][coluna].equals("Barco")) ||
                        (jogador1[linha-1][coluna-1].equals("Barco")) ||
                        (jogador1[linha-1][coluna-2].equals("Barco")) ||
                        (jogador1[linha][coluna+1].equals("Barco")) ||
                        (jogador1[linha][coluna-2].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador1[linha][coluna] = "Barco";
                        jogador1[linha][coluna-1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela1(jogador1);

                        barcos++;
                    }
                    
                } else if (linha == 1){
                    if ((jogador1[linha][coluna+1].equals("Barco")) ||
                        (jogador1[linha][coluna-2].equals("Barco")) ||
                        (jogador1[linha+1][coluna+1].equals("Barco")) ||
                        (jogador1[linha+1][coluna].equals("Barco")) ||
                        (jogador1[linha+1][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna-2].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador1[linha][coluna] = "Barco";
                        jogador1[linha][coluna-1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela1(jogador1);

                        barcos++;
                    }
                    
                } else if ((jogador1[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador1[linha-1][coluna].equals("Barco")) ||
                        (jogador1[linha-1][coluna-1].equals("Barco")) ||
                        (jogador1[linha-1][coluna-2].equals("Barco")) ||
                        (jogador1[linha][coluna+1].equals("Barco")) ||
                        (jogador1[linha][coluna-2].equals("Barco")) ||
                        (jogador1[linha+1][coluna+1].equals("Barco")) ||
                        (jogador1[linha+1][coluna].equals("Barco")) ||
                        (jogador1[linha+1][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna-2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                } else {
                    jogador1[linha][coluna] = "Barco";
                    jogador1[linha][coluna-1] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela1(jogador1);
        
                    barcos++;
                }
            } else {
                if ((jogador1[linha][coluna].equals("Barco")) || 
                        (jogador1[linha][coluna+1].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");

                } else if (linha == 10){
                    if ((jogador1[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador1[linha-1][coluna].equals("Barco")) ||
                        (jogador1[linha-1][coluna+1].equals("Barco")) ||
                        (jogador1[linha-1][coluna+2].equals("Barco")) ||
                        (jogador1[linha][coluna+2].equals("Barco")) ||
                        (jogador1[linha][coluna-1].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                        
                    } else {
                        jogador1[linha][coluna] = "Barco";
                        jogador1[linha][coluna+1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela1(jogador1);

                        barcos++;
                    }
                } else if (linha == 1){
                    if ((jogador1[linha][coluna+2].equals("Barco")) ||
                        (jogador1[linha][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna].equals("Barco")) ||
                        (jogador1[linha+1][coluna+1].equals("Barco")) ||
                        (jogador1[linha+1][coluna+2].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                        
                    } else {
                        jogador1[linha][coluna] = "Barco";
                        jogador1[linha][coluna+1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela1(jogador1);

                        barcos++;
                    }
                } else if ((jogador1[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador1[linha-1][coluna].equals("Barco")) ||
                        (jogador1[linha-1][coluna+1].equals("Barco")) ||
                        (jogador1[linha-1][coluna+2].equals("Barco")) ||
                        (jogador1[linha][coluna+2].equals("Barco")) ||
                        (jogador1[linha][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna-1].equals("Barco")) ||
                        (jogador1[linha+1][coluna].equals("Barco")) ||
                        (jogador1[linha+1][coluna+1].equals("Barco")) ||
                        (jogador1[linha+1][coluna+2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                    
                }else {
                    jogador1[linha][coluna] = "Barco";
                    jogador1[linha][coluna+1] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela1(jogador1);
                    
                    barcos++;
                }
            }            
        }
        barcos = 0;

        //4 barcos de 1 casas
        while (barcos < 4){
            while (correto == false){
                System.out.println("\n\nInsira o " + (barcos+1) + "° barco de 1 casa");
                System.out.print("linha: ");
                linha = leia.nextInt();
                System.out.print("Coluna: ");
                coluna = leia.nextInt();
                if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa linha ou coluna não existe!");
                    System.out.println("--------------------------------------------");
                } else {
                    correto = true;
                }
            }
            correto = false;

            if ((jogador1[linha][coluna].equals("Barco"))){
                System.out.println("--------------------------------------------");
                System.out.println("Essa casa já está ocupada!");
                System.out.println("--------------------------------------------");

            } else if (linha == 10) {
                if ((jogador1[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                    (jogador1[linha-1][coluna].equals("Barco")) ||
                    (jogador1[linha-1][coluna-1].equals("Barco")) ||
                    (jogador1[linha][coluna+1].equals("Barco")) ||
                    (jogador1[linha][coluna-1].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");

                } else {
                    jogador1[linha][coluna] = "Barco";

                System.out.println("Seu barco ficou aqui:");
                tabela1(jogador1);

                barcos++;
                }

            } else if (linha == 1) {
                if ((jogador1[linha][coluna+1].equals("Barco")) ||
                    (jogador1[linha][coluna-1].equals("Barco")) ||
                    (jogador1[linha+1][coluna+1].equals("Barco")) ||
                    (jogador1[linha+1][coluna].equals("Barco")) ||
                    (jogador1[linha+1][coluna-1].equals("Barco"))) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");

                } else {
                    jogador1[linha][coluna] = "Barco";

                System.out.println("Seu barco ficou aqui:");
                tabela1(jogador1);

                barcos++;
                }
            } else if ((jogador1[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                    (jogador1[linha-1][coluna].equals("Barco")) ||
                    (jogador1[linha-1][coluna-1].equals("Barco")) ||
                    (jogador1[linha][coluna+1].equals("Barco")) ||
                    (jogador1[linha][coluna-1].equals("Barco")) ||
                    (jogador1[linha+1][coluna+1].equals("Barco")) ||
                    (jogador1[linha+1][coluna].equals("Barco")) ||
                    (jogador1[linha+1][coluna-1].equals("Barco"))) {
                System.out.println("--------------------------------------------");
                System.out.println("Exite um barco em torno da casa selecionada!");
                System.out.println("--------------------------------------------");

            } else {
                jogador1[linha][coluna] = "Barco";

                System.out.println("Seu barco ficou aqui:");
                tabela1(jogador1);

                barcos++;
            }        
        }
        barcos = 0;
        
        
        
        
        
        System.out.println("\n\n===================================================");
        System.out.println("TABELA DO JOGADOR 1 PRONTA!");
        System.out.println("===================================================\n");
        
        
        
        
        //Jogador 2 montando sua tabela
        tabela2(jogador2);
        System.out.println("\n\n-JOGADOR 2--\n");
        
        //1 barco de 4 casas
        while (correto == false){
            System.out.println("-Insira um barco de 4 casas");
            System.out.print("linha: ");
            linha = leia.nextInt();
            System.out.print("Coluna: ");
            coluna = leia.nextInt();
            
            if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                System.out.println("--------------------------------------------");
                System.out.println("Essa linha ou coluna não existe!");
                System.out.println("--------------------------------------------");
            } else {
                correto = true;
            }
        }
        correto = false;
        if (coluna > 7){
            jogador2[linha][coluna] = "Barco";
            jogador2[linha][coluna-1] = "Barco";
            jogador2[linha][coluna-2] = "Barco";
            jogador2[linha][coluna-3] = "Barco";
        } else {
            jogador2[linha][coluna] = "Barco";
            jogador2[linha][coluna+1] = "Barco";
            jogador2[linha][coluna+2] = "Barco";
            jogador2[linha][coluna+3] = "Barco";
        }
        

        System.out.println("Seu barco ficou aqui:");
        tabela2(jogador2);

        //2 barcos de 3 casas
        while (barcos < 2){
            while (correto == false){
                System.out.println("\n\nInsira o " + (barcos+1) + "° barco de 3 casas");
                System.out.print("linha: ");
                linha = leia.nextInt();
                System.out.print("Coluna: ");
                coluna = leia.nextInt();
                
                if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa linha ou coluna não existe!");
                    System.out.println("--------------------------------------------");
                } else {
                    correto = true;
                }
            }
            correto = false;
            if (coluna > 8){
                
                if ((jogador2[linha][coluna].equals("Barco")) ||
                        (jogador2[linha][coluna-1].equals("Barco")) || 
                        (jogador2[linha][coluna-2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");

                } else if((linha == 10)){
                        if ((jogador2[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                                (jogador2[linha-1][coluna].equals("Barco")) ||
                                (jogador2[linha-1][coluna-1].equals("Barco")) ||
                                (jogador2[linha-1][coluna-2].equals("Barco")) ||
                                (jogador2[linha-1][coluna-3].equals("Barco")) ||
                                (jogador2[linha][coluna+1].equals("Barco")) ||
                                (jogador2[linha][coluna-3].equals("Barco"))){
                            System.out.println("--------------------------------------------");
                            System.out.println("Exite um barco em torno da casa selecionada!");
                            System.out.println("--------------------------------------------");
                        } else {
                            jogador2[linha][coluna] = "Barco";
                            jogador2[linha][coluna-1] = "Barco";
                            jogador2[linha][coluna-2] = "Barco";

                            System.out.println("Seu barco ficou aqui:");
                            tabela2(jogador2);

                            barcos++;
                        }
                
                } else if((linha == 1)){
                        if ((jogador2[linha][coluna+1].equals("Barco")) ||
                                (jogador2[linha][coluna-3].equals("Barco")) ||
                                (jogador2[linha+1][coluna+1].equals("Barco")) ||
                                (jogador2[linha+1][coluna].equals("Barco")) ||
                                (jogador2[linha+1][coluna-1].equals("Barco")) ||
                                (jogador2[linha+1][coluna-2].equals("Barco")) ||
                                (jogador2[linha+1][coluna-3].equals("Barco"))) {
                            System.out.println("--------------------------------------------");
                            System.out.println("Exite um barco em torno da casa selecionada!");
                            System.out.println("--------------------------------------------");
                        } else {
                            jogador2[linha][coluna] = "Barco";
                            jogador2[linha][coluna-1] = "Barco";
                            jogador2[linha][coluna-2] = "Barco";

                            System.out.println("Seu barco ficou aqui:");
                            tabela2(jogador2);

                            barcos++;
                        }
                    
                } else if((jogador2[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador2[linha-1][coluna].equals("Barco")) ||
                        (jogador2[linha-1][coluna-1].equals("Barco")) ||
                        (jogador2[linha-1][coluna-2].equals("Barco")) ||
                        (jogador2[linha-1][coluna-3].equals("Barco")) ||
                        (jogador2[linha][coluna+1].equals("Barco")) ||
                        (jogador2[linha][coluna-3].equals("Barco")) ||
                        (jogador2[linha+1][coluna+1].equals("Barco")) ||
                        (jogador2[linha+1][coluna].equals("Barco")) ||
                        (jogador2[linha+1][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna-2].equals("Barco")) ||
                        (jogador2[linha+1][coluna-3].equals("Barco"))) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                
                } else {
                    jogador2[linha][coluna] = "Barco";
                    jogador2[linha][coluna-1] = "Barco";
                    jogador2[linha][coluna-2] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela2(jogador2);
        
                    barcos++;
                }
            } else {
                if ((jogador2[linha][coluna].equals("Barco")) ||
                        (jogador2[linha][coluna+1].equals("Barco")) || 
                        (jogador2[linha][coluna+2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");
                
                } else if ((linha == 10)){
                    if ((jogador2[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                            (jogador2[linha-1][coluna].equals("Barco")) ||
                            (jogador2[linha-1][coluna+1].equals("Barco")) ||
                            (jogador2[linha-1][coluna+2].equals("Barco")) ||
                            (jogador2[linha-1][coluna+3].equals("Barco")) ||
                            (jogador2[linha][coluna+3].equals("Barco")) ||
                            (jogador2[linha][coluna-1].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador2[linha][coluna] = "Barco";
                        jogador2[linha][coluna+1] = "Barco";
                        jogador2[linha][coluna+2] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela2(jogador2);

                        barcos++;
                    }
                    
                } else if ((linha == 1)){
                    if ((jogador2[linha][coluna+3].equals("Barco")) ||
                            (jogador2[linha][coluna-1].equals("Barco")) ||
                            (jogador2[linha+1][coluna-1].equals("Barco")) ||
                            (jogador2[linha+1][coluna].equals("Barco")) ||
                            (jogador2[linha+1][coluna+1].equals("Barco")) ||
                            (jogador2[linha+1][coluna+2].equals("Barco")) ||
                            (jogador2[linha+1][coluna+3].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador2[linha][coluna] = "Barco";
                        jogador2[linha][coluna+1] = "Barco";
                        jogador2[linha][coluna+2] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela2(jogador2);

                        barcos++;
                    }
                    
                } else if ((jogador2[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador2[linha-1][coluna].equals("Barco")) ||
                        (jogador2[linha-1][coluna+1].equals("Barco")) ||
                        (jogador2[linha-1][coluna+2].equals("Barco")) ||
                        (jogador2[linha-1][coluna+3].equals("Barco")) ||
                        (jogador2[linha][coluna+3].equals("Barco")) ||
                        (jogador2[linha][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna].equals("Barco")) ||
                        (jogador2[linha+1][coluna+1].equals("Barco")) ||
                        (jogador2[linha+1][coluna+2].equals("Barco")) ||
                        (jogador2[linha+1][coluna+3].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                
                } else {
                    jogador2[linha][coluna] = "Barco";
                    jogador2[linha][coluna+1] = "Barco";
                    jogador2[linha][coluna+2] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela2(jogador2);
                    
                    barcos++;
                }
            }            
        }
        barcos = 0;

        //3 barcos de 2 casas
        while (barcos < 3){
            while (correto == false){
                System.out.println("\n\nInsira o " + (barcos+1) + "° barco de 2 casas");
                System.out.print("linha: ");
                linha = leia.nextInt();
                System.out.print("Coluna: ");
                coluna = leia.nextInt();
                if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa linha ou coluna não existe!");
                    System.out.println("--------------------------------------------");
                } else {
                    correto = true;
                }
            }
            correto = false;
            
            if (coluna > 9){
                if ((jogador2[linha][coluna].equals("Barco")) || 
                        (jogador2[linha][coluna-1].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");
                
                } else if (linha == 10){
                    if ((jogador2[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador2[linha-1][coluna].equals("Barco")) ||
                        (jogador2[linha-1][coluna-1].equals("Barco")) ||
                        (jogador2[linha-1][coluna-2].equals("Barco")) ||
                        (jogador2[linha][coluna+1].equals("Barco")) ||
                        (jogador2[linha][coluna-2].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador2[linha][coluna] = "Barco";
                        jogador2[linha][coluna-1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela2(jogador2);

                        barcos++;
                    }
                    
                } else if (linha == 1){
                    if ((jogador2[linha][coluna+1].equals("Barco")) ||
                        (jogador2[linha][coluna-2].equals("Barco")) ||
                        (jogador2[linha+1][coluna+1].equals("Barco")) ||
                        (jogador2[linha+1][coluna].equals("Barco")) ||
                        (jogador2[linha+1][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna-2].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                    } else {
                        jogador2[linha][coluna] = "Barco";
                        jogador2[linha][coluna-1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela2(jogador2);

                        barcos++;
                    }
                    
                } else if ((jogador2[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador2[linha-1][coluna].equals("Barco")) ||
                        (jogador2[linha-1][coluna-1].equals("Barco")) ||
                        (jogador2[linha-1][coluna-2].equals("Barco")) ||
                        (jogador2[linha][coluna+1].equals("Barco")) ||
                        (jogador2[linha][coluna-2].equals("Barco")) ||
                        (jogador2[linha+1][coluna+1].equals("Barco")) ||
                        (jogador2[linha+1][coluna].equals("Barco")) ||
                        (jogador2[linha+1][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna-2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                } else {
                    jogador2[linha][coluna] = "Barco";
                    jogador2[linha][coluna-1] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela2(jogador2);
        
                    barcos++;
                }
            } else {
                if ((jogador2[linha][coluna].equals("Barco")) || 
                        (jogador2[linha][coluna+1].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa casa já está ocupada!");
                    System.out.println("--------------------------------------------");

                } else if (linha == 10){
                    if ((jogador2[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador2[linha-1][coluna].equals("Barco")) ||
                        (jogador2[linha-1][coluna+1].equals("Barco")) ||
                        (jogador2[linha-1][coluna+2].equals("Barco")) ||
                        (jogador2[linha][coluna+2].equals("Barco")) ||
                        (jogador2[linha][coluna-1].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                        
                    } else {
                        jogador2[linha][coluna] = "Barco";
                        jogador2[linha][coluna+1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela2(jogador2);

                        barcos++;
                    }
                } else if (linha == 1){
                    if ((jogador2[linha][coluna+2].equals("Barco")) ||
                        (jogador2[linha][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna].equals("Barco")) ||
                        (jogador2[linha+1][coluna+1].equals("Barco")) ||
                        (jogador2[linha+1][coluna+2].equals("Barco"))){
                        System.out.println("--------------------------------------------");
                        System.out.println("Exite um barco em torno da casa selecionada!");
                        System.out.println("--------------------------------------------");
                        
                    } else {
                        jogador2[linha][coluna] = "Barco";
                        jogador2[linha][coluna+1] = "Barco";

                        System.out.println("Seu barco ficou aqui:");
                        tabela2(jogador2);

                        barcos++;
                    }
                } else if ((jogador2[linha-1][coluna-1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                        (jogador2[linha-1][coluna].equals("Barco")) ||
                        (jogador2[linha-1][coluna+1].equals("Barco")) ||
                        (jogador2[linha-1][coluna+2].equals("Barco")) ||
                        (jogador2[linha][coluna+2].equals("Barco")) ||
                        (jogador2[linha][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna-1].equals("Barco")) ||
                        (jogador2[linha+1][coluna].equals("Barco")) ||
                        (jogador2[linha+1][coluna+1].equals("Barco")) ||
                        (jogador2[linha+1][coluna+2].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");
                    
                }else {
                    jogador2[linha][coluna] = "Barco";
                    jogador2[linha][coluna+1] = "Barco";
                    
                    System.out.println("Seu barco ficou aqui:");
                    tabela2(jogador2);
                    
                    barcos++;
                }
            }            
        }
        barcos = 0;

        //4 barcos de 1 casas
        while (barcos < 4){
            while (correto == false){
                System.out.println("\n\nInsira o " + (barcos+1) + "° barco de 1 casa");
                System.out.print("linha: ");
                linha = leia.nextInt();
                System.out.print("Coluna: ");
                coluna = leia.nextInt();
                if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                    System.out.println("--------------------------------------------");
                    System.out.println("Essa linha ou coluna não existe!");
                    System.out.println("--------------------------------------------");
                } else {
                    correto = true;
                }
            }
            correto = false;

            if ((jogador2[linha][coluna].equals("Barco"))){
                System.out.println("--------------------------------------------");
                System.out.println("Essa casa já está ocupada!");
                System.out.println("--------------------------------------------");

            } else if (linha == 10) {
                if ((jogador2[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                    (jogador2[linha-1][coluna].equals("Barco")) ||
                    (jogador2[linha-1][coluna-1].equals("Barco")) ||
                    (jogador2[linha][coluna+1].equals("Barco")) ||
                    (jogador2[linha][coluna-1].equals("Barco"))){
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");

                } else {
                    jogador2[linha][coluna] = "Barco";

                System.out.println("Seu barco ficou aqui:");
                tabela2(jogador2);

                barcos++;
                }

            } else if (linha == 1) {
                if ((jogador2[linha][coluna+1].equals("Barco")) ||
                    (jogador2[linha][coluna-1].equals("Barco")) ||
                    (jogador2[linha+1][coluna+1].equals("Barco")) ||
                    (jogador2[linha+1][coluna].equals("Barco")) ||
                    (jogador2[linha+1][coluna-1].equals("Barco"))) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Exite um barco em torno da casa selecionada!");
                    System.out.println("--------------------------------------------");

                } else {
                    jogador2[linha][coluna] = "Barco";

                System.out.println("Seu barco ficou aqui:");
                tabela2(jogador2);

                barcos++;
                }
            } else if ((jogador2[linha-1][coluna+1].equals("Barco")) ||//testa se existe um barco em volta da casa selecionada
                    (jogador2[linha-1][coluna].equals("Barco")) ||
                    (jogador2[linha-1][coluna-1].equals("Barco")) ||
                    (jogador2[linha][coluna+1].equals("Barco")) ||
                    (jogador2[linha][coluna-1].equals("Barco")) ||
                    (jogador2[linha+1][coluna+1].equals("Barco")) ||
                    (jogador2[linha+1][coluna].equals("Barco")) ||
                    (jogador2[linha+1][coluna-1].equals("Barco"))) {
                System.out.println("--------------------------------------------");
                System.out.println("Exite um barco em torno da casa selecionada!");
                System.out.println("--------------------------------------------");

            } else {
                jogador2[linha][coluna] = "Barco";

                System.out.println("Seu barco ficou aqui:");
                tabela2(jogador2);

                barcos++;
            }
        }
        
        System.out.println("\n\n===================================================");
        System.out.println("TABELA DO JOGADOR 2 PRONTA!");
        System.out.println("===================================================\n");

        System.out.println("\n===================================================");
        System.out.println("COMEÇANDO JOGO!");
        System.out.println("===================================================");
        
        //Onde os jogadores jogam
        int jogada = 1;
        int j1 = 0, j2 = 0;
        while (j1 != 20 && j2 != 20){
            if (jogada == 1){
                while (correto == false){
                    System.out.println("\n\n---VEZ DO JOGADOR 1---\n");
                    tabelaResposta1(tabelaResposta1);
                    System.out.print("\n\nChute uma linha: ");
                    linha = leia.nextInt();
                    System.out.print("Chute uma coluna: ");
                    coluna = leia.nextInt();
                    if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                        System.out.println("--------------------------------------------");
                        System.out.println("Essa linha ou coluna não existe!");
                        System.out.println("--------------------------------------------");
                    } else if (jogador2[linha][coluna].equals("ja foi")){
                        System.out.println("--------------------------------------------");
                        System.out.println("Essa casa já foi escolhida anteriormente!");
                        System.out.println("--------------------------------------------");
                    } else {
                        correto = true;
                    }
                }
                correto = false;
                
                if (jogador2[linha][coluna].equals("Barco")){
                    System.out.println("\n===================================================");
                    System.out.println("Parabéns você acertou um barco!");
                    System.out.println("===================================================\n");
                    tabelaResposta1[linha][coluna] = "Barco";
                    jogada = 1;
                    j1++;
                    jogador2[linha][coluna] = "ja foi";
                } else {
                    System.out.println("\n===================================================");
                    System.out.println("Você acredtou o mar!");
                    System.out.println("===================================================\n");
                    tabelaResposta1[linha][coluna] = "XXXXX";
                    jogada = 2;
                    jogador2[linha][coluna] = "ja foi";
                    tabelaResposta1(tabelaResposta1);
                }
            } else {
                while (correto == false){
                    System.out.println("\n\n---VEZ DO JOGADOR 2---\n");
                    tabelaResposta2(tabelaResposta2);
                    System.out.print("\n\nChute uma linha: ");
                    linha = leia.nextInt();
                    System.out.print("Chute uma coluna: ");
                    coluna = leia.nextInt();
                    
                    if ((linha < 1 || linha > 10) || (coluna < 1 || coluna > 10)){
                        System.out.println("--------------------------------------------");
                        System.out.println("Essa linha ou coluna não existe!");
                        System.out.println("--------------------------------------------");
                    } else if (jogador1[linha][coluna].equals("ja foi")){
                        System.out.println("--------------------------------------------");
                        System.out.println("Essa casa já foi escolhida anteriormente!");
                        System.out.println("--------------------------------------------");
                    } else {
                        correto = true;
                    }
                }
                correto = false;
                
                if (jogador1[linha][coluna].equals("Barco")){
                    System.out.println("\n===================================================");
                    System.out.println("Parabéns você acertou um barco!");
                    System.out.println("===================================================\n");
                    tabelaResposta2[linha][coluna] = "Barco";
                    jogada = 2;
                    j2++;
                    jogador1[linha][coluna] = "ja foi";
                } else {
                    System.out.println("\n===================================================");
                    System.out.println("Você acredtou o mar!");
                    System.out.println("===================================================\n");
                    tabelaResposta2[linha][coluna] = "XXXXX";
                    jogada = 1;
                    jogador1[linha][coluna] = "ja foi";
                    tabelaResposta2(tabelaResposta2);
                }
            }
        }
        
        if (j1 == 20){
            System.out.println("\n===================================================");
            System.out.println("JOGADOR 1 VENCEU!");
            System.out.println("===================================================");
        } else {
            System.out.println("\n===================================================");
            System.out.println("JOGADOR 2 VENCEU!");
            System.out.println("===================================================");
        }
    }
}
