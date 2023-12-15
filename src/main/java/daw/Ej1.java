package daw;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {
        String[] miarray = crearArrayPalabras();
        mostrarArray(miarray);

        JOptionPane.showMessageDialog(null,
                arraysMenosDe2Vocales(miarray));
        String arrayEnteros = Arrays.toString(arrayNumerosPosicion(miarray, 'o'));
        JOptionPane.showMessageDialog(null, arrayEnteros);
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

    public static String[] arraysMenosDe2Vocales(String[] miarray) {
        int contador = 0;
        for (int i = 0; i < miarray.length; i++) {
            if (cuentaVocales(miarray[i]) <= 2) {
                contador++;
            }
        }

        String[] arrayCopia = new String[contador];
        int k = 0;
        for (int j = 0; j < miarray.length; j++) {
            if (cuentaVocales(miarray[j]) <= 2) {
                arrayCopia[k] = miarray[j];
                k++;
            }
        }
        return arrayCopia;
    }

    public static int posicionLetras(String palabra, char letra) {

        int posicion = -1;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {

                posicion = i;
                break;
            }

        }
        return posicion;
    }

    public static int[] arrayNumerosPosicion(String[] array, char letra) {
        int[] arrayCopia = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            arrayCopia[j] = posicionLetras(array[i], letra);
            j++;
        }
        return arrayCopia;
    }

}
