package design.command;

public class ConcreteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("concrete command,may invoke other class...");
    }
}
