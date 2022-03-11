// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageBuilderAccessEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageBuilderAccessEndpointArgs Empty = new ImageBuilderAccessEndpointArgs();

    /**
     * Type of interface endpoint.
     * 
     */
    @InputImport(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * Identifier (ID) of the VPC in which the interface endpoint is used.
     * 
     */
    @InputImport(name="vpceId")
      private final @Nullable Output<String> vpceId;

    public Output<String> getVpceId() {
        return this.vpceId == null ? Output.empty() : this.vpceId;
    }

    public ImageBuilderAccessEndpointArgs(
        Output<String> endpointType,
        @Nullable Output<String> vpceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.vpceId = vpceId;
    }

    private ImageBuilderAccessEndpointArgs() {
        this.endpointType = Output.empty();
        this.vpceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderAccessEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpointType;
        private @Nullable Output<String> vpceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageBuilderAccessEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.vpceId = defaults.vpceId;
        }

        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder vpceId(@Nullable Output<String> vpceId) {
            this.vpceId = vpceId;
            return this;
        }

        public Builder vpceId(@Nullable String vpceId) {
            this.vpceId = Output.ofNullable(vpceId);
            return this;
        }
        public ImageBuilderAccessEndpointArgs build() {
            return new ImageBuilderAccessEndpointArgs(endpointType, vpceId);
        }
    }
}
