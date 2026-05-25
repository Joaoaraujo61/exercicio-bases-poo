package ex3;

public class ProdutoImportado extends Produto{
    private float taxa;
    private float taxaImportacao;

    public ProdutoImportado(String descricao, float valor){
        super(descricao,valor);
    }

    @Override
    public void aplicarImpostos() {
        super.setImposto(0.10f);
        this.taxa = 0.05f;
        this.taxaImportacao = 0.05f;

        float novoValor = super.getValor() + (super.getValor() * 0.10f + (super.getValor() * taxa) + (super.getValor() * taxaImportacao));
        super.setValor(novoValor);
    }
}
