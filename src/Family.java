public class Family {
    private int numberOfPeople;
    //количество членов семьи
    private String residenceType;
    //тип жилья
    private double paymentForRent;
    //оплата за аренду

    public Family() {
    }

    public Family(int numberOfPeople, String residenceType, double payment) {
        this.numberOfPeople = numberOfPeople;
        this.residenceType = residenceType;
        this.paymentForRent = payment;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    public double getPaymentForRent() {
        return paymentForRent;
    }

    public void setPaymentForRent(double paymentForRent) {
        this.paymentForRent = paymentForRent;
    }

    @Override
    public String toString() {
        return "Family{" +
                "numberOfPeople=" + numberOfPeople +
                ", residenceType='" + residenceType + '\'' +
                ", payment=" + paymentForRent +
                '}';
    }
}
