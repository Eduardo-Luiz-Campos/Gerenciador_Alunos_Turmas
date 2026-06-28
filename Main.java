public class Main {
    public static void main(String[] args) {
        // 1. Criar pelo menos 1 professor (testando a validação de experiência)
        Professor prof1 = new Professor("Carlos Silva", "Programação Orientada a Objetos", 5);
        Professor profInvalido = new Professor("João", "Matemática", -2); // Demonstrando validação

        // 2. Criar 3 alunos diferentes
        Aluno aluno1 = new Aluno("Ana Paula", 1001, 8.5);
        Aluno aluno2 = new Aluno("Bruno Souza", 1002, 7.0);
        Aluno aluno3 = new Aluno("Carla Dias", 1003, 9.2);

        // 3. Associar o professor aos alunos
        aluno1.setProfessor(prof1);
        aluno2.setProfessor(prof1);
        aluno3.setProfessor(prof1);

        // 4. Criar 1 turma
        Turma turmaJava = new Turma("Engenharia de Software", prof1, 5);

        // 5. Adicionar os alunos à turma
        turmaJava.adicionarAluno(aluno1);
        turmaJava.adicionarAluno(aluno2);
        turmaJava.adicionarAluno(aluno3);

        // 6. Exibir os dados completos da turma
        turmaJava.exibirTurma();

        // 7. Calcular e exibir a média geral
        double media = turmaJava.calcularMediaGeral();
        System.out.printf("Média Geral da Turma: %.2f\n\n", media);

        // 8. Remover um aluno (Testando também a remoção de um aluno inexistente)
        turmaJava.removerAluno(1002); // Remove o Bruno
        turmaJava.removerAluno(9999); // Tenta remover aluno que não existe

        // 9. Exibir novamente a turma após a remoção
        turmaJava.exibirTurma();
        
        // Recalculando a média para mostrar que a alteração no array refletiu no cálculo
        System.out.printf("Nova Média Geral da Turma: %.2f\n", turmaJava.calcularMediaGeral());
    }
}