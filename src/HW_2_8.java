public class HW_2_8 {
    public static void main(String[] args) {
        for (String arg : args) {
            int matrixType;
            matrixType = Integer.parseInt(arg);
            String str;
            for (int i = 1; i <= 4; i++) {
                str = "";
                for (int j = 1; j <= 4; j++) {
                    if (matrixType == 1) {
                        if (i + j >= 5) {
                            str += "*";
                        } else {
                            str += " ";
                        }
                    } else {
                        if (i <= j) {
                            str += "*";
                        } else {
                            str += " ";
                        }
                    }

                }
                System.out.println(str);
            }
        }
    }
}