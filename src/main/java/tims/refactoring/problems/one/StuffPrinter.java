package tims.refactoring.problems.one;

public class StuffPrinter {
    private String foo = "foo";
    private String bar = "bar";

    private int one = 1;
    private int two = 2;

    public void printStuff() {
        System.out.print(foo + bar);
        System.out.print(one + two);
    }

}
