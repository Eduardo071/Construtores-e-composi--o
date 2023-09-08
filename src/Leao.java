public class Leao {
    String habitat;
    int lenght;
    boolean isTrained;
    String ownerName;

    public Leao(String ownerName, boolean isTrained){
        this.ownerName = ownerName;
        this.isTrained = isTrained;
    }

    public void showLeaoInformations() {
        System.out.println("O habitat natural do leão é " + habitat);
        System.out.println("O tamanho do leao é " + lenght + " cm");
        System.out.println("O leão é adestrado? " + isTrained);
        System.out.println("O nome do dono é " + ownerName + "\n");
    }
}
