class Student{
    private int matricula;
    private String nome;

    public Student(){}
    public Student(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }
    
    public String getNome(){
        return nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    
}