import java.util.ArrayList;
public class disciplina {
    private String materia;
    public disciplina() {
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    private ArrayList<entrega> listamedia = new ArrayList<>();

    public void adicionar(entrega l) {
        listamedia.add(l);
    }
    public double media(String nome) {
        double a = 0;
        double mediafinal = 0;
        double cont = 0;
        for (int i = 0; i < listamedia.size(); i++) {
            if (nome == listamedia.get(i).getAluno()) {
                cont += 1;
                a += listamedia.get(i).notaPeso();
                mediafinal = a / cont;
            }
        }
        return mediafinal;
    }
    public void statusdoaluno (String nome) {
        boolean existe =  false;
        for (int i = 0; i < listamedia.size(); i++) {
            if (nome == listamedia.get(i).getAluno()) {
                existe = true;
            }
        }

        if (existe == true) {
            System.out.println("Status Aluno");
            System.out.println("Aluno:"+ nome);
            System.out.println("Disciplina: " + getMateria());
            System.out.println("Media final: " + media(nome));
            System.out.println();
        } else {
            System.out.println("Aluno sem media");
            System.out.println();
        }
    }
}
