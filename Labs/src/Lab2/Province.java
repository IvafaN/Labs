package Lab2;

/**
 * Created by ifarfan
 */
public class Province {

/*
Create two classes: Province and Canada, as described below.

Class Province has three instance variables:
private String name;         // e.g. “British Columbia”
private String capital;  // e.g. “Victoria”
private long population; // e.g. 2264823
 */
    private static final long DEFAULT_POPULATION = 4_648_055;
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private String name;
    private String capital;
    private long population;

    /*
    * is a private method you must write which contains a local array of the 10 Canadian Province names, and returns true if the String parameter exists in that array; otherwise it returns false.
      isValidCapitalCity(String capital).
    * is a private method you must write which contains a local array of the 10 Canadian Province Capital City names.
    * returns true if the String parameter exists in that array; otherwise it returns false.
    * isValidPopulation(int population) is a private method you must write which returns true if the parameter is between 30,000 and 15,000,000 otherwise it returns false.
     */
    String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia",
                          "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
    String[] capitals = {"Toronto", "Quebec", "Halifax", "Fredericton", "Winnipe",
                        "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};
    long[] populations = {14_659_616, 8_522_800, 976_768, 780_021, 1_373_859,
                           5_105_576,   157_901, 1_178_657, 4_395_586, 521_922};

/*
The constructor takes all three parameters and assigns them if they follow the rules:
 */
    public Province(String name, String capital, long population) {
        if ((isValidPopulation(population) && isValidProvince(name)
                && isValidCapitalCity(capital))) {

            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION; // 4,648,055
            this.name = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
    }

    private boolean isValidCapitalCity(String capital) {
        for (int i = 0; i < capitals.length; i++) {
            if (capitals[i] == capital) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPopulation(long population) {

        if ( population <= 15_000_000 && population>= 30_000) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidProvince(String name) {
        for (int i = 0; i < provinces.length; i++) {
            if (provinces[i] == name) {
                return true;
            }
        }
        return false;
    }

    /*
     * Then, add accessor(getter) and mutator(setter) methods for each instance variable.
     * Finally, add a method called public String getDetails() which returns a String in the format:
       The capital of British Columbia (population. 4648055) is Victoria.
     */

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCapital() { return capital; }
    public void setCapital(String capital) { this.capital = capital; }

    public long getPopulation() { return population; }
    public void setPopulation(long population) { this.population = population; }

    public String getDetails() {
        String information = ("The capital of %s (population. %.0f) is %s." + getName() + getPopulation() + getCapital());
        return information;
    }
}
