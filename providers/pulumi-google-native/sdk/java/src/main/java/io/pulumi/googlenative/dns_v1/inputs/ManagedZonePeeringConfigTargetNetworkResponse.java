// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePeeringConfigTargetNetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZonePeeringConfigTargetNetworkResponse Empty = new ManagedZonePeeringConfigTargetNetworkResponse();

    /**
     * The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
     */
    @Import(name="deactivateTime", required=true)
      private final String deactivateTime;

    public String getDeactivateTime() {
        return this.deactivateTime;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl", required=true)
      private final String networkUrl;

    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public ManagedZonePeeringConfigTargetNetworkResponse(
        String deactivateTime,
        String kind,
        String networkUrl) {
        this.deactivateTime = Objects.requireNonNull(deactivateTime, "expected parameter 'deactivateTime' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private ManagedZonePeeringConfigTargetNetworkResponse() {
        this.deactivateTime = null;
        this.kind = null;
        this.networkUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deactivateTime;
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deactivateTime = defaults.deactivateTime;
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder deactivateTime(String deactivateTime) {
            this.deactivateTime = Objects.requireNonNull(deactivateTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder networkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }        public ManagedZonePeeringConfigTargetNetworkResponse build() {
            return new ManagedZonePeeringConfigTargetNetworkResponse(deactivateTime, kind, networkUrl);
        }
    }
}
