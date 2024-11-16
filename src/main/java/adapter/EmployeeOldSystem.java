package adapter;

// Class represents the employee in the old system
class EmployeeOldSystem {
    private String name;
    private int officeNumber;

    public EmployeeOldSystem(String name, int officeNumber) {
        this.name = name;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }
}
