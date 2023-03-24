public class Company {
    String brand;
    Company(){
        brand="Apple";
    }

    public static void main(String[] args) {
        Company a = new Company();
        System.out.println(a.brand);
    }
}
