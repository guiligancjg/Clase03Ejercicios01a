package Clase03Ejercicios01a;

public class Main {

    public static void main(String[] args) {
        //1a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
        //3. Realizar el ejercicio 1 (De esta misma guía) enviando los valores por parámetro.
        String cadena = "Genere una clase que tenga";
        char letra = 'e';
        System.out.println("Apariciones de la letra \"" +letra+"\" en la cadena \"" + cadena +"\" "+"son: "+cantidadTotal(cadena,letra));
    }

    public static int cantidadTotal(String cadena, char letra){
        int cantidad = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra)
                cantidad++;
        }
        return cantidad;
    }
}
