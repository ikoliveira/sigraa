import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import models.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

class SGRAATests {

    private Animal animal;
    private Voluntario voluntario;
    private PretendenteAdocao pretendente;
    private Adocao adocao;
    private Escala escala;

    @BeforeEach
    void setUp() {
        animal = new Animal(3, "Macho", PorteFisico.MEDIO, "Marrom", Especie.CACHORRO);
        voluntario = new Voluntario("Carlos", 25, Funcao.CAMPO);
        pretendente = new PretendenteAdocao("Mariana", 30, "Rua das Flores, 123");
        escala = new Escala(DayOfWeek.WEDNESDAY, LocalTime.of(8, 0), LocalTime.of(12, 0));
    }

    @Test
    void testCriacaoAnimal() {
        assertNotNull(animal);
        assertEquals(3, animal.getIdade());
        assertEquals(Especie.CACHORRO, animal.getEspecie());
    }

    @Test
    void testAdicaoContatoVoluntario() {
        voluntario.addContato("email", "carlos@email.com");
        assertEquals(1, voluntario.getContatos().size());
        assertEquals("carlos@email.com", voluntario.getContatos().get(0).getContato());
    }

    @Test
    void testRemocaoContatoVoluntario() {
        voluntario.addContato("telefone", "123456789");
        voluntario.rmContato("123456789");
        assertEquals(0, voluntario.getContatos().size());
    }

    @Test
    void testAdocaoAnimal() {
        adocao = new Adocao(pretendente, animal);
        assertNotNull(adocao);
        assertEquals(pretendente, adocao.getPretendente());
        assertEquals(animal, adocao.getAnimal());
    }

    @Test
    void testAdicaoEscalaVoluntario() {
        voluntario.adicionarEscala(escala);
        assertEquals(1, voluntario.getEscalas().size());
        assertEquals(DayOfWeek.WEDNESDAY, voluntario.getEscalas().get(0).getDiaSemana());
    }
}
