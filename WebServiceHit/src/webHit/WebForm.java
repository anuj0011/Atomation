package webHit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class WebForm extends Webhit {

	private JFrame frame;
	private final Action action = new SwingAction();
	Thread thread;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebForm window = new WebForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WebForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnStart = new JButton("START");
		btnStart.setBounds(39, 72, 145, 39);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				thread = new Thread(new Runnable() {

					@Override
					public void run() {
						try {
							ubuyurl();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				});
				thread.start();
			}

		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnStart);

		JButton btnStop = new JButton("STOP");
		btnStop.setAction(action);
		btnStop.setBounds(237, 72, 166, 39);
		frame.getContentPane().add(btnStop);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "STOP");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			if (thread != null) {
				thread.stop();
			}
		}
	}
}
