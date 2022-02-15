// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeploymentInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentInstanceResponse Empty = new DeploymentInstanceResponse();

    @InputImport(name="discoveryStatus", required=true)
    private final String discoveryStatus;

    public String getDiscoveryStatus() {
        return this.discoveryStatus;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="reason", required=true)
    private final String reason;

    public String getReason() {
        return this.reason;
    }

    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public DeploymentInstanceResponse(
        String discoveryStatus,
        String name,
        String reason,
        String startTime,
        String status) {
        this.discoveryStatus = Objects.requireNonNull(discoveryStatus, "expected parameter 'discoveryStatus' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private DeploymentInstanceResponse() {
        this.discoveryStatus = null;
        this.name = null;
        this.reason = null;
        this.startTime = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String discoveryStatus;
        private String name;
        private String reason;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discoveryStatus = defaults.discoveryStatus;
    	      this.name = defaults.name;
    	      this.reason = defaults.reason;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder setDiscoveryStatus(String discoveryStatus) {
            this.discoveryStatus = Objects.requireNonNull(discoveryStatus);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public DeploymentInstanceResponse build() {
            return new DeploymentInstanceResponse(discoveryStatus, name, reason, startTime, status);
        }
    }
}