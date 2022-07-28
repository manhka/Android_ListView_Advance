package manhnguyen.listview_practice.com;

public class Student {
    private String name;
    private String clazz;
    private int image;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Student(String name, String clazz, int image) {
        this.name = name;
        this.clazz = clazz;
        this.image = image;
    }
}
