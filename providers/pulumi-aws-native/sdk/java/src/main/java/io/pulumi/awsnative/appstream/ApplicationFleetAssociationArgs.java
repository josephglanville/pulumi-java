// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationFleetAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationFleetAssociationArgs Empty = new ApplicationFleetAssociationArgs();

    @Import(name="applicationArn", required=true)
      private final Output<String> applicationArn;

    public Output<String> getApplicationArn() {
        return this.applicationArn;
    }

    @Import(name="fleetName", required=true)
      private final Output<String> fleetName;

    public Output<String> getFleetName() {
        return this.fleetName;
    }

    public ApplicationFleetAssociationArgs(
        Output<String> applicationArn,
        Output<String> fleetName) {
        this.applicationArn = Objects.requireNonNull(applicationArn, "expected parameter 'applicationArn' to be non-null");
        this.fleetName = Objects.requireNonNull(fleetName, "expected parameter 'fleetName' to be non-null");
    }

    private ApplicationFleetAssociationArgs() {
        this.applicationArn = Output.empty();
        this.fleetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationFleetAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationArn;
        private Output<String> fleetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationFleetAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationArn = defaults.applicationArn;
    	      this.fleetName = defaults.fleetName;
        }

        public Builder applicationArn(Output<String> applicationArn) {
            this.applicationArn = Objects.requireNonNull(applicationArn);
            return this;
        }
        public Builder applicationArn(String applicationArn) {
            this.applicationArn = Output.of(Objects.requireNonNull(applicationArn));
            return this;
        }
        public Builder fleetName(Output<String> fleetName) {
            this.fleetName = Objects.requireNonNull(fleetName);
            return this;
        }
        public Builder fleetName(String fleetName) {
            this.fleetName = Output.of(Objects.requireNonNull(fleetName));
            return this;
        }        public ApplicationFleetAssociationArgs build() {
            return new ApplicationFleetAssociationArgs(applicationArn, fleetName);
        }
    }
}
