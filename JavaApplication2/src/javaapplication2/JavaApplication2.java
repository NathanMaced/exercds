/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author manager
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acerto=0;

        String x1 = JOptionPane.showInputDialog(null, "1ª - Qual jogador é conhecido como terror do Morumbi? \n 1-Denílson \n 2-Raí \n 3-Lucas Moura \n 4-Kaka \n 5-Amoroso");
       double b1 = Double.parseDouble(x1);
       if(b1==2){
        acerto++;
       }
       String x2 = JOptionPane.showInputDialog(null, "2ª - Quantos gols Rogério Ceni tem em sua carreira? \n 1-120 \n 2-117 \n 3-110 \n 4-130 \n 5-100");
       double b2 = Double.parseDouble(x2);
       if(b2==4){
        acerto++;
       }
       String x3 = JOptionPane.showInputDialog(null, "3ª - Quem é o maior artilheiro da historia do São Paulo? \n 1-Careca \n 2-Muller \n 3-Serginho chulapa \n 4-Leônildas da Silva \n 5-França");
       double b3 = Double.parseDouble(x3);
       if(b3==3){
        acerto++;
       }
       String x4 = JOptionPane.showInputDialog(null, "4ª - Como é conhecido o São Paulo? \n 1-Três cores \n 2-Tricolor do Morumbi \n 3-Maior de todos \n 4-Nunca rebaixado \n 5-Maior campeão internacional");
       double b4 = Double.parseDouble(x4);
       if(b4==2){
        acerto++;
       }
       String x5 = JOptionPane.showInputDialog(null, "5ª - Quantos títulos oficias tem o São Paulo? \n 1-58 \n 2-35 \n 3-40 \n 4-25 \n 5-65");
       double b5 = Double.parseDouble(x5);
       if(b5==1){
        acerto++;
       }String x6 = JOptionPane.showInputDialog(null, "6ª - Qual o jogador que passou pelo São Paulo tem mais jogos com a camisa tricolor? \n 1-Rogerio Ceni \n 2-Muller \n 3-Serginho chulapa \n 4-Leônildas da Silva \n 5-França");
       double b6 = Double.parseDouble(x6);
       if(b6==1){
        acerto++;
       }
       String x7 = JOptionPane.showInputDialog(null, "7ª - Quais os maiores rivais do São Paulo? \n 1-Portuguesa, São Caetano e Bragantino \n 2-RB Brasil, São Bento e Novorizontino \n 3-Ponte Preta, Ferroviária e Mirassol \n 4-Ituano , Rio Claro e Santo André \n 5-Santos, Corinthians e Palmeiras");
       double b7 = Double.parseDouble(x7);
       if(b7==5){
        acerto++;
       }
       String x8 = JOptionPane.showInputDialog(null, "8ª - Em que anos o São Paulo tanto conquistou a libertadores como o mundial de clubes? \n 1-1994, 1996 e 2002 \n 2-1990, 1998 e 2010 \n 3-1992, 1993 e 2005 \n 4-1997, 2004 e 2012 \n 5-1989, 1996 e 2003");
       double b8 = Double.parseDouble(x8);
       if(b8==3){
        acerto++;
       }
       String x9 = JOptionPane.showInputDialog(null, "9ª - Como é chamado os moleques da base São paulina? \n 1-Meninos do tricolor \n 2-Moleques tricolor \n 3-Made in Cotia \n 4-Moleque da base \n 5-Cotia Junior");
       double b9 = Double.parseDouble(x9);
       if(b9==1){
        acerto++;
       }
       String x10 = JOptionPane.showInputDialog(null, "10ª -Qual jogador que passou pela base São Paulina tem grandes titulos em sua carreira desde sua saída da base? \n 1-Ederson \n 2-Casemiro \n 3-Lucas Moura \n 4-Marquinhos \n 5-Fabinho");
       double b10 = Double.parseDouble(x10);
       if(b10==2){
        acerto++;
       }
       if(acerto<=4){
       		JOptionPane.showMessageDialog(null,"Você não domina o assunto \n Você acertou "+acerto);
                }
        else if (acerto<=6){
       		JOptionPane.showMessageDialog(null,"Conhecimento basico sobre o assunto\n Você acertou "+acerto);
                }
        else if(acerto<=9){
                JOptionPane.showMessageDialog(null,"Quase um mestre\n Você acertou "+acerto);
                }
        else{
                JOptionPane.showMessageDialog(null,"PARABENS, você tem profundo conhecimentos\n Você acertou "+acerto);
}
      
    }
    
}
