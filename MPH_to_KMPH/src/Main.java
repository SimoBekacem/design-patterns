public class Main {
    public static void main(String[] args) {
        Speed carSpeed = new CarSpeedAdapter(new CarSpeedByMPH());
        double carspeed = carSpeed.carSpeed();
        System.out.print("car speed in kmph is :");
        System.out.println(carspeed);
    }
}