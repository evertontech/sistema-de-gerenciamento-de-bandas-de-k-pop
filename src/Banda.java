import java.time.LocalDate;
import java.util.List;

public class Banda {
    private String nome;
    private String agencia;
    private int anoDeEstreia;
    private List<Membro> listaDeMembros;
    private Manager managerResponsavel;

    public Banda(String nome, String agencia, int anoDeEstreia, Manager managerResponsavel) {
        this.setNome(nome);
        this.setAgencia(agencia);
        this.setAnoDeEstreia(anoDeEstreia);
        this.setManager(managerResponsavel);
    }

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

    public void setAnoDeEstreia(int anoDeEstreia) {
        int anoAtual = LocalDate.now().getYear();
        if (anoDeEstreia <= anoAtual) {
            this.anoDeEstreia = anoDeEstreia;
        } else {
            System.out.println("O Ano de estreia da banda não pode ser um valor futuro.");
        }
    }

    public int getAnoDeEstreia() {
        return this.anoDeEstreia;
    }

    public void setListaDeMembros(List<Membro> listaDeMembros) {
        this.listaDeMembros = listaDeMembros;
    }

    public List<Membro> getListaDeMembros() {
        return this.listaDeMembros;
    }

    public void setManager(Manager managerResponsavel) {
        this.managerResponsavel = managerResponsavel;
    }

    public void adicionarMembro(Membro membroParaAdicionar) {
        this.listaDeMembros.add(membroParaAdicionar);
    }

    public float calcularMediaDeIdadeDosMembros() {
        int soma = 0;

        for (Membro membro : listaDeMembros) {
            soma = soma + membro.getIdade();
        }

        return (float) soma / listaDeMembros.size();
    }

    public void exibirTodasAsInformacoes() {
        System.out.println(nome);
        System.out.println(agencia);
        System.out.println(anoDeEstreia);
        System.out.println(listaDeMembros);
    }
}
