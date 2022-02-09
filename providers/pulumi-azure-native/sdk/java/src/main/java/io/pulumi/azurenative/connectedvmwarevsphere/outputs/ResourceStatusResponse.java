// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceStatusResponse {
    private final String lastUpdatedAt;
    private final String message;
    private final String reason;
    private final String severity;
    private final String status;
    private final String type;

    @OutputCustomType.Constructor({"lastUpdatedAt","message","reason","severity","status","type"})
    private ResourceStatusResponse(
        String lastUpdatedAt,
        String message,
        String reason,
        String severity,
        String status,
        String type) {
        this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt);
        this.message = Objects.requireNonNull(message);
        this.reason = Objects.requireNonNull(reason);
        this.severity = Objects.requireNonNull(severity);
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    public String getMessage() {
        return this.message;
    }
    public String getReason() {
        return this.reason;
    }
    public String getSeverity() {
        return this.severity;
    }
    public String getStatus() {
        return this.status;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdatedAt;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = Objects.requireNonNull(lastUpdatedAt);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ResourceStatusResponse build() {
            return new ResourceStatusResponse(lastUpdatedAt, message, reason, severity, status, type);
        }
    }
}
