class Main
{
    //wave print of array
    public static void main(String[] args)
    {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9},{1,2,3}};

        for(int col = 0;col < arr[0].length;col++)
        {
            if(col % 2 == 0)
            {
                //top down

                for(int row = 0; row < arr.length ;row ++)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
            else
            {
                //bootom up

                for(int row = arr.length-1 ; row >= 0  ; row --)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }

    }
}