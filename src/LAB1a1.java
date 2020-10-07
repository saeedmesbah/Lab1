import java.util.*;

public class LAB1a1 {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int max=0,min=0,counter=0;
        System.out.println("enter number1: ");
        int a=input.nextInt();
        System.out.println("enter number2: ");
        int b=input.nextInt();
        
        if(a>b){
            max=a;
            min=b;
        }
        
        else if(b>a){
            max=b;
            min=a;
        }
        
        else{
           System.out.println("false?????????");
           return;
        }
        
        for(int i=2;i<min;i++){
            int hold;
            hold=max%i;
            if(hold==0){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("false?????????");
        }
        if(counter==0){
            System.out.println("true!!!!!!!!");
        }
        
    }
    
}
