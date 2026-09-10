public class Main {
    public static void main(String[] args){
        Vehicle vehicle =new Vehicle(5,5,5);

        Truck truck = new Truck(3,3,3,5);

        OffRoad offRoad = new OffRoad(5,5,5,5);

        System.out.println(vehicle);
        System.out.println(truck);
        System.out.println(offRoad);

        truck.setCapacidadeCarga(444);

        offRoad.setGroundClearence(33);
    }
}