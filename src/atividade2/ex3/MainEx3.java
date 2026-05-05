package atividade2.ex3;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEx3 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(4.3F, 5.5F, 2.2F);
        Triangulo triangulo2 = new Triangulo(2.3F, 4.5F, 3.2F);

        System.out.println(triangulo1.calcularArea());
        System.out.println(triangulo2.calcularArea());

        if (triangulo1.area> triangulo2.area) System.out.println("O primeiro triangulo é maior");
        else System.out.println("O segundo triangulo é maior");
    }
}
