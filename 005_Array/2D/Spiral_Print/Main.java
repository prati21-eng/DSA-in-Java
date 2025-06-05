class Main 
{
    public static void main(String[] a)
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        int row = arr.length;
        int coloumn = arr[0].length;
        int element= row*coloumn;
        int count =0;

        int firstRow = 0;
        int firstCol = 0;
        
        int lastRow = row -1;
        int lastCol = coloumn -1;

        while (count < element) {
            
            //first row printting 
            for(int index = firstCol ;count < element && index <= lastCol;index++)
            {
                System.out.print(arr[firstRow][index]+" ");
                count++;
            }
            firstRow++;

            //last coloumn
            for(int index = firstRow ; count < element && index <= lastRow ;index++)
            {
                System.out.print(arr[index][lastCol]+" ");
                count++;
            }
            lastCol--;

            //last row
            for(int index = lastCol ;count < element && index >= firstCol ;index--)
            {
                System.out.print(arr[lastRow][index]+" ");
                count++;
            }
            lastRow--;

            //for first coloumn

            for(int index = lastRow ; count < element && index >= firstRow ;index --)
            {
                System.out.print(arr[index][lastCol]+" ");
                count++;
            }
            firstCol++;
        }

    }
}
