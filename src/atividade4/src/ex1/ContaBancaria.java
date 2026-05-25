package ex1;

public class ContaBancaria{
    protected String cliente;
    protected int numeroConta;
    protected float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor){
        if (valor > 0){
            saldo+=valor;
        }else System.out.println("Valor inválido!");
    }

    public void sacar(float valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
        }else System.out.println("Valor superior a saldo!");

    }
}
