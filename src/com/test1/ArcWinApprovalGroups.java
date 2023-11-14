package com.test1;

public class ArcWinApprovalGroups {
	private Integer seqId;
	private String approvalGrpName;
	private String approvalGrpDesc;
	private boolean isActive;
	private String eventName;
	private boolean isGenericApproval;
	private String approvalGroupType;
	private String actionType;
	private String approvalObjectType;
	private String autoApprovalFlag;
	private String ccList;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ArcWinApprovalGroups(Integer seqId, String approvalGrpName, String approvalGrpDesc, boolean isActive,
			String eventName, boolean isGenericApproval, String approvalGroupType, String actionType,
			String approvalObjectType, String autoApprovalFlag, String ccList, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.seqId = seqId;
		this.approvalGrpName = approvalGrpName;
		this.approvalGrpDesc = approvalGrpDesc;
		this.isActive = isActive;
		this.eventName = eventName;
		this.isGenericApproval = isGenericApproval;
		this.approvalGroupType = approvalGroupType;
		this.actionType = actionType;
		this.approvalObjectType = approvalObjectType;
		this.autoApprovalFlag = autoApprovalFlag;
		this.ccList = ccList;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSeqId() {
		return seqId;
	}

	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}

	public String getApprovalGrpName() {
		return approvalGrpName;
	}

	public void setApprovalGrpName(String approvalGrpName) {
		this.approvalGrpName = approvalGrpName;
	}

	public String getApprovalGrpDesc() {
		return approvalGrpDesc;
	}

	public void setApprovalGrpDesc(String approvalGrpDesc) {
		this.approvalGrpDesc = approvalGrpDesc;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public boolean isGenericApproval() {
		return isGenericApproval;
	}

	public void setGenericApproval(boolean isGenericApproval) {
		this.isGenericApproval = isGenericApproval;
	}

	public String getApprovalGroupType() {
		return approvalGroupType;
	}

	public void setApprovalGroupType(String approvalGroupType) {
		this.approvalGroupType = approvalGroupType;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getApprovalObjectType() {
		return approvalObjectType;
	}

	public void setApprovalObjectType(String approvalObjectType) {
		this.approvalObjectType = approvalObjectType;
	}

	public String getAutoApprovalFlag() {
		return autoApprovalFlag;
	}

	public void setAutoApprovalFlag(String autoApprovalFlag) {
		this.autoApprovalFlag = autoApprovalFlag;
	}

	public String getCcList() {
		return ccList;
	}

	public void setCcList(String ccList) {
		this.ccList = ccList;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
