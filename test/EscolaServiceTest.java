import model.Aluno;
import model.Turma;
import org.junit.jupiter.api.Test;
import service.EscolaService;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class EscolaServiceTest {

    @Test
    public void deveListarSomentAprovados() {
        EscolaService escolaService = new EscolaService();
        model.Aluno aluno1 = new Aluno("André", 10, 20, Turma.A, LocalDate.of(2025,02,10));
        model.Aluno aluno2 = new Aluno("João", 4, 37, Turma.B, LocalDate.of(2023,05,12)) ;
        escolaService.adicionar(aluno1);
        escolaService.adicionar(aluno2);
        escolaService.listar();
        assertEquals(1, escolaService.listarAprovados().size());
    }


    @Test
    public void deveLancarExcecaoParaNotaInvalida() {
        EscolaService escolaService = new EscolaService();
        escolaService.listar();
        assertThrows(IllegalArgumentException.class, () -> {
            model.Aluno aluno1 = new Aluno("André", 15, 20, Turma.A, LocalDate.of(2025,02,10));
        });
    }

    @Test
    public void deveCalcularMediaCorretamente() {
        EscolaService escolaService = new EscolaService();
        model.Aluno aluno1 = new Aluno("André", 10, 20, Turma.A, LocalDate.of(2025,02,10));
        model.Aluno aluno2 = new Aluno("João", 4, 37, Turma.B, LocalDate.of(2023,05,12)) ;
        escolaService.adicionar(aluno1);
        escolaService.adicionar(aluno2);
        escolaService.exibirMedia();
        assertEquals(7, escolaService.exibirMedia(), 0.01);

    }
}