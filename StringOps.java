public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String str = "Hello World";
        String stringprint = camelCase(str);
        for(int i = 0; i<stringprint.length();i++ ){
               System.out.print(stringprint.charAt(i));     
        }
          
        
    }

    public static String capVowelsLowRest (String string) {
        
        string = LowerCase(string);
        String ans = "";
        
        for(int i =0;i< string.length();i++){
            char c = string.charAt(i);
            if( c == 'a' ||c == 'u' ||c == 'o' ||c == 'i' ||c == 'e'){
            c = (char) (c-32);
            ans+= c;
           }
           else{
            ans+=c;
           }
        }
        return ans;
    }

    public static String  LowerCase(String string){
        String ans = "";
			 for(int i = 0; i< string.length(); i++)
			 {
				
				if( ((int) string.charAt(i) >= 65) && ((int) string.charAt(i) <= 90) )
				{
					int character = ((int) string.charAt(i)) + 32;
					char current = 0;
					current += character;
					ans += current;
					current = 0;
					
				}
                 else {
				ans += string.charAt(i);
				}
			 }
				return ans;
    }

    public static String camelCase (String string) {
        
        string = Lower(string);
        string = UpperCase(string);
        string = Spaces(string);
        return string;
        }

        public static String Lower(String string) {
            String str = ""; 
            int start = 0;
            int i = 0;
            while (string.charAt(i) == 32) {
                start++;
                i++;
            }
            for (int j = start; j < string.length(); j++) {
                if (string.charAt(j) >= 'A' && string.charAt(j) <= 'Z')
                    str += (char) (string.charAt(j) + 32);
                else
                    str += string.charAt(j);
            }
            return str;
        }
    
        public static String UpperCase(String string) {
            String str = "";
            str += string.charAt(0);
            for (int i = 1; i < string.length(); i++) {
                if (string.charAt(i - 1) == ' ') {
                    if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
                        str += (char) (string.charAt(i) - 32);
                    else
                        str += string.charAt(i);
                } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
                    str += (char) (string.charAt(i) + 32);
                else
                    str += string.charAt(i);
            }
            return str;
        }
    
        public static String Spaces(String string) {
            String str = "";
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != 32)
                    str += string.charAt(i);
            }
            return str;
        }
    
    
    public static int[] allIndexOf (String string, char chr) {
        int counter =0;
        for(int i=0; i<string.length();i++){
            if(string.charAt(i)==chr){
                   counter++;
            }
        }
        int new_array [] = new int [counter];
        int position=0;
         for(int j=0; j<string.length();j++){
            
            if(string.charAt(j)==chr){
                new_array[position]=j;
                position++;
            }
         }
        return new_array;
    }
}
