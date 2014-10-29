package me.rbrick.zeus.annotations;

import javax.annotation.Nonnull;

/**
 * Created by Ryan on 10/28/2014
 * <p/>
 * Project: ZeusV2
 */
public @interface TabCompleter {

    @Nonnull String[] value();
}
