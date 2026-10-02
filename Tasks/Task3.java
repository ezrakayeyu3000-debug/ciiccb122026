public class Task3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = a;                        //same reference a 
        String c = new String("Wow!");       //same content
        String d = new String("Wow!");       //matches "Wow" + "!"
        
        boolean b1 = a == b;                 //true lahat yan 
        boolean b2 = d.equals(b + "!");      
        boolean b3 = !c.equals(a);   
        
        
        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}