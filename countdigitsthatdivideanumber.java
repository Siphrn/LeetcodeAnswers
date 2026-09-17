import java.util.ArrayList;
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;
        ArrayList<Integer> digits = new ArrayList<>();
        while(temp > 0){
            digits.add(temp % 10);
            temp /= 10;
        }
        for(int i = 0; i < digits.size(); i++){
            if(num % digits.get(i) == 0){
                count++;
            }
        }
        return count;
    }
}
