package mustafakhan.uk.to.dsa.pradeep;
import java.util.ArrayList;
 
public class RandomArray {
    public static void main (String []args){
    int [] array = {2,20,14,13,21,20,3,7,4,6,5,1,9,10,16,18,17};
    int a=14;
    int b=9;
    int flag=0;
    ArrayList<String> elements = new ArrayList<String>();
    for(int i=0;i<array.length;i++){
        if(array[i]==a){
            flag=1;
        }
        if(flag==1){
            elements.add(String.valueOf(array[i]));
    }if(array[i]==b){
        flag=0;
    }
 
    
    }
   System.out.println(elements);
}
 
}