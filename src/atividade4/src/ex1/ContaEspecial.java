package ex1;

public class ContaEspecial extends ContaBancaria{
    int limite;

    public ContaEspecial(int limite){
        this.limite = limite;
    }

    @Override
    public void sacar(float valor){
        if (valor < 0){
            if (valor >= -(limite)){
                saldo -= valor;
            }else System.out.println("Valor superior a limite!");
        }else if(valor > saldo)System.out.println("Valor superior a saldo!");

    }
}
