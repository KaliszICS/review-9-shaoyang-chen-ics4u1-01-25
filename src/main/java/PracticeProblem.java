public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int lettersToFive(String s,char ch){
        int count = 0;
        int index = 0;
        int length = s.length();
        while (index < length){
            if (s.charAt(index) == ch){
                count++;
                if (count == 5){
                    return index+1;
                }
            }
			index++;
        }
        return -1;
    }
    public static int countLetter(String str,char ch){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static int oddSum(int a,int b){
        int sum = 0;
        int temp = b;
        if (a > b){
            b = a;
            a = temp;
        }
        if (a % 2 == 0){
            a++;
        }
        while (a <= b){
            sum += a;
            a += 2;
        }
        return sum;
    }
}
