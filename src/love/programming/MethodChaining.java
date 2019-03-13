package love.programming;

public class MethodChaining {
    public static void main(String[] args) {
        String myString = "Hello";
        System.out.println(myString);
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toUpperCase().concat("WORLD"));
        //method chaining
        System.out.println(myString.toUpperCase().concat("WORLD").length());
        //string builder
        StringBuilder myStringBuilder = new StringBuilder("narmada kalapala");
        myStringBuilder.append(" is good");
        System.out.println(myStringBuilder);
        System.out.println(myStringBuilder.length());
        System.out.println(myStringBuilder.capacity());

    }
}
