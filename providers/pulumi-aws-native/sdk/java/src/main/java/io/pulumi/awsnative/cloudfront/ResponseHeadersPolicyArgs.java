// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class ResponseHeadersPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyArgs Empty = new ResponseHeadersPolicyArgs();

    @Import(name="responseHeadersPolicyConfig", required=true)
      private final Output<ResponseHeadersPolicyConfigArgs> responseHeadersPolicyConfig;

    public Output<ResponseHeadersPolicyConfigArgs> getResponseHeadersPolicyConfig() {
        return this.responseHeadersPolicyConfig;
    }

    public ResponseHeadersPolicyArgs(Output<ResponseHeadersPolicyConfigArgs> responseHeadersPolicyConfig) {
        this.responseHeadersPolicyConfig = Objects.requireNonNull(responseHeadersPolicyConfig, "expected parameter 'responseHeadersPolicyConfig' to be non-null");
    }

    private ResponseHeadersPolicyArgs() {
        this.responseHeadersPolicyConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ResponseHeadersPolicyConfigArgs> responseHeadersPolicyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.responseHeadersPolicyConfig = defaults.responseHeadersPolicyConfig;
        }

        public Builder responseHeadersPolicyConfig(Output<ResponseHeadersPolicyConfigArgs> responseHeadersPolicyConfig) {
            this.responseHeadersPolicyConfig = Objects.requireNonNull(responseHeadersPolicyConfig);
            return this;
        }
        public Builder responseHeadersPolicyConfig(ResponseHeadersPolicyConfigArgs responseHeadersPolicyConfig) {
            this.responseHeadersPolicyConfig = Output.of(Objects.requireNonNull(responseHeadersPolicyConfig));
            return this;
        }        public ResponseHeadersPolicyArgs build() {
            return new ResponseHeadersPolicyArgs(responseHeadersPolicyConfig);
        }
    }
}
