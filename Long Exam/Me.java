public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    //Define your visit
    public void visit(Boracay boracay) {

        int airFare = 100;

        System.out.println("Boracay airFare: " + airFare);

        if (budget > airFare) {
            System.out.println("Paradise on Earth is in Boracay!!!");
            budget = budget - airFare;
            checkBudget();
            System.out.println(" ");
        } else {
            System.out.println("Amount not enough!");
        }

    }

    // Define your visit
    public void visit(Pangasinan pangasinan) {

        int airFare = 100;

        System.out.println("Pangasinan airFare: " + airFare);
        
        if (budget > airFare) {
            System.out.println("The home to many wonders!");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("Amount not enough!");
        }
    }

    // Define your visit
    public void visit(ElNido elnido) {

        int airFare = 200;

        System.out.println("El Nido airFare: " + airFare);

        if (budget > airFare) {
            System.out.println("El Nido here I come!");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("Amount not enough!");
        }

    }

     // Define your visit
    public void visit(SamarIslands samarislands) {

        int airFare = 250;
        
        System.out.println("Samar Islands airFare: " + airFare);

        if (budget > airFare) {
            System.out.println("Discover more fun here in Samar!");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("Amount not enough!");
        }

    }

    // Define your visit
    public void visit(Tagaytay tagaytay) {

        int airFare = 200;

        System.out.println("Tagaytay airFare: " + airFare);
        
        if (budget > airFare) {
            System.out.println("Kagandahang taglay ng tagaytay!");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("Amount not enough!");
        }
    }

    // Define your visit
    public void visit(Batanes batanes) {

        int airFare = 300;

        System.out.println("Batanes airfare: " + airFare);
        
        if (budget > airFare) {
            System.out.println("Breathetaking Batanes - Explore Simplicity <3");
            budget = budget - airFare;
            checkBudget();
            System.out.println("");
        } else {
            System.out.println("amount not enough!");
        }
    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }

}