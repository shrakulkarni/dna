package dna;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class AboutWindow extends JFrame {
    
    /**
	 * This class shows an about window with instructions.
	 * 
	 * @author Philip Leifeld
	 */
	JPanel aboutInhalt;
    JEditorPane aboutText;
    JScrollPane aboutScrollLeiste;
    
    public AboutWindow(String version, String date) {
        this.setTitle("About DNA");
        ImageIcon dna32Icon = new ImageIcon(getClass().getResource(
            "/icons/dna32.png"));
        this.setIconImage(dna32Icon.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setPreferredSize(new Dimension(400, 300));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        Icon dnaTextIcon = new ImageIcon(getClass().getResource("/icons/dna32text.png"));
        JLabel dnaIcon = new JLabel(dnaTextIcon);
        JPanel dnaIconPanel = new JPanel( new FlowLayout() );
        dnaIconPanel.add(dnaIcon);
        
        aboutInhalt = new JPanel( new BorderLayout() );
        aboutText = new JEditorPane();
        aboutText.setContentType("text/html");
        aboutText.setText("<p><b>Current version</b><br>" + version + " (" + date + ")</p>"
            + "<p><b>DNA project homepage</b><br> <a href=\"http://github.com/leifeld/dna/\">"
            + "http://github.com/leifeld/dna/</a><br/>Documentation, publications "
            + "a forum, and a bug tracker can be found on this website.</p>"
            + "<p><b>Icons</b><br> taken from <a href=\"http://www.famfamfam.com/lab/icons/silk/\">"
            + "http://www.famfamfam.com/lab/icons/silk/</a>.</p>"
            );
        aboutText.setEditable(false);
        aboutScrollLeiste = new JScrollPane(aboutText);
        aboutScrollLeiste.setPreferredSize(new Dimension(580, 340));
        aboutInhalt.add(dnaIconPanel, BorderLayout.NORTH);
        aboutInhalt.add(aboutScrollLeiste, BorderLayout.CENTER);
        this.add(aboutInhalt);
    }
    
}