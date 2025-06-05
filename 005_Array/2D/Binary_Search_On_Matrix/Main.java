class Mian   
{

    private static boolean binarySearch(int[][] arr,int target)
    {
        int row = arr.length;
        int coloumn = arr[0].length;

        int start =0;
        int end =(row*coloumn)-1;

        int mid = (start+end)/2;

        while (start<end) {
             int element = arr[mid/row][mid%coloumn];

             if(element==target)
             {
                return true;
             }
             else if (element < target) {
                start = mid+1;
             }
             else
             {
                end =mid-1;
             }
             mid =(start+end)/2;
        }


        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        boolean found =binarySearch(arr,8);
        System.out.println(found);
    }
}