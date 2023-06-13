package padroescomportamentais.visitor;

public class Mestre implements Pessoa {


    private String nome;
    private String faixa;
    private String graduarAluno;

    public Mestre(String nome, String faixa, String graduaraluno) {

        this.nome = nome;
        this.faixa = faixa;
        this.graduarAluno = graduaraluno;
    }


    public String getNome() {
        return nome;
    }

    public String getFaixa() {
        return faixa;
    }

    public String getGraduarAluno() {return graduarAluno;}

    public String aceitar(Visitor visitor) {
        return visitor.exibirMestre(this);
    }

}
