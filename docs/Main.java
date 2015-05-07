import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Main
{
    public static void main(String arg[])
    {
        BigInteger n;
        Scanner cin=new Scanner(System.in);
        PrintStream out=new PrintStream(System.out);
        while(cin.hasNext())
        {
            n=cin.nextBigInteger();
            BigInteger l=BigInteger.ONE;
            BigInteger r=n;
            BigInteger mid;
            BigInteger midd;
            while(l.compareTo(r)<0)
            {
                mid=l.add(r).shiftRight(1);
                midd=mid.multiply(mid).add(mid).add(mid);
                if(midd.compareTo(n)<0)
                    l=mid.add(BigInteger.ONE);
                else r=mid;
            }
            out.println(l.remainder(BigInteger.valueOf(2)));
        }
    }
}

//分析：自己手算一下~前10项或者20项，马上找到规律，就是根号n的整数部分模2.

/**
 *想证明其实也不难，首先这个式子可以看成与y轴与x轴夹着的部分的整点数，
 *然后呢，这这些点显然是关于y=x对称的，所以除了y=x上的点意外，
 *肯定是偶数个点，因此只要考虑y=x上的整点，
 *就是根号n的整数部分了~
 *可惜Java的大数类库是没有包括开根号的运算~因此可以自己手写根号，也可以用二分
 *标程就是用二分的，貌似牛顿切线会更快
 **/

比如：二分法近似求根2的值

1^2=1<2
2^2=4>2
((2+1)/2)^2=1.5^2=2.25>2
((1+1.5)/2)^2=1.25^2=1.5625<2
((1.25+1.5)/2)^2=1.375^2=1.89<2
((1.375+1.5)/2)^2=1.44^2=2.07>2
((1.375+1.44)/2)^2=1.41^2=1.988  （约为2）
根号2近似值为1.41

