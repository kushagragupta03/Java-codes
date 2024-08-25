public class StringUppercase {
    public static String upperCase(String str){
        String newstr="";
        str=' '+str;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)== ' '){
                newstr+=" "+ Character.toUpperCase(str.charAt(i+1));
                i++;
            }
            else{
                newstr+= str.charAt(i);
            }
        }
        return newstr;
    }

    public static void main(String args[]){
        String str= "hi, i am kushagra";
        System.out.println(upperCase(str));

    }
    
}


