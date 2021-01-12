package Easy;

public class No28_Implement_strStr {
    public int strStr1(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle))
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String evalString = haystack.substring(i, i + needle.length());
            if (evalString.equals(needle))
                return i;
        }

        return -1;
    }

    // Silly Solution
    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // Using KMP Algorithm
    public int strStr3(String haystack, String needle) {
        if(needle.length()==0)
            return 0;

        int patternLen = needle.length();
        int[] lps = new int[patternLen+1];
        int j=0;

        for(int i=1; i<patternLen; i++) {
            while(j>0 && needle.charAt(i)!=needle.charAt(j))
                j=lps[j-1];
            if(needle.charAt(i)==needle.charAt(j))
                j++;
            lps[i]=j;
        }

        int i=0; j=0;
        while(i<haystack.length()) {
            if(haystack.charAt(i)==needle.charAt(j))
                i++; j++;
            if(j==patternLen)
                return (i-j);
            else if(i<haystack.length() && haystack.charAt(i)!=needle.charAt(j))
                if(j!=0)
                    j=lps[j-1];
                else
                    i++;
        }
        return -1;
    }

}
