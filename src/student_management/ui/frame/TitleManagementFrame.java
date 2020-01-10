package student_management.ui.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import student_management.dto.Department;
import student_management.dto.Student;
import student_management.dto.Title;
import student_management.ui.panel.AbsItemPanel;
import student_management.ui.panel.DepartmentPanel;
import student_management.ui.panel.StudentPanel;
import student_management.ui.panel.TitlePanel;

@SuppressWarnings("serial")
public class TitleManagementFrame extends AbsManagementFrame<Title> {
	private TitlePanel titlePanel;
	
	public TitleManagementFrame() {
		titlePanel = new TitlePanel();
	}
	@Override
	protected Title getItem() {
		return titlePanel.getItem();
	}

	@Override
	protected AbsItemPanel<Title> createItemPanel() {
		return titlePanel;
	}
	
}
