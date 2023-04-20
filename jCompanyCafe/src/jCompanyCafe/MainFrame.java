package jCompanyCafe;

import java.awt.*; // �׷��� ó���� ���� Ŭ�������� ��θ�
import javax.swing.*; // ���� ������Ʈ Ŭ�������� ��θ�

public class MainFrame extends JFrame {

	private CardLayout cardLayout = new CardLayout();

	public MainFrame() {
		setTitle("KIOSK PROGRAM"); // Ÿ��Ʋ �ޱ�
		setSize(720, 770); // ������ ũ�� 720x770
		getContentPane().setLayout(cardLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����ư�� Ŭ���� �� �������� �ݰ� ���� ���α׷��� �����ϵ��� �ϱ� ���� �����

		// �����ӿ� ����� ����Ʈ���� �˾Ƴ� �г��� ������
		getContentPane().add("FirstPage", new EmployeeCheck(this));
		getContentPane().add("MenuPage", new MenuSelect(this));
		getContentPane().add("SelectPage", new MenuInfomation(this));
		getContentPane().add("DiscountPage", new Membership(this));
		getContentPane().add("PayPage", new PaymentHistory(this));
		getContentPane().add("DBPage", new CheckDB(this));
		getContentPane().add("LastPage", new PayComplete(this));

		setVisible(true); // ������ ���
	}

	public void nextPanel() {
		// ���� �гη� �Ѿ
		cardLayout.next(this.getContentPane());
	}

	public void jumpPanel() { 
		// �ΰ��� �г��� �Ѿ
		cardLayout.next(this.getContentPane());
		cardLayout.next(this.getContentPane());
	}

	public void previousPanel() {
		// ���� �гη� �Ѿ
		cardLayout.previous(this.getContentPane());
	}

	public static void main(String[] args) {
		MainFrame frame = new MainFrame(); 
	}
}
