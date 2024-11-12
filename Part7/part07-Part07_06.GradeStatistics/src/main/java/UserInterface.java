import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private Average list;

    public UserInterface(Scanner reader, Average list) {
        this.reader = reader;
        this.list = list;
    }
    
    public void adding(int point) {
        this.list.add(point);
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(reader.nextLine());
            if (point == -1) {
                break;
            }
            if (point >= 0 && point <= 100) {
                this.adding(point);
            }
        }
        System.out.println("Point average (all): " + DoPointsAverage());

        if (this.list.passAverage() != 0.0) {
            System.out.println("Point average (passing): " + DoPassAverage());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + DoPassPercentage());
        System.out.println("Grade distribution:");
        DoPointsToGrade();
    }

    public double DoPointsAverage() {
        return this.list.pointsAverage();
    }

    public double DoPassAverage() {
        return this.list.passAverage();
    }

    public double DoPassPercentage() {
        return this.list.passPercentage();
    }

    public void DoPointsToGrade() {
        this.list.pointsToGrade();
    }

}