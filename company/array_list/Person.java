package company.array_list;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
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

    public String hocBai() {
        return "đang học tiếng anh";
    }

    @Override
    public String toString() {
        return name + "\t" + id;
    }
}
