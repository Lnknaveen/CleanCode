package principles.easyremove;

public class DifficultToRemove {

    public int findResult(int i, int j) {
        int result = 0;

        if (i < 10) {
            if (j > 10) {
                result = 1;
            }
        } else {

            if (i > 20) {
                if (j < 10) {
                    result = 2;
                }
                {
                    result--;
                }
            } else if (j > 10) {
                result = 3;
                result++;
            }
        }

        return result;
    }

}
