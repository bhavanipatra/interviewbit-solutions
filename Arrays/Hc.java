public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        String str1 = new String();
        Boolean flag = false;
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        if(A.size() == 1 && A.get(0) == 0){
            array1.add(1);
            return array1;
        }
        for(int i=0; i<A.size(); i++){
            if(A.get(i)!=0 && flag==false)flag=true;
            if(flag == true)array1.add(A.get(i));
        }
        
        Integer lastIndex = array1.size()-1;
        Integer lastElement = array1.get(lastIndex);
        if(lastElement>=0 && lastElement<=8){
            array1.set(lastIndex, lastElement+1);
        }
        else{
            for(int i=lastIndex; i>=0; i--){
                if(array1.get(i) == 9){
                    array1.set(i, 0);
                    if(i==0){
                        array1.set(0, 1);
                        array1.add(0);
                    }
                }
                else{
                    array1.set(i, array1.get(i)+1);
                    break;
                }
            }
        }
        return array1;
    }
}
