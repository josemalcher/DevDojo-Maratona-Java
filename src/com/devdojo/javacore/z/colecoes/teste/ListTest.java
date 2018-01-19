package com.devdojo.javacore.z.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes  = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("José");
        nomes.add("Malcher");
        nomes2.add("José 2");
        nomes2.add("Malcher 2");

        /*System.out.println("size: " + nomes.size());
        System.out.println(nomes.remove("Malcher")); //boolean
        System.out.println("size: " + nomes.size());*/
        nomes.clear(); //Limpar a lista
        nomes.addAll(nomes2); //união de duas coleções

        int size = nomes.size();
        for(int i = 0 ; i < size ; i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10); //wrapper
        numeros.add(20);
        for(Integer num : numeros){
            System.out.println(num);
        }
    }
}
