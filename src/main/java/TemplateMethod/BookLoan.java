package TemplateMethod;

abstract class BookLoan {

    public final void loanBook() {
        checkBookAvailability();
        updateLoanRecord();
        notifyUser();
        issueReceipt();
    }

    private void checkBookAvailability() {
        System.out.println("Checking if the book is available...");
    }

    private void updateLoanRecord() {
        System.out.println("Updating the loan record in the database...");
    }

    private void notifyUser() {
        System.out.println("Sending notification to the user about the loan...");
    }

    abstract void issueReceipt();

}
