package atividade2.ex3;

public class Triangulo {
    float ladoA;
    float ladoB;
    float ladoC;
    float area;

    Triangulo(float ladoA, float ladoB, float ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public float calcularArea() {
        float p = (ladoA+ladoB+ladoC)/2;
        area = (float) Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
        return area;
    }

}
