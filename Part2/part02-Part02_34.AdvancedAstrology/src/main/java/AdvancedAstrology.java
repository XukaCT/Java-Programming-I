
public class AdvancedAstrology {
    
    public static void printStars(int number) {
        for(int i=0;i<number;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for(int i=0;i<number;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i=0;i<size;i++){
            for(int j=size-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        for(int i=0;i<height;i++){
            for(int j=height-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<height-2;j++){
                System.out.print(" ");
            }
            for(int a=0;a<3;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
