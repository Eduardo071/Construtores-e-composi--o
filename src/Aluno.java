public class Aluno {
    String name;
    int age;
    double note;
    boolean isHardWorking;

    public Aluno(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showAlunoInformations() {
        System.out.println("O nome do aluno é " + name);
        System.out.println("A idade do aluno é " + age);
        System.out.println("A nota do aluno é " + note);
        System.out.println("O aluno é esforçado? " + isHardWorking + "\n");
    }
}
