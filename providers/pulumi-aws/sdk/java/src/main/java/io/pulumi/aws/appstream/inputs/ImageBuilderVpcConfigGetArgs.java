// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageBuilderVpcConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageBuilderVpcConfigGetArgs Empty = new ImageBuilderVpcConfigGetArgs();

    /**
     * Identifiers of the security groups for the image builder or image builder.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Codegen.empty() : this.securityGroupIds;
    }

    /**
     * Identifiers of the subnets to which a network interface is attached from the image builder instance or image builder instance.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    public ImageBuilderVpcConfigGetArgs(
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<List<String>> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    private ImageBuilderVpcConfigGetArgs() {
        this.securityGroupIds = Codegen.empty();
        this.subnetIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderVpcConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageBuilderVpcConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Codegen.ofNullable(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }        public ImageBuilderVpcConfigGetArgs build() {
            return new ImageBuilderVpcConfigGetArgs(securityGroupIds, subnetIds);
        }
    }
}
