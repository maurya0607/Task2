//package Codesoft;

import java.util.Scanner;

public class StuGclac {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);


        System.out.print("Enter Number of Subject: ");
        int Nsubject = sc.nextInt();
        double[] marks = new double[Nsubject];


        for(int i = 0; i<Nsubject; i++)
        {
            System.out.print("Enter marks of sybject "+ (i+1)+ " (out of 100) : ");
            marks[i] = sc.nextDouble();
        }

        double tmarks = caltmarks(marks);

        double avPer = calavPer(tmarks, Nsubject);

        char grade  =  calgrade(avPer);

        System.out.println("******** Results : given marks ************");
        System.out.println("Total marks :"+tmarks);
        System.out.println("Average Percentage : %.2f%% :"+avPer);
        System.out.println("Grade :"+grade);
        sc.close();

    }
    
    private static double caltmarks(double[] marks)
    {
        double total = 0;
        for(double mark : marks)
        {
            total += mark;
        }
        return total;

    }
    private static double calavPer(double tmarks, int Nsubject){
        return tmarks/Nsubject;
    }

    private static char calgrade(double avPer)
    {
        if(avPer >= 90)
        {
            return 'A';
        }
        else if(avPer >= 80)
        {
            
            return 'B';
        }
        else if(avPer >= 70)
        {
            return 'C';

        }
        else if(avPer >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';   
        }
    }
}
