
public class CCongNhan {
	private String mscn;
	private String hoten;
	private double mucluong;
	private int songaynghi;
	private String phai;
	public String getMscn() {
		return mscn;
	}
	public void setMscn(String mscn) {
		this.mscn = mscn;
	}
	public CCongNhan(String mscn, String hoten, double mucluong,
			int songaynghi, String phai) {
		super();
		this.mscn = mscn;
		this.hoten = hoten;
		this.mucluong = mucluong;
		this.songaynghi = songaynghi;
		this.phai = phai;
	}
	public CCongNhan() {
		super();
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getMucluong() {
		return mucluong;
	}
	public void setMucluong(double mucluong) {
		this.mucluong = mucluong;
	}
	public int getSongaynghi() {
		return songaynghi;
	}
	public void setSongaynghi(int songaynghi) {
		this.songaynghi = songaynghi;
	}
	public String getPhai() {
		return phai;
	}
	public void setPhai(String phai) {
		this.phai = phai;
	}
	public String xeploai()
	{
		String loai=null;
		if(getMucluong()>=5000000)
			loai="A";
		else if(getMucluong()<5000000)
			loai="B";
		return loai;
		
		
	}

}
