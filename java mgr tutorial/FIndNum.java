import java.util.Scanner;
public class FIndNum {
   static String findNum(String str){
    String str2="";
    for(char ch:str.toCharArray()){
        int c_num=(int)ch;
        if(c_num >= 48||c_num<=57 ){
            for(int i=48;i<=57;i++){
                if(c_num==i){
                    char ch_num=(char)i;
                    str2+=ch_num;
                }
            }
        }
    }
    return str2;
   } 
   public static void main(String[] args) {
    Scanner nu=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=nu.nextLine();
    System.out.println(findNum(str));
   }
}
