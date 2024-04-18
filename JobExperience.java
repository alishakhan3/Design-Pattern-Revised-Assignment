public class JobExperience {
    private static JobExperience instance;
    private int totalyears;

    private JobExperience() {
        this.totalyears = 0;
    }

    public static JobExperience getInstance() {
        if (instance == null) {
            instance = new JobExperience();
        }
        return instance;
    }

    public void jobLength(int yrs) {
        totalyears+=yrs;
    }

    public void getMyJobYears() {
        System.out.print("\nMy total job experience is "+ totalyears+" years\n");
    }
}