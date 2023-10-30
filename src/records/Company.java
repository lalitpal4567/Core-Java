package records;

public record Company(int compID, String compName) {
    static int establishedYear;
    public Company(int compID, String compName, int year){
        this(compID, compName);
        establishedYear = year;
    }
}
