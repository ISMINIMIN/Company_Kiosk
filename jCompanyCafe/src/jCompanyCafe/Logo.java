package jCompanyCafe;

import java.awt.*;
import javax.swing.*;

// �� �гο� ���� �κ��� �ΰ� �� �гο� ��ӽ�Ű������ �θ� Ŭ���� ����
public class Logo extends JPanel {
	protected MainFrame F;
	protected JLabel lbltitle;

	public Logo(MainFrame f) {
		setSize(720, 750); // �г� ũ�� 720x750
		setLayout(null);
		setBackground(new Color(255,255,255)); // ���� ����

		F = f;

		lbltitle = new JLabel("J Company Cafe"); // �ΰ� �� ����
		lbltitle.setFont(new Font("���ʷҵ���", Font.BOLD, 40));  // �ΰ� ��Ʈ ����
		lbltitle.setForeground(new Color(26,116,2)); // ��Ʈ�� ����
 		lbltitle.setBounds(200, 50, 320, 50); // ���� ��ġ ����
		add(lbltitle);
	} 
}
