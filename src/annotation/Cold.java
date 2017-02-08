package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Inherited
@Documented
public @interface Cold {

}
