import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/* AUTHOR:	R Grant
 * DATE:	4/2014
 */
public class ReserveRoomGUI extends JFrame implements ActionListener, ItemListener, FocusListener
{
	private final double dblBRKFST_PKG_COST = 7;
	private final double dblDinner_PKG_COST = 15;
	private final double dblSMOKING_SURCHARGE = 5;
	private final double dblTAX_RATE = .07;
	private final double dblBUDGET_ROOM_RATE = 100;
	private final double dblBUSINESS_ROOM_RATE = 150;
	private final double dblDELUXE_ROOM_RATE = 300;
	private final String[] strROOM_TYPE = {
			"Budget ($100/night)", "Business ($150/night)", "Deluxe ($300/night)"
	};
	private final double[] dblROOM_COST = {
			dblBUDGET_ROOM_RATE, dblBUSINESS_ROOM_RATE, dblDELUXE_ROOM_RATE
	};
	
	private JCheckBox chkLunchPkg;
	private JCheckBox chkFullMealPkg;
	private JLabel lblNamePrompt;
	private JTextField txtName;
	private JLabel lblNumberOfNightsPrompt;
	private JTextField txtNumberOfNights;
	private JLabel lblRoomTypePrompt;
	private JComboBox<String> cboRoomType;
	private ButtonGroup grpSmokingOption;
	private JRadioButton radSmoking;
	private JRadioButton radNoSmoking;
	private JLabel lblAmoutOwedPrompt;
	private JLabel lblAmountOwed;
	private JButton btnReserve;
	private JButton btnExit;
	private int intNumberOfNights;
	private DecimalFormat df = new DecimalFormat("$###,###.00");
	
	public ReserveRoomGUI(String title)
	{
		super(title);
		setSize(230, 375);
		setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
		initializeGUI();
	}
	private void initializeGUI()
	{
		//set up user interface
		lblNamePrompt = new JLabel("Name:");
		add(lblNamePrompt);
		txtName = new JTextField(10);
		add(txtName);
		lblNumberOfNightsPrompt = new JLabel("Number of Nights:");
		add(lblNumberOfNightsPrompt);
		txtNumberOfNights = new JTextField(5);
		add(txtNumberOfNights);
		txtNumberOfNights.setText("0");
		lblRoomTypePrompt = new JLabel("Type of Room:");
		add(lblRoomTypePrompt);
		cboRoomType = new JComboBox<String>(strROOM_TYPE);
		add(cboRoomType);
		
		chkLunchPkg = new JCheckBox("Breakfast Pkg (" + df.format(dblBRKFST_PKG_COST) + " per day)");
		add(chkLunchPkg);
		chkFullMealPkg = new JCheckBox("Dinner Pkg (" + df.format(dblDinner_PKG_COST) + " per day)");
		add(chkFullMealPkg);
		
		grpSmokingOption = new ButtonGroup();
		radNoSmoking = new JRadioButton("No Smoking");
		grpSmokingOption.add(radNoSmoking);
		radSmoking = new JRadioButton("Smoking (" + df.format(dblSMOKING_SURCHARGE) + " per day)");
		grpSmokingOption.add(radSmoking);
		add(radNoSmoking);
		add(radSmoking);
		radNoSmoking.setSelected(true);
		
		lblAmoutOwedPrompt = new JLabel("Amount owed:");
		add(lblAmoutOwedPrompt);
		lblAmountOwed = new JLabel("$0.00");
		add(lblAmountOwed);
		
		btnReserve = new JButton("Reserve");
		add(btnReserve);
		btnExit = new JButton("   Exit  ");
		add(btnExit);
		
		addListeners();//add the listeners for each component that can be source of event
	}
	/* The method below is the single place where the cost is calculated. Each event handler
	 * calls this method to determine what the "new" cost is.
	 */
	public double getAllCosts()
	{
		double dblRoomRate;
		int intRateIdx;
		double dblTotalCost = 0;
		//get nightly room cost
		if (cboRoomType.getSelectedIndex() >= 0)
			intRateIdx = cboRoomType.getSelectedIndex();
		else
			intRateIdx = 0;
		dblRoomRate = dblROOM_COST[intRateIdx];
		//get number of nights; use 0 if invalid
		try{
			intNumberOfNights = Integer.parseInt(txtNumberOfNights.getText());
			if (intNumberOfNights < 0)
			{
				intNumberOfNights = 0;
				txtNumberOfNights.setText("0");
			}
		}
		catch (NumberFormatException e) {
			intNumberOfNights = 0;
			txtNumberOfNights.setText("0");
		}
		//add in costs for each type of cost for 1 night
		dblTotalCost = dblRoomRate;
		if (chkLunchPkg.isSelected())
			dblTotalCost += dblBRKFST_PKG_COST;
		if (chkFullMealPkg.isSelected())
			dblTotalCost += dblDinner_PKG_COST;
		
		if (radSmoking.isSelected())
			dblTotalCost += dblSMOKING_SURCHARGE; 
		//extend cost per night by number of nights
		dblTotalCost *= intNumberOfNights;
		//add tax amount
		dblTotalCost *= (1 + dblTAX_RATE);
		//update GUI
		lblAmountOwed.setText(df.format(dblTotalCost));
		return dblTotalCost;
	}
	@Override
	public void actionPerformed(ActionEvent source) 
	{
		if (source.getSource() == btnExit)
				System.exit(0);	
		//otherwise the source was the Reserve button so process that	
		JOptionPane.showMessageDialog(null, txtName.getText() +
					" has reserved a room for " + intNumberOfNights +
					" night(s) for a total of " + df.format(getAllCosts()));
	}
	@Override
	public void itemStateChanged(ItemEvent source)	{
		getAllCosts();	
	}
	
	@Override
	public void focusGained(FocusEvent arg0) {
		// nothing to do here - just need to "implement" the method
	}
	@Override
	public void focusLost(FocusEvent arg0) {
		getAllCosts();	
	}
	public void addListeners()
	{
			btnReserve.addActionListener(this);
			btnExit.addActionListener(this);
			chkFullMealPkg.addItemListener(this);
			chkLunchPkg.addItemListener(this);
			radSmoking.addItemListener(this);
			radNoSmoking.addItemListener(this);
			cboRoomType.addItemListener(this);
			txtNumberOfNights.addFocusListener(this);
	}
}