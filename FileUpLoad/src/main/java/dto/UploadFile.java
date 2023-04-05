package dto;

public class UploadFile {

	private int fileno;
	String originName;
	String storedName;

	public UploadFile() {

	}

	public UploadFile(int fileno, String originName, String storedName) {
		super();
		this.fileno = fileno;
		this.originName = originName;
		this.storedName = storedName;
	}

	public int getFileno() {
		return fileno;
	}

	public void setFileno(int fileno) {
		this.fileno = fileno;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getStoredName() {
		return storedName;
	}

	public void setStoredName(String storedName) {
		this.storedName = storedName;
	}

	@Override
	public String toString() {
		return "UploadFile [fileno=" + fileno + ", originName=" + originName + ", storedName=" + storedName + "]";
	}

}
