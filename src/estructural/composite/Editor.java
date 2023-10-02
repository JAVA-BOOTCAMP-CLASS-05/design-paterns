package estructural.composite;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serial;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Editor {

    private final EditorCanvas canvas;
    private final FiguraCompuesta figCompuesta = new FiguraCompuesta();

    public Editor() {
        canvas = new EditorCanvas();
    }

    public void cargarFiguras(Figura... figuras) {
        figCompuesta.clear();
        figCompuesta.add(figuras);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
 
    	@Serial
        private static final long serialVersionUID = -6364855872813025055L;

		private JFrame frame;

        private static final int PADDING = 10;

        EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    figCompuesta.unSelect();
                    figCompuesta.selectChildAt(e.getX(), e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        private void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        public int getWidth() {
            return figCompuesta.getX() + figCompuesta.getWidth() + PADDING;
        }

        public int getHeight() {
            return figCompuesta.getY() + figCompuesta.getHeight() + PADDING;
        }

        void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        public void paint(Graphics graphics) {
            figCompuesta.paint(graphics);
        }
    }	
}
