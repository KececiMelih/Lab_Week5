
package lab_week5;


public class Lab_week5 {

  
    public static void main(String[] args) {
        
        Package p1 = new Package(
            "Melih", "Street 1", "Istanbul", "Turkey", "34000",
            "Erol", "Street 2", "Antalya", "Turkey", "07000",
            10, 2
        );

        TwoDayPackage p2 = new TwoDayPackage(
            "Samet", "Street 1", "Istanbul", "Turkey", "34000",
            "Zahit", "Street 2", "Antalya", "Turkey", "07000",
            10, 2, 5
        );

        OvernightPackage p3 = new OvernightPackage(
            "Emir", "Street 1", "Istanbul", "Turkey", "34000",
            "Mert", "Street 2", "Antalya", "Turkey", "07000",
            10, 2, 3
        );

        System.out.println("---NORMAL PACKAGE---");
        p1.info();

        System.out.println("\n---TWO DAY PACKAGE---");
        p2.info();

        System.out.println("\n---OVERNIGHT PACKAGE---");
        p3.info();
    }
    }
    

