package pkgGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import pkgData.Database;
import pkgData.Take;

public class ApplFisher extends JFrame implements ActionListener {
	private static final long serialVersionUID = 0L;
	private JPanel paneMain = null;
	private JPanel paneLogin = null;
	private JLabel lblLogin = null;
	private JPasswordField txtLogin = null;
	private JButton btnLogin = null;
	private JPanel paneInformation = null;
	private JLabel lblMessage = null;
	private JPanel paneButtons = null;
	private JButton btnAdd = null;
	private JButton btnRemove = null;
	private JPanel paneInput = null;
	private JLabel lblFisher = null;
	private JLabel lblFish = null;
	private JTextField txtFisher = null;
	private JTextField txtFish = null;
	private JLabel lblWeight = null;
	private JTextField txtWeight = null;
	private JList<Take> lstAllTakes = null;
	/**
	 * other attributes
	 */
	Database db = new Database();
	private JLabel labelDate;
	private JTextField txtDate;

	/**
	 * This method initializes
	 * 
	 */
	public ApplFisher() {
		super();
		initialize();
		setVisible(true);
	}

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		this.setSize(new Dimension(701, 312));
		this.setContentPane(getPaneMain());
		this.setTitle("Fisher's Fritz");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * This method initializes paneMain
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPaneMain() {
		if (paneMain == null) {
			lblMessage = new JLabel();
			lblMessage.setBounds(new Rectangle(10, 246, 666, 25));
			lblMessage.setBackground(Color.orange);
			lblMessage.setText("...");
			lblMessage.setOpaque(true);
			paneMain = new JPanel();
			paneMain.setLayout(null);
			paneMain.add(getPaneLogin(), null);
			paneMain.add(getPaneInformation(), null);
			paneMain.add(lblMessage, null);
		}
		return paneMain;
	}

	/**
	 * This method initializes paneLogin
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPaneLogin() {
		if (paneLogin == null) {
			lblLogin = new JLabel();
			lblLogin.setBounds(new Rectangle(11, 12, 45, 30));
			lblLogin.setText("login:");
			paneLogin = new JPanel();
			paneLogin.setLayout(null);
			paneLogin.setBounds(new Rectangle(8, 6, 672, 56));
			paneLogin.setBackground(Color.green);
			paneLogin.add(lblLogin, null);
			paneLogin.add(getTxtLogin(), null);
			paneLogin.add(getBtnLogin(), null);
		}
		return paneLogin;
	}

	/**
	 * This method initializes txtLogin
	 * 
	 * @return javax.swing.JPasswordField
	 */
	private JPasswordField getTxtLogin() {
		if (txtLogin == null) {
			txtLogin = new JPasswordField();
			txtLogin.setBounds(new Rectangle(60, 8, 133, 37));
		}
		return txtLogin;
	}

