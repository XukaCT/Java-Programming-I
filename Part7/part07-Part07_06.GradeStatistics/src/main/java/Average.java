
import java.util.ArrayList;

public class Average {

    private ArrayList<Integer> points;

    public Average() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {
        this.points.add(point);
    }

    public double pointsAverage() {
        double total = 0.0;
        for (Integer point : points) {
            total += point;
        }
        total= total / this.points.size();
        return total;
    }

    public double passAverage() {
        double total = 0.0;
        int count = 0;
        for (Integer point : points) {
            if (point >= 50) {
                total += point;
                count++;
            }
        }
        if (count != 0) {
            return total / count;
        }
        return -1;
    }

    public double passPercentage() {
        int count = 0;
        for (Integer point : points) {
            if (point >= 50) {
                count++;
            }
        }
        return ((1.0 * count) / this.points.size()) * 100;
    }

    public void pointsToGrade() {
        ArrayList<Integer> grade = new ArrayList<>();
        for (Integer point : points) {
            if (point < 50) {
                grade.add(0);
            } else if (point < 60) {
                grade.add(1);
            } else if (point < 70) {
                grade.add(2);
            } else if (point < 80) {
                grade.add(3);
            } else if (point < 90) {
                grade.add(4);
            } else {
                grade.add(5);
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grade,i));
        }
    }

    private String stars(ArrayList<Integer> grades, int number) {
        String star = "";
        for (Integer grade : grades) {
            if(grade==number) {
                star+="*";
            }
        }
        return star;
    }

}