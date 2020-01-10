package student_management.ui.panel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import student_management.dto.Title;

@SuppressWarnings("serial")
public class TitlePanel extends AbsItemPanel<Title> {
	private JLabel lbltitle;
	private JLabel lbltitleName;
	private JTextField tfTitleNo;
	private JTextField tfTitleName;

	/**
	 * Create the panel.
	 */
	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC9C1\uCC45\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lbltitle = new JLabel("직책번호");
		lbltitle.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lbltitle);
		
		tfTitleNo = new JTextField();
		add(tfTitleNo);
		tfTitleNo.setColumns(10);
		
		lbltitleName = new JLabel("직책명");
		lbltitleName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lbltitleName);
		
		tfTitleName = new JTextField();
		add(tfTitleName);
		tfTitleName.setColumns(10);
	}
	
	public void clearTf() {
		tfTitleName.setText("");
		tfTitleNo.setText("");
	}
	
	public void setItem(Title item) {
		tfTitleName.setText(item.getTitleName());
		tfTitleNo.setText(item.getTitleNo()+"");
	}
	
	public Title getItem() {
		int titleNo = Integer.parseInt(tfTitleNo.getText().trim());
		String titleName = tfTitleName.getText().trim();
		return new Title(titleNo, titleName);
	}

}
