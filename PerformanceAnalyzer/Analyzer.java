import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" enter your name ?");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter your marks : ");
        System.out.println("MATHS MARKS :");
        int maths = sc.nextInt();
        System.out.println("MATHS : "+ maths );
        System.out.println("PHYSICS MARKS :");
        int physics = sc.nextInt();
        System.out.println("PHYSICS : " + physics);
        System.out.println("CHEMISTRY MARKS :");
        int chemistry = sc.nextInt();
        System.out.println("CHEMISTRY : "+chemistry);
        System.out.println("YOUR TOTAL MARKS = ");
        int sum = (maths + physics + chemistry);
        System.out.println(sum);
        System.out.println("YOUR PERCENTAGE = ");
        Double percentage = (sum/300.0*100);
         System.out.println(percentage);
         System.out.println("YOUR GRADE = ");
         if(percentage>=70){
         System.out.println("B grade");

         }else if(percentage >=80){
            System.out.println("A grade");
         }else {
            System.out.println("LOW GRADE");
         }
         System.out.println("STRONGEST AND WEAKEST SUBJECTS : ");
         System.out.println("STRONGEST SUBJECT");
         if(maths>physics && maths>chemistry){
            System.out.println(" MATHS IS Strongest");
         }else if(physics>chemistry && physics>maths){
            System.out.println("PHYSICS IS Strongest");
         }else {
            System.out.println("CHEMISTRY IS Strongest");
         }
         System.out.println("WEAKEST SUBJECT");
         if(maths<physics && maths<chemistry){
            System.out.println(" MATHS IS Weaker");
         }else if(physics<chemistry && physics<maths){
            System.out.println("PHYSICS IS Weaker");
         }else {
            System.out.println("CHEMISTRY IS Weaker");
         }
         System.out.println("YOUR PERFORMANCE :");
         if(percentage>70){
            System.out.println("GOOD");
         }else if (percentage>80){
            System.out.println("EXCELLENT");
         }else if (percentage>90){
            System.out.println("SUPERB");
         }else {
            System.out.println("NEEDS HARDWORK");
         }

       

          sum = calculateTotal(maths, physics, chemistry);
            System.out.println(sum);
            
    
     
        }
         
   
        public static int calculateTotal(int maths , int physics , int chemistry){
                int sum = maths+physics+chemistry;
                return sum;
            }
           
    }


