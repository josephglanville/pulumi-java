// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationReplayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationReplayArgs Empty = new GetOrganizationReplayArgs();

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    @Import(name="replayId", required=true)
      private final String replayId;

    public String getReplayId() {
        return this.replayId;
    }

    public GetOrganizationReplayArgs(
        String location,
        String organizationId,
        String replayId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.replayId = Objects.requireNonNull(replayId, "expected parameter 'replayId' to be non-null");
    }

    private GetOrganizationReplayArgs() {
        this.location = null;
        this.organizationId = null;
        this.replayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String organizationId;
        private String replayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationReplayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.organizationId = defaults.organizationId;
    	      this.replayId = defaults.replayId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder replayId(String replayId) {
            this.replayId = Objects.requireNonNull(replayId);
            return this;
        }        public GetOrganizationReplayArgs build() {
            return new GetOrganizationReplayArgs(location, organizationId, replayId);
        }
    }
}