	/**
	 * This method initializes btnLogin
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton();
			btnLogin.setBounds(new Rectangle(215, 6, 75, 37));
			btnLogin.setText("login");
			btnLogin.addActionListener(this);
		}
		return btnLogin;
	}

	/**
	 * This method initializes paneInformation
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPaneInformation() {
		if (paneInformation == null) {
			paneInformation = new JPanel();
			paneInformation.setLayout(null);
			paneInformation.setBounds(new Rectangle(10, 66, 666, 178));
			paneInformation.setBackground(Color.green);
			paneInformation.add(getPaneButtons(), null);
			paneInformation.add(getPaneInput(), null);
			paneInformation.add(getLstAllTakes(), null);
			paneInformation.setVisible(false);
		}
		return paneInformation;
	}

	/**
	 * This method initializes paneButtons
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPaneButtons() {
		if (paneButtons == null) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(4);
			paneButtons = new JPanel();
			paneButtons.setLayout(gridLayout);
			paneButtons.setBounds(new Rectangle(5, 6, 91, 158));
			paneButtons.add(getBtnAdd(), null);
			paneButtons.add(getBtnRemove(), null);
		}
		return paneButtons;
	}

	/**
	 * This method initializes btnAdd
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setText("add");
			btnAdd.addActionListener(this);
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnRemove
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton();
			btnRemove.setText("remove");
			btnRemove.addActionListener(this);
		}
		return btnRemove;
	}

	/**
	 * This method initializes paneInput
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPaneInput() {
		if (paneInput == null) {
			lblWeight = new JLabel();
			lblWeight.setText("Weight:");
			lblFish = new JLabel();
			lblFish.setText("Fish:");
			lblFisher = new JLabel();
			lblFisher.setText("Fisher:");
			GridLayout gridLayout1 = new GridLayout(4, 2);
			// gridLayout1.setRows(1);
			paneInput = new JPanel();
			paneInput.setLayout(gridLayout1);
			paneInput.setBounds(new Rectangle(109, 5, 195, 161));
			paneInput.add(lblFisher, null);
			paneInput.add(getTxtFisher(), null);
			paneInput.add(lblFish, null);
			paneInput.add(getTxtFish(), null);
			paneInput.add(lblWeight, null);
			paneInput.add(getTxtWeight(), null);
			paneInput.add(getLabelDate());
			paneInput.add(getTxtDate());
		}
		return paneInput;
	}

	/**
	 * This method initializes txtFisher
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtFisher() {
		if (txtFisher == null) {
			txtFisher = new JTextField();
			txtFisher.setText("Fisher's Fritz");
		}
		return txtFisher;
	}

	/**
	 * This method initializes txtFish
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtFish() {
		if (txtFish == null) {
			txtFish = new JTextField();
			txtFish.setText("frog");
		}
		return txtFish;
	}

	/**
	 * This method initializes txtWeight
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtWeight() {
		if (txtWeight == null) {
			txtWeight = new JTextField();
			txtWeight.setText("22");
			txtWeight.setHorizontalAlignment(JTextField.RIGHT);
		}
		return txtWeight;
	}

	/**
	 * This method initializes lstAllTakes
	 * 
	 * @return javax.swing.JList
	 */
	private JList<Take> getLstAllTakes() {
		if (lstAllTakes == null) {
			lstAllTakes = new JList<Take>();
			lstAllTakes.setBounds(new Rectangle(311, 6, 339, 159));
		}
		return lstAllTakes;
	}

	private JLabel getLabelDate() {
		if (labelDate == null) {
			labelDate = new JLabel("date of take:");
		}
		return labelDate;
	}

	private JTextField getTxtDate() {
		if (txtDate == null) {
			txtDate = new JTextField();

			txtDate.setText(LocalDate.now().format(
					DateTimeFormatter.ofPattern("dd.MM.yyyy")));
			txtDate.setColumns(10);
		}
		return txtDate;
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		try {
			if (e.getSource() == this.btnLogin) {
				if (new String(txtLogin.getPassword()).equals("geheim")) {
					lblMessage.setText("login ok");
					paneInformation.setVisible(true);
				} else {
					lblMessage.setText("login not ok");
					paneInformation.setVisible(false);
				}
			} else if (e.getSource() == this.btnRemove) {
				Take tmpTake = new Take(txtFisher.getText(), txtFish.getText(),
						LocalDate.parse(txtDate.getText(),
								DateTimeFormatter.ofPattern("dd.MM.yyyy")),
						Integer.parseInt(txtWeight.getText()));
				db.removeTake(tmpTake);
				lstAllTakes.setListData(db.getTakes().toArray(new Take[0]));
				lblMessage.setText(tmpTake + " removed");
			} else if (e.getSource() == this.btnAdd) {
				Take tmpTake = new Take(txtFisher.getText(), txtFish.getText(),
						LocalDate.parse(txtDate.getText(),
								DateTimeFormatter.ofPattern("dd.MM.yyyy")),
						Integer.parseInt(txtWeight.getText()));
				db.addTake(tmpTake);
				lstAllTakes.setListData(db.getTakes().toArray(new Take[0]));
				lblMessage.setText(db.getTakes().size() + " takes stored");
			}

		} catch (Exception ex) {
			lblMessage.setText("error: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
} // @jve:decl-index=0:visual-constraint="10,10"
