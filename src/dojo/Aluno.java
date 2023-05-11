package dojo;

import dojo.Pessoa;

public class Aluno extends Pessoa {
    private String ra;
    private Curso curso;
    
    public String getRa(){
        return ra;
    }
    
    public void setRa(String ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
