package main.impl;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Student on 7/18/2017.
 */
public class Render extends JFrame {

    private DrawingCanvas canvas;

    private double[][] pos;
    private Color[] col;
    private int count;



    public Render(double[][] pos, Color[] col)
    {
        this.pos = pos;
        this.col = col;
        canvas = new DrawingCanvas();
        canvas.setPreferredSize(new Dimension(1280, 720));
        canvas.setBackground(Color.BLACK);
        setContentPane(canvas);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setTitle("Render");
    }


    class DrawingCanvas extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);


            for(int i = 0; i < count; i++)
            {
                g.setColor(col[i]);
                //g.drawLine((int)pos[i][0], (int)pos[i][1],(int)pos[i][0], (int)pos[i][1]);
                g.fillOval((int)pos[i][0], (int)pos[i][1],13, 13);

            }

           System.gc();
        }
    }


    public void update(int maxcount)
    {
        count = maxcount;
        repaint();
    }





}
