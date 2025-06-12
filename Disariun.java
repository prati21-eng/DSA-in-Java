public class Disariun {
    public static void main(String[] args) {

        String num="175";
        Double tempnum=Double.parseDouble(num);
        Double sum=0.0;
        for(int i=0;i<num.length();i++)
        {
           Double power=0.0;
           power=Math.pow(((num.charAt(i)-'0')), i+1);
           sum+=power;
        }
        System.out.println(sum);
        System.out.println(tempnum);
        if(sum.equals(tempnum))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
