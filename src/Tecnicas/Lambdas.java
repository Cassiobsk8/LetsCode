package Tecnicas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas
{
    public static void main(String[] args)
    {
        List<Integer> listaPares = new ArrayList<>();
        listaPares.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Lista de pares: " + listaPares.toString());
    }
}

