package leetcode;

public class SplitaStringinBalancedStrings1221 {

    public void SplitaStringinBalancedStrings1221() {
        String s = "RLRRLLRLRL";
        int iContR = 0, iContL = 0, iContBalanced = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                iContR++;
            } else if (s.charAt(i) == 'L') {
                iContL++;
            }
            if (iContL == iContR) {
                iContBalanced++;
                iContL = iContR = 0;
            }
        }
        System.out.println(iContBalanced);
    }
}
