ZeusV2
======

The direct successor to Zeus


So far
========

So far this is how methods are going to look:

```java
@Command(name="example", aliases={"ex"})
@TabCompleter({"texttocomplete"}) // I should code like a offset of where it should happen or just have let the subcommands do that.
public void example(CommandContext<Player> context) { 
   Player player = context.sender();
   String[] args = context.arguments();
   
   if(context.argsLength() == 1) {
      player.sendMessage(args[0]);
   } else {
      player.sendMessage("Hello");
   }
}
```