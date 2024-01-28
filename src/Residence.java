public class Residence {
    private String type;
    //тип жилья
    private double rent;
    //аренда
    private double utilityPayments;
    //ком.услуги

    public Residence() {
    }

    public Residence(String type, double rent, double utilityPayments) {
        this.type = type;
        this.rent = rent;
        this.utilityPayments = utilityPayments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getUtilityPayments() {
        return utilityPayments;
    }

    public void setUtilityPayments(double utilityPayments) {
        this.utilityPayments = utilityPayments;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "type='" + type + '\'' +
                ", rent=" + rent +
                ", utilityPayments=" + utilityPayments +
                '}';
    }
}
