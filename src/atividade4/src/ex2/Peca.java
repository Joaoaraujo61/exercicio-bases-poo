package ex2;

public class Peca {
    private String nome;
    private float custo;
    private float lucro;

    public Peca(String nome, float custo, float lucro){
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public float getCusto() {
        return custo;
    }

    public float getLucro() {
        return lucro;
    }

    public float calcularPreco(){
        return custo+lucro;
    }
    public void exibir(){
        System.out.println("Nome: " + nome + "\nCusto: " + custo + "\nLucro: " + lucro + "\nPreço: " + calcularPreco());
    }
}
