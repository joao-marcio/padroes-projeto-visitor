package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new ArteMarcial("Karate"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Aluno{inscricao=1, nome='Ana', Arte marcial=Karate}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirMestre() {
        Mestre mestre = new Mestre("Marcus", "Preta", "Aluno graduado");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Mestre{nome='Marcus', faixa='Preta', graduar aluno='Aluno graduado'}", visitor.exibir(mestre));
    }


}