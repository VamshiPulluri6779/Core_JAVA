package Annotations;

@SuppressWarnings("deprecation") // If I use this, compiler will ignore all the deprecated warnings
public class Main {

    // @SuppressWarnings("deprecation") // If I use this, compiler will ignore all the deprecated warnings
    public static void main(String[] args) {

        DeprecatedMethod deprecatedMethod = new DeprecatedMethod();
        deprecatedMethod.deprecatedMethod(); // This will show a warning in the IDE
    }
}
