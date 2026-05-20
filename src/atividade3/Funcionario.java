public class Funcionario {

    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSalarioFuncionario() {
        return String.format("R$ %.2f", salarioFuncionario);
    }

    public void definirSalario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
}
