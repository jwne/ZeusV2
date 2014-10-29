package me.rbrick.zeus.annotations;

import javax.annotation.Nonnull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Ryan on 10/28/2014
 * <p/>
 * Project: ZeusV2
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Command {

    @Nonnull String name();

    String[] aliases();

    String usage() default "Usage: /<command>";

    String permission();

    String permMsg() default "You do not have permission to perform this command.";

    int maxArgs() default -1;

    int minArgs() default 0;
}
