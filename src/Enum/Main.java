package Enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(EnumClass.MONDAY.getName());

        // all methods are present in java.lang.Enum which is superclass of all enums
        for(EnumClass val : EnumClass.values()) {  // values() will give all the enums in a list
            System.out.println(val.ordinal()); // ordinal() will return the value for enum or default if not assigned
        }

        EnumClass enumVal = EnumClass.valueOf("MONDAY"); // valueOf() will return the enum for the given value
        System.out.println(enumVal.name());
    }
}
