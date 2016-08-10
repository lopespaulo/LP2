import java.util.ArrayList;

class Aplicacao {
    public static void main(String[] args) {
         /*Student[] alunos = new Student[5];
        for(int i= 0; i < 5; i++){
            alunos[i] = new Student((i*i*2),"João");
        }

        ArrayList<Student> students = new ArrayList<Student>();
        
        Student aluno1 = new Student(1, "Tony Stark");
        Student aluno2 = new Student(2, "Thor");
        Student aluno3 = new Student(3, "Hulk");
        Student aluno4 = new Student(4, "Capitão America");
        Student aluno5 = new Student(5, "Ze Maguinho");

        students.add(aluno1);
        students.add(aluno2);
        students.add(aluno3);
        students.add(aluno4);
        students.add(aluno5);

        for(Student aluno: students){
            System.out.println("Nome: "+aluno.getNome());
        }

        students.add(new Student(6, "Homem Aranha"));

        for(int i = 0; i < students.size(); i++){
            System.out.println("Nome: "+students.get(i).getNome());
        }*/


        Turma turma = new Turma();

        turma.addAluno(new Student(1, "Huguinho"));
        turma.addAluno(new Student(2, "Zezinho"));
        turma.addAluno(new Student(3, "Luisinho"));

        turma.listaTurma();

        turma.listaAluno(2);

    }
}