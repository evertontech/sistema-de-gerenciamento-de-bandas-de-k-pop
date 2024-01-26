public class Manager {
    private String nome;
    private int idade;
    private float salario;
    private int anosDeExperiencia;

    public Manager(String nome, int idade, float salario, int anosDeExperiencia) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setAnosDeExperiencia(anosDeExperiencia);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade > 18) {
            this.idade = idade;
        } else {
            System.out.println("A idade precisa ser maior que dezoito anos.");
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

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public int getAnosDeExperiencia() {
        return this.anosDeExperiencia;
    }
}
