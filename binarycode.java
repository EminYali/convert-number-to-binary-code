import java.util.Scanner;

public class binarycode {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        var binary="";
        if (number%2==0)binary+=0;
        else binary+=1;
        while (true){
            if(number%2==0){
                number=number/2;
                if (number%2==0)binary+=0;
                else binary+=1;
            }
            else{
                number=number-1;
                continue;
            }
            if (number==1) break;
        }
        StringBuffer binaryorigin = new StringBuffer(binary);
        System.out.println("Output : "+binaryorigin.reverse());
        input.close();
    }
}