package TemplateMethod;

public class LibrarySystem {
    public static void main(String[] args) {
        //Book borrowing by student

        BookLoan studentLoan = new StudentLoan();
        System.out.println("Processing book loan for a student...");
        studentLoan.loanBook();

        System.out.println("\n***************\n");

        //Book borrowing by an employee
        BookLoan staffLoan = new StaffLoan();
        System.out.println("Processing book loan for a staff member...");
        staffLoan.loanBook();
    }
}