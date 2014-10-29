package me.rbrick.zeus;

/**
 * Created by Ryan on 10/28/2014
 * <p/>
 * Project: ZeusV2
 */
public interface CommandContext<T> {

    T sender();

    String[] arguments();

    int argsLength();
}
