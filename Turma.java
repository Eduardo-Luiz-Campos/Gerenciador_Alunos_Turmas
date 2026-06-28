public class Turma {
    private String nomeTurma;
    private Aluno[] alunos;
    private Professor professorResponsavel;
    private int capacidadeMaxima;
    private int quantidadeAtual;

    public Turma(String nomeTurma, Professor professorResponsavel, int capacidadeMaxima) {
        this.nomeTurma = nomeTurma;
        this.professorResponsavel = professorResponsavel;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunos = new Aluno[capacidadeMaxima];
        this.quantidadeAtual = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAtual < capacidadeMaxima) {
            alunos[quantidadeAtual] = aluno;
            quantidadeAtual++;
            System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + nomeTurma + ".");
        } else {
            System.out.println("Erro: A turma " + nomeTurma + " está lotada!");
        }
    }

    public void removerAluno(int matricula) {
        boolean encontrado = false;
        for (int i = 0; i < quantidadeAtual; i++) {
            if (alunos[i].getMatricula() == matricula) {
                encontrado = true;
                System.out.println("Aluno " + alunos[i].getNome() + " removido com sucesso.");
                // Desloca os alunos no array para preencher o espaço vazio
                for (int j = i; j < quantidadeAtual - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                alunos[quantidadeAtual - 1] = null; // Limpa a última posição
                quantidadeAtual--;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Erro: Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public void listarAlunos() {
        if (quantidadeAtual == 0) {
            System.out.println("A turma está vazia.");
            return;
        }
        System.out.println("--- Lista de Alunos (" + nomeTurma + ") ---");
        for (int i = 0; i < quantidadeAtual; i++) {
            alunos[i].exibir();
        }
    }

    public double calcularMediaGeral() {
        if (quantidadeAtual == 0) return 0.0;
        
        double soma = 0;
        for (int i = 0; i < quantidadeAtual; i++) {
            soma += alunos[i].getNota();
        }
        return soma / quantidadeAtual;
    }

    public void exibirTurma() {
        System.out.println("\n===================================");
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Capacidade: " + quantidadeAtual + "/" + capacidadeMaxima);
        System.out.print("Professor Responsável: ");
        professorResponsavel.exibir();
        System.out.println("===================================");
        listarAlunos();
        System.out.println("===================================\n");
    }
}