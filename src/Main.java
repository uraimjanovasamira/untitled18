
public class Main {
    public static void main(String[] args) {


        Family[] families = new Family[]{
                new Family(4, "dormitory", 60_000),
                new Family(6, "Hotel", 70_000),
                new Family(7, "Apartment", 120_000)};


        Residence[] residences = new Residence[]{
                new Residence("Hotel", 70_000, 34_000),
                new Residence("dormitory", 60_000, 20_000),
                new Residence("Apartment", 120_000, 50_000)};

               calculate(families, residences);
    }

    public static void calculate(Family[] families, Residence[] residences) {
        for (int i = 0; i < families.length; i++) {
            Family family = families[i];
            double result = 0;

            for (int j = 0; j < residences.length; j++) {
                Residence residence = residences[j];

                if (family.getResidenceType().equals(residence.getType())) {
                    result = residence.getRent() + residence.getUtilityPayments();


                }
            }
            System.out.println("Family with " + family.getNumberOfPeople() + " people lives in " +
                    family.getResidenceType() + " and pays $" + result);

        }


    }
}

