public class ArrayOps {
    public static void main(String[] args) {

        int[] array1 = { 1,2 };
        int[] array2 = {1, -1, 500, 76, 500, 1, 6};
       
       System.out.println(isSorted(array1));
    }
    
    public static int findMissingInt (int [] array) {
         
        int sum_general = 0;
        int sum = 0;
        for(int j = 0; j<array.length; j++){
        sum_general+= j + 1;
        }
        
        for(int i = 0; i < array.length; i++){
            sum+= array[i];
        }

        return(sum_general - sum);
    }


    public static int secondMaxValue(int [] array) {
        
        int max = MaxValue(array);
        int new_array [] = new int [array.length];
        for(int i=0;i<array.length;i++){
            if(array[i] != max){
                new_array[i] = array[i];
            }
        }
        return MaxValue(new_array);
    }

    public static int MaxValue(int [] array) {
        
        int max = array[0];
        for(int i = 1; i<array.length;i++){
            
            if(max < array[i]){
                max = array[i];            
            }
        }    
        return max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2)
     {
        
        int counter = 0;
        for(int i=0; i<array1.length;i++)
        {
            boolean contained = false;    
            for(int j=0;j<array2.length;j++)
            {
                  if(array1[i] == array2[j])
                  {
                    contained = true;
                  }  
                  
            }
            if(contained == true)
            {
                counter++;
            }
            
        }
        if(counter == Math.min(array1.length, array2.length))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

    public static boolean isSorted(int [] array) {
        boolean sort = true;
        if(array.length <4)
        {
             if(  (array[0]<array[1] && array[1]>array[2])  || array[0]>array[1] && array[1]< array[2] )
                {
                    sort =false;
                }
        }
        else
        {
            for(int i =0; i< array.length-2; i++)
            {
                if(  (array[i]<array[i+1] && array[i+1]>array[i+2])  || array[i]>array[i+1] && array[i+1]< array[i+2] )
                {
                    sort =false;
                }
            }
        }
        return sort;
    }

}
