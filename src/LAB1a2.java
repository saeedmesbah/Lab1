import java.util.*;

public class LAB1a2 {
    
    
    public static void main(String[] args) {
        
        for(int i=1;i<11;i++){
            
            for(int j=1;j<11;j++){
                System.out.print(""+i*j);
                System.out.print(" ");
                if(i*j<10)
                    System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}
