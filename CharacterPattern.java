public class CharacterPattern {
    public static void main (String[]args){
        int n = 4;
        char ch='A';
        //outer loop for no. of lines
        for(int line = 1;line<=n;line++){
            // inner loop no. of character has to print
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
