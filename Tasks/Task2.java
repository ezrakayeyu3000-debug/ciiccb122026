//Print "H3110  w0rld 2.0 True" using all primitivies (except long and double)
public class Task2 {
    public static void main(String[] args) {
    //Primitivies for the output     
        byte zero = 0;                 //for 0
        short threeOneOneZero = 3110;  //for 3110
        int two = 2;                   //for "2"
        float twoPointZero = 2.0f;     //for "2.0"
        char h = 'H';                  //for "H"
        char w = 'w';                  //for "w"
        boolean isTrue = true;         //for "true"

        //Output String 
        //h + ""forces String concatatenation (other 'H' + 3110 = 3182)
        String output = h + "" + threeOneOneZero + " " + w + zero + "rld " + two + "." + zero + " " + isTrue;
       
        //Print the result
        System.out.println(output);
    }
}
