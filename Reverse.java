public class Reverse {
    public static void main(String[] a) {

        int n = 12345;        // original number
        int reverse = 0;      // yaha hum reversed number store karenge

        // loop tab tak chalega jab tak n > 0 (jab tak saare digits process na ho jaye)
        while (n > 0) {

            int lastdigit = n % 10;  
            // last digit nikalne ke liye (e.g. 12345 → 5)

            reverse = reverse * 10 + lastdigit;  
            // pehle reverse ko 10 se multiply karte hain (digits left shift)
            // phir last digit add kar dete hain
            // example: 12 → 120 → +3 = 123

            n = n / 10;  
            // last digit remove karte hain (12345 → 1234)

        }

        System.out.println("The reverse of this no. is " + reverse);
        // final reversed number print hoga
    }
}
