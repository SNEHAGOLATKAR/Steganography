import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MessageDisplay extends JFrame
{
  public MessageDisplay(String paramString1, String paramString2)
  {
    super("Retrieved message from file '" + paramString2 + "' - Steganograph " + "2.0.0" + "    -- By: Sneha");
    setDefaultCloseOperation(2);

    getContentPane().add(new JScrollPane(new JTextArea(paramString1, 14, 50)));

    Dimension localDimension = Toolkit.getDefaultToolkit().getScreenSize();
    int i = (int)(0.75D * localDimension.width);
    int j = (int)(0.75D * localDimension.height);
    setSize(i, j);
    setLocation((localDimension.width - i) / 2, (localDimension.height - j) / 2);
    setVisible(true);
  }
}