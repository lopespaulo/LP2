import java.util.ArrayList;
import java.util.Iterator;

class Turma{

    ArrayList<Student> alunos;


    public Turma(){
        alunos = new ArrayList<Student>();
    }

    public void addAluno(Student aluno){
        alunos.add(aluno);
    }

    public void listaTurma(){
        Iterator<Student> iter = alunos.iterator();
        
		while (iter.hasNext()) {
			System.out.println("Aluno: "+ iter.next().getNome());
		}
    }

    public void delAluno(String nome){
        for (Student aluno : alunos){
            if(aluno.getNome().equals(nome)){
                System.out.println("Removendo... "+aluno.getNome());
                alunos.remove(aluno);
            }
        }
    }

    public void listaAluno(int matricula){
        for (Student aluno : alunos){
            if(aluno.getNome() != null && aluno.getMatricula() == matricula){
                System.out.println("Aluno: "+aluno.getNome()+ " Matricula: "+aluno.getMatricula());
            }
        }


    }





}