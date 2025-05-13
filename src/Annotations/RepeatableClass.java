package Annotations;

@Category
@Category(name = "MyCategory")
@Category(name = "AnotherCategory")
public class RepeatableClass {

    public void method(){
        System.out.println("This is a method in RepeatableClass");
    }

    public static void main(String[] args) {
        RepeatableClass repeatableClass = new RepeatableClass();

        // This will get all the name field for the Category annotations
        for(Category category : repeatableClass.getClass().getAnnotationsByType(Category.class)){
            System.out.println(category.name());
        }
    }
}
