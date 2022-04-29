// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OperatorAccessControl.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAccessRequestResult {
    /**
     * @return Summary comment by the operator creating the access request.
     * 
     */
    private final String accessReasonSummary;
    private final String accessRequestId;
    /**
     * @return List of operator actions for which approval is sought by the operator user.
     * 
     */
    private final List<String> actionRequestsLists;
    /**
     * @return The last recent Comment entered by the approver of the request.
     * 
     */
    private final String approverComment;
    /**
     * @return Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.  By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,  in addition to command level logging, key strokes are also logged.
     * 
     */
    private final List<String> auditTypes;
    /**
     * @return The comment entered by the operator while closing the request.
     * 
     */
    private final String closureComment;
    /**
     * @return The OCID of the compartment that contains the access request.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Duration in hours for which access is sought on the target resource.
     * 
     */
    private final Integer duration;
    /**
     * @return Duration in hours for which extension access is sought on the target resource.
     * 
     */
    private final Integer extendDuration;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Whether the access request was automatically approved.
     * 
     */
    private final Boolean isAutoApproved;
    /**
     * @return Additional message specific to the access request that can be specified by the approver at the time of approval.
     * 
     */
    private final String opctlAdditionalMessage;
    /**
     * @return The OCID of the operator control governing the target resource.
     * 
     */
    private final String opctlId;
    /**
     * @return Name of the Operator control governing the target resource.
     * 
     */
    private final String opctlName;
    /**
     * @return A unique identifier associated with the operator who raised the request. This identifier can not be used directly to identify the operator. You need to provide this identifier if you would like Oracle to provide additional information about the operator action within Oracle tenancy.
     * 
     */
    private final String operatorId;
    /**
     * @return Summary reason for which the operator is requesting access on the target resource.
     * 
     */
    private final String reason;
    /**
     * @return This is an automatic identifier generated by the system which is easier for human comprehension.
     * 
     */
    private final String requestId;
    /**
     * @return The OCID of the target resource associated with the access request. The operator raises an access request to get approval to  access the target resource.
     * 
     */
    private final String resourceId;
    /**
     * @return The name of the target resource.
     * 
     */
    private final String resourceName;
    /**
     * @return resourceType for which the AccessRequest is applicable
     * 
     */
    private final String resourceType;
    /**
     * @return Priority assigned to the access request by the operator
     * 
     */
    private final String severity;
    /**
     * @return The current state of the AccessRequest.
     * 
     */
    private final String state;
    /**
     * @return System message that will be displayed to the operator at login to the target resource.
     * 
     */
    private final String systemMessage;
    /**
     * @return Time when the access request was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    private final String timeOfCreation;
    /**
     * @return Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    private final String timeOfModification;
    /**
     * @return The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    private final String timeOfUserCreation;
    /**
     * @return The OCID of the user that last modified the access request.
     * 
     */
    private final String userId;
    /**
     * @return The OCID of the workflow associated with the access request. This is needed if you want to contact Oracle Support for a stuck access request or for an access request that encounters an internal error.
     * 
     */
    private final List<String> workflowIds;

    @CustomType.Constructor
    private GetAccessRequestResult(
        @CustomType.Parameter("accessReasonSummary") String accessReasonSummary,
        @CustomType.Parameter("accessRequestId") String accessRequestId,
        @CustomType.Parameter("actionRequestsLists") List<String> actionRequestsLists,
        @CustomType.Parameter("approverComment") String approverComment,
        @CustomType.Parameter("auditTypes") List<String> auditTypes,
        @CustomType.Parameter("closureComment") String closureComment,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("duration") Integer duration,
        @CustomType.Parameter("extendDuration") Integer extendDuration,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAutoApproved") Boolean isAutoApproved,
        @CustomType.Parameter("opctlAdditionalMessage") String opctlAdditionalMessage,
        @CustomType.Parameter("opctlId") String opctlId,
        @CustomType.Parameter("opctlName") String opctlName,
        @CustomType.Parameter("operatorId") String operatorId,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("requestId") String requestId,
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("resourceName") String resourceName,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemMessage") String systemMessage,
        @CustomType.Parameter("timeOfCreation") String timeOfCreation,
        @CustomType.Parameter("timeOfModification") String timeOfModification,
        @CustomType.Parameter("timeOfUserCreation") String timeOfUserCreation,
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("workflowIds") List<String> workflowIds) {
        this.accessReasonSummary = accessReasonSummary;
        this.accessRequestId = accessRequestId;
        this.actionRequestsLists = actionRequestsLists;
        this.approverComment = approverComment;
        this.auditTypes = auditTypes;
        this.closureComment = closureComment;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.duration = duration;
        this.extendDuration = extendDuration;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isAutoApproved = isAutoApproved;
        this.opctlAdditionalMessage = opctlAdditionalMessage;
        this.opctlId = opctlId;
        this.opctlName = opctlName;
        this.operatorId = operatorId;
        this.reason = reason;
        this.requestId = requestId;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.severity = severity;
        this.state = state;
        this.systemMessage = systemMessage;
        this.timeOfCreation = timeOfCreation;
        this.timeOfModification = timeOfModification;
        this.timeOfUserCreation = timeOfUserCreation;
        this.userId = userId;
        this.workflowIds = workflowIds;
    }

    /**
     * @return Summary comment by the operator creating the access request.
     * 
     */
    public String accessReasonSummary() {
        return this.accessReasonSummary;
    }
    public String accessRequestId() {
        return this.accessRequestId;
    }
    /**
     * @return List of operator actions for which approval is sought by the operator user.
     * 
     */
    public List<String> actionRequestsLists() {
        return this.actionRequestsLists;
    }
    /**
     * @return The last recent Comment entered by the approver of the request.
     * 
     */
    public String approverComment() {
        return this.approverComment;
    }
    /**
     * @return Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.  By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,  in addition to command level logging, key strokes are also logged.
     * 
     */
    public List<String> auditTypes() {
        return this.auditTypes;
    }
    /**
     * @return The comment entered by the operator while closing the request.
     * 
     */
    public String closureComment() {
        return this.closureComment;
    }
    /**
     * @return The OCID of the compartment that contains the access request.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Duration in hours for which access is sought on the target resource.
     * 
     */
    public Integer duration() {
        return this.duration;
    }
    /**
     * @return Duration in hours for which extension access is sought on the target resource.
     * 
     */
    public Integer extendDuration() {
        return this.extendDuration;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the access request was automatically approved.
     * 
     */
    public Boolean isAutoApproved() {
        return this.isAutoApproved;
    }
    /**
     * @return Additional message specific to the access request that can be specified by the approver at the time of approval.
     * 
     */
    public String opctlAdditionalMessage() {
        return this.opctlAdditionalMessage;
    }
    /**
     * @return The OCID of the operator control governing the target resource.
     * 
     */
    public String opctlId() {
        return this.opctlId;
    }
    /**
     * @return Name of the Operator control governing the target resource.
     * 
     */
    public String opctlName() {
        return this.opctlName;
    }
    /**
     * @return A unique identifier associated with the operator who raised the request. This identifier can not be used directly to identify the operator. You need to provide this identifier if you would like Oracle to provide additional information about the operator action within Oracle tenancy.
     * 
     */
    public String operatorId() {
        return this.operatorId;
    }
    /**
     * @return Summary reason for which the operator is requesting access on the target resource.
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return This is an automatic identifier generated by the system which is easier for human comprehension.
     * 
     */
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The OCID of the target resource associated with the access request. The operator raises an access request to get approval to  access the target resource.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return The name of the target resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    /**
     * @return resourceType for which the AccessRequest is applicable
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return Priority assigned to the access request by the operator
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return The current state of the AccessRequest.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return System message that will be displayed to the operator at login to the target resource.
     * 
     */
    public String systemMessage() {
        return this.systemMessage;
    }
    /**
     * @return Time when the access request was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    public String timeOfCreation() {
        return this.timeOfCreation;
    }
    /**
     * @return Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    public String timeOfModification() {
        return this.timeOfModification;
    }
    /**
     * @return The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    public String timeOfUserCreation() {
        return this.timeOfUserCreation;
    }
    /**
     * @return The OCID of the user that last modified the access request.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return The OCID of the workflow associated with the access request. This is needed if you want to contact Oracle Support for a stuck access request or for an access request that encounters an internal error.
     * 
     */
    public List<String> workflowIds() {
        return this.workflowIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessRequestResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessReasonSummary;
        private String accessRequestId;
        private List<String> actionRequestsLists;
        private String approverComment;
        private List<String> auditTypes;
        private String closureComment;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private Integer duration;
        private Integer extendDuration;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isAutoApproved;
        private String opctlAdditionalMessage;
        private String opctlId;
        private String opctlName;
        private String operatorId;
        private String reason;
        private String requestId;
        private String resourceId;
        private String resourceName;
        private String resourceType;
        private String severity;
        private String state;
        private String systemMessage;
        private String timeOfCreation;
        private String timeOfModification;
        private String timeOfUserCreation;
        private String userId;
        private List<String> workflowIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessRequestResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessReasonSummary = defaults.accessReasonSummary;
    	      this.accessRequestId = defaults.accessRequestId;
    	      this.actionRequestsLists = defaults.actionRequestsLists;
    	      this.approverComment = defaults.approverComment;
    	      this.auditTypes = defaults.auditTypes;
    	      this.closureComment = defaults.closureComment;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.duration = defaults.duration;
    	      this.extendDuration = defaults.extendDuration;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isAutoApproved = defaults.isAutoApproved;
    	      this.opctlAdditionalMessage = defaults.opctlAdditionalMessage;
    	      this.opctlId = defaults.opctlId;
    	      this.opctlName = defaults.opctlName;
    	      this.operatorId = defaults.operatorId;
    	      this.reason = defaults.reason;
    	      this.requestId = defaults.requestId;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
    	      this.severity = defaults.severity;
    	      this.state = defaults.state;
    	      this.systemMessage = defaults.systemMessage;
    	      this.timeOfCreation = defaults.timeOfCreation;
    	      this.timeOfModification = defaults.timeOfModification;
    	      this.timeOfUserCreation = defaults.timeOfUserCreation;
    	      this.userId = defaults.userId;
    	      this.workflowIds = defaults.workflowIds;
        }

        public Builder accessReasonSummary(String accessReasonSummary) {
            this.accessReasonSummary = Objects.requireNonNull(accessReasonSummary);
            return this;
        }
        public Builder accessRequestId(String accessRequestId) {
            this.accessRequestId = Objects.requireNonNull(accessRequestId);
            return this;
        }
        public Builder actionRequestsLists(List<String> actionRequestsLists) {
            this.actionRequestsLists = Objects.requireNonNull(actionRequestsLists);
            return this;
        }
        public Builder actionRequestsLists(String... actionRequestsLists) {
            return actionRequestsLists(List.of(actionRequestsLists));
        }
        public Builder approverComment(String approverComment) {
            this.approverComment = Objects.requireNonNull(approverComment);
            return this;
        }
        public Builder auditTypes(List<String> auditTypes) {
            this.auditTypes = Objects.requireNonNull(auditTypes);
            return this;
        }
        public Builder auditTypes(String... auditTypes) {
            return auditTypes(List.of(auditTypes));
        }
        public Builder closureComment(String closureComment) {
            this.closureComment = Objects.requireNonNull(closureComment);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder duration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder extendDuration(Integer extendDuration) {
            this.extendDuration = Objects.requireNonNull(extendDuration);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = Objects.requireNonNull(isAutoApproved);
            return this;
        }
        public Builder opctlAdditionalMessage(String opctlAdditionalMessage) {
            this.opctlAdditionalMessage = Objects.requireNonNull(opctlAdditionalMessage);
            return this;
        }
        public Builder opctlId(String opctlId) {
            this.opctlId = Objects.requireNonNull(opctlId);
            return this;
        }
        public Builder opctlName(String opctlName) {
            this.opctlName = Objects.requireNonNull(opctlName);
            return this;
        }
        public Builder operatorId(String operatorId) {
            this.operatorId = Objects.requireNonNull(operatorId);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemMessage(String systemMessage) {
            this.systemMessage = Objects.requireNonNull(systemMessage);
            return this;
        }
        public Builder timeOfCreation(String timeOfCreation) {
            this.timeOfCreation = Objects.requireNonNull(timeOfCreation);
            return this;
        }
        public Builder timeOfModification(String timeOfModification) {
            this.timeOfModification = Objects.requireNonNull(timeOfModification);
            return this;
        }
        public Builder timeOfUserCreation(String timeOfUserCreation) {
            this.timeOfUserCreation = Objects.requireNonNull(timeOfUserCreation);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder workflowIds(List<String> workflowIds) {
            this.workflowIds = Objects.requireNonNull(workflowIds);
            return this;
        }
        public Builder workflowIds(String... workflowIds) {
            return workflowIds(List.of(workflowIds));
        }        public GetAccessRequestResult build() {
            return new GetAccessRequestResult(accessReasonSummary, accessRequestId, actionRequestsLists, approverComment, auditTypes, closureComment, compartmentId, definedTags, duration, extendDuration, freeformTags, id, isAutoApproved, opctlAdditionalMessage, opctlId, opctlName, operatorId, reason, requestId, resourceId, resourceName, resourceType, severity, state, systemMessage, timeOfCreation, timeOfModification, timeOfUserCreation, userId, workflowIds);
        }
    }
}
