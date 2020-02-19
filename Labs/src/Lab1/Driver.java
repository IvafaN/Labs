package Lab1;

/**
 * Created by ifarfan
 */
public class Driver {

    public static void main(String[] args) {

        Model model1 = new Model("Tiger", "Woods", 72, 190, true, false);
        model1.printDetails();

        Model model2 = new Model("Susan", "Smith", 70, 120, true, false);
        model2.displayModelDetails();
    }
}
