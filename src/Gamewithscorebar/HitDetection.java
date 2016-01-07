package Gamewithscorebar;


public class HitDetection {

    public static boolean HitDetection(int nX, int nY, int nX1, int nY1, int nLength, int nHeight, int nWidth) {
        if ((((nX <= nX1) && (nX + nLength >= nX1))
                || ((nX >= nX1) && (nX <= nX1 + nWidth)))
                && (((nY <= nY1) && (nY + nLength >= nY1))
                || ((nY >= nY1) && (nY <= nY1 + nHeight)))) {
            return true;
        } else {
            return false;
        }
    }
}
