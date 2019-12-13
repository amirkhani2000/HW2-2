package Base;

import java.util.ArrayList;

public class Pishrafte extends Lesson{
    public final boolean HasKargah = true;
    public Pishrafte(){
        this.Teacher = "Minofam";
        ArrayList<Lesson> p =new ArrayList<>();
        Lesson lesson1 = new Mabani();
        p.add(lesson1);
        this.Hamniaz = null;
        this.PishNiaz = p;
    }
}
