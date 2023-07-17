import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if(args.length > 0){
            String bef = args[0];
            String[] aft = bef.split(","); // カンマで分ける
            //System.out.println(bef);
            int[] temp = Sort.sortI(aft);
            System.out.println(Arrays.toString(temp));
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < temp.length; i++){
                sb.append(temp[i]);
            }
            System.out.println(sb.toString());
        }
        else{
            System.out.println("use number");
            return ;
        }
        
        
    }

    
}

class Sort{
    public static int[] sortI(String[] numbers){
        int[] numbersSort = new int[numbers.length];
        try{
            for(int i = 0; i < numbers.length; i++){
                numbersSort[i] = Integer.parseInt(numbers[i]); // 文字の数字をint型に変換
                //System.out.println(numbersSort[i]);
            }
        }
        catch(NumberFormatException e){
            System.out.println(e); // error
            int[] tmp = {0};
            return tmp;
        }

        Arrays.sort(numbersSort);
        System.out.println(Arrays.toString(numbersSort));

        for(int i = 0, j = numbersSort.length - 1; i < j; i++, j--){
            int temp = numbersSort[i];
            numbersSort[i] = numbersSort[j];
            numbersSort[j] = temp;
        }

        return numbersSort;
    }
}
