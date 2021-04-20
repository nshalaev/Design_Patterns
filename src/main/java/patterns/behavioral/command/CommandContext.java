package patterns.behavioral.command;

//receiver
public class CommandContext {
    private int a;
    private int b;
    private int result;

    public CommandContext(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
