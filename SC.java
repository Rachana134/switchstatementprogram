/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ch,a,b;
        System.out.println("enter the value of a and b");
        Scanner c = new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
        System.out.println("enter your choice\t1.+\t2.-\t3.*\t4./");
        ch=c.nextInt();
        switch(ch){
            case 1:System.out.println(a+b);
                   break;
            case 2:System.out.println(a-b);
                   break;
            case 3:System.out.println(a*b);
                   break;
            case 4:if(b==0)
                     System.out.println("dinominator cant be 0");
                   else
                     System.out.println(a/b);
                   break;
            default:System.out.println("Invalid");
        }
        
        // TODO code application logic here
    }
    
}
