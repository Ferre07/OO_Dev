package tm.itbachelors.projectclassiccars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tm.itbachelors.projectclassiccars.model.*;
import java.util.ArrayList;
import java.time.LocalDate;

@SpringBootApplication
public class ProjectclassiccarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectclassiccarsApplication.class, args);
	
	System.out.println("\n-- PART 1 --");
		Owner owner1 = new Owner("Lisa", "Janssen");
		owner1.setNationality("NL");
		owner1.addToWishList("Porsche");
		owner1.addToWishList("Ferrari");

		Owner owner2 = new Owner("Ferre", "Goovaerts");
		owner2.setNationality("BE");
		owner2.addToWishList("BMW");
		owner2.addToWishList("Audi");
		owner2.addToWishList("Mercedes");
		owner2.addToWishList("Volvo");

		Owner owner3 = new Owner("Marco", "Rossi");
		owner3.addToWishList("Fiat");

		ArrayList<Owner> ownerList = new ArrayList<>();
		ownerList.add(owner1);
		ownerList.add(owner2);
		ownerList.add(owner3);

		int counter = 1;
		for (Owner o : ownerList) {
			System.out.println("Information owner " + counter);
			System.out.println(o.toString());
			System.out.println("Wish list of " + o.getFirstName() + ":");
			// Loop through the wish list of each owner
			for (String wish : o.getWishList()) {
				System.out.println("-" + wish);
			}
			System.out.println();
			counter++;
		}

	System.out.println("\n-- PART 2 --");
		Staff staff1 = new Staff("Eva", "De Smedt");
		staff1.setSenior(true);
		staff1.setStartDate(LocalDate.of(2020, 3, 15));

		Staff staff2 = new Staff("Tom", "Willems");
		staff2.setStartDate(LocalDate.of(2022, 9, 1));

		Staff staff3 = new Staff("Sara", "Claes");
		staff3.setSenior(true);
		staff3.setStartDate(LocalDate.of(2019, 6, 10));

		System.out.println(staff1 + " *".repeat(
				Boolean.compare(staff1.isSenior(), false)));
		System.out.println(staff2 + " *".repeat(
				Boolean.compare(staff2.isSenior(), false)));
		System.out.println(staff3 + " *".repeat(
				Boolean.compare(staff3.isSenior(), false)));



		System.out.println("\n-- PART 3 --");
		Car car1 = new Car("Porsche", "911");
		car1.setKilometers(45000);
		car1.registerOwner(owner2);

		Maintenance m1 = new Maintenance("Oil Change", 180);
		m1.setHourlyRate(30.0);
		m1.setResponsible(staff1);
		Maintenance m2 = new Maintenance("Replacing tyres", 300);
		m2.setHourlyRate(25.0);
		m2.setResponsible(staff2);
		Maintenance m3 = new Maintenance("Replacing brakes", 120);
		m3.setHourlyRate(30.0);
		m3.setResponsible(staff3);

		car1.addMaintenance(m1);
		car1.addMaintenance(m2);
		car1.addMaintenance(m3);

		Car car2 = new Car("Dacia", "Duster");
		car2.setKilometers(12000);
		car2.registerOwner(owner1);

		Maintenance m4 = new Maintenance("Replacing air filters", 60);
		m4.setHourlyRate(15.0);
		m4.setResponsible(staff2);
		Maintenance m5 = new Maintenance("Battery check", 90);
		m5.setHourlyRate(20.0);
		m5.setResponsible(staff3);

		car2.addMaintenance(m4);
		car2.addMaintenance(m5);

		ArrayList<Car> carList = new ArrayList<>();
		carList.add(car1);
		carList.add(car2);

		for (Car car : carList) {
			System.out.println("** " + car.getName() + " **");
			System.out.println("This car has " + car.getNumberOfMaintenances()+ " number of maintenances");
			double totalCost = 0;
			for (Maintenance m : car.getMaintenances()) {
				System.out.println("- " + m.getType()+ ", duration: " + m.getDuration()	+ " minutes, rate: " + m.getHourlyRate()
						+ ", price: " + m.getPrice()+ " (Done by: " + m.getResponsible()+ ")");
				totalCost = totalCost + m.getPrice();
			}
			System.out.println("Total cost: " + totalCost);
			System.out.println();
		}

	System.out.println("\n-- PART 4 --");
		for (Owner o : ownerList) {
			if (o.getFirstName().equals("Ferre")) {
				System.out.println(o.toString());
			}
		}

	System.out.println("\nThe end ...");
        System.exit(0);

    }

}
