package jCompanyCafe;

import java.awt.*;
import java.awt.event.*; // AWT �̺�Ʈ ����� ���� ��θ�
import javax.swing.*;

public class EmployeeCheck extends Logo {

	private JLabel lbl1, lbl2;
	private JButton btnorder;	

	public EmployeeCheck(MainFrame f) {

		super(f);

		lbl1 = new JLabel("�ش� �ֹ� �ý����� ��� �����Դϴ�."); // �� ����
		lbl1.setFont(new Font("���� ���", Font.BOLD, 18)); // ��Ʈ ����
		lbl1.setBounds(200, 300, 320, 30); // ���� ��ġ ����
		add(lbl1);

		lbl2 = new JLabel("����� �ƴϽ� ���� ���� ������ ���� �ֹ��� �����մϴ�.");
		lbl2.setFont(new Font("���� ���", Font.PLAIN, 15));
		lbl2.setBounds(160, 350, 390, 30);
		add(lbl2);

		btnorder = new JButton("�ֹ��ϱ�"); // ��ư ����
		// ��ư�� ������ �� �̺�Ʈ ����
		btnorder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// ���� �гη� �Ѿ
            	F.nextPanel();
            }
        });
		btnorder.setFont(new Font("���� ���", Font.BOLD, 20));
		btnorder.setBackground(new Color(217,242,192));
		btnorder.setForeground(new Color(26,116,2));
		btnorder.setBounds(255, 610, 200, 50);
		add(btnorder);
		setVisible(true);
	}
}

