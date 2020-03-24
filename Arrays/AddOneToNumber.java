/*
Arrays: AddOneToNumber
----------------------
Given a non-negative number represented as an array of digits,
add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.

Example:
If the vector has [1, 2, 3]
the returned vector should be [1, 2, 4]
as 123 + 1 = 124.
    
NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
*/

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
