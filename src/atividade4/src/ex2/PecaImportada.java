package ex2;

public class PecaImportada extends Peca{
    private float taxaImportacao;
    private float taxaFrete;


    public PecaImportada(String nome, float custo, float lucro, float taxaFrete, float taxaImportacao){
        super(nome, custo, lucro);
        this.taxaFrete = taxaFrete;
        this.taxaImportacao  = taxaImportacao;
    }

    @Override
    public float calcularPreco(){
        return super.calcularPreco() +taxaFrete+taxaImportacao;
    }
    @Override
    public void exibir(){
        System.out.println("Nome: " + super.getNome() + "\nCusto: " + super.getCusto() + "\nLucro: " + super.getLucro() + "\nPreço: " + calcularPreco() + "Taxas: " + (taxaImportacao+taxaFrete));
    }
}
