package adapter;

// Class adapter that connects the old system to the new interface
class EmployeeAdapter implements NewEmployeeInterface {
    private EmployeeOldSystem oldEmployee;

    public EmployeeAdapter(EmployeeOldSystem oldEmployee) {
        this.oldEmployee = oldEmployee;
    }

    @Override
    public String getEmployeeName() {
        return oldEmployee.getName();
    }

    @Override
    public String getPhoneNumber() {
        // Convert office number to phone number by default
        return "0" + oldEmployee.getOfficeNumber();
    }
}
