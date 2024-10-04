package com.codigo.morse;

public class No<T> {
    protected T valor;
    protected No<T> esquerda, direita;

    public No(T valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public T getValor() {
        return this.valor;
    }

    public No<T> getDireita() {
        return direita;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public void setDireita(No<T> direita) {
        this.direita = direita;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }
}
