package ex1;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;


    public ContaPoupanca( int diaRendimento){
        if (diaRendimento > 31 || diaRendimento < 1){
            System.out.println("Valor inválido");
        }else this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento){
        saldo += saldo*taxaRendimento/100;
    }
}
