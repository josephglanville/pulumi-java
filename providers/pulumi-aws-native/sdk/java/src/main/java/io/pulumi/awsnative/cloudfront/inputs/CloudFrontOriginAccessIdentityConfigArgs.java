// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CloudFrontOriginAccessIdentityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudFrontOriginAccessIdentityConfigArgs Empty = new CloudFrontOriginAccessIdentityConfigArgs();

    @InputImport(name="comment", required=true)
      private final Output<String> comment;

    public Output<String> getComment() {
        return this.comment;
    }

    public CloudFrontOriginAccessIdentityConfigArgs(Output<String> comment) {
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
    }

    private CloudFrontOriginAccessIdentityConfigArgs() {
        this.comment = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFrontOriginAccessIdentityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comment;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFrontOriginAccessIdentityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
        }

        public Builder comment(Output<String> comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder comment(String comment) {
            this.comment = Output.of(Objects.requireNonNull(comment));
            return this;
        }
        public CloudFrontOriginAccessIdentityConfigArgs build() {
            return new CloudFrontOriginAccessIdentityConfigArgs(comment);
        }
    }
}
