package UI.hanbit;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

//public class MyTableTest implements TableCellRenderer {
public class MyTableTest{
//public class MyTableTest {

	String[]			obj	= { "하나", "둘", "셋" };
	DefaultTableModel	dtm	= new DefaultTableModel(new String[2][3], obj);
	JFrame				jf	= new JFrame();
	JTable				jtb	= new JTable(dtm);
	JScrollPane			jsp	= new JScrollPane(jtb);
	ImageIcon			img	= new ImageIcon("src\\UI\\hanbit\\geumja.jpg");
	JLabel				jlb	= null;
	JCheckBox			jcb = new JCheckBox();
	static int i = 0;

	public MyTableTest() {
		jlb = new JLabel();
		System.out.println("" + jtb.getCellRect(2, 1, false).width + "*****" + jtb.getCellRect(2, 1, false).height);
		jtb.setRowHeight(15);
		jtb.getColumn("둘").setWidth(74);
		Image newImg = img.getImage().getScaledInstance(jtb.getCellRect(2, 1, false).width,
				-10, 4);
		img.setImage(newImg);
		jlb.setIcon(img);
		jtb.getColumn("하나").setCellRenderer(new TableCellRenderer() {

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				System.out.println("getTableCellRendererComponent호출");
				Component comp = null;
				value = true;
				if (isSelected = true) {
					i++;
					System.out.println("트루"+i);
				}
				return jlb;
			}
			
		});
		//jtb.getColumn("둘").setCellRenderer(this);
		jtb.setRowHeight(100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add("Center", jsp);
		jf.setSize(500, 700);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new MyTableTest();
	}
}
