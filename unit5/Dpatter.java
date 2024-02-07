//Print character pattern 

public class Dpatter {
    public static void main(String[] args) {
        char ch = 'A';
        for(int line=1; line<=4; line++){
            for(int Char=1; Char<=line; Char++){
                System.out.print(ch);
                ch++;
            }
         System.out.println();
        }
    }
}
