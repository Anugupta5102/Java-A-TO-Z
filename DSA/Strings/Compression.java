package DSA.Strings;

public class Compression {
/*Given str array, compress it
Change in input str only and return length
eg--> aaabb,  a3b2 , o/p=4 
eg---> a...10bbb, a10b3, o/p= 5 length*/  
public static void main(String[] args) {
    //char arr[]={'a','a','a','b','b'}; //a3b2--> 4 length
    char arr[]={'a','a','a','a','a','a','a','a','a','a','a','b','b','b'}; // a11b3-->5
    int n=arr.length;

    int index=0;
    int i=0;

    while(i<n){
        char curr=arr[i];
        int c=0;

        while(i<n && arr[i] == curr){
            c++;
            i++;
        }
        arr[index]=curr;
        index++;

        if(c > 1){
            String cnt=String.valueOf(c);
            for(char ch=0;ch<cnt.length();ch++){
                arr[index]=ch;
                index++;
            }   
        }
    }
    System.out.println("Length of compressed string: "+index);
}  
}
