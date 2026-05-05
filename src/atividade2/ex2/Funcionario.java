package atividade2.ex2;

public class Funcionario {
    String nome;
    float salario;
    float novoSalario;

    Funcionario(String nome, float salario){
        this.salario = salario;
        this.nome = nome;
    }
    public void receberAumento() {
        if (salario<=1000) this.novoSalario = (float) (salario * 1.15);
        else if (salario<=1500) this.novoSalario = (float) (salario* 1.1);
        else if (salario<=2000) this.novoSalario = (float) (salario* 1.05);
        else System.out.println("Salário inválido, digite um valor entre R$ 1 e R$ 2000");
    }
    public void mostarSalario(){
        System.out.println("Antigo: " + salario);
        System.out.println("Novo: " + novoSalario);
    }
}
