package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height%2 == 0){
            int temp = 0;
            for(int i = 0; i < height/2; i++){
                temp = height-((height/2-i)*2);
                for(int j = 0; j<temp/2;j++){
                    System.out.print(" ");
                }
                for (int j = 0;j < height - temp; j++){
                    System.out.print("8");
                }
                for(int j = 0; j<temp/2;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i = height/2-1; i >= 0; i--){
                temp = height-((height/2-i)*2);
                for(int j = 0; j<temp/2;j++){
                    System.out.print(" ");
                }
                for (int j = 0;j < height - temp; j++){
                    System.out.print("8");
                }
                for(int j = 0; j<temp/2;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        else {
            int temp = 0;
            for(int i = 0; i <= height/2; i++){
                temp = height/2-(height/2-i);
                for(int j = 0; j<temp;j++){
                    System.out.print(" ");
                }
                for (int j = 0;j < height - temp*2; j++){
                    System.out.print("8");
                }
                for(int j = 0; j<temp;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = height - height/2 - 1; i > 0; i--){
                temp = height/2-(height/2-i) - 1;
                for(int j = 0; j<temp;j++){
                    System.out.print(" ");
                }
                for (int j = 0;j < height - temp*2; j++){
                    System.out.print("8");
                }
                for(int j = 0; j<temp;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
