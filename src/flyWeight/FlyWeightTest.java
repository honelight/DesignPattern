package flyWeight;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class FlyWeightTest extends JFrame{
    JButton startDrawing;
    int windowWitdth=1750;
    int windowHeight = 150;

    Color[] shapeColor={Color.orange, Color.red, Color.yellow, Color.blue, Color.pink,
                        Color.cyan, Color.magenta, Color.black};

    public static void main(String[] args){
        new FlyWeightTest();
    }

    public FlyWeightTest(){
        this.setSize(windowWitdth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FlyWeight Test");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");
        contentPanel.add(drawingPanel, BorderLayout.CENTER);
        contentPanel.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long startTime = System.currentTimeMillis();
                Graphics g = contentPanel.getGraphics();
                for(int i=0; i<100000; i++){
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
                }
                long endTime = System.currentTimeMillis();
                System.out.println("That took "+(endTime-startTime));
            }
        });

        this.add(contentPanel);
        this.setVisible(true);
    }

    private Color getRandColor(){
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(shapeColor.length);
        return shapeColor[randInt];
    }

    private int getRandX(){
        return (int)(Math.random()*windowWitdth);
    }

    private int getRandY(){
        return (int)(Math.random()*windowHeight);
    }
}
