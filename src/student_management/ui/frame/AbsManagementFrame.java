package student_management.ui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import student_management.dto.Department;
import student_management.ui.panel.AbsItemPanel;
import student_management.ui.panel.DepartmentPanel;

@SuppressWarnings("serial")
public abstract class AbsManagementFrame<T> extends JFrame implements ActionListener {

	private JPanel contentPane;
	//다른 부분
	private AbsItemPanel<T> pCenter;
//	private AbsItemPanel<Title> pCenter;
//	private AbsItemPanel<Student> pCenter;
	private JPanel pSouth;
	private JButton btnAdd;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	


	/**
	 * Create the frame.
	 */
	public AbsManagementFrame() {
		initialize();
		
		//다른 부분
		pCenter = createItemPanel();
		/*
		 * pCenter = new DepartmentPanel();
		 * pCenter = new StudentPanel();
		 * pCenter = new TitlePanel();
		 */
		contentPane.add(pCenter, BorderLayout.CENTER);
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		

		
		pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pSouth.add(btnAdd);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		pSouth.add(btnCancel);
	}

	

	/*
	 * private AbsItemPanel<T> getCenterPanel(int type) { if(type == 1) { return
	 * (AbsItemPanel<T>) new StudentPanel(); } if(type == 2) { return
	 * (AbsItemPanel<T>) new DepartmentPanel(); } if(type == 3) { return
	 * (AbsItemPanel<T>) new TitlePanel(); } return null; }
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			btnCancelActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		//Student newStudent = pCenter.getItem();
		JOptionPane.showMessageDialog(null, getItem());
	}
	protected void btnCancelActionPerformed(ActionEvent e) {
		pCenter.clearTf();
	}
	
	//다른 부분
	protected abstract T getItem();
	protected abstract AbsItemPanel<T> createItemPanel();
}
