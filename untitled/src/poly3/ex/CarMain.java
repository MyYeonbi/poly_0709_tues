package poly3.ex;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3 k3 = new K3();

        driver.setCar(k3);
        driver.driverDrive();
    }
}
