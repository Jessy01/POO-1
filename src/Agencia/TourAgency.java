package Agencia;
 
public class TourAgency {
 
    public static void main(String[] args) {
 
        Customer customer = new Customer(1, "Talha", "Ocakci", "M", true);
        Customer customer2 = new Customer(2, "Josh", "Holloway", "M", true);
        Customer customer3 = new Customer(2, "Marie", "Jane", "F", true);
        Customer customer4 = new Customer(2, "Natalie", "Portman", "F", true);
        Customer customer5 = new Customer(2, "Brad", "Pitt", "M", true);
 
        Car car = new Car();
        car.reserveSeat(customer);
        car.reserveSeat(customer2);
        car.reserveSeat(customer3);
        car.reserveSeat(customer4);
        car.reserveSeat(customer5);
        car.listSeats();
 
        System.out.println("-------------");
 
        Bus bus = new Bus();
        bus.reserveSeat(customer);
        bus.reserveSeat(customer4);
        bus.reserveSeat(customer3);
        bus.reserveSeat(customer2);
        //bus.reserveSeat(customer5);
        bus.listSeats();
 
        System.out.println("-------------");
 
        Plane plane = new Plane();
        plane.reserveSeat(customer);
        plane.reserveSeat(customer4);
        plane.reserveSeat(customer3);
        plane.reserveSeat(customer2);
        bus.reserveSeat(customer5);
        plane.listSeats();
 
    }
}