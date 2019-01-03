package lyy.mumu.user.entity;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3009703197159896387L;

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
