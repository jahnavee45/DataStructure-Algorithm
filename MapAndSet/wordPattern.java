package MapAndSet;

public class wordPattern {
    public static void main(String[] args) {
        String p = "abba";
        String w = "dog cat cat dog";

        System.out.println("Word Pattern: " + isMatch(p, w)?"matches" : "not match");
    }
}
