package ArrayProblems;

public class AdditionOfArray {
    public static void main(String[] args) {
        int first[] = {1,2,3,4};
        int second[] = {5,2,4,3};
        int third[] = new int[first.length > second.length ? first.length : second.length];
        int sum = 0;
        int carry = 0;
        int i = first.length - 1;
        int j = second.length - 1;
        int k = third.length - 1;
        while(k >= 0) {
            if(i >= 0 && j >=0) {
                sum = first[i] + second[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sum = first[i] + carry;
            }
            else if(j >= 0 && i < 0) {
                sum = second[j] + carry;
            }
            carry = sum / 10;
            sum = sum % 10;
            third[k] = sum;
            i--;
            j--;
            k--;
        }
        if(carry != 0) {
            System.out.println(carry);
        }
        for(int element : third) {
            System.out.print(element);
        }
        System.out.println();
    }
}