package tims.refactoring.problems.one;

public class Stuff {
    private String foo;
    private String bar;

    private int one;
    private int two;

    public Stuff(String foo, String bar, int one, int two) {
        this.foo = foo;
        this.bar = bar;
        this.one = one;
        this.two = two;
    }

    public String getStringStuff() {
        return foo + bar;
    }

    public String getNumberStuff() {
        return "" + one + two;
    }

    public static void main(String[] args) {
        Stuff stuff = new Stuff("foo", "bar", 1, 2);
        System.out.println(stuff.getStringStuff());
        System.out.println(stuff.getStringStuff());

    }

}
