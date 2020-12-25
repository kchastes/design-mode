package design.command;

/**
 * @see Runnable
 * @author KChaste
 */
public class CommandDesign {

    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoke invoke = new Invoke(command);
        invoke.call();
    }

}
