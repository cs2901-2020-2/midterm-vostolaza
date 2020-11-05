package midterm;
import java.io.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartUtilities;

public class PieChartMonitor {

    private PieChartMonitor(){
        throw new IllegalStateException("Utility class");
    }

    public static void generatePieChart(float valueA, float valueB, float valueC, float valueD) throws IOException {
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue( "A" , valueA );
        dataset.setValue( "B" , valueB );
        dataset.setValue( "C" , valueC );
        dataset.setValue( "D" , valueD );

        JFreeChart chart = ChartFactory.createPieChart3D(
                "Pie Chart" ,  // chart title
                dataset ,         // data
                true ,            // include legend
                true,
                false);

        final PiePlot3D plot = ( PiePlot3D ) chart.getPlot( );
        plot.setStartAngle( 270 );
        plot.setForegroundAlpha( 0.60f );
        plot.setInteriorGap( 0.02 );
        int width = 640;   /* Width of the image */
        int height = 480;  /* Height of the image */
        File pieChart3D = new File( "PieChart.jpeg" );
        ChartUtilities.saveChartAsJPEG( pieChart3D , chart , width , height );
    }

}
