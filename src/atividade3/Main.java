public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(19);
        pessoa.setPais("Brasil");

        System.out.println("Pessoa");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("País: " + pessoa.getPais());

        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(10);
        retangulo.setLargura(5);

        System.out.println("\nRetângulo");
        System.out.println("Comprimento: " + retangulo.getComprimento());
        System.out.println("Largura: " + retangulo.getLargura());

        Funcionario funcionario = new Funcionario();
        funcionario.setIdFuncionario(1);
        funcionario.setNomeFuncionario("Maria");
        funcionario.definirSalario(3500);

        System.out.println("\nFuncionário");
        System.out.println("ID: " + funcionario.getIdFuncionario());
        System.out.println("Nome: " + funcionario.getNomeFuncionario());
        System.out.println("Salário: " + funcionario.getSalarioFuncionario());

        Circulo circulo = new Circulo();
        circulo.setRaio(7);

        System.out.println("\nCírculo");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
