// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebACLAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLAssociationArgs Empty = new WebACLAssociationArgs();

    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    @Import(name="webACLArn", required=true)
      private final Output<String> webACLArn;

    public Output<String> getWebACLArn() {
        return this.webACLArn;
    }

    public WebACLAssociationArgs(
        Output<String> resourceArn,
        Output<String> webACLArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.webACLArn = Objects.requireNonNull(webACLArn, "expected parameter 'webACLArn' to be non-null");
    }

    private WebACLAssociationArgs() {
        this.resourceArn = Output.empty();
        this.webACLArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceArn;
        private Output<String> webACLArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webACLArn = defaults.webACLArn;
        }

        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public Builder webACLArn(Output<String> webACLArn) {
            this.webACLArn = Objects.requireNonNull(webACLArn);
            return this;
        }
        public Builder webACLArn(String webACLArn) {
            this.webACLArn = Output.of(Objects.requireNonNull(webACLArn));
            return this;
        }        public WebACLAssociationArgs build() {
            return new WebACLAssociationArgs(resourceArn, webACLArn);
        }
    }
}
