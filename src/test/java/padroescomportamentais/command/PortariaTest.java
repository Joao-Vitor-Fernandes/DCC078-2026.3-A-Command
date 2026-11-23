package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PortariaTest {

    Portaria portaria;
    Laboratorio laboratorio;

    @BeforeEach
    void setUp() {
        portaria = new Portaria();
        laboratorio = new Laboratorio("Informática", 204);
    }

    @Test
    void deveDestrancarLaboratorio() {
        Tarefa destrancamento = new DestrancamentoLaboratorioTarefa(laboratorio);
        portaria.executarTarefa(destrancamento);

        assertEquals("Laboratório destrancado", laboratorio.getSituacao());
    }

    @Test
    void deveTrancarLaboratorio() {
        Tarefa destrancamento = new DestrancamentoLaboratorioTarefa(laboratorio);
        Tarefa trancamento = new TrancamentoLaboratorioTarefa(laboratorio);

        portaria.executarTarefa(destrancamento);
        portaria.executarTarefa(trancamento);

        assertEquals("Laboratório trancado", laboratorio.getSituacao());
    }

    @Test
    void deveCancelarDestrancamentoLaboratorio() {
        Tarefa destrancamento = new DestrancamentoLaboratorioTarefa(laboratorio);

        portaria.executarTarefa(destrancamento);
        portaria.cancelarUltimaTarefa();

        assertEquals("Laboratório trancado", laboratorio.getSituacao());
    }

    @Test
    void deveCancelarTrancamentoLaboratorio() {
        Tarefa destrancamento = new DestrancamentoLaboratorioTarefa(laboratorio);
        Tarefa trancamento = new TrancamentoLaboratorioTarefa(laboratorio);

        portaria.executarTarefa(destrancamento);
        portaria.executarTarefa(trancamento);

        portaria.cancelarUltimaTarefa();

        assertEquals("Laboratório destrancado", laboratorio.getSituacao());
    }

}
