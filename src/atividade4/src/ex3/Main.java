import ex3.ProdutoEstadual;
import ex3.ProdutoImportado;
import ex3.ProdutoNacional;

void main() {
    ProdutoEstadual carregador = new ProdutoEstadual("Carregador 30w", 30);
    carregador.aplicarImpostos();
    System.out.println(carregador.getDescricao());
    System.out.println(carregador.getValor());

    ProdutoNacional carregador2 = new ProdutoNacional("Carregador 40w", 30);
    carregador2.aplicarImpostos();
    System.out.println(carregador2.getDescricao());
    System.out.println(carregador2.getValor());

    ProdutoImportado carregador3 = new ProdutoImportado("Carregador 50w", 30);
    carregador3.aplicarImpostos();
    System.out.println(carregador3.getDescricao());
    System.out.println(carregador3.getValor());
}