package exmaple;

public class Main {

    public static void main(String[] args) {
        YourClass<Double> doubleYourClass = new YourClass<>(2.0, 1, "description");
        YourClass<String> stringYourClass = new YourClass<>("stringField", 2, "description");
        doubleYourClass.getGenericType();
        stringYourClass.getGenericType();
    }
}
