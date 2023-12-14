package daw;

import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {

    }

    public static int numeroDePalabras() {
        boolean repetir = true;
        int numeroDePalabras = 0;

        do {
            try {
                numeroDePalabras = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Introduce el numero de palabras a guardar"));
                repetir = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduce un valor valido");
            }
        } while (repetir);
        return numeroDePalabras;
    }

    public static String[] crearArrayPalabras() {

        String[] palabrasIntroducidas = new String[numeroDePalabras()];

        for (int i = 0; i < palabrasIntroducidas.length; i++) {

            palabrasIntroducidas[i] = 
        }
    }
}
