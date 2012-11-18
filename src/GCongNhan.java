import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class GCongNhan extends JFrame {

	private JPanel contentPane;
	private JLabel lblMscn;
	private JLabel lblHoten;
	private JLabel lblMucLuong;
	private JLabel lblSongaynghi;
	private JTextField txtms;
	private JTextField txtten;
	private JTextField txtmucluong;
	private JTextField txtsongaynghi;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnSua;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel modeltable;
	private JComboBox combophai;
	private JLabel lblPhai;
	private DefaultComboBoxModel modelcombo;

	/**
	 * Launch the application.
	 *///Vector<CCongNhan> dscn=new Vector<CCongNhan>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GCongNhan frame = new GCongNhan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GCongNhan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblMscn());
		contentPane.add(getLblHoten());
		contentPane.add(getLblMucLuong());
		contentPane.add(getLblSongaynghi());
		contentPane.add(getTxtms());
		contentPane.add(getTxtten());
		contentPane.add(getTxtmucluong());
		contentPane.add(getTxtsongaynghi());
		contentPane.add(getBtnThem());
		contentPane.add(getBtnXoa());
		contentPane.add(getBtnSua());
		contentPane.add(getScrollPane());
		contentPane.add(getCombophai());
		contentPane.add(getLblPhai());
	}
	private JLabel getLblMscn() {
		if (lblMscn == null) {
			lblMscn = new JLabel("MSCN:");
			lblMscn.setBounds(10, 11, 46, 14);
		}
		return lblMscn;
	}
	private JLabel getLblHoten() {
		if (lblHoten == null) {
			lblHoten = new JLabel("Hoten:");
			lblHoten.setBounds(10, 36, 46, 14);
		}
		return lblHoten;
	}
	private JLabel getLblMucLuong() {
		if (lblMucLuong == null) {
			lblMucLuong = new JLabel("Muc Luong:");
			lblMucLuong.setBounds(0, 61, 69, 14);
		}
		return lblMucLuong;
	}
	private JLabel getLblSongaynghi() {
		if (lblSongaynghi == null) {
			lblSongaynghi = new JLabel("SoNgayNghi:");
			lblSongaynghi.setBounds(0, 86, 69, 14);
		}
		return lblSongaynghi;
	}
	private JTextField getTxtms() {
		if (txtms == null) {
			txtms = new JTextField();
			txtms.setBounds(67, 5, 86, 20);
			txtms.setColumns(10);
		}
		return txtms;
	}
	private JTextField getTxtten() {
		if (txtten == null) {
			txtten = new JTextField();
			txtten.setBounds(67, 33, 86, 20);
			txtten.setColumns(10);
		}
		return txtten;
	}
	private JTextField getTxtmucluong() {
		if (txtmucluong == null) {
			txtmucluong = new JTextField();
			txtmucluong.setBounds(67, 58, 86, 20);
			txtmucluong.setColumns(10);
		}
		return txtmucluong;
	}
	private JTextField getTxtsongaynghi() {
		if (txtsongaynghi == null) {
			txtsongaynghi = new JTextField();
			txtsongaynghi.setBounds(67, 83, 86, 20);
			txtsongaynghi.setColumns(10);
		}
		return txtsongaynghi;
	}
	private JButton getBtnThem() {
		if (btnThem == null) {
			btnThem = new JButton("Them");
			btnThem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					CCongNhan cn=new CCongNhan();
					cn.setMscn(txtms.getText());
					cn.setHoten(txtten.getText());
					cn.setMucluong(Double.parseDouble(txtmucluong.getText()));
					cn.setSongaynghi(Integer.parseInt(txtsongaynghi.getText()));
					cn.setPhai(combophai.getSelectedItem().toString());
					String x=cn.xeploai();
					String[] dscn={cn.getMscn(),cn.getHoten(),Double.toString(cn.getMucluong()),Integer.toString(cn.getSongaynghi()),cn.getPhai(),x};
					modeltable.addRow(dscn);
				}
			});
			btnThem.setBounds(35, 128, 89, 23);
		}
		return btnThem;
	}
	private JButton getBtnXoa() {
		if (btnXoa == null) {
			btnXoa = new JButton("Xoa");
			btnXoa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int index=table.getSelectedRow();
					modeltable.removeRow(index);
				}
			});
			btnXoa.setBounds(141, 128, 89, 23);
		}
		return btnXoa;
	}
	private JButton getBtnSua() {
		if (btnSua == null) {
			btnSua = new JButton("Sua");
			btnSua.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int index=table.getSelectedRow();
					CCongNhan cn=new CCongNhan();
					cn.setMscn(txtms.getText());
					cn.setHoten(txtten.getText());
					cn.setMucluong(Double.parseDouble(txtmucluong.getText()));
					cn.setSongaynghi(Integer.parseInt(txtsongaynghi.getText()));
					cn.setPhai(combophai.getSelectedItem().toString());
					String x=cn.xeploai();
					String[] dscn={cn.getMscn(),cn.getHoten(),Double.toString(cn.getMucluong()),Integer.toString(cn.getSongaynghi()),cn.getPhai(),x};
					
				}
			});
			btnSua.setBounds(263, 128, 89, 23);
		}
		return btnSua;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 162, 422, 100);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable(getModeltable());
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					int index=table.getSelectedRow();
					txtms.setText(modeltable.getValueAt(index, 0).toString());
					txtten.setText(modeltable.getValueAt(index, 1).toString());
					txtmucluong.setText(modeltable.getValueAt(index, 2).toString());
					txtsongaynghi.setText(modeltable.getValueAt(index, 3).toString());
					combophai.setSelectedItem(modeltable.getValueAt(index, 1).toString());
				}
			});
			modeltable.addColumn("MSCN");
			modeltable.addColumn("HoTen");
			modeltable.addColumn("MucLuong");
			modeltable.addColumn("SoNgayNghi");
			modeltable.addColumn("Phai");
			modeltable.addColumn("Xep Loai");
			
		}
		return table;
	}
	/**
	 * @wbp.nonvisual location=403,171
	 */
	private DefaultTableModel getModeltable() {
		if (modeltable == null) {
			modeltable = new DefaultTableModel();
		}
		return modeltable;
	}
	private JComboBox getCombophai() {
		if (combophai == null) {
			combophai = new JComboBox(getModelcombo());
			combophai.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nu"}));
			combophai.setBounds(293, 33, 59, 20);
		}
		return combophai;
	}
	private JLabel getLblPhai() {
		if (lblPhai == null) {
			lblPhai = new JLabel("Phai:");
			lblPhai.setBounds(221, 36, 46, 14);
		}
		return lblPhai;
	}
	/**
	 * @wbp.nonvisual location=331,111
	 */
	private DefaultComboBoxModel getModelcombo() {
		if (modelcombo == null) {
			modelcombo = new DefaultComboBoxModel();
		}
		return modelcombo;
	}
}
