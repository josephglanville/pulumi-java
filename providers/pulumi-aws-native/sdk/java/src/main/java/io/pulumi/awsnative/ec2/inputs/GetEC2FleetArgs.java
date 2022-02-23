// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEC2FleetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEC2FleetArgs Empty = new GetEC2FleetArgs();

    @InputImport(name="fleetId", required=true)
      private final String fleetId;

    public String getFleetId() {
        return this.fleetId;
    }

    public GetEC2FleetArgs(String fleetId) {
        this.fleetId = Objects.requireNonNull(fleetId, "expected parameter 'fleetId' to be non-null");
    }

    private GetEC2FleetArgs() {
        this.fleetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEC2FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEC2FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetId = defaults.fleetId;
        }

        public Builder setFleetId(String fleetId) {
            this.fleetId = Objects.requireNonNull(fleetId);
            return this;
        }
        public GetEC2FleetArgs build() {
            return new GetEC2FleetArgs(fleetId);
        }
    }
}
