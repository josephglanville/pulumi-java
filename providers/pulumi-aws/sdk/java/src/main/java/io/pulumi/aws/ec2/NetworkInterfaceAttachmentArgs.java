// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NetworkInterfaceAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceAttachmentArgs Empty = new NetworkInterfaceAttachmentArgs();

    /**
     * Network interface index (int).
     * 
     */
    @Import(name="deviceIndex", required=true)
      private final Output<Integer> deviceIndex;

    public Output<Integer> getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * Instance ID to attach.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * ENI ID to attach.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
      private final Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public NetworkInterfaceAttachmentArgs(
        Output<Integer> deviceIndex,
        Output<String> instanceId,
        Output<String> networkInterfaceId) {
        this.deviceIndex = Objects.requireNonNull(deviceIndex, "expected parameter 'deviceIndex' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
    }

    private NetworkInterfaceAttachmentArgs() {
        this.deviceIndex = Output.empty();
        this.instanceId = Output.empty();
        this.networkInterfaceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> deviceIndex;
        private Output<String> instanceId;
        private Output<String> networkInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.instanceId = defaults.instanceId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
        }

        public Builder deviceIndex(Output<Integer> deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        public Builder deviceIndex(Integer deviceIndex) {
            this.deviceIndex = Output.of(Objects.requireNonNull(deviceIndex));
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Output.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }        public NetworkInterfaceAttachmentArgs build() {
            return new NetworkInterfaceAttachmentArgs(deviceIndex, instanceId, networkInterfaceId);
        }
    }
}
