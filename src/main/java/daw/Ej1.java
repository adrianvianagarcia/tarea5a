package daw;

import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {
        String[] aux = crearArrayPalabras();
        mostrarArray(aux);

        JOptionPane.showMessageDialog(null,
                arraysMasDe3Vocales(aux));
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

            palabrasIntroducidas[i] = JOptionPane.showInputDialog(null,
                    "Introduce la siguiente palabra");
        }
        return palabrasIntroducidas;
    }

    public static void mostrarArray(String[] palabrasIntroducidas) {

        String aux = "";
        int repetir = 0;
        for (int i = 0; i < palabrasIntroducidas.length; i++) {
            aux += "Posicion " + repetir + " - " + "Palabra: " + palabrasIntroducidas[i] + "\n";
            repetir++;
        }
        JOptionPane.showMessageDialog(null, aux);
    }

    public static int cuentaVocales(String palabra) {

        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e'
                    || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o'
                    || palabra.charAt(i) == 'u') {

                contador++;
            }

        }
        return contador;
    }

    public static String[] arraysMasDe3Vocales(String[] miarray) {
        int contador = 0;
        for (int i = 0; i < miarray.length; i++) {
            if (cuentaVocales(miarray[i]) >= 3) {
                contador++;
            }
        }

        String[] arrayCopia = new String[contador];
        int k = 0;
        for (int j = 0; j < miarray.length; j++) {
            if (cuentaVocales(miarray[j]) >= 3) {
                arrayCopia[k] = miarray[j];
                k++;
            }
        }
        return arrayCopia;
    }

}
