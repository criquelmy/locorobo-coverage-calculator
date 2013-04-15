import javax.swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

/**
 * @author Paul McAnnally
 * @date 4/15/2012
 */
public class SurfaceManager extends JDialog {
	private JTextField heightTextField;
	private JTextField lengthTextField;
	private JTextField widthTextField;
	private JCheckBox trimCheckBox;
	private JCheckBox floorCheckBox;
	private JCheckBox paintCheckBox;

	private ActionListener listener;

	public SurfaceManager() {
		setTitle("Surface Manager");
		setBounds(200, 200, 700, 400);

		// *String[] data = {"Trim", "Paint", "Floor Tile"};
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 143, 208, 124, 148, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0 };
		getContentPane().setLayout(gridBagLayout);

		// Creates the Label for the height/width/length text input boxes
		JLabel lblEnterTheValues = new JLabel("Enter the Size of your Surface");
		GridBagConstraints gbc_lblEnterTheValues = new GridBagConstraints();
		gbc_lblEnterTheValues.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterTheValues.gridx = 0;
		gbc_lblEnterTheValues.gridy = 0;
		getContentPane().add(lblEnterTheValues, gbc_lblEnterTheValues);

		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut.gridx = 4;
		gbc_verticalStrut.gridy = 0;
		getContentPane().add(verticalStrut, gbc_verticalStrut);

		// Creates text input field for entering the height of the surface
		heightTextField = new JTextField();
		heightTextField.setText("Height");
		heightTextField.addActionListener(new heightTextFieldListener());
		GridBagConstraints gbc_heightTextField = new GridBagConstraints();
		gbc_heightTextField.fill = GridBagConstraints.BOTH;
		gbc_heightTextField.insets = new Insets(0, 0, 5, 5);
		gbc_heightTextField.gridx = 0;
		gbc_heightTextField.gridy = 3;
		getContentPane().add(heightTextField, gbc_heightTextField);

		// Creates text input field for entering the width of the surface
		widthTextField = new JTextField();
		widthTextField.setText("Width");
		widthTextField.addActionListener(new widthTextFieldListener());
		GridBagConstraints gbc_widthTextField = new GridBagConstraints();
		gbc_widthTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_widthTextField.insets = new Insets(0, 0, 5, 5);
		gbc_widthTextField.gridx = 0;
		gbc_widthTextField.gridy = 2;
		getContentPane().add(widthTextField, gbc_widthTextField);
		widthTextField.setColumns(10);

		// Creates text input field for entering the length of the surface....
		lengthTextField = new JTextField();
		lengthTextField.setText("Length");
		lengthTextField.addActionListener(new lengthTextFieldListener());
		GridBagConstraints gbc_lengthTextField = new GridBagConstraints();
		gbc_lengthTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_lengthTextField.anchor = GridBagConstraints.NORTH;
		gbc_lengthTextField.insets = new Insets(0, 0, 5, 5);
		gbc_lengthTextField.gridx = 0;
		gbc_lengthTextField.gridy = 1;
		getContentPane().add(lengthTextField, gbc_lengthTextField);
		lengthTextField.setColumns(10);

		JButton SaveSurface = new JButton("Save Surface");
		SaveSurface.addActionListener(new SaveSurfaceListener());
		GridBagConstraints gbc_SaveSurface = new GridBagConstraints();
		gbc_SaveSurface.insets = new Insets(0, 0, 5, 5);
		gbc_SaveSurface.gridx = 1;
		gbc_SaveSurface.gridy = 4;
		getContentPane().add(SaveSurface, gbc_SaveSurface);

		// Adds a check box that is used to select "Trim"
		trimCheckBox = new JCheckBox("Trim");
		trimCheckBox.addActionListener(listener);
		GridBagConstraints gbc_trimCheckBox = new GridBagConstraints();
		gbc_trimCheckBox.anchor = GridBagConstraints.WEST;
		gbc_trimCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_trimCheckBox.gridx = 0;
		gbc_trimCheckBox.gridy = 4;
		getContentPane().add(trimCheckBox, gbc_trimCheckBox);

		// Adds a "Paint" check box
		paintCheckBox = new JCheckBox("Paint");
		paintCheckBox.addActionListener(listener);
		GridBagConstraints gbc_paintCheckBox = new GridBagConstraints();
		gbc_paintCheckBox.anchor = GridBagConstraints.WEST;
		gbc_paintCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_paintCheckBox.gridx = 0;
		gbc_paintCheckBox.gridy = 5;
		getContentPane().add(paintCheckBox, gbc_paintCheckBox);

		// Adds a check box to select tile flooring
		floorCheckBox = new JCheckBox("Floor Tile");
		floorCheckBox.addActionListener(listener);
		GridBagConstraints gbc_floorCheckBox = new GridBagConstraints();
		gbc_floorCheckBox.anchor = GridBagConstraints.WEST;
		gbc_floorCheckBox.insets = new Insets(0, 0, 0, 5);
		gbc_floorCheckBox.gridx = 0;
		gbc_floorCheckBox.gridy = 6;
		getContentPane().add(floorCheckBox, gbc_floorCheckBox);

	}

	// Listener for the height text box
	private class heightTextFieldListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Text= " + heightTextField.getText());
		}
	}

	// Listener for the "width" text box
	private class widthTextFieldListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Text= " + widthTextField.getText());
		}
	}

	// Listener for the "Length" text box
	private class lengthTextFieldListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Text= " + lengthTextField.getText());
		}
	}

	// Listener for the "Save Surface" button
	private class SaveSurfaceListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (trimCheckBox.isSelected())
				System.out.println("Hey you checked TRIM");

			if (paintCheckBox.isSelected())
				System.out.println("Hey you checked PAINT");

			if (floorCheckBox.isSelected())
				System.out.println("Hey you checked Tile");

		}
	}

}
