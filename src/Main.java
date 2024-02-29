public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome(new Lighting(),
                new MusicSystem(), new ClimateControl());
        System.out.println("----Empieza el día----");
        smartHome.startEveningRoutine();

        System.out.println("----Termina el día----");
        smartHome.endEveningRoutine();

    }
}