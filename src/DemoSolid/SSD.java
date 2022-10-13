package DemoSolid;

public class SSD implements Computer {
    private String connected;
    private String name;


    @Override
    public String connect() {
        connected = "sata";
        return connected;
    }
}
