package io.universe.emmaframework.api.annotation;

import java.lang.annotation.*;

/**
 * @author Sir.D
 */
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Field {
    String name() default "";

    String desc() default "";

    FieldType type() default FieldType.Inference;

    boolean nullable() default true;

    String defaultValue() default "";
}
