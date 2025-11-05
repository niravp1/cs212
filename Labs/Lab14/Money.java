package Lab14;

public class Money {

    /*
     * Create a new class called Money, and include:
     * Instance variables for dollars (int) and cents (int).
     * A no-argument constructor which sets dollars and cents to zero.
     * A two-argument constructor accepting integer dollars and cents.
     * Get methods for dollars and cents.
     * A toString method which would print 6 dollars and 5 cents as:
     * $ 6.05
     */

    private int dollars;
    private int cents;

    public Money() {
        dollars = 0;
        cents = 0;
    }

    public Money(int d, int c) {
        dollars = d;
        cents = c;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public String toString() {
        String centsString = "0" + Integer.toString(cents);
        return "$" + Integer.toString(dollars) + "." + centsString.charAt(centsString.length() - 2) +
                centsString.charAt(centsString.length() - 1);
    }

    public double compareTo(Money other) {
        double otherTotal = other.dollars + other.cents;
        double total = dollars + cents;
        return Math.abs(total - otherTotal);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Money))
            return false;
        return true;
    }

    /*
     * dollars = 6 cents = 5 -> 1234
     * centsString = 5
     */
    public static void main(String args[]) {
        Money m1 = new Money();
        Money m2 = new Money(6, 5);
        System.out.println(m1.getCents());
        System.out.println(m2.getDollars());
        System.out.println(m2);
        System.out.println(m1.compareTo(m2));
        System.out.println(m1.equals(m2));
    }
}
