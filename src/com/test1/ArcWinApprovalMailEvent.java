package com.test1;

public class ArcWinApprovalMailEvent {
	private Integer seqId;
	private Integer eventId;
	private String mailTemplate;
	private boolean isActive;
	private String fromApprovalEnv;
	private String eventHost;
	private String toList;
	private String ccList;
	private String bccList;
	private String attachementType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ArcWinApprovalMailEvent(Integer seqId, Integer eventId, String mailTemplate, boolean isActive,
			String fromApprovalEnv, String eventHost, String toList, String ccList, String bccList,
			String attachementType, String creationDate, String modifiedDate, String entityState) {
		super();
		this.seqId = seqId;
		this.eventId = eventId;
		this.mailTemplate = mailTemplate;
		this.isActive = isActive;
		this.fromApprovalEnv = fromApprovalEnv;
		this.eventHost = eventHost;
		this.toList = toList;
		this.ccList = ccList;
		this.bccList = bccList;
		this.attachementType = attachementType;
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

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getMailTemplate() {
		return mailTemplate;
	}

	public void setMailTemplate(String mailTemplate) {
		this.mailTemplate = mailTemplate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getFromApprovalEnv() {
		return fromApprovalEnv;
	}

	public void setFromApprovalEnv(String fromApprovalEnv) {
		this.fromApprovalEnv = fromApprovalEnv;
	}

	public String getEventHost() {
		return eventHost;
	}

	public void setEventHost(String eventHost) {
		this.eventHost = eventHost;
	}

	public String getToList() {
		return toList;
	}

	public void setToList(String toList) {
		this.toList = toList;
	}

	public String getCcList() {
		return ccList;
	}

	public void setCcList(String ccList) {
		this.ccList = ccList;
	}

	public String getBccList() {
		return bccList;
	}

	public void setBccList(String bccList) {
		this.bccList = bccList;
	}

	public String getAttachementType() {
		return attachementType;
	}

	public void setAttachementType(String attachementType) {
		this.attachementType = attachementType;
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
