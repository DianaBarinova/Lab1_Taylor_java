package paketic;

import java.text.NumberFormat;

public class Standart {
    String counter(double x, int k) {

            if (x < 0) {
                x *= (-1);
            }
            while (x > 2 * Math.PI) {
                x -= 2 * Math.PI;
            }

        double result;
        result = (Math.sin(x)) / x;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        return formatter.format(result);
    }
}
