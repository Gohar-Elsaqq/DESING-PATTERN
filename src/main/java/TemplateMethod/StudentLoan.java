package TemplateMethod;

class StudentLoan extends BookLoan {
    @Override
    void issueReceipt() {
        System.out.println("Issuing receipt for student loan. Note: Students have a 2-week loan period.");
    }
}