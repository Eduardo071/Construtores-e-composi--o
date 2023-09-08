public class Moto {
    String licensePlate;
    double tankCapacity;
    String paintColor;
    String modelName;

    public Moto(String licensePlate, String modelName){
        this.licensePlate = licensePlate;
        this.modelName = modelName;
    }

    public void showMotoInformations() {
        System.out.println("A placa da moto é " + licensePlate);
        System.out.println("A capacidade do tanque da moto é de " + tankCapacity + " litros");
        System.out.println("A cor da pintura é " + paintColor);
        System.out.println("O modelo da moto é " + modelName + "\n");
    }
}
