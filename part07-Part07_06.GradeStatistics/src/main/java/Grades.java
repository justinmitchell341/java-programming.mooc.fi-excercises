import java.util.ArrayList;
public class Grades{
    private ArrayList<Integer> grades;
    public Grades(){
            this.grades = new ArrayList();
    }
    public void add(int grade){
        if(grade <= 100 && grade >= 0){
        grades.add(grade);
        }
    }
    public double averages(){
        double avg = 0;
        double total = 0;
        for(Integer grade: grades){
            total = total + grade;
        }
        avg = total/grades.size();
        return avg;
    }
    public double averagePassing(){
        double total = 0;
        int i = 0;
        for(Integer grade: grades){
            if(grade >= 50){
                total+= grade;
                i++;
            }
        }
        return total/i;
    }
    public double passPercent(){
        double i = 0;
        double passing = 0;
        for(Integer grade: grades){
           if(grade >= 50){
               passing++;
            }
           i++;
        }
        return passing/i * 100;
    }
    public void distribution(){
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        int fail = 0;
        for(Integer grade: grades){
            if(grade >= 90){
                A++;
            }
            if(grade < 90 && grade >= 80){
                B++;
            }
            if(grade < 80 && grade >= 70){
                C++;
            }
            if(grade < 70 && grade >= 60){
                D++;
            }
            if(grade < 60 && grade >= 50){
                F++;
            }
            if(grade < 50){
                fail++;
            }
        }
        System.out.print("5: ");
        while(A > 0){
            System.out.print("*");
            A = A - 1;
        }
        System.out.println("");
        System.out.print("4: ");
        while(B > 0){
            System.out.print("*");
            B = B - 1;
        }
        System.out.println("");
        System.out.print("3: ");
        while(C > 0){
            System.out.print("*");
            C = C - 1;
        }
        System.out.println("");
        System.out.print("2: ");
        while(D > 0){
            System.out.print("*");
            D = D - 1;
        }
        System.out.println("");
        System.out.print("1: ");
        while(F > 0){
            System.out.print("*");
            F = F - 1;
        }
        System.out.println("");
        System.out.print("0: ");
        while(fail > 0){
            System.out.print("*");
            fail = fail - 1;
        }
        System.out.println("");
    }
    public void print(){
        for(Integer grade: grades){
            System.out.print(grade + " ");
        }
    }
   
}
