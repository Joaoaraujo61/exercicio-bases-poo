package atividade2.ex1;

public class Produto {
    String nome;
    float preco;
    int quantidade;

    public void mostrarDados(){
        System.out.println("Produto: " + nome + "\nPreço: "  + preco + "\nQuantidade: " + quantidade);
    }
    public void saidaEstoque(int qtd){
        if (quantidade >= qtd){
            quantidade-=qtd;
        }else {
            System.out.println("Valor inválido! Tente um valor menor!");
        }

    }
    public void entradaEstoque(int qtd){
        quantidade+=qtd;
    }
}
