public class Carro {
    String vehicleCategory;
    String brandName;
    int maxSpeed;
    String engineModelName;

    public Carro(String vehicleCategory, String brandName){
        this.vehicleCategory = vehicleCategory;
        this.brandName = brandName;
    }

    public void showCarroInformations() {
        System.out.println("A categoria do veículo é " + vehicleCategory);
        System.out.println("A marca do carro é " + brandName);
        System.out.println("A velocidade máxima é de " + maxSpeed + "Km/h");
        System.out.println("O modelo do motor do carro é " + engineModelName + "\n");
    }
}
