package design.command;

/**
 * <p>
 *     You can see <a href="https://github.com/iluwatar/java-design-patterns/tree/master/command">command-design</a>
 *     write is very good!
 * </p>
 *
 * @author KChaste Sun
 */
public class Invoke {

    private Command command;

    public Invoke(){}
    public Invoke(Command command){
        this.command = command;
    }

    public void call(){
        command.execute();
    }


}
