package Lab2;

/**
 * Created by ifarfan
 */
public class Canada {

//private Province[] provinces;
    private Province[] provinces;

//The Canada class has one constructor, a default constructor, which simply creates an array of ten Province objects, to match Canada’s provinces.
    public Canada() {
        this.provinces = new Province[]{
                new Province("Ontario", "Toronto", 13_448_494),
                new Province("Quebec", "Quebec City", 816_4361),
                new Province("Nova Scotia", "Halifax", 971_395),
                new Province("New Brunswick", "Fredericton", 747101),
                new Province("Manitoba", "Winnipeg", 1_278_365),
                new Province("British Columbia", "Victoria", 4_648_055),
                new Province("Prince Edward Island", "Charlottetown", 142_907),
                new Province("Saskatchewan","Regina",109_8352),
                new Province("Alberta", "Edmonton", 4_067_175),
                new Province("Newfoundland and Labrador", "St. John's", 519_716)
        };
    }

//Add the following methods to the Canada class:
//public void displayAllProvinces(), which loops through the array and prints each Province object’s getDetails() method.

    public void displayAllProvinces() {

    }

//Note: Use for-each loop.public int getNumOfProvincesBetween(int min, int max), which takes the population in millions (e.g. 4, 6) and
//returns the number of Provinces with the populations in that range (e.g. 4-6 million, inclusive). Note: Use for-each loop.



}
