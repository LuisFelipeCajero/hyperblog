package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("AMQ123", new Account("Jose Valencia", "AMQ123"));
        car.passenger = 3;
        car.printDataCar();

        Car car2 = new Car("NZT9821", new Account("Emmanuel Aguilar", "NZT9821"));
        car2.passenger = 2;
        car2.printDataCar();
    }
}