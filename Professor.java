public class Professor {
    private String nome;
    private String disciplina;
    private int anosExperiencia;

    public Professor(String nome, String disciplina, int anosExperiencia) {
        this.nome = nome;
        this.disciplina = disciplina;
        setAnosExperiencia(anosExperiencia); // Usa o setter para aplicar a validação
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        if (anosExperiencia >= 0) {
            this.anosExperiencia = anosExperiencia;
        } else {
            System.out.println("Erro: Anos de experiência não podem ser negativos. Valor ajustado para 0.");
            this.anosExperiencia = 0;
        }
    }

    public void exibir() {
        System.out.println("Professor: " + nome + " | Disciplina: " + disciplina + " | Experiência: " + anosExperiencia + " anos");
    }
}