import java.util.*;

public class driverSingleton {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int y=0;

        JobExperience job1 = JobExperience.getInstance();
        System.out.print("\nEnter the number of years you worked at 1st job: ");
        y=sc.nextInt();
        job1.jobLength(y);
        job1.getMyJobYears();

        JobExperience job2 = JobExperience.getInstance();
        System.out.print("\nEnter the number of years you worked at 2nd job: ");
        y=sc.nextInt();
        job2.jobLength(y);
        job2.getMyJobYears();

        sc.close();
    }
}
