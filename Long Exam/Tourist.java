interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Batanes batanes);
    void visit(ElNido elnido);
    void visit(Pangasinan pangasinan);
    void visit(SamarIslands samarislands);
    void visit(Tagaytay tagaytay);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}