// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceGetArgs Empty = new InstanceNetworkInterfaceGetArgs();

    /**
     * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
     * 
     */
    @Import(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Output.empty() : this.deleteOnTermination;
    }

    /**
     * Integer index of the network interface attachment. Limited by instance type.
     * 
     */
    @Import(name="deviceIndex", required=true)
      private final Output<Integer> deviceIndex;

    public Output<Integer> getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * ID of the network interface to attach.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
      private final Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public InstanceNetworkInterfaceGetArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        Output<Integer> deviceIndex,
        Output<String> networkInterfaceId) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceIndex = Objects.requireNonNull(deviceIndex, "expected parameter 'deviceIndex' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
    }

    private InstanceNetworkInterfaceGetArgs() {
        this.deleteOnTermination = Output.empty();
        this.deviceIndex = Output.empty();
        this.networkInterfaceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private Output<Integer> deviceIndex;
        private Output<String> networkInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Output.ofNullable(deleteOnTermination);
            return this;
        }
        public Builder deviceIndex(Output<Integer> deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        public Builder deviceIndex(Integer deviceIndex) {
            this.deviceIndex = Output.of(Objects.requireNonNull(deviceIndex));
            return this;
        }
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Output.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }        public InstanceNetworkInterfaceGetArgs build() {
            return new InstanceNetworkInterfaceGetArgs(deleteOnTermination, deviceIndex, networkInterfaceId);
        }
    }
}