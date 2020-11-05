package midterm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtilities;

import java.io.File;
import java.io.IOException;

public class BarChartMonitor {

    private BarChartMonitor() {
        throw new IllegalStateException("Utility class");
    }

    public static void generateBarChart(float valueA, float valueB, float valueC, float valueD) throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String category = "Variables";
        dataset.addValue(valueA, "A", category);
        dataset.addValue(valueB, "B", category);
        dataset.addValue(valueC, "C", category);
        dataset.addValue(valueD, "D", category);

        JFreeChart barChart = ChartFactory.createBarChart3D("Bar Chart", "", "Value", dataset, PlotOrientation.VERTICAL, true, true, false);

        File barChart3D = new File("BarChart.jpeg");
        ChartUtilities.saveChartAsJPEG(barChart3D, barChart, 640, 480);
    }
}
