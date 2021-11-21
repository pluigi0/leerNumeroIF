package Condicionales;

import javax.swing.JOptionPane;



public class Condicionales {
    public static void main(String[] args) {
        int numero, dato=5;
        
        JOptionPane.showMessageDialog(null, "PROGRAMITA QUE LEE UN NUMERO E INDICA QUE NUMERO ESCRIBISTE");
       
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero: "));
        
        // Compara el numero ingresado con el numero 5 inicializado en "dato"
        if (numero != dato){
            JOptionPane.showMessageDialog(null, "Perfecto, has escrito: "+numero);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingresaste 5, cool!");
        }
        
    }
}
