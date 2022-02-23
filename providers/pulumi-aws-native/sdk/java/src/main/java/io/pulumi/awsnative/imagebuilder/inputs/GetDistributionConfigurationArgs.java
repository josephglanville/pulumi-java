// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDistributionConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationArgs Empty = new GetDistributionConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @InputImport(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetDistributionConfigurationArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetDistributionConfigurationArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetDistributionConfigurationArgs build() {
            return new GetDistributionConfigurationArgs(arn);
        }
    }
}
