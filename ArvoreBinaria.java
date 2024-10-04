package com.codigo.morse;


public class ArvoreBinaria {
    private No<String> raiz = new No<>("inicio");

    public No<String> getRaiz() {
        return raiz;
    }

    public void adicionar(String valor, String instrucao) {
        No<String> atual = this.raiz;

        for (int i = 0; i < instrucao.length(); i++) {
            String caractere = String.valueOf(instrucao.charAt(i));
            if (caractere.equals(".")) {
                if (atual.getEsquerda() == null) {
                    atual.setEsquerda(new No<>("")); 
                }
                atual = atual.getEsquerda();
            } else if (caractere.equals("-")) {
                if (atual.getDireita() == null) {
                    atual.setDireita(new No<>(""));
                }
                atual = atual.getDireita();
            }
        }
        atual.setValor(valor); 
    }

    public String buscarPalavra(String instrucao) {
        String resultado = "PALAVRA: "; 
        No<String> atual = this.raiz;
        instrucao = instrucao + " "; 

        for (int i = 0; i < instrucao.length(); i++) {
            String caractere = String.valueOf(instrucao.charAt(i));

            if (caractere.equals(".")) {
                atual = atual.getEsquerda();
            } else if (caractere.equals("-")) {
                atual = atual.getDireita();
            } else { // Espero que seja um espaço
                if (atual != null && atual != this.raiz && !atual.getValor().isEmpty()) { 
                                                                                          
                    resultado += atual.getValor();
                }
                atual = this.raiz; 
            }
        }
        return resultado;
    }

    public void exibirArvore(No<String> no, String prefixo, boolean ehUltimo) {
        if (no == null) {
            return;
        }

        System.out.print(prefixo);
        System.out.print(ehUltimo ? "└── " : "├── ");
        System.out.println(no.getValor());

        prefixo += ehUltimo ? "    " : "│   ";

        if (no.getEsquerda() != null || no.getDireita() != null) {
            exibirArvore(no.getEsquerda(), prefixo, no.getDireita() == null);
            exibirArvore(no.getDireita(), prefixo, true);
        }
    }

    public void exibirArvore() {
        exibirArvore(raiz, "", true);
    }
}
