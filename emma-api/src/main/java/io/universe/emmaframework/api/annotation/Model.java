package io.universe.emmaframework.api.annotation;

import java.lang.annotation.*;

/**
 * 模型注解
 *
 * @author Sir.D
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Model {
    String name() default "";

    String mainField() default "id";

    String desc() default "";

    IDRule idRule() default @IDRule;

    Index[] indexes() default {};

    boolean superClass() default false;
}
