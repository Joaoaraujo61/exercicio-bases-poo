package ex3;

public class Produto {
    private String descricao;
    private float valor;
    private float imposto;


    public Produto(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = 0;
    }

    public void aplicarImpostos() {

    }

    public float getImposto() {
        return imposto;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    protected void setImposto(float i) {
    }
}
