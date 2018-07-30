package cn.fly.yun.config.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Created by tao on 2018/4/19.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RedisLock {

    String value() default "";
    String[] params() default {};
    long timeOut() default 2;
    TimeUnit timeUnit() default TimeUnit.SECONDS;

}
