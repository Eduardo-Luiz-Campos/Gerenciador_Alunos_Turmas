public class Aluno {
    private String nome;
    private int matricula;
    private double nota;
    private Professor professor; // Composição de classes

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = (nota >= 0 && nota <= 10) ? nota : 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void exibir() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula + " | Nota: " + nota);
        if (professor != null) {
            System.out.print("   -> Orientado por: ");
            professor.exibir();
        } else {
            System.out.println("   -> Nenhum professor associado.");
        }
    }
}