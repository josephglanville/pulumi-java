// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WebAclAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclAssociationArgs Empty = new WebAclAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
     * 
     */
    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    @Import(name="webAclArn", required=true)
      private final Output<String> webAclArn;

    public Output<String> getWebAclArn() {
        return this.webAclArn;
    }

    public WebAclAssociationArgs(
        Output<String> resourceArn,
        Output<String> webAclArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.webAclArn = Objects.requireNonNull(webAclArn, "expected parameter 'webAclArn' to be non-null");
    }

    private WebAclAssociationArgs() {
        this.resourceArn = Codegen.empty();
        this.webAclArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceArn;
        private Output<String> webAclArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webAclArn = defaults.webAclArn;
        }

        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public Builder webAclArn(Output<String> webAclArn) {
            this.webAclArn = Objects.requireNonNull(webAclArn);
            return this;
        }
        public Builder webAclArn(String webAclArn) {
            this.webAclArn = Output.of(Objects.requireNonNull(webAclArn));
            return this;
        }        public WebAclAssociationArgs build() {
            return new WebAclAssociationArgs(resourceArn, webAclArn);
        }
    }
}
