package workbook.one;

/**
 *
 * Created by zhumingfang on 2018/1/23.
 */
public class Test1 {
    /** 水仙花数*/
    public void shuiXianHuaShu(){
        int a = 0;//个位
        int b = 0;//十位
        int c = 0;//百位
        int d = 0;//千位
        for (int i=1;i<=10000;i++){
            if (i<10){
                if (i==i*i*i){
                    System.out.println(i);
                }
            }else if(10<=i && i<100){
                a = i%10;
                b = (i%100-a)/10;
                if (i==a*a*a+b*b*b){
                    System.out.println(i);
                }
            }else if (100<=i && i<1000){
                a = i%10;
                b = (i%100-a)/10;
                c = (i%1000-b*10-a)/100;
                if (i==a*a*a+b*b*b+c*c*c){
                    System.out.println(i);
                }
            }else if (1000<=i && i<10000){
                a = i%10;
                b = (i%100-a)/10;
                c = (i%1000-b*10-a)/100;
                d = (i%10000-c*100-b*10-a)/1000;
                if (i==a*a*a+b*b*b+c*c*c+d*d*d){
                    System.out.println(i);
                }
            }else {
                System.out.println(10000);
            }

        }
    }
    /** 2个整数交换 */
    public void exchange(){
        int a = 65;
        int b = 11;
        int c = 0;
        System.out.println("a="+a+"b="+b);
        c = a;
        a = b;
        b = c;
        System.out.println("a="+a+"b="+b);
    }

    /** 判断是否被3/5/7整除 */
    public void exactivision(int i) {
        if (i%3 ==0 && i%5==0 && i%7==0 ){
            System.out.println("此数能被3/5/7整除");
        }else {
            System.out.println("此数不能被3/5/7整除");
        }
    }

    /** 取三个数的最大值*/
    public void maxNumber(int a,int b,int c){
        int max = 0;
        max = a>b?a:b;
        max = c>max?c:max;
        System.out.println(max);
    }

    /** do...while和for求100~200累加和 */
    public void sum(){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 100;i<200;i++){
            sum1 += i;
        }

        int a = 100;
        do {
            sum2 += a;
            a++;
        }while (a<200);
        System.out.println("sum1="+sum1+"sum2="+sum2);
    }
}
