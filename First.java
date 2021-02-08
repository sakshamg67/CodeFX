package minor_project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.io.*;
/*
 @author saksham
 */
import static java.lang.Thread.sleep;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.tools.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class First extends javax.swing.JFrame {

    public First() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        out_time = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Save the code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("compile ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("run the class");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jt1.setColumns(20);
        jt1.setRows(5);
        jt1.setText("PUT YOUR CODE HERE");
        jScrollPane1.setViewportView(jt1);

        out_time.setColumns(20);
        out_time.setRows(5);
        out_time.setText("OUTPUT TIME");
        jScrollPane3.setViewportView(out_time);

        jButton5.setText("GRAPH IT!");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String filetocompile = "C:\\Users\\saksham\\desktop\\prog1.java";
        JavaCompiler jj = ToolProvider.getSystemJavaCompiler();
        int compile = jj.run(null, null, null, filetocompile);
        if (compile == 0) {
            System.out.println("comilation successfull");
        } else {
            System.out.println("compilation failed bro");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            File f = new File("C:\\Users\\saksham\\desktop\\prog1.java");
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            String s;
            s = jt1.getText();
            System.out.println("String is: " + s);
            pw.print(s);
            fw.flush();

            fw.close();
        } catch (Exception e) {
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Random rand = new Random();
        URL url;
        try {
            int tt = 0;
            url = new URL("file:///C:\\Users\\saksham\\Desktop\\");
            URLClassLoader ucl = new URLClassLoader(new URL[]{url});
            Class clazz = ucl.loadClass("prog1");
            Object o = clazz.newInstance();
            Method method = clazz.getMethod("hello", int.class);
          //  int m = 1,n=1;
            int j = 0;
            int time[] = new int[1000], size[] = new int[1000];
            for (int i = 100; i <= 100000; i += 500) {
                tt = 0;
                int k = 10;
            //    m = 0;
              //  n=0;
                while (k > 0) {
                    Scanner sc = new Scanner(new FileInputStream("C:\\Users\\saksham\\Desktop\\MINOR\\input" + m++ + ".txt"));
                    //Scanner sc = new Scanner(new FileInputStream("C:\\Users\\saksham\\Desktop\\MINOR\\input0.txt"));
                    int p = 0, ar[] = new int[i];
                    while (p < i) {
                        ar[p] = sc.nextInt();
                        p++;
                    }
                    int temp1=ar[rand.nextInt(p)];
                    System.setIn(new FileInputStream("C:\\Users\\saksham\\Desktop\\MINOR\\input" + n++ + ".txt"));
                    System.setIn(new FileInputStream("C:\\Users\\saksham\\Desktop\\MINOR\\input0.txt"));
                    long start_time = System.nanoTime();
                    method.invoke(o, i);
                    long end_time = System.nanoTime();
                    long time_elapsed = end_time - start_time;
                   // time_elapsed /= 1000;
                    tt += time_elapsed;
                    k--;
                }
                tt /= 10;
                System.out.println("TIme Elapsed for size: " + i + " " + tt);
                time[j] = tt;
                size[j] = i;
                j++;
                //out_time.setText("TIME ELAPSED: \n"+time_elapsed/1000+"ms");
            }
            //Minor_Project.data(time,size,j);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        File file = new File("C:\\Users\\saksham\\Documents\\NetBeansProjects\\Minor_Project\\src\\minor_project\\prog1.class");
        file.delete();
        File file1 = new File("C:\\Users\\saksham\\Documents\\NetBeansProjects\\Minor_Project\\src\\minor_project\\prog1.java");
        file1.delete();
        File file2 = new File("C:\\Users\\saksham\\Documents\\NetBeansProjects\\Minor_Project\\prog1.java");
        file2.delete();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String query = "select * from logn", query2 = "select * from n ";
            Connection mycon = JDBC_connect.connect_it();
            Statement st = mycon.createStatement();
            XYSeriesCollection xysr = new XYSeriesCollection();
            XYSeries n = new XYSeries("n");
            ResultSet rs = st.executeQuery(query2);
            while (rs.next()) {
                n.add(rs.getInt("size"), rs.getInt("time"));
            }
            rs.close();
            XYSeries logn = new XYSeries("logn");
            ResultSet rs1 = st.executeQuery(query);
            while (rs1.next()) {
                logn.add(rs1.getInt("size"), rs1.getInt("time"));
            }
            xysr.addSeries(logn);
            xysr.addSeries(n);
            JFreeChart xychart = ChartFactory.createXYLineChart("SIZE-TIME CURVE", "INPUT SIZE", "TIME\nIN MICROSECONDS", xysr, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel panel = new ChartPanel(xychart);
            JFrame frame = new JFrame("GRAPH");
            frame.add(panel);
            frame.setSize(500, 500);
            frame.setVisible(true);
            //panel.setPreferredSize(new java.awt.Dimension(560,367));
            //XYPlot plot = xychart.getXYPlot();
            panel.setVisible(true);
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            System.out.println("aapse na ho paega");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jt1;
    private javax.swing.JTextArea out_time;
    // End of variables declaration//GEN-END:variables
}
