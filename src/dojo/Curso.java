package dojo;

public class Curso {
    private String nome;
    private Disciplina disciplina;
    
        public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDiciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
