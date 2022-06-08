class Solution{
    String removeSpecialCharacter(String s) {
        // code here
StringBuilder str=new StringBuilder();
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
               str.append(s.charAt(i));
           }
       }
           if(str.length()==0){
               str.append("-1");
           }
           return str.toString();
   }
}