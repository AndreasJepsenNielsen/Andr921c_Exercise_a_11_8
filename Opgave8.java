import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


//færdig opgave 8

public class Opgave8 {


    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

       // set1.add("kort");
       // set1.add("to");
       // set1.add("MegetLang");

        minLength(set1);
    }

    public static int minLength(Set<String> a)
    {
        int minLength = 1000; // sætter længden til er meget højt tal, så det næsten er umuligt at stringen er længere til at starte med
        for (String n : a)
        {
            if(minLength > n.length() ) // hvis minlength er større en n.length
            {
                minLength = n.length(); // minlength bliver sat til at være n.length så længe den er kortere
            }
        }

        if(a.isEmpty()) // i tilfælde af at vores set er tomt bliver minlength sat til 0
        {
            minLength = 0;
        }

        System.out.println(minLength); // udskriver længden
        return minLength;

    }
}
