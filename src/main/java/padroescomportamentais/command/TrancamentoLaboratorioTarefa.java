package padroescomportamentais.command;

public class TrancamentoLaboratorioTarefa implements Tarefa {

    private Laboratorio laboratorio;

    public TrancamentoLaboratorioTarefa(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void executar() {
        this.laboratorio.trancar();
    }

    public void cancelar() {
        this.laboratorio.destrancar();
    }
}
