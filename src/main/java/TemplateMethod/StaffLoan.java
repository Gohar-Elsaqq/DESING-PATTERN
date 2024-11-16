package TemplateMethod;

class StaffLoan extends BookLoan {
    @Override
    void issueReceipt() {
        System.out.println("Issuing receipt for staff loan. Note: Staff members have a 1-month loan period.");
    }
}