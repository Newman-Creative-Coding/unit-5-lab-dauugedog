public class CarTest{
    public static void main(String[] args) {
        Car x = new Car("Speedster");
        System.out.println(x.getModel());
        System.out.println(x.getVIN());
        System.out.println(x.getMake());
        x.setPlateNumber("ADJF23");
        System.out.println(x.getPlateNumber());
        System.out.println(x.getTotalProfits());
        System.out.println(x.getTotalCars());
        System.out.println(x.getTotalCubesters());
        System.out.println(x.getTotalRoadsters());
        System.out.println(x.getTotalSpeedsters());
    }
}   