import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class TypeWriter implements ActionListener{
    private Timer timer;
    private int characterIndex = 0;
    private String input;
    private JTextArea textArea;

    public TypeWriter(JTextArea textArea, String input) {
        this.textArea = textArea;
        this.input = input;
        timer = new Timer(17, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (characterIndex < input.length()) {
                    textArea.append(Character.toString(input.charAt(characterIndex)));
                    characterIndex++;
                } else {
                    stop();
                }
            }
        });
    }

    public void start() {
        textArea.setText(null);
        characterIndex = 0;
        timer.start();
    }

    public void stop() {
        timer.stop();
    }
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}