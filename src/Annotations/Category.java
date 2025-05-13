package Annotations;

import java.lang.annotation.*;

@Repeatable(Categories.class)  // Container where this annotation can be repeated
public @interface Category {

    String name() default "noCategory";
}
