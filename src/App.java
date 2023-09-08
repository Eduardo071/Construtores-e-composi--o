public class App {
    public static void main(String[] args) throws Exception {
        Professor professorIgor = new Professor("Igor", 10000.00);

        professorIgor.age = 30;
        professorIgor.isGradueted = true;
        professorIgor.showProfessorInformations();


        Moto motoDoIgor = new Moto("BRA5F42", "XJ6");

        motoDoIgor.tankCapacity = 17.3;
        motoDoIgor.paintColor = "Black";
        motoDoIgor.showMotoInformations();


        Carro carroDoIgor = new Carro("Sport", "Porshe");

        carroDoIgor.maxSpeed = 325;
        carroDoIgor.engineModelName = "V6";
        carroDoIgor.showCarroInformations();


        Cachorro cachorroDoIgor = new Cachorro("Javinha", (short) 10);

        cachorroDoIgor.breed = "Pinscher";
        cachorroDoIgor.coatColor = "White";
        cachorroDoIgor.showCachorroInformations();


        Leao leaoDoIgor = new Leao("Igor", true);

        leaoDoIgor.habitat = "Savana";
        leaoDoIgor.lenght = 174;
        leaoDoIgor.showLeaoInformations();


        Aluno alunoFavoritoDoIgor = new Aluno("Eduardo", 17);

        alunoFavoritoDoIgor.note = 8.5;
        alunoFavoritoDoIgor.isHardWorking = true;
        alunoFavoritoDoIgor.showAlunoInformations();

    }
}