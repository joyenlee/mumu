package lyy.mumu.user.entity;

import java.io.Serializable;
import java.util.Date;

public class CitizenIdentityCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8998303438997122640L;
	/**
	 * 唯一标识，递增
	 */
	private long id;
	/**
	 * 姓名
	 */
	private String name;
	public static enum Sex {
		MALE, FEMALE
	}
	/**
	 * 性别
	 */
	private Sex sex;
	public static enum Ethnicity {
		Han
	}
	/**
	 * 民族
	 */
	private Ethnicity ethnicity;
	/**
	 * 出生日期
	 */
	private Date birth;
	/**
	 * 住址
	 */
	private String residentialAddress;
	/**
	 * 公民身份号码
	 */
	private String citizenIdNumber;
	/**
	 * 签发机关
	 */
	private String authority;
	/**
	 * 有效期限，开始日期
	 */
	private Date start;
	/**
	 * 有效期限，结束日期
	 */
	private Date end;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public Ethnicity getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(Ethnicity ethnicity) {
		this.ethnicity = ethnicity;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getCitizenIdNumber() {
		return citizenIdNumber;
	}
	public void setCitizenIdNumber(String citizenIdNumber) {
		this.citizenIdNumber = citizenIdNumber;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
}
