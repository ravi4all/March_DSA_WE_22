package ArrayProblems;

public class SubtractionOfArray {
    public static void main(String[] args) {
        int first[] = {5,1,2,4};
        int second[] = {2,4,5};
        int third[] = new int[first.length];
        int carry = 0;
        int sub = 0;
        int i = first.length - 1;
        int j = second.length - 1;
        int k = third.length - 1;
        while(k >= 0) {
            if(j >= 0) {
                if(first[i] < second[i]) {
                    sub = first[i] + 10 - second[j];
                    carry = -1;
                }
                else {
                    sub = first[i] + carry - second[j];
                    carry = 0;
                }
            }

            else {
                if(i >= 0 && carry == -1) {
                    sub = first[i] + 10 + carry;
                }
                else {
                    sub = first[i] + carry;
                }
            }

            third[k] = sub;
            k--;
            j--;
            i--;
        }
        for(int element : third) {
            System.out.println(element);
        }
    }
}
