public class Main {
    public static void main(String[] args) {

        System.out.println((binarytoDecimalConverter("1010")));
        System.out.println(decimaltoBinaryConverter(10));
        System.out.println(revertSentence("My Name is Shady Ahmed"));
        System.out.println(calculateLeterDistance("adddbda"));
    }

    private static boolean calculateLeterDistance(String s) {
        int state=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='a' ||s.charAt(i)=='b') {
               if (i == 0)
                   state = i;
               else {
                   if (state==4)
                       continue;
                   else
                       state = i - state;
               }
           }
           }
        if (state==4)
                return true;
        else
            return false;
    }

    private static String revertSentence(String s) {
        char temp []=new char[s.length()];
        for(int i=s.length()-1;i>=0;i--)
        {
            temp[s.length()-1-i]=s.charAt(i);
        }
        return String.valueOf(temp);
    }

    private static String decimaltoBinaryConverter(int s) {
        return Integer.toBinaryString(s);
    }

    private static int binarytoDecimalConverter(String s) {
        return Integer.parseInt(s,2);
    }
}