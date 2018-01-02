package lesson16;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

public class SFileChooser extends JFrame {
	JTextArea txt;

	SFileChooser() {
		super("Open and Save file");
		setSize(200, 300);
		Container c = getContentPane();

		JPanel pn = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 5));
		JButton openBtn = new JButton("Open");
		JButton saveBtn = new JButton("Save");
		pn.add(openBtn);
		pn.add(saveBtn);
		c.add(pn, BorderLayout.NORTH);

		txt = new JTextArea();
		JScrollPane sp = new JScrollPane(txt);
		c.add(sp, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SFileChooser();

	}

	class ExtFileChooser extends FileFilter {
		String ext;
		String desc;

		ExtFileChooser(String ext, String desc) {
			this.ext = ext;
			this.desc = desc;
		}

		public boolean accept(File file) {
			return true;
		}

		public String getDescription() {
			return this.desc;

		}

	}

}
