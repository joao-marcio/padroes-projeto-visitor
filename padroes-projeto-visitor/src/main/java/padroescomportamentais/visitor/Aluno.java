package padroescomportamentais.visitor;

public class Aluno implements Pessoa {

    private int inscricao;
    private String nome;
    private ArteMarcial arteMarcial;

    public Aluno(int inscricao, String nome, ArteMarcial arteMarcial) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.arteMarcial = arteMarcial;
    }

    public int getInscricao() {
        return inscricao;
    }

    public String getNome() {
        return nome;
    }

    public String getArteMarcial() {
        return this.arteMarcial.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAluno(this);
    }

}
