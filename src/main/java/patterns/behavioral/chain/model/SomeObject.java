package patterns.behavioral.chain.model;

public class SomeObject {
    private String name;
    private String info;

    public SomeObject(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
