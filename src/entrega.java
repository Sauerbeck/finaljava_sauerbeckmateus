public abstract class entrega {
    private String aluno;
    private String nomeAvaliacao;
    private double peso;
    private double nota;
    private double notaPeso;
    public entrega(String aluno, String nomeAvaliacao, double peso, double nota) {
        this.aluno = aluno;
        this.nomeAvaliacao = nomeAvaliacao;
        this.peso = peso;
        this.nota = nota;
    }
    public String getAluno() {
        return aluno;
    }
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getnomeAvaliacao() {
        return nomeAvaliacao;
    }
    public void setnomeAvaliacao(String nomeAvaliacao) {
        this.nomeAvaliacao = nomeAvaliacao;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public double notaPeso() {
        notaPeso = nota * peso;
        return notaPeso;
    }
    public void statusObjeto() {
        System.out.println("Status Aluno");
        System.out.println("Aluno:" + getAluno());
        System.out.println("Trabalho:" + getnomeAvaliacao());
        System.out.println("Peso:" + getPeso());
        System.out.println("Nota da prova" + getNota());
        System.out.println();
    }
}
