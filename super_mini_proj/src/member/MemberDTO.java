package member;

public class MemberDTO {
	int mNum;
	String mName;
	String mId;
	String mPw;
	int mStatus;
	
	public int getmNum() {
		return mNum;
	}
	
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	
	public String getmName() {
		return mName;
	}
	
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public String getmId() {
		return mId;
	}
	
	public void setmId(String mId) {
		this.mId = mId;
	}
	
	public String getmPw() {
		return mPw;
	}
	
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	
	public int getmStatus() {
		return mStatus;
	}
	
	public void setmStatus(int mStatus) {
		this.mStatus = mStatus;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [mNum=" + mNum + ", mName=" + mName + ", mId=" + mId + ", mPw=" + mPw + ", mStatus=" + mStatus
				+ "]";
	}
	public MemberDTO(int mNum, String mName, String mId, String mPw, int mStatus) {
		super();
		this.mNum = mNum;
		this.mName = mName;
		this.mId = mId;
		this.mPw = mPw;
		this.mStatus = mStatus;
	}
	
	
}
