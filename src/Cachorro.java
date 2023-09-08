public class Cachorro {
    String name;
    String breed;
    short age;
    String coatColor;

    public Cachorro(String name, short age){
        this.name = name;
        this.age = age;
    }

    public void showCachorroInformations() {
        System.out.println("O nome do cachorro é " + name);
        System.out.println("A raça do cachorro é " + breed);
        System.out.println("A idade do cachorro é " + age + " anos");
        System.out.println("A cor da pelagem é " + coatColor + "\n");
    }
}
