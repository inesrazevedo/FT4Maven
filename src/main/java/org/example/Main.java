package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

    double[] values = new double[] {65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32};
    DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
    for (double v : values) {
        descriptiveStatistics.addValue(v);
    }
    double mean = descriptiveStatistics.getMean();
    double median = descriptiveStatistics.getPercentile(50);
    double standardDeviation = descriptiveStatistics.getStandardDeviation();
    }
}
