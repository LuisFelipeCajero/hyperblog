package Java;

class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }
    
    void printDataCar() {
        System.out.println("license: " + license + " Driver " + driver.name + "Passengers: " + passenger);
    }


    public Integer getPassenger(){
        return passenger;
        
    }

    public void setPassenger(Integer passenger){
        if (passenger == 4){
        this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}
