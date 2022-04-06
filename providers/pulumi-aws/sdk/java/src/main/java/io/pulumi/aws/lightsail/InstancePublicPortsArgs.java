// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstancePublicPortsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstancePublicPortsArgs Empty = new InstancePublicPortsArgs();

    /**
     * Name of the Lightsail Instance.
     * 
     */
    @Import(name="instanceName", required=true)
      private final Output<String> instanceName;

    public Output<String> getInstanceName() {
        return this.instanceName;
    }

    /**
     * Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
     * 
     */
    @Import(name="portInfos", required=true)
      private final Output<List<InstancePublicPortsPortInfoArgs>> portInfos;

    public Output<List<InstancePublicPortsPortInfoArgs>> getPortInfos() {
        return this.portInfos;
    }

    public InstancePublicPortsArgs(
        Output<String> instanceName,
        Output<List<InstancePublicPortsPortInfoArgs>> portInfos) {
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.portInfos = Objects.requireNonNull(portInfos, "expected parameter 'portInfos' to be non-null");
    }

    private InstancePublicPortsArgs() {
        this.instanceName = Output.empty();
        this.portInfos = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePublicPortsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceName;
        private Output<List<InstancePublicPortsPortInfoArgs>> portInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePublicPortsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.portInfos = defaults.portInfos;
        }

        public Builder instanceName(Output<String> instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Output.of(Objects.requireNonNull(instanceName));
            return this;
        }
        public Builder portInfos(Output<List<InstancePublicPortsPortInfoArgs>> portInfos) {
            this.portInfos = Objects.requireNonNull(portInfos);
            return this;
        }
        public Builder portInfos(List<InstancePublicPortsPortInfoArgs> portInfos) {
            this.portInfos = Output.of(Objects.requireNonNull(portInfos));
            return this;
        }
        public Builder portInfos(InstancePublicPortsPortInfoArgs... portInfos) {
            return portInfos(List.of(portInfos));
        }        public InstancePublicPortsArgs build() {
            return new InstancePublicPortsArgs(instanceName, portInfos);
        }
    }
}