package io.universe.emmaframework.api.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Sir.D
 */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface IDRule {
    String UUID = "UUID";
    String AUTO_INCREMENT = "AUTO_INCREMENT";
    String CUSTOM = "CUSTOM";

    String rule() default "";
}
