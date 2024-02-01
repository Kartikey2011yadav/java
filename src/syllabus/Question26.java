package syllabus;

public class Question26 {
    public static void main(String[] args) {
        int[][][] array = new int[3][4][6];
        int min =0,max =0,sum =0;
        for(int i = 0;i< 3 ;i++){
            for(int j = 0;j< 4 ;j++){
                for(int k = 0;k< 6 ;k++){
                    array[i][j][k] = (int)(Math.random() *100);
                }
            }
        }
        for(int i = 0;i< 3 ;i++){
            for(int j = 0;j< 4 ;j++){
                for(int k = 0;k< 6 ;k++){
                    if (min > array[i][j][k]) min = array[i][j][k];
                    if (max < array[i][j][k]) max = array[i][j][k];
                    sum += array[i][j][k];
                }
            }
        }
        System.out.println("Biggest Number in array: "+max);
        System.out.println("Smallest Number in array: "+min);
        System.out.println("Average of all Numbers in array: "+(sum/(3*4*6)));
    }

}
