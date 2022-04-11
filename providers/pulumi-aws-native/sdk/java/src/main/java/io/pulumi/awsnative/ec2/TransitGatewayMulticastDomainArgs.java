// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.OptionsPropertiesArgs;
import io.pulumi.awsnative.ec2.inputs.TransitGatewayMulticastDomainTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayMulticastDomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayMulticastDomainArgs Empty = new TransitGatewayMulticastDomainArgs();

    /**
     * The options for the transit gateway multicast domain.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<OptionsPropertiesArgs> options;

    public Output<OptionsPropertiesArgs> getOptions() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * The tags for the transit gateway multicast domain.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<TransitGatewayMulticastDomainTagArgs>> tags;

    public Output<List<TransitGatewayMulticastDomainTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The ID of the transit gateway.
     * 
     */
    @Import(name="transitGatewayId", required=true)
      private final Output<String> transitGatewayId;

    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }

    public TransitGatewayMulticastDomainArgs(
        @Nullable Output<OptionsPropertiesArgs> options,
        @Nullable Output<List<TransitGatewayMulticastDomainTagArgs>> tags,
        Output<String> transitGatewayId) {
        this.options = options;
        this.tags = tags;
        this.transitGatewayId = Objects.requireNonNull(transitGatewayId, "expected parameter 'transitGatewayId' to be non-null");
    }

    private TransitGatewayMulticastDomainArgs() {
        this.options = Codegen.empty();
        this.tags = Codegen.empty();
        this.transitGatewayId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayMulticastDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OptionsPropertiesArgs> options;
        private @Nullable Output<List<TransitGatewayMulticastDomainTagArgs>> tags;
        private Output<String> transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayMulticastDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder options(@Nullable Output<OptionsPropertiesArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable OptionsPropertiesArgs options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder tags(@Nullable Output<List<TransitGatewayMulticastDomainTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<TransitGatewayMulticastDomainTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(TransitGatewayMulticastDomainTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder transitGatewayId(Output<String> transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }
        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Output.of(Objects.requireNonNull(transitGatewayId));
            return this;
        }        public TransitGatewayMulticastDomainArgs build() {
            return new TransitGatewayMulticastDomainArgs(options, tags, transitGatewayId);
        }
    }
}
