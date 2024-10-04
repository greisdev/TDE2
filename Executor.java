package com.codigo.morse;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        String[] letras = { "Q", "Z", "Y", "C", "X", "B", "J", "P", "L", "F", "V", "H", "O", "G", "K", "D", "W", "R", "U", "S", "M", "N", "A", "I", "T", "E" };
        String[] codigos = { ".", "-", "..", ".-", "-.", "--", "...", "..-", ".-.", ".--", "-..", "-.-", "--.", "---",
                "....", "...-", "..-.", ".-..", ".--.", ".---", "-...", "-..-", "-.-.", "-.--", "--..", "--.-" };
    
        for (int indice = 0; indice < letras.length; indice++) {
            arvore.adicionar(letras[indice], codigos[indice]);
        }
    
        
        System.out.println("Árvore Binária de Busca (Código Morse):");
        arvore.exibirArvore();
    
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sequência de código Morse para decodificar: ");
        String input = scanner.nextLine();
        String palavraDecodificada = arvore.buscarPalavra(input);
        System.out.println(palavraDecodificada);
    
        scanner.close();
    }
    }
    
