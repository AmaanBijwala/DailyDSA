package BasicMath;
/*
* You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
* */
public class ChampagneTower {

        public double champagneTower(int poured, int query_row, int query_glass) {
            double[][] glasses = new double[query_row + 1][query_row + 1];
            glasses[0][0] = (double) poured; // Initialize the top glass

            // Simulate the flow of champagne
            for (int i = 0; i < query_row; i++) {
                for (int j = 0; j <= i; j++) {
                    double overflow = (glasses[i][j] - 1.0) / 2.0;
                    if (overflow > 0) {
                        glasses[i + 1][j] += overflow;
                        glasses[i + 1][j + 1] += overflow;
                    }
                }
            }

            // Ensure the champagne doesn't exceed 1 cup in the target glass
            return Math.min(1.0, glasses[query_row][query_glass]);
        }
    }