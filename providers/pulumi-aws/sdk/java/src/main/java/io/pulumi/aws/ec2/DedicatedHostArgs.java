// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedHostArgs extends io.pulumi.resources.ResourceArgs {

    public static final DedicatedHostArgs Empty = new DedicatedHostArgs();

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
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
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    @Import(name="hostRecovery")
      private final @Nullable Output<String> hostRecovery;

    public Output<String> getHostRecovery() {
        return this.hostRecovery == null ? Output.empty() : this.hostRecovery;
    }

    /**
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @Import(name="instanceFamily")
      private final @Nullable Output<String> instanceFamily;

    public Output<String> getInstanceFamily() {
        return this.instanceFamily == null ? Output.empty() : this.instanceFamily;
    }

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DedicatedHostArgs(
        @Nullable Output<String> autoPlacement,
        Output<String> availabilityZone,
        @Nullable Output<String> hostRecovery,
        @Nullable Output<String> instanceFamily,
        @Nullable Output<String> instanceType,
        @Nullable Output<Map<String,String>> tags) {
        this.autoPlacement = autoPlacement;
        this.availabilityZone = Objects.requireNonNull(availabilityZone, "expected parameter 'availabilityZone' to be non-null");
        this.hostRecovery = hostRecovery;
        this.instanceFamily = instanceFamily;
        this.instanceType = instanceType;
        this.tags = tags;
    }

    private DedicatedHostArgs() {
        this.autoPlacement = Output.empty();
        this.availabilityZone = Output.empty();
        this.hostRecovery = Output.empty();
        this.instanceFamily = Output.empty();
        this.instanceType = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoPlacement;
        private Output<String> availabilityZone;
        private @Nullable Output<String> hostRecovery;
        private @Nullable Output<String> instanceFamily;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPlacement = defaults.autoPlacement;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.hostRecovery = defaults.hostRecovery;
    	      this.instanceFamily = defaults.instanceFamily;
    	      this.instanceType = defaults.instanceType;
    	      this.tags = defaults.tags;
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
        public Builder instanceFamily(@Nullable Output<String> instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }
        public Builder instanceFamily(@Nullable String instanceFamily) {
            this.instanceFamily = Output.ofNullable(instanceFamily);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public DedicatedHostArgs build() {
            return new DedicatedHostArgs(autoPlacement, availabilityZone, hostRecovery, instanceFamily, instanceType, tags);
        }
    }
}
