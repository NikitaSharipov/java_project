package Food;

public class WrongFoodException extends Exception {
    public WrongFoodException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
