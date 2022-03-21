// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ProductSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProductSubscriptionArgs Empty = new ProductSubscriptionArgs();

    /**
     * The ARN of the product that generates findings that you want to import into Security Hub - see below.
     * 
     */
    @Import(name="productArn", required=true)
      private final Output<String> productArn;

    public Output<String> getProductArn() {
        return this.productArn;
    }

    public ProductSubscriptionArgs(Output<String> productArn) {
        this.productArn = Objects.requireNonNull(productArn, "expected parameter 'productArn' to be non-null");
    }

    private ProductSubscriptionArgs() {
        this.productArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> productArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productArn = defaults.productArn;
        }

        public Builder productArn(Output<String> productArn) {
            this.productArn = Objects.requireNonNull(productArn);
            return this;
        }
        public Builder productArn(String productArn) {
            this.productArn = Output.of(Objects.requireNonNull(productArn));
            return this;
        }        public ProductSubscriptionArgs build() {
            return new ProductSubscriptionArgs(productArn);
        }
    }
}
