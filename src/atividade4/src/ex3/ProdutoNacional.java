package ex3;

public class ProdutoNacional extends Produto{
    private float taxa;

    public ProdutoNacional(String descricao, float valor){
        super(descricao,valor);
    }

    @Override
    public void aplicarImpostos() {
        super.setImposto(10/100);
        this.taxa = 0.05f;
        super.setImposto(0.10f);

        float novoValor = super.getValor() + (super.getValor() * 0.10f) + (super.getValor() * taxa);
        super.setValor(novoValor);
    }
}
