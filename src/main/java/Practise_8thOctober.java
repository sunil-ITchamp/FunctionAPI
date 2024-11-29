import org.apache.tomcat.util.net.jsse.JSSEUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Practise_8thOctober {

    public static void main(String[] args) {

//        System.out.println("Enter any no :");
//        //int i = new Scanner(System.in).nextInt();
//        String str = new Scanner(System.in).nextLine();
//        //String str = ""+ i;
//        int length = str.length();
//        int[] myarr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
//        System.out.println(myarr[0]);
//        int l = myarr.length;
//        System.out.println("lenth of array = " + l);
//        if (l>3){
//            System.out.println("");
//        }
//        else if
//        (l == 3){
//            int sum = myarr[0]+ myarr[1]+ myarr[2];
//            System.out.println("" + sum);
//        }
//        else if (l == 2){
//            int res = myarr[0] * myarr[1];
//            System.out.println("" + res);
//        }
//
//    }

        String str1 = "abcd";
        String str2 = "xyz";
        char[] charArray = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        StringBuffer sb = new StringBuffer();
        int length1 = charArray.length;
        int length2 = charArray2.length;

        int longIndex = (length1>length2)?length1:length2;
        int shortIndex = (length1>length2)?length2:length1;

        int i =0;
        while (i < longIndex) {
            sb.append(charArray[i]);
            if (i<shortIndex) {
                sb.append(charArray2[i]);
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}
