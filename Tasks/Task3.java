//Change variables so all 3 condition are true ->prints "Sucess"

public class Task3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = a;                                   // b = same reference as a
        String c = new String("Wow!");        // c = different content from a
        String d = new String("Wow!");        // d = matches "Wow" + "!"
        
        boolean b1 = a == b;                           // true: same object
        boolean b2 = d.equals(b + "!");                // true: "Wow == "Wow" + "!"
        boolean b3 = !c.equals(a);                     // true: different content
        
        
        if (b1 && b2 && b3) {
            System.out.println("Success!");         // All conditions true!
        }
    }
}