package principles.easyremove;

public class EasyToRemove {

    public int findResult(int i, int j) {
        int result = 0;

        if (i < 10 && j > 10) {
            result = 1;
        } else if (i > 20 && j < 10) {
            result = 1;
        } else if (j > 10) {
            result = 4;
        }

        return result;
    }


}
