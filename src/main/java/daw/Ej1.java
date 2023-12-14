package daw;

import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {

        boolean repetir = true;
        int numeroDePalabras;
        
        do{
        try{
        numeroDePalabras = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Introduce el numero de palabras a guardar"));
                repetir = false;
        }catch (NumberFormatException nfe){
            System.out.println("Introduce un valor valido");
        }
        }while (repetir);

        String[] palabrasIntroducidas;
        
        for (int i = 0; i < nu; i++) {

        }
    }
}
