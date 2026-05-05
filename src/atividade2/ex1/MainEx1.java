package atividade2.ex1;

import javax.swing.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEx1{
    public static void main(String[] args) {
        Produto novoProduto = new Produto();

        novoProduto.nome = JOptionPane.showInputDialog("Nome do Produto: ");
        novoProduto.preco = Float.parseFloat(JOptionPane.showInputDialog("Preço do Produto: "));
        novoProduto.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque: "));

        novoProduto.mostrarDados();

        int resposta = JOptionPane.showConfirmDialog(null, "Realizar entrada no estoque?");
        if (resposta == JOptionPane.YES_OPTION){
            novoProduto.entradaEstoque(Integer.parseInt(JOptionPane.showInputDialog("Quantidade: ")));
        }

        resposta = JOptionPane.showConfirmDialog(null, "Realizar saída do estoque?");

        if (resposta == JOptionPane.YES_OPTION) {
            novoProduto.saidaEstoque(Integer.parseInt(JOptionPane.showInputDialog("Quantidade: ")));
        }


        novoProduto.mostrarDados();
    }
}
