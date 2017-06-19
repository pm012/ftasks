package lesson11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class NoteBook extends JFrame {
	// TreeSet<Person> ts = new TreeSet<Person>();
	TreeMap<String, Person> tm = new TreeMap<String, Person>();

	public NoteBook() {
		super("Note Book");
		MaskFormatter mask = null;
		// Mask

		try {
			mask = new MaskFormatter("+##(###)##-##-###");
			mask.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();

		}

		setSize(400, 200);
		// Information panel content
		JPanel pnlInfo = new JPanel(new GridLayout(3, 1, 3, 3));
		pnlInfo.setBorder(BorderFactory.createEtchedBorder());
		Container c = getContentPane();
		JPanel namePanel = new JPanel();
		JLabel nameLbl = new JLabel("Name ");
		JTextField nameFld = new JTextField(12);
		namePanel.add(nameLbl, BorderLayout.WEST);
		namePanel.add(nameFld, BorderLayout.CENTER);

		JPanel phonePanel = new JPanel();
		JLabel phoneLbl = new JLabel("Phone");
		JFormattedTextField phoneFld = new JFormattedTextField(mask);
		phoneFld.setPreferredSize(new Dimension(140, 20));
		// JTextField phoneFld = new JTextField(20);
		phonePanel.add(phoneLbl, BorderLayout.WEST);
		phonePanel.add(phoneFld, BorderLayout.CENTER);

		JPanel btnPanel = new JPanel();
		JButton addBtn = new JButton("Add");
		JButton printBtn = new JButton("Print");
		JButton exitBtn = new JButton("Exit");
		btnPanel.add(addBtn, BorderLayout.WEST);
		btnPanel.add(printBtn, BorderLayout.CENTER);
		btnPanel.add(exitBtn, BorderLayout.EAST);

		pnlInfo.add(namePanel, BorderLayout.NORTH);
		pnlInfo.add(phonePanel, BorderLayout.CENTER);
		pnlInfo.add(btnPanel, BorderLayout.SOUTH);

		// Count panel
		JPanel cntPanel = new JPanel();
		cntPanel.setBorder(BorderFactory.createEtchedBorder());
		JTextField cntFld = new JTextField(7);
		cntFld.setEnabled(false);
		JLabel cntLbl = new JLabel("Number of Records");
		cntPanel.add(cntLbl, BorderLayout.WEST);
		cntPanel.add(cntFld, BorderLayout.CENTER);

		c.add(pnlInfo, BorderLayout.NORTH);
		c.add(cntPanel, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);

		// Listeners
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pattern pattern = Pattern.compile("\\+\\d{2}\\(\\d{3}\\)\\d{2}-\\d{2}-\\d{3}");
				Matcher matcher = pattern.matcher(phoneFld.getText());
				if (matcher.matches()) {
					// ts.add(new Person(nameFld.getText(),
					// phoneFld.getText()));
					// cntFld.setText(Integer.toString(ts.size()));
					tm.put(nameFld.getText(), new Person(nameFld.getText(), phoneFld.getText()));
					cntFld.setText(Integer.toString(tm.size()));
					nameFld.setText("");
					phoneFld.setValue(null);
					nameFld.requestFocusInWindow();
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect phone number entered", "Incorrect Data",
							JOptionPane.ERROR_MESSAGE);
					System.out.println(phoneFld.getText());

				}

			}
		});

		printBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * for (Person p : ts) { System.out.println(p.toString()); }
				 */
				for (Map.Entry<String, Person> m : tm.entrySet()) {
					System.out.println(m.getValue().toString());

				}
			}
		});

		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		nameFld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phoneFld.requestFocusInWindow();
			}

		});

		phoneFld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBtn.doClick();
			}
		});

	}

	public static void main(String[] args) {
		new NoteBook();

	}

}
