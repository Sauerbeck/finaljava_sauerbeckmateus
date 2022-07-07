public class main {
    public static void main(String[] args) {
        prova a = new prova("Aluno01", "Prova01", 7, 10);
        trabalho b = new trabalho("Aluno02", "Trabalho02", 8, 8);
        trabalho c = new trabalho("Aluno03", "Trabalho03", 9, 7);
        prova d = new prova("Aluno04", "Prova04", 10, 5);
        prova e = new prova("Aluno05", "Prova05", 7, 8);
        prova f = new prova("Aluno06", "Prova06", 8, 10);

        disciplina listaNota = new disciplina();
            listaNota.adicionar(a);
            listaNota.adicionar(b);
            listaNota.adicionar(c);
            listaNota.adicionar(d);
            listaNota.adicionar(e);
            listaNota.adicionar(f);
            listaNota.setMateria("Java");
            listaNota.media("Aluno03");
            listaNota.statusdoaluno("leanderson");
    }
}

