// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for attaching a VPC interface to an output.
 * 
 */
public final class FlowOutputVpcInterfaceAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowOutputVpcInterfaceAttachmentArgs Empty = new FlowOutputVpcInterfaceAttachmentArgs();

    /**
     * The name of the VPC interface to use for this output.
     * 
     */
    @Import(name="vpcInterfaceName")
      private final @Nullable Output<String> vpcInterfaceName;

    public Output<String> getVpcInterfaceName() {
        return this.vpcInterfaceName == null ? Output.empty() : this.vpcInterfaceName;
    }

    public FlowOutputVpcInterfaceAttachmentArgs(@Nullable Output<String> vpcInterfaceName) {
        this.vpcInterfaceName = vpcInterfaceName;
    }

    private FlowOutputVpcInterfaceAttachmentArgs() {
        this.vpcInterfaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowOutputVpcInterfaceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> vpcInterfaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowOutputVpcInterfaceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcInterfaceName = defaults.vpcInterfaceName;
        }

        public Builder vpcInterfaceName(@Nullable Output<String> vpcInterfaceName) {
            this.vpcInterfaceName = vpcInterfaceName;
            return this;
        }
        public Builder vpcInterfaceName(@Nullable String vpcInterfaceName) {
            this.vpcInterfaceName = Output.ofNullable(vpcInterfaceName);
            return this;
        }        public FlowOutputVpcInterfaceAttachmentArgs build() {
            return new FlowOutputVpcInterfaceAttachmentArgs(vpcInterfaceName);
        }
    }
}
