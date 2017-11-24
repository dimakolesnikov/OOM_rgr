package Program;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FuelCalcProgramFrame extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textPathLength;
	private JTextField textFuelConsumption;
	private JTextField textPriceOneLiter;
	private JTextField textTotalConsumption;
	private JTextField textTotalAmount;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					FuelCalcProgramFrame frame = new FuelCalcProgramFrame();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	private void Calculate()
	{
		double distance = 0;
		double fuelConsumption = 0;
		double fuelCost = 0;
		
		try 
		{
			distance = Double.parseDouble(textPathLength.getText());
			fuelConsumption = Double.parseDouble(textFuelConsumption.getText());
			fuelCost = Double.parseDouble(textPriceOneLiter.getText());
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Invalid input. Please, try again.");
			
			textPathLength.setText("");
			textFuelConsumption.setText("");
			textPriceOneLiter.setText("");
			textTotalAmount.setText("");
			textTotalConsumption.setText("");
			
			return;
		}
		
		FuelCalcBL fc = new FuelCalcBL(distance, fuelConsumption, fuelCost);
		
		textTotalConsumption.setText(String.format(new Locale("ru"), "%(.2f", fc.TotalFuelConsumption));
		textTotalAmount.setText(String.format(new Locale("ru"), "%(.2f", fc.TotalSum));
	}

	public FuelCalcProgramFrame() 
	{
		setResizable(false);
		setTitle("Fuel Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Path length:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(24, 11, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fuel consumption per 100 km:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(24, 36, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("The price of one liter of fuel:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(24, 61, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		textPathLength = new JTextField();
		textPathLength.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPathLength.setBounds(180, 8, 114, 20);
		contentPane.add(textPathLength);
		textPathLength.setColumns(10);
		
		textFuelConsumption = new JTextField();
		textFuelConsumption.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFuelConsumption.setBounds(180, 33, 114, 20);
		contentPane.add(textFuelConsumption);
		textFuelConsumption.setColumns(10);
		
		textPriceOneLiter = new JTextField();
		textPriceOneLiter.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPriceOneLiter.setBounds(180, 58, 114, 20);
		contentPane.add(textPriceOneLiter);
		textPriceOneLiter.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCalculate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Calculate();
			}
		});
		btnCalculate.setBounds(180, 97, 114, 23);
		contentPane.add(btnCalculate);
		
		JLabel lblNewLabel_3 = new JLabel("Total fuel consumption:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(24, 143, 121, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total amount:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(24, 168, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		textTotalConsumption = new JTextField();
		textTotalConsumption.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textTotalConsumption.setBounds(180, 140, 114, 20);
		contentPane.add(textTotalConsumption);
		textTotalConsumption.setColumns(10);
		
		textTotalAmount = new JTextField();
		textTotalAmount.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textTotalAmount.setBounds(180, 165, 114, 20);
		contentPane.add(textTotalAmount);
		textTotalAmount.setColumns(10);
	}
}
