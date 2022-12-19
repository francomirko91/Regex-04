public class Start {
    public static void main(String[] args) {

        String regex1 = "x3z ? xYz ! R1 && __";
        String regex2 = regex1.replaceAll("[0-9_a-z]", "*");
        System.out.println(regex2);

    }
}
