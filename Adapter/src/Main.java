public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        vehicule car2 = new Car();

        bycicle byc1 = new bycicle();
        vehicule byc2 = new adapterBycicle(new bycicle());

        car1.accelerating();
        car1.stopping();
        car1.Pipe();
        car2.accelerating();
        car2.stopping();
        car2.Pipe();

        byc2.Pipe();
        byc1.
    }
}