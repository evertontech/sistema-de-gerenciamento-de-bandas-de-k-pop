public class Manager {
    private String nome;
    private int idade;
    private float salario;
    private int anosExperiencia;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade precisa ser maior que zero.");
        }
    }

    public int getIdade() {
        return this.idade;
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

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return this.anosExperiencia;
    }
}
