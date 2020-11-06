import java.util.*;
public class calculator{
    private static Scanner input = new Scanner(System.in);
    private static double num=0;
    public static void main(String[] args){
        simplecalc();
    }
    public static void simplecalc(){
       String inp= input.next().toLowerCase();
       int inpNum=0;
//       if(input.hasNext()) inpNum = input.nextInt();
        switch (inp){
           case "exit":
               return;
           case "cancel":
               num=0;
               break;
            case "add":
               inpNum = input.nextInt();
               num=num+inpNum;
               break;
            case "substract":
               inpNum = input.nextInt();
               num=num-inpNum;
               break;
           case "divide":
               inpNum = input.nextInt();
               if(inpNum==0){
                   num=0;
               }
               else num=num/inpNum;
               break;
           case "multiply":
               inpNum = input.nextInt();
               num=num*inpNum;
               break;
           default:
               simplecalc();
               return;
       }
       System.out.printf("%.1f%n",num);
        simplecalc();
       //add substract multiply divided cancel exit


    }

}
