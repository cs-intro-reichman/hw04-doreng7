public class ArrayOps {
    public static void main(String[] args) {
int[] array1 = {2,2,3,7,8,3,2};
int[] array2 = {2,7,7,3,  8};
    System.out.println(containsTheSameElements(array1, array2));
       
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
        
        int max =Math.max(array[0],array[1]);
        int second_max = Math.max(array[0],array[1]);
        for(int i=-0;i<array.length;i++){
            if(array[i]> max){
                second_max =max;
                max=array[i];
            }
        }
        return second_max;
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
        
         boolean contained = false; 
        for(int i=0; i<array1.length;i++)
        {    
            for(int j=0;j<array2.length;j++)
            {
                  if(array1[i] == array2[j])
                  {
                    contained = true;
                  }  
                  
            }
            if(contained == false)
            {
                return false;
            }
            contained =false;
        }

         for(int i=0; i<array2.length;i++)
        {    
            for(int j=0;j<array1.length;j++)
            {
                  if(array1[j] == array2[i])
                  {
                    contained = true;
                  }  
                  
            }
            if(contained == false)
            {
                return false;
            }
            contained =false;
        }
        
        return true;
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
