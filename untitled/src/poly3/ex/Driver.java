package poly3.ex;

public class Driver {
   private Car car;

   public void setCar(Car car) {
       this.car = car;
   }

   public void driverDrive(){
       System.out.println("드라이버가 운전을 시작합니다!");
       car.drive();
   }

}


