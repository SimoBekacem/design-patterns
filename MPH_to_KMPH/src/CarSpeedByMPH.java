import java.util.Scanner;

public class CarSpeedByMPH implements Speed{

    @Override
    public double carSpeed() {
        Scanner scanner = new Scanner(System.in);
        double speed ;
        System.out.println("Give the speed : ");
        speed = scanner.nextDouble();
        return speed;
    }
}
