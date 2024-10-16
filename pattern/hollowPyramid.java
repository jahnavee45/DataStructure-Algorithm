
public class hollowPyramid {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5-i-1; j++){
                System.out.print(" ");
            }
            if(i != 5-1){
                for(int k = 0; k <= i; k++){
                    if(k == 0 || k == i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
                else{
                    for(int k = 0; k <= i; k++){
                        System.out.print("* ");
                    }
                }
            
            System.out.println();
        }
    }
}
