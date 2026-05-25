package ex3;

public class ProdutoEstadual extends Produto{

    public ProdutoEstadual(String descricao, float valor) {
        super(descricao, valor);
    }

    @Override
    public void aplicarImpostos() {
        super.setImposto(0.10f);
        float novoValor = super.getValor() + (super.getValor() *0.10f);
        super.setValor(novoValor);
    }
}
