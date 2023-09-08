public class Professor {
    String name;
    int age;
    double salary;
    boolean isGradueted;

    public Professor(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void showProfessorInformations() {
        System.out.println("O nome do professor é " + name);
        System.out.println("A idade do professor é " + age);
        System.out.println("O salário do professor é R$" + salary);
        System.out.println("O professor possui graduação? " + isGradueted + "\n");
    }
}
