package lab.lab12;

public class HocSinh {

    int id;
    String name;
    String quoctich;

    HocSinh(String name) {
        System.out.println("gọi constructor mặc định");
    }

    HocSinh(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public HocSinh(int id, String name, String quoctich) {
        this(id);
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        HocSinh e1 = new HocSinh(111, "Viet");
        HocSinh e2 = new HocSinh(222, "Nam");
//        e1.display();
//        e2.display();
    }
}
