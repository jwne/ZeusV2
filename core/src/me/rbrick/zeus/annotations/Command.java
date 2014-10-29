package me.rbrick.zeus.annotations;

import javax.annotation.Nonnull;

/**
 * Created by Ryan on 10/28/2014
 * <p/>
 * Project: ZeusV2
 */
public @interface Command {

    @Nonnull String name();

    String[] aliases();

    String usage() default "Usage: /<command>";

    String permission();

    String permMsg() default "You do not have permission to perform this command.";

    int maxArgs() default -1;

    int minArgs() default 0;
}
