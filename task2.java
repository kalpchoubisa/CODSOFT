import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*******************Student grade Calculator**************");
        System.out.println("Enter the number of subjects:");
        int s=sc.nextInt();
        int total=0;
        System.out.println("Enter the marks obtained in "+s+" subjects respectively: ");
        for(int i=0;i<s;i++){
            int marks=sc.nextInt();
            total=total+marks;
        }
        double AP=(double)total/s;
        String Grade;
        if (AP>=90){
            Grade="A+";
        }
        else if(AP>=80){
            Grade="A";
        }
        else if(AP>=70){
            Grade="B";
        }
        else if(AP>=60){
            Grade="C";
        }
        else if(AP>=50){
            Grade="D";
        }
        else if(AP>=40){
            Grade="E";
        }
        else{
            Grade="Fail(F)";
        }
        System.out.println("Total marks = "+total);
        System.out.println("Average precentage= "+AP+"%");
        System.out.println("Grade is : "+Grade);
    }
    
}
