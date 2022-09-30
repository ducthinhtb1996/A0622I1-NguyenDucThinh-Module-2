package company.ss6_ke_thua.circleCylinder;

public class RunMain {
    public static void main(String[] args) {
        Cylinder hinhTru = new Cylinder(5,"Red",10);
        System.out.println(hinhTru.getVolume());
        System.out.println(hinhTru.getArea());
        System.out.println(hinhTru);
        System.out.println(hinhTru.getArea());
    }
}
