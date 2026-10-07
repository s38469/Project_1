// TODO musimy dodać brakujące klasy.

// Ok, ja dodam 'Adder', a s#### doda 'Subtractor'


public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(150, 223));

        Subtractor subtractor = new Subtractor();


        System.out.println(subtractor.subtract(6, 3));
    }
}
