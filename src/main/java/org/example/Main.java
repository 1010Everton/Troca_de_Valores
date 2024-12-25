package org.example;


import javax.swing.*;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println( "digite o numero a ser convertido : " );
        //entrada de dados//
        Scanner scan = new Scanner(System.in);
        String numerodigitado = scan.nextLine();
        //converção//
        float numero = Float.parseFloat(numerodigitado);
        System.out.println( "numero : " + numero + " convertido com sucesso" );
    }
}