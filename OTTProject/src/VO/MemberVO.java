package VO;

public class MemberVO {
	private String memId;
	private String memPw;
	private String memName;
	private String memNt;
	private String memTel;
	private String memMail;
	private String memDb;

	public String getOtId() {
		return memId;
	}

	public void setOtId(String otId) {
		this.memId = otId;
	}

	public String getOtPw() {
		return memPw;
	}

	public void setOtPw(String otPw) {
		this.memPw = otPw;
	}

	public String getOtName() {
		return memName;
	}

	public void setOtName(String otName) {
		this.memName = otName;
	}

	public String getOtNt() {
		return memNt;
	}

	public void setOtNt(String otNt) {
		this.memNt = otNt;
	}

	public String getOtTel() {
		return memTel;
	}

	public void setOtTel(String otTel) {
		this.memTel = otTel;
	}

	public String getOtMail() {
		return memMail;
	}

	public void setOtMail(String otMail) {
		this.memMail = otMail;
	}

	public String getOtDb() {
		return memDb;
	}

	public void setOtDb(String otDb) {
		this.memDb = otDb;
	}

	@Override
	public String toString() {
		return "OTTVO [otId=" + memId + ", otPw=" + memPw + ", otName=" + memName + ", otNt=" + memNt + ", otTel=" + memTel
				+ ", otMail=" + memMail + ", otDb=" + memDb + "]";
	}

}
