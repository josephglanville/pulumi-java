// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.TransitGatewayConnectOptionsArgs;
import io.pulumi.awsnative.ec2.inputs.TransitGatewayConnectTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayConnectArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayConnectArgs Empty = new TransitGatewayConnectArgs();

    /**
     * The Connect attachment options.
     * 
     */
    @Import(name="options", required=true)
      private final Output<TransitGatewayConnectOptionsArgs> options;

    public Output<TransitGatewayConnectOptionsArgs> getOptions() {
        return this.options;
    }

    /**
     * The tags for the attachment.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<TransitGatewayConnectTagArgs>> tags;

    public Output<List<TransitGatewayConnectTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The ID of the attachment from which the Connect attachment was created.
     * 
     */
    @Import(name="transportTransitGatewayAttachmentId", required=true)
      private final Output<String> transportTransitGatewayAttachmentId;

    public Output<String> getTransportTransitGatewayAttachmentId() {
        return this.transportTransitGatewayAttachmentId;
    }

    public TransitGatewayConnectArgs(
        Output<TransitGatewayConnectOptionsArgs> options,
        @Nullable Output<List<TransitGatewayConnectTagArgs>> tags,
        Output<String> transportTransitGatewayAttachmentId) {
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.tags = tags;
        this.transportTransitGatewayAttachmentId = Objects.requireNonNull(transportTransitGatewayAttachmentId, "expected parameter 'transportTransitGatewayAttachmentId' to be non-null");
    }

    private TransitGatewayConnectArgs() {
        this.options = Codegen.empty();
        this.tags = Codegen.empty();
        this.transportTransitGatewayAttachmentId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<TransitGatewayConnectOptionsArgs> options;
        private @Nullable Output<List<TransitGatewayConnectTagArgs>> tags;
        private Output<String> transportTransitGatewayAttachmentId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayConnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.tags = defaults.tags;
    	      this.transportTransitGatewayAttachmentId = defaults.transportTransitGatewayAttachmentId;
        }

        public Builder options(Output<TransitGatewayConnectOptionsArgs> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(TransitGatewayConnectOptionsArgs options) {
            this.options = Output.of(Objects.requireNonNull(options));
            return this;
        }
        public Builder tags(@Nullable Output<List<TransitGatewayConnectTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<TransitGatewayConnectTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(TransitGatewayConnectTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder transportTransitGatewayAttachmentId(Output<String> transportTransitGatewayAttachmentId) {
            this.transportTransitGatewayAttachmentId = Objects.requireNonNull(transportTransitGatewayAttachmentId);
            return this;
        }
        public Builder transportTransitGatewayAttachmentId(String transportTransitGatewayAttachmentId) {
            this.transportTransitGatewayAttachmentId = Output.of(Objects.requireNonNull(transportTransitGatewayAttachmentId));
            return this;
        }        public TransitGatewayConnectArgs build() {
            return new TransitGatewayConnectArgs(options, tags, transportTransitGatewayAttachmentId);
        }
    }
}
