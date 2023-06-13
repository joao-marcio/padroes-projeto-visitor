package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return "Aluno{" +
                "inscricao=" + aluno.getInscricao() +
                ", nome='" + aluno.getNome() + '\'' +
                ", Arte marcial=" + aluno.getArteMarcial() +
                '}';
    }

    @Override
    public String exibirMestre(Mestre mestre) {
        return "Mestre{" +
                "nome='" + mestre.getNome() + '\'' +
                ", faixa='" + mestre.getFaixa() + '\'' +
                ", graduar aluno='" + mestre.getGraduarAluno() + '\'' +
                '}';
    }


}
