package humpl;

import java.util.Scanner;

/**
 *
 * @author Vojtech Humpl
 */
public class KvadratickaRovnice {

    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        float a, b, c;
        float x, x1, x2;
        float re, im;
        float d, d2;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        
        if(a == 0){
            
            if(b == 0){
                System.out.println("Not an equation\n");
                return;
            }
            
            x = -c/a;
            System.out.printf("Result: x = %.2f\n", x);
            return;
        }
        
        d = b*b - 4*a*c;
        d2 = (float) Math.sqrt(Math.abs(d));
        
        if(d < 0){
            re = -b / (2*a);
            im = Math.abs(d2 / (2*a));
            System.out.printf("Result: %.2f %.2f, %.2f %.2f\n", re, im, re, -im);
            return;
        }
        
        x1 = (-b + d2) / (2*a);
        x2 = (-b - d2) / (2*a);
        
        System.out.printf("Result: x1 = %.2f, x2 = %.2f\n", x1, x2);
        
        
    }
    
}
