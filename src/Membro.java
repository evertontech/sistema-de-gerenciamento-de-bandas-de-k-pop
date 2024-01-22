public class Membro {
    private String nome;
    private int idade;
    private String cargo;
    private float salario;
    private boolean statusContrato;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade  > 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade precida ser maior que zero.");
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setSalario(float salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("O Salário não pode ser negativo.");
        }

    }

    public float getSalario() {
        return this.salario;
    }

    public void setStatusContrato(boolean statusContrato) {
        this.statusContrato = statusContrato;
    }

    public boolean getStatusContrato() {
        return this.statusContrato;
    }
}
