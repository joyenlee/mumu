package lyy.mumu.user.entity;

import java.io.Serializable;

/**
 * 用户
 * 
 * @author yongyanli
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3009703197159896387L;

	/**
	 * 唯一标识，递增
	 */
	private long id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 手机号
	 */
	private String mobilePhone;
	/**
	 * 电子邮箱
	 */
	private String email;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 确认密码
	 */
	private String confirmPassword;
	/**
	 * 居民身份证
	 */
	private CitizenIdentityCard idCard;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
