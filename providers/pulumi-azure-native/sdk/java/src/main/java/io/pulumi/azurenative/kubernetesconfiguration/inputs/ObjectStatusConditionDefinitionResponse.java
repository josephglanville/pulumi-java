// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Status condition of Kubernetes object
 * 
 */
public final class ObjectStatusConditionDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObjectStatusConditionDefinitionResponse Empty = new ObjectStatusConditionDefinitionResponse();

    /**
     * Last time this status condition has changed
     * 
     */
    @Import(name="lastTransitionTime")
      private final @Nullable String lastTransitionTime;

    public Optional<String> getLastTransitionTime() {
        return this.lastTransitionTime == null ? Optional.empty() : Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * A more verbose description of the object status condition
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Reason for the specified status condition type status
     * 
     */
    @Import(name="reason")
      private final @Nullable String reason;

    public Optional<String> getReason() {
        return this.reason == null ? Optional.empty() : Optional.ofNullable(this.reason);
    }

    /**
     * Status of the Kubernetes object condition type
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Object status condition type for this object
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ObjectStatusConditionDefinitionResponse(
        @Nullable String lastTransitionTime,
        @Nullable String message,
        @Nullable String reason,
        @Nullable String status,
        @Nullable String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    private ObjectStatusConditionDefinitionResponse() {
        this.lastTransitionTime = null;
        this.message = null;
        this.reason = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectStatusConditionDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable String status;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectStatusConditionDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ObjectStatusConditionDefinitionResponse build() {
            return new ObjectStatusConditionDefinitionResponse(lastTransitionTime, message, reason, status, type);
        }
    }
}
