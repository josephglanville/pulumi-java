// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.OptionsPropertiesArgs;
import io.pulumi.awsnative.ec2.inputs.TransitGatewayVpcAttachmentTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayVpcAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayVpcAttachmentArgs Empty = new TransitGatewayVpcAttachmentArgs();

    @InputImport(name="addSubnetIds")
      private final @Nullable Input<List<String>> addSubnetIds;

    public Input<List<String>> getAddSubnetIds() {
        return this.addSubnetIds == null ? Input.empty() : this.addSubnetIds;
    }

    /**
     * The options for the transit gateway vpc attachment.
     * 
     */
    @InputImport(name="options")
      private final @Nullable Input<OptionsPropertiesArgs> options;

    public Input<OptionsPropertiesArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    @InputImport(name="removeSubnetIds")
      private final @Nullable Input<List<String>> removeSubnetIds;

    public Input<List<String>> getRemoveSubnetIds() {
        return this.removeSubnetIds == null ? Input.empty() : this.removeSubnetIds;
    }

    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<TransitGatewayVpcAttachmentTagArgs>> tags;

    public Input<List<TransitGatewayVpcAttachmentTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="transitGatewayId")
      private final @Nullable Input<String> transitGatewayId;

    public Input<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Input.empty() : this.transitGatewayId;
    }

    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public TransitGatewayVpcAttachmentArgs(
        @Nullable Input<List<String>> addSubnetIds,
        @Nullable Input<OptionsPropertiesArgs> options,
        @Nullable Input<List<String>> removeSubnetIds,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<List<TransitGatewayVpcAttachmentTagArgs>> tags,
        @Nullable Input<String> transitGatewayId,
        @Nullable Input<String> vpcId) {
        this.addSubnetIds = addSubnetIds;
        this.options = options;
        this.removeSubnetIds = removeSubnetIds;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
        this.vpcId = vpcId;
    }

    private TransitGatewayVpcAttachmentArgs() {
        this.addSubnetIds = Input.empty();
        this.options = Input.empty();
        this.removeSubnetIds = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.transitGatewayId = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayVpcAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addSubnetIds;
        private @Nullable Input<OptionsPropertiesArgs> options;
        private @Nullable Input<List<String>> removeSubnetIds;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<List<TransitGatewayVpcAttachmentTagArgs>> tags;
        private @Nullable Input<String> transitGatewayId;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayVpcAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addSubnetIds = defaults.addSubnetIds;
    	      this.options = defaults.options;
    	      this.removeSubnetIds = defaults.removeSubnetIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAddSubnetIds(@Nullable Input<List<String>> addSubnetIds) {
            this.addSubnetIds = addSubnetIds;
            return this;
        }

        public Builder setAddSubnetIds(@Nullable List<String> addSubnetIds) {
            this.addSubnetIds = Input.ofNullable(addSubnetIds);
            return this;
        }

        public Builder setOptions(@Nullable Input<OptionsPropertiesArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable OptionsPropertiesArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setRemoveSubnetIds(@Nullable Input<List<String>> removeSubnetIds) {
            this.removeSubnetIds = removeSubnetIds;
            return this;
        }

        public Builder setRemoveSubnetIds(@Nullable List<String> removeSubnetIds) {
            this.removeSubnetIds = Input.ofNullable(removeSubnetIds);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public Builder setTags(@Nullable Input<List<TransitGatewayVpcAttachmentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TransitGatewayVpcAttachmentTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTransitGatewayId(@Nullable Input<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder setTransitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Input.ofNullable(transitGatewayId);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public TransitGatewayVpcAttachmentArgs build() {
            return new TransitGatewayVpcAttachmentArgs(addSubnetIds, options, removeSubnetIds, subnetIds, tags, transitGatewayId, vpcId);
        }
    }
}
