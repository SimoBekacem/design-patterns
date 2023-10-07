public class CarSpeedAdapter implements Speed{
    private CarSpeedByMPH CarSpeedByMPH = new CarSpeedByMPH();
    CarSpeedAdapter( CarSpeedByMPH CarSpeedByMPH){
        this.CarSpeedByMPH = CarSpeedByMPH;
    };

    @Override
    public double carSpeed() {
        double speed = CarSpeedByMPH.carSpeed();
        return speed*1.60934;
    }
}
