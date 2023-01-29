import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        // your code goes here
        int testLength = test.length();
        int origiLength = original.length();
        boolean result = false;

        if(testLength == origiLength) {
            String[] arrTest = new String[testLength];
            String[] arrOriginal = new String[origiLength];

            arrTest = test.toLowerCase().split("");
            arrOriginal = original.toLowerCase().split("");
            Arrays.sort(arrTest);
            Arrays.sort(arrOriginal);
            System.out.println("Arrays.toString(arrOriginal) = " + Arrays.toString(arrOriginal));
            System.out.println("Arrays.toString(arrTest) = " + Arrays.toString(arrTest));
            System.out.println("arrOriginal[0] = " + arrOriginal[0].getClass());

            for(int i = 0; i < arrOriginal.length; i++) {
                if(!arrOriginal[i].equals(arrTest[i])) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }


        } else {
            result = false;
        }
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        isAnagram("Buckethead", "DeathCubeK");
    }
}
