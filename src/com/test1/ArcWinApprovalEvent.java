package com.test1;

public class ArcWinApprovalEvent {
	private Integer seqId;
	private String eventName;
	private String eventDesc;
	private boolean isActive;
	private String eventType;
	private boolean autoTrigger;
	private String tiggerAfter;
	private String actonToTrigger;
	private String objectTypesToTrigger;
	private String incrementalEventType;
	private String scheduledEvent;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ArcWinApprovalEvent(Integer seqId, String eventName, String eventDesc, boolean isActive, String eventType,
			boolean autoTrigger, String tiggerAfter, String actonToTrigger, String objectTypesToTrigger,
			String incrementalEventType, String scheduledEvent, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.seqId = seqId;
		this.eventName = eventName;
		this.eventDesc = eventDesc;
		this.isActive = isActive;
		this.eventType = eventType;
		this.autoTrigger = autoTrigger;
		this.tiggerAfter = tiggerAfter;
		this.actonToTrigger = actonToTrigger;
		this.objectTypesToTrigger = objectTypesToTrigger;
		this.incrementalEventType = incrementalEventType;
		this.scheduledEvent = scheduledEvent;
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

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public boolean isAutoTrigger() {
		return autoTrigger;
	}

	public void setAutoTrigger(boolean autoTrigger) {
		this.autoTrigger = autoTrigger;
	}

	public String getTiggerAfter() {
		return tiggerAfter;
	}

	public void setTiggerAfter(String tiggerAfter) {
		this.tiggerAfter = tiggerAfter;
	}

	public String getActonToTrigger() {
		return actonToTrigger;
	}

	public void setActonToTrigger(String actonToTrigger) {
		this.actonToTrigger = actonToTrigger;
	}

	public String getObjectTypesToTrigger() {
		return objectTypesToTrigger;
	}

	public void setObjectTypesToTrigger(String objectTypesToTrigger) {
		this.objectTypesToTrigger = objectTypesToTrigger;
	}

	public String getIncrementalEventType() {
		return incrementalEventType;
	}

	public void setIncrementalEventType(String incrementalEventType) {
		this.incrementalEventType = incrementalEventType;
	}

	public String getScheduledEvent() {
		return scheduledEvent;
	}

	public void setScheduledEvent(String scheduledEvent) {
		this.scheduledEvent = scheduledEvent;
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
