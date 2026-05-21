package ex1;

public class ContaEspecial extends ContaBancaria{
    int limite;

    public void ContaEspecial(int limite){
        this.limite = limite;
    }

    @Override
    protected void sacar(float valor){
        if (valor = saldo){
            saldo -= valor;
        }else System.out.println("Valor superior a saldo!");

    }
}
