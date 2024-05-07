import java.util.*;

public class Main {
    public static void main(String[] args) {

       List<Integer> listNumeros = Arrays.asList(23,12,21,14,16,15,10,9,8,7);
       List<String> listLetras = Arrays.asList("F", "L", "H", "E", "C", "Y", "A", "D");


        // NUMEROS NAO ORDENADO
        System.out.println("---------- NUMEROS NAO ORDENADO -------------");
        listNumeros.forEach(System.out::println);


        // FILTRANDO NUMEROS PARES
        System.out.println("---------- FILTRANDO NUMEROS PARES -------------");
        listNumeros.stream().filter( num -> num % 2 == 0 ).forEach(System.out::println);

        // NUMEROS ORDENADO
        System.out.println("------------ NUMEROS ORDENADO -----------");
        listNumeros.stream().sorted(Integer::compare).forEach(System.out::println);

        // LETRAS NAO ORDENADAS
        System.out.println("----------- LETRAS NAO ORDENADAS -------------");
        listLetras.forEach(System.out::println);

        // LETRAS ORDENADAS
        System.out.println("----------- LETRAS ORDENADAS -------------");
        listLetras.sort((l1, l2) -> l1.compareTo(l2));
        listLetras.forEach(System.out::println);
    }
}