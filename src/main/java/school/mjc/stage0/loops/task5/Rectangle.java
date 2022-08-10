package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for(int i = 0; i < height; i++){
            if (i==0 || i == height-1){
                for(int j = 0; j < length; j++){
                    System.out.print("8");
                }
                System.out.println();
            }
            else {
                System.out.print("8");
                for(int j = 1; j < length - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("8");
                System.out.println();
            }
        }
    }
}
