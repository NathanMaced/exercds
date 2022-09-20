package pkginterface;

import javax.swing.JOptionPane;

public class DSquiz {
int acerto=0;

    String x1 = JOptionPane.showInputDialog(null, "Digite a nota do primeiro");
       double b1 = Double.parseDouble(x1);{
       if(b1==1){
        acerto++;
       }
       String x2 = JOptionPane.showInputDialog(null, "Digite a nota do primeiro");
       double b2 = Double.parseDouble(x2);
       if(b2==1){
        acerto++;
       }
       String x3 = JOptionPane.showInputDialog(null, "Digite a nota do primeiro");
       double b3 = Double.parseDouble(x3);
       if(b3==1){
        acerto++;
       }
       String x4 = JOptionPane.showInputDialog(null, "Digite a nota do primeiro");
       double b4 = Double.parseDouble(x4);
       if(b4==1){
        acerto++;
       }
       String x5 = JOptionPane.showInputDialog(null, "Digite a nota do primeiro");
       double b5 = Double.parseDouble(x5);
       if(b5==1){
        acerto++;
       }
       JOptionPane.showMessageDialog(null,acerto);
}}