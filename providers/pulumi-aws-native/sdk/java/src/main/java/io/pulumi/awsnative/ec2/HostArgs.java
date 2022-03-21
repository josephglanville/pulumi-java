// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostArgs Empty = new HostArgs();

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     * 
     */
    @Import(name="autoPlacement")
      private final @Nullable Output<String> autoPlacement;

    public Output<String> getAutoPlacement() {
        return this.autoPlacement == null ? Output.empty() : this.autoPlacement;
    }

    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    @Import(name="availabilityZone", required=true)
      private final Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     * 
     */
    @Import(name="hostRecovery")
      private final @Nullable Output<String> hostRecovery;

    public Output<String> getHostRecovery() {
        return this.hostRecovery == null ? Output.empty() : this.hostRecovery;
    }

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType;
    }

    public HostArgs(
        @Nullable Output<String> autoPlacement,
        Output<String> availabilityZone,
        @Nullable Output<String> hostRecovery,
        Output<String> instanceType) {
        this.autoPlacement = autoPlacement;
        this.availabilityZone = Objects.requireNonNull(availabilityZone, "expected parameter 'availabilityZone' to be non-null");
        this.hostRecovery = hostRecovery;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
    }

    private HostArgs() {
        this.autoPlacement = Output.empty();
        this.availabilityZone = Output.empty();
        this.hostRecovery = Output.empty();
        this.instanceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoPlacement;
        private Output<String> availabilityZone;
        private @Nullable Output<String> hostRecovery;
        private Output<String> instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(HostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPlacement = defaults.autoPlacement;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.hostRecovery = defaults.hostRecovery;
    	      this.instanceType = defaults.instanceType;
        }

        public Builder autoPlacement(@Nullable Output<String> autoPlacement) {
            this.autoPlacement = autoPlacement;
            return this;
        }
        public Builder autoPlacement(@Nullable String autoPlacement) {
            this.autoPlacement = Output.ofNullable(autoPlacement);
            return this;
        }
        public Builder availabilityZone(Output<String> availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Output.of(Objects.requireNonNull(availabilityZone));
            return this;
        }
        public Builder hostRecovery(@Nullable Output<String> hostRecovery) {
            this.hostRecovery = hostRecovery;
            return this;
        }
        public Builder hostRecovery(@Nullable String hostRecovery) {
            this.hostRecovery = Output.ofNullable(hostRecovery);
            return this;
        }
        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }        public HostArgs build() {
            return new HostArgs(autoPlacement, availabilityZone, hostRecovery, instanceType);
        }
    }
}
