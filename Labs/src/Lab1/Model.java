package Lab1;

/**
 * Created by ifarfan
 */
public class Model {

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName, lastName;
    private int height;
    private double weight;
    private boolean canTravel, smokes;

    // First constructor
    public Model() {

    }

    // Second constructor
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeightInches(height);
        setWeightPounds(weight);
        setCanTravel(canTravel);
        setSmoker(smokes);
    }

    // Third constructor
    public Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeightInches(height);
        setWeightPounds(weight);
    }

    /**
     * set firstName
     * @param firstName
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set lastName
     * @param lastName
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set height
     * @param height
     * @return
     */
    public void setHeightInches(int height) {
        this.height = height;
    }

    /**
     * set weight
     * @param weight
     * @return
     */
    public void setWeightPounds(double weight) {
        this.weight = weight;
    }

    /**
     * set canTravel
     * @param canTravel
     * @return
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * set smokes
     * @param smokes
     * @return
     */
    public void setSmoker(boolean smokes) {
        this.smokes = smokes;
    }

    /*
    first name and last name must be 3 to 20 characters long or else they won't be stored
height must be 24 to 84 inches or it won't be stored
weight must be 80 to 280 pounds or it won't be stored
     */

    /**
     * get firstName
     * @param
     * @return the first name
     */
    public String getFirstName() {
        return this.firstName = (firstName.length() >= 3 && firstName.length() <= 20) ? this.firstName : "";
    }

    /**
     * get lastName
     * @param
     * @return the last name
     */
    public String getLastName() {
        return this.lastName = (lastName.length() >= 3 && lastName.length() <= 20) ? this.lastName : "";
    }

    /**
     * get height
     * @param
     * @return the height
     */
    public int getHeightInches() {
        return this.height = (height >= 24 && height <= 84) ? height : 0;
    }

    /**
     * get weight
     * @param
     * @return the weight
     */
    public double getWeightPounds() {
        return this.weight = (weight >= 80 && weight <= 280) ? weight : 0;
    }

    /**
     * get canTravel
     * @param
     * @return true or false
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * get smokes
     * @param
     * @return true or false
     */
    public boolean isSmokes() {
        return smokes;
    }

    public String getHeightInFeetAndInches() {
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;
        return String.format("%d feet %d inches", feet, inches);
    }

    public long getWeightKg() {
        long kgs = (long) (weight / POUNDS_PER_KG);
        return Math.round(kgs);
    }

    /*
    public void setWeight(long kilograms)
public void setWeight(double pounds)
public void setHeight(int feet, int inches)
public void setHeight(int inches)
     */

    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInches() + " inches");
        System.out.println("Weight: " + Math.round(getWeightPounds()) + " pounds");
        String travel = (isCanTravel() == true) ? "Does travel" : "Does not travel";
        System.out.println(travel);
        String smoke = (isSmokes()) ? "Does smoke" : "Does not smoke";
        System.out.println(smoke);
    }

    /*
    Calculates a model's per-hour pay rate and returns the amount.
    Everyone receives the hourly BASE_RATE_DOLLARS_PER_HOUR.
    Tall, thin models (both tall and thin) receive an hourly bonus of TALL_THIN_BONUS_DOLLARS_PER_HOUR.
    Tall means TALL_INCHES inches or more, thin means less than THIN_POUNDS pounds.
    Models who are willing to travel receive an extra TRAVEL_BONUS_DOLLARS_PER_HOUR per hour.
    However, models who smoke have SMOKER_DEDUCTION_DOLLARS_PER_HOUR per hour deducted from their pay.
     */
    public int calculatePayDollarsPerHour() {
        int total = 0;
        total = BASE_RATE_DOLLARS_PER_HOUR;
        total = (getHeightInches() >= TALL_INCHES && getWeightPounds() < THIN_POUNDS) ? total + TALL_THIN_BONUS_DOLLARS_PER_HOUR : total;
        total = (isCanTravel() == true) ? total + TRAVEL_BONUS_DOLLARS_PER_HOUR : total;
        total = (isSmokes() == true) ? total - SMOKER_DEDUCTION_DOLLARS_PER_HOUR : total;

        return total;
    }

    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + Math.round(getWeightPounds()) + " pounds");
        String travel = (isCanTravel() == true) ? "yep" : "nope";
        System.out.println(travel);
        String smoke = (isSmokes()) ? "yep" : "nope";
        System.out.println(smoke);
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }
}
