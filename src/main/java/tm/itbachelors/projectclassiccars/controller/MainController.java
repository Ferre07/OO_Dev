package tm.itbachelors.projectclassiccars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Controller
public class MainController {
//    private ArrayList<Staff> staffArrayList;
//    private ArrayList<Owner> ownerArrayList;
//    private ArrayList<Car> carArrayList;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


//    private ArrayList<Staff> fillStaffMembers() {
//        ArrayList<Staff> staffArrayList = new ArrayList<>();
//
//        Staff staff1 = new Staff("Johan", "Bertels");
//        staff1.setStartDate(LocalDate.of(2002, 5, 1));
//        Staff staff2 = new Staff("An", "Van Herck");
//        staff2.setStartDate(LocalDate.of(2019, 3, 15));
//        staff2.setSenior(true);
//        Staff staff3 = new Staff("Bruno", "Coenen");
//        staff3.setStartDate(LocalDate.of(1995,1,1));
//        Staff staff4 = new Staff("Wout", "Dayaert");
//        staff4.setStartDate(LocalDate.of(2002, 12, 15));
//        Staff staff5 = new Staff("Louis", "Petit");
//        staff5.setStartDate(LocalDate.of(2020, 8, 1));
//        staff5.setSenior(true);
//        Staff staff6 = new Staff("Jean", "Pinot");
//        staff6.setStartDate(LocalDate.of(1999,4,1));
//        Staff staff7 = new Staff("Ahmad", "Bezeri");
//        staff7.setStartDate(LocalDate.of(2009, 5, 1));
//        Staff staff8 = new Staff("Hans", "Volzky");
//        staff8.setStartDate(LocalDate.of(2015, 6, 10));
//        staff8.setSenior(true);
//        Staff staff9 = new Staff("Joachim", "Henau");
//        staff9.setStartDate(LocalDate.of(2007,9,18));
//        staffArrayList.add(staff1);
//        staffArrayList.add(staff2);
//        staffArrayList.add(staff3);
//        staffArrayList.add(staff4);
//        staffArrayList.add(staff5);
//        staffArrayList.add(staff6);
//        staffArrayList.add(staff7);
//        staffArrayList.add(staff8);
//        staffArrayList.add(staff9);
//        return staffArrayList;
//    }
//
//    private ArrayList<Owner> fillOwners() {
//        ArrayList<Owner> ownerArrayList = new ArrayList<>();
//        Owner owner1 = new Owner("Dominik", "Mioens");
//        owner1.setYearOfBirth(2001);
//        Owner owner2 = new Owner("Zion", "Noops");
//        owner2.setYearOfBirth(1996);
//        Owner owner3 = new Owner("Maria", "Bonetta");
//        owner3.setYearOfBirth(1998);
//        ownerArrayList.add(owner1);
//        ownerArrayList.add(owner2);
//        ownerArrayList.add(owner3);
//        ownerArrayList.get(0).addToWishList("Volkswagen Golf (1984)");
//        ownerArrayList.get(0).addToWishList("Porsche 911 (1973)");
//        ownerArrayList.get(1).addToWishList("Alfa Romeo Spider (1966)");
//        ownerArrayList.get(1).addToWishList("BMW 3 Series (E30, 1982)");
//        ownerArrayList.get(1).addToWishList("Fiat 124 Sport Coupe (1966)");
//        ownerArrayList.get(1).addToWishList("Citroën DS (1955)");
//        ownerArrayList.get(2).addToWishList("Audi Quattro (1980)");
//        return ownerArrayList;
//    }
//
//    private ArrayList<Car> fillCars() {
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        Car car1 = new Car("BMW", "2002");
//        car1.setPhoto("/img/bmw_2002_turbo.jpg");
//        Car car2 = new Car("Ford", "Capri");
//        car2.setPhoto("/img/ford_capri.jpg");
//        Car car3 = new Car("Jaguar", "E-Type");
//        car3.setPhoto("/img/jaguar_e_type.jpg");
//        Maintenance maintenance1 = new Maintenance("Oil Change", 60, 25);
//        Maintenance maintenance2 = new Maintenance("Tire Rotation and Replacement", 180, 12.58);
//        Maintenance maintenance3 = new Maintenance("Brake Inspection",150,30.99);
//        Maintenance maintenance4 = new Maintenance("Fluid Checks and Top-Ups", 258,25.45);
//        Maintenance maintenance5 = new Maintenance("Battery Maintenance",30,20);
//        Maintenance maintenance6 = new Maintenance("Air Filter Replacement",130,26.6);
//        Maintenance maintenance7 = new Maintenance("Motor Review/Engine Tune-Up", 240,15);
//        Maintenance maintenance8 = new Maintenance("Wiper Blade Replacement", 180,25.99);
//        Maintenance maintenance9 = new Maintenance("Check and Replace Lights",50,35);
//        Maintenance maintenance10 = new Maintenance("Oil Change", 80, 20);
//        Maintenance maintenance11 = new Maintenance("Air Filter Replacement",10,35);
//        maintenance1.setResponsible(staffArrayList.get(0));
//        maintenance2.setResponsible(staffArrayList.get(1));
//        maintenance3.setResponsible(staffArrayList.get(2));
//        maintenance4.setResponsible(staffArrayList.get(3));
//        maintenance5.setResponsible(staffArrayList.get(4));
//        maintenance6.setResponsible(staffArrayList.get(5));
//        maintenance7.setResponsible(staffArrayList.get(6));
//        maintenance8.setResponsible(staffArrayList.get(7));
//        maintenance9.setResponsible(staffArrayList.get(8));
//        car1.addMaintenance(maintenance1);
//        car1.addMaintenance(maintenance2);
//        car1.addMaintenance(maintenance3);
//        car1.addMaintenance(maintenance4);
//        car2.addMaintenance(maintenance10);
//        car2.addMaintenance(maintenance5);
//        car2.addMaintenance(maintenance6);
//        car3.addMaintenance(maintenance7);
//        car3.addMaintenance(maintenance8);
//        car3.addMaintenance(maintenance9);
//        car3.addMaintenance(maintenance11);
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//        return carArrayList;
//    }
}

