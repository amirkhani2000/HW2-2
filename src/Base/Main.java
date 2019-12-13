package Base;

public class Main {
    public static void main(String[] args) {
        Pishrafte p = new Pishrafte();
        System.out.println(p.getClass().toString()+" pish niaz :");
        for (Lesson l:p.PishNiaz) {
            System.out.println(l.getClass()+" "+l.Teacher);
        }
        System.out.println(p.getClass()+" ham niaz :");
        System.out.println(p.Hamniaz);
    }
}
