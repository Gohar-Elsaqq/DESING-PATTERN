package builderpattern;

class Payment {
    private String method;
    private int amount;
    private String currency;

    private Payment(Builder builder) {
        this.method = builder.method;
        this.amount = builder.amount;
        this.currency = builder.currency;
    }
    public static class Builder {
        private String method;
        private int amount;
        private String currency;

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }

    @Override
    public String toString() {
        return "Payment [method=" + method + ", amount=" + amount + ", currency=" + currency + "]";
    }
}