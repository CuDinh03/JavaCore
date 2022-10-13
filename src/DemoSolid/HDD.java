package DemoSolid;

public class HDD implements Computer{
    private String concected;
    private String name;
    @Override
    public String connect() {
        concected = "sata";
        return concected;
    }
}
