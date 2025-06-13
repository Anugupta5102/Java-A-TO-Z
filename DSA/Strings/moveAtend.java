package DSA.Strings;

public class moveAtend {
    public static void moveAll(String str,int i,int c, String newString){
        if(i==str.length()){
            for(int j=0;j<c;j++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(i);
        if(curr=='x'){
            c++;
            moveAll(str, i+1, c, newString);
        }
        else{
            newString += curr;
            moveAll(str, i+1, c, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAll(str, 0, 0, " ");

        
    }
}
