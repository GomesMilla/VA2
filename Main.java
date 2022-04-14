class Main {
   public static void main(String[] args) {
    
    /*
        * 1. Instanciar dois alunos, dois cursos, 4 disciplinas e tres professores.
        * 2. Exibir o calculo da media de dois alunos 
        * 3. Exiba a consulta de uma nota de qualquer disciplina de algum aluno.
        * 4. Exiba o relatório final de dois alunos.
    */

    // Instanciando o que foi pedido 
    Professor Carol = new Professor("Carol");
    Professor Pedro = new Professor("Pedro");
    Professor Wendell = new Professor("Wendell");

    Disciplina POO = new Disciplina("POO",Pedro, 100);
    Disciplina Sistemas = new Disciplina("Sistemas",Carol, 100); 
    Disciplina Complexidade = new Disciplina("Complexidade",Wendell, 100);
    Disciplina Banco = new Disciplina("Banco", Pedro, 100);

    Curso CPU = new Curso("CPU", POO, Sistemas, Banco);
    Curso Odonto = new Curso("Complexidade", Sistemas, POO);

    Aluno alunoUm = new Aluno("Camila", 07, CPU);
    Aluno alunoDois = new Aluno("Jose", 70, CPU);
 }
}