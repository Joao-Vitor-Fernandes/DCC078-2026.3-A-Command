package padroescomportamentais.command;

public class Laboratorio {

    private String nome;
    private int sala;
    private String situacao;

    public Laboratorio(String nome, int sala) {
        this.nome = nome;
        this.sala = sala;
    }

    public String getSituacao() {
        return situacao;
    }

    public void trancar() {
        this.situacao = "Laboratório trancado";
    }

    public void destrancar() {
        this.situacao = "Laboratório destrancado";
    }
}