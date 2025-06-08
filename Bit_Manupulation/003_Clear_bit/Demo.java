public class Demo {

    public static void main(String[] args) {
        int num=5;
        int pos=2;

        int mask=1<<(pos-1);

        int ans=num&(~mask);
        System.out.println("Answer in decimal :"+ans);
        System.out.println("Answer is Binary :"+Integer.toBinaryString(ans));
    }
}