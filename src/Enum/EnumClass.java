package Enum;

public enum EnumClass implements Interface{
    MONDAY(1, "Monday"){
        // override the default method
        @Override
        public String getName() {
            return "Monday is the first day of the week";
        }

        @Override
        public void absractMethod() {
            System.out.println("Abstract method implemented in MONDAY");
        }
    },
    TUESDAY(2, "Tuesday"){

        @Override
        public void absractMethod() {
            System.out.println("Abstract method implemented in TUESDAY");
        }
    },
    WEDNESDAY(3, "Wednesday"){
        @Override
        public void absractMethod() {
            System.out.println("Abstract method implemented in WEDNESDAY");
        }
    },
    THURSDAY(4, "Thursday"){
        @Override
        public void absractMethod() {
            System.out.println("Abstract method implemented in THURSDAY");
        }
    },
    FRIDAY(5, "Friday"){
        @Override
        public void absractMethod() {
            System.out.println("Abstract method implemented in FRIDAY");
        }
    },
    SATURDAY(6, "Saturday"){
        @Override
        public void absractMethod() {
            System.out.println("Abstract method implemented in SATURDAY");
        }
    },
    SUNDAY(7,"Sunday"){
        @Override
        public void absractMethod() {
            System.out.println("Abstract method implemented in SUNDAY");
        }
    };

    // Below variables should be applicable to all the enums
    private int val;
    private String name;

    EnumClass(int val, String name){  // constructors are private by default in enums
        this.val = val;
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printName() {
        System.out.println("Name: " + name);
    }

    public abstract void absractMethod(); // abstract method which should be implemented in all the enum
}
