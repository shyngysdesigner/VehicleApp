public class Main {
    public static void main(String[] args) {
        SUV fortuner = new SUV("Fortuner",false);
        fortuner.move(40, 0);
        fortuner.accelerate(20);
        fortuner.accelerate(-60);

        System.out.println("Current gear: " + fortuner.getCurrentGear());
        System.out.println("Current speed: " + fortuner.getCurrentSpeed());
    }

}