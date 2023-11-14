package com.test1;

public class ArcWinApprovals {
	private Integer seqId;
	private String approvalName;
	private String approvalDesc;
	private String approvalType;
	private boolean isActive;
	private Integer executionOrder;
	private boolean notificationRequired;
	private String notificationType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ArcWinApprovals(Integer seqId, String approvalName, String approvalDesc, String approvalType,
			boolean isActive, Integer executionOrder, boolean notificationRequired, String notificationType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.seqId = seqId;
		this.approvalName = approvalName;
		this.approvalDesc = approvalDesc;
		this.approvalType = approvalType;
		this.isActive = isActive;
		this.executionOrder = executionOrder;
		this.notificationRequired = notificationRequired;
		this.notificationType = notificationType;
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

	public String getApprovalName() {
		return approvalName;
	}

	public void setApprovalName(String approvalName) {
		this.approvalName = approvalName;
	}

	public String getApprovalDesc() {
		return approvalDesc;
	}

	public void setApprovalDesc(String approvalDesc) {
		this.approvalDesc = approvalDesc;
	}

	public String getApprovalType() {
		return approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getExecutionOrder() {
		return executionOrder;
	}

	public void setExecutionOrder(Integer executionOrder) {
		this.executionOrder = executionOrder;
	}

	public boolean isNotificationRequired() {
		return notificationRequired;
	}

	public void setNotificationRequired(boolean notificationRequired) {
		this.notificationRequired = notificationRequired;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
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
