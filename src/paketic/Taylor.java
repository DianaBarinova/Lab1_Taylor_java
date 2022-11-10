package paketic;

import java.text.NumberFormat;

public class Taylor {
    String counter(double x, int k){

            if (x < 0) {
                x *= (-1);
            }
            while (x > 2 * Math.PI) {
                x -= 2 * Math.PI;
            }

        double result = 1;
        double e = Math.pow(10, -k);
        int count = 0;
        double tmp = 1;
        do {
            tmp = (tmp * (-Math.pow(x, 2))) / ((2 * count + 2) * (2 * count + 3));
            result += tmp;
            count++;
        } while ((Math.abs(tmp)) > e);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        return formatter.format(result);
    }
}
