// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class StaticIpAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticIpAttachmentArgs Empty = new StaticIpAttachmentArgs();

    /**
     * The name of the Lightsail instance to attach the IP to
     * 
     */
    @InputImport(name="instanceName", required=true)
      private final Output<String> instanceName;

    public Output<String> getInstanceName() {
        return this.instanceName;
    }

    /**
     * The name of the allocated static IP
     * 
     */
    @InputImport(name="staticIpName", required=true)
      private final Output<String> staticIpName;

    public Output<String> getStaticIpName() {
        return this.staticIpName;
    }

    public StaticIpAttachmentArgs(
        Output<String> instanceName,
        Output<String> staticIpName) {
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.staticIpName = Objects.requireNonNull(staticIpName, "expected parameter 'staticIpName' to be non-null");
    }

    private StaticIpAttachmentArgs() {
        this.instanceName = Output.empty();
        this.staticIpName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticIpAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceName;
        private Output<String> staticIpName;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticIpAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.staticIpName = defaults.staticIpName;
        }

        public Builder instanceName(Output<String> instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }

        public Builder instanceName(String instanceName) {
            this.instanceName = Output.of(Objects.requireNonNull(instanceName));
            return this;
        }

        public Builder staticIpName(Output<String> staticIpName) {
            this.staticIpName = Objects.requireNonNull(staticIpName);
            return this;
        }

        public Builder staticIpName(String staticIpName) {
            this.staticIpName = Output.of(Objects.requireNonNull(staticIpName));
            return this;
        }
        public StaticIpAttachmentArgs build() {
            return new StaticIpAttachmentArgs(instanceName, staticIpName);
        }
    }
}
