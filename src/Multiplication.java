/**
 * 乘法表
 * Created by zhumingfang on 2018/1/23.
 */
public class Multiplication {

    public void writerMultiplication(){
        for (int i = 1;i<=9;i++){
            for (int j=1;j<=i;j++){
                if (j==5){
                    continue;
                }
                System.out.print(j+"x"+i+"="+(i*j)+"\t");
            }
            System.out.print("\n");
        }
    }
}
