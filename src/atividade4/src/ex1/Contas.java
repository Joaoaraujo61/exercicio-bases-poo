import ex1.ContaEspecial;
import ex1.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ContaPoupanca conta1 = new ContaPoupanca(28);
    conta1.depositar(300);
    conta1.sacar(-200);

    System.out.println(conta1.getSaldo());
    conta1.calcularNovoSaldo(3);
    System.out.println(conta1.getSaldo());

    ContaEspecial conta2 = new ContaEspecial(250);

    conta2.sacar(-280);
}
