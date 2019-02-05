package yash.CAB;

import java.io.Serializable;

/**
 * Hello world!
 *
 */
class GrossaryDetails implements Serializable{ 
private int grossaryQuntity;
private long refId;
private String grossaryName;
private String grossaryType;

GrossaryDetails(long refId, String grossaryName, int grossaryQuntity, String grossaryType) {
		this.refId = refId;
		this.grossaryName = grossaryName;
		this.grossaryQuntity = grossaryQuntity;
		this.grossaryType = grossaryType;

	}

	public void setgrossaryQuntity(int grossaryQuntity) {
		this.grossaryQuntity = grossaryQuntity;
	}
	public int getGrossaryQuntity() {
		return this.grossaryQuntity;
	}
	public void setRefId(long refId) {
	this.refId=refId;
	}
	public long getRefId() {
		return this.refId;
	}

	public void setgrossaryName(String name) {
		this.grossaryName = name;
	}
	public String getGrossaryName() {
		return this.grossaryName;
	}
	public void setgrossaryTypey(String type) {
		this.grossaryType = type;
	}
	
	public String getGrossaryType() {
		return this.grossaryType;
	}


@Override
	public String toString() {
System.out.println("refId:-"+getRefId());
System.out.println("grossaryName:-"+getGrossaryName());
System.out.println("GrossaryQuntity:-"+getGrossaryQuntity());
System.out.println("GrossaryType:-"+getGrossaryType());

	return super.toString();
	}

}