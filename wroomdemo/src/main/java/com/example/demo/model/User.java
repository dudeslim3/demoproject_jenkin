package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_users")
public class User {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int userid;
	@Column(name = "user_fname")
	private String userfname;
	@Column(name = "user_lname")
	private String userlname;
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userfname=" + userfname + ", userlname=" + userlname + ", usermbno="
				+ usermbno + ", usermail=" + usermail + ", password=" + password + ", useraddress=" + useraddress
				+ ", userdlno=" + userdlno + ", isadmin=" + isadmin + ", stateidu=" + stateidu + ", cityidu=" + cityidu
				+ ", state=" + state + ", city=" + city + "]";
	}
	@Column(name = "user_mobno")
	private String usermbno;
	@Column(name = "user_mail")
	private String usermail;
	@Column(name = "user_password")
	private String password;
	@Column(name = "user_address")
	private String useraddress;
	@Column(name = "user_dlno")
	private String userdlno;
	private int isadmin;
	private int stateidu;
	
	private int cityidu;
	@ManyToOne(fetch = FetchType.LAZY)
	@Transient
	@JoinColumn(name = "stateidu", referencedColumnName = "stateid", insertable = false, updatable = false)
	private State state;
	@ManyToOne(fetch = FetchType.LAZY)
	@Transient
	@JoinColumn(name = "cityidu", referencedColumnName = "cityid", insertable = false, updatable = false)
	private City city;
	public int getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(int isadmin) {
		this.isadmin = isadmin;
	}

	public User() {}
	
	public User(int userid, String userfname, String userlname, String usermbno, String usermail, String password,
			String useraddress, String userdlno, int isadmin, int stateidu, int cityidu, State state, City city) {
		super();
		this.userid = userid;
		this.userfname = userfname;
		this.userlname = userlname;
		this.usermbno = usermbno;
		this.usermail = usermail;
		this.password = password;
		this.useraddress = useraddress;
		this.userdlno = userdlno;
		this.isadmin = isadmin;
		this.stateidu = stateidu;
		this.cityidu = cityidu;
		this.state = state;
		this.city = city;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserfname() {
		return userfname;
	}
	public void setUserfname(String userfname) {
		this.userfname = userfname;
	}
	public String getUserlname() {
		return userlname;
	}
	public void setUserlname(String userlname) {
		this.userlname = userlname;
	}
	public String getUsermbno() {
		return usermbno;
	}
	public void setUsermbno(String usermbno) {
		this.usermbno = usermbno;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUserdlno() {
		return userdlno;
	}
	public void setUserdlno(String userdlno) {
		this.userdlno = userdlno;
	}
	public int getStateidu() {
		return stateidu;
	}
	public void setStateidu(int stateidu) {
		this.stateidu = stateidu;
	}
	public int getCityidu() {
		return cityidu;
	}
	public void setCityidu(int cityidu) {
		this.cityidu = cityidu;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	

	
	
}
