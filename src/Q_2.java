import java.util.Scanner;

public class Q_2 {
    public static int count(String s){
        String vowel = "aeiou";
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(vowel.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String s = sc.nextLine();
        System.out.println(count(s));
    }
}
