package baitap;

import java.io.Serializable;

public class ClassCG implements Serializable {
    private static final long serialVersionUID = 2906642554793891381L;
    private int id;
    private String name;

    public ClassCG() {
    }

    public ClassCG(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassCG{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
