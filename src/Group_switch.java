import java.util.*;
public class Group_switch {
    public static void main(String args[])
    {
        char c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a letter:");
        c=in.next().charAt(0);
        switch(c)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("letter\t"+c+"\tis a vowels");
                break;
            default:
                System.out.println("letter"+c+"is a constant");
        }
    }
}
