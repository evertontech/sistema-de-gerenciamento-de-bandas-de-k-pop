public class Main {
    public static void main(String[] args) {
        Membro membro1 = new Membro("Jimin", 25, "Vocalista", 300000.0f,true);
        Membro membro2 = new Membro("Jungkook", 24, "Maknae", 350000.0f, true);

        Manager manager = new Manager("Bang Si-hyuk", 45, 1500000.0f,15);

        Banda banda = new Banda("BTS", "Big Hit Entertainment", 2013, manager);
        banda.adicionarMembro(membro1);
        banda.adicionarMembro(membro2);

        System.out.println("Média de idade dos membros: " + banda.calcularMediaDeIdadeDosMembros());
        banda.exibirTodasAsInformacoes();
    }
}
