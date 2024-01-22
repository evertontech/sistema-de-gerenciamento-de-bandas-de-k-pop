import java.util.List;

public class Banda {
    private String nome;
    private String agencia;
    private int anosDeEstreia;
    private List<Membro>;
    private managerResponsavel Manager;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAnosDeEstreia(int anosDeEstreia) {
        if (anosDeEstreia) {
            this.anosDeEstreia = anosDeEstreia;
        } else {
            System.out.println("O Ano de estreia da banda não pode ser um valor futuro.");
        }

    }

    public int getAnosDeEstreia() {
        return this.anosDeEstreia;
    }

    public void setManager() {
        this.manager;
    }

    public int mediaIdadesMembros() {
        return;
    }

    public String exibirInformacoesBanda() {

    }
}
