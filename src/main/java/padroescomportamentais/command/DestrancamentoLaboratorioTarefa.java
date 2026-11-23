package padroescomportamentais.command;

public class DestrancamentoLaboratorioTarefa implements Tarefa {

    private Laboratorio laboratorio;

    public DestrancamentoLaboratorioTarefa(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void executar() {
        this.laboratorio.destrancar();
    }

    public void cancelar() {
        this.laboratorio.trancar();
    }
}
