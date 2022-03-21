// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines a status condition for a resource.
 * 
 */
public final class GoogleCloudRunOpV2ConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2ConditionResponse Empty = new GoogleCloudRunOpV2ConditionResponse();

    /**
     * A reason for the domain mapping condition.
     * 
     */
    @Import(name="domainMappingReason", required=true)
      private final String domainMappingReason;

    public String getDomainMappingReason() {
        return this.domainMappingReason;
    }

    /**
     * A reason for the execution condition.
     * 
     */
    @Import(name="executionReason", required=true)
      private final String executionReason;

    public String getExecutionReason() {
        return this.executionReason;
    }

    /**
     * A reason for the internal condition.
     * 
     */
    @Import(name="internalReason", required=true)
      private final String internalReason;

    public String getInternalReason() {
        return this.internalReason;
    }

    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime", required=true)
      private final String lastTransitionTime;

    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    /**
     * Human readable message indicating details about the current status.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * A common (service-level) reason for this condition.
     * 
     */
    @Import(name="reason", required=true)
      private final String reason;

    public String getReason() {
        return this.reason;
    }

    /**
     * A reason for the revision condition.
     * 
     */
    @Import(name="revisionReason", required=true)
      private final String revisionReason;

    public String getRevisionReason() {
        return this.revisionReason;
    }

    /**
     * How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    @Import(name="severity", required=true)
      private final String severity;

    public String getSeverity() {
        return this.severity;
    }

    /**
     * State of the condition.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * "Ready": True when the Resource is ready.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudRunOpV2ConditionResponse(
        String domainMappingReason,
        String executionReason,
        String internalReason,
        String lastTransitionTime,
        String message,
        String reason,
        String revisionReason,
        String severity,
        String state,
        String type) {
        this.domainMappingReason = Objects.requireNonNull(domainMappingReason, "expected parameter 'domainMappingReason' to be non-null");
        this.executionReason = Objects.requireNonNull(executionReason, "expected parameter 'executionReason' to be non-null");
        this.internalReason = Objects.requireNonNull(internalReason, "expected parameter 'internalReason' to be non-null");
        this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime, "expected parameter 'lastTransitionTime' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.revisionReason = Objects.requireNonNull(revisionReason, "expected parameter 'revisionReason' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudRunOpV2ConditionResponse() {
        this.domainMappingReason = null;
        this.executionReason = null;
        this.internalReason = null;
        this.lastTransitionTime = null;
        this.message = null;
        this.reason = null;
        this.revisionReason = null;
        this.severity = null;
        this.state = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainMappingReason;
        private String executionReason;
        private String internalReason;
        private String lastTransitionTime;
        private String message;
        private String reason;
        private String revisionReason;
        private String severity;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainMappingReason = defaults.domainMappingReason;
    	      this.executionReason = defaults.executionReason;
    	      this.internalReason = defaults.internalReason;
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.revisionReason = defaults.revisionReason;
    	      this.severity = defaults.severity;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder domainMappingReason(String domainMappingReason) {
            this.domainMappingReason = Objects.requireNonNull(domainMappingReason);
            return this;
        }
        public Builder executionReason(String executionReason) {
            this.executionReason = Objects.requireNonNull(executionReason);
            return this;
        }
        public Builder internalReason(String internalReason) {
            this.internalReason = Objects.requireNonNull(internalReason);
            return this;
        }
        public Builder lastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder revisionReason(String revisionReason) {
            this.revisionReason = Objects.requireNonNull(revisionReason);
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudRunOpV2ConditionResponse build() {
            return new GoogleCloudRunOpV2ConditionResponse(domainMappingReason, executionReason, internalReason, lastTransitionTime, message, reason, revisionReason, severity, state, type);
        }
    }
}
