// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigQueryStringsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginRequestPolicyQueryStringsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyQueryStringsConfigGetArgs Empty = new OriginRequestPolicyQueryStringsConfigGetArgs();

    @InputImport(name="queryStringBehavior", required=true)
      private final Output<String> queryStringBehavior;

    public Output<String> getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    @InputImport(name="queryStrings")
      private final @Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsGetArgs> queryStrings;

    public Output<OriginRequestPolicyQueryStringsConfigQueryStringsGetArgs> getQueryStrings() {
        return this.queryStrings == null ? Output.empty() : this.queryStrings;
    }

    public OriginRequestPolicyQueryStringsConfigGetArgs(
        Output<String> queryStringBehavior,
        @Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsGetArgs> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
        this.queryStrings = queryStrings;
    }

    private OriginRequestPolicyQueryStringsConfigGetArgs() {
        this.queryStringBehavior = Output.empty();
        this.queryStrings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyQueryStringsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> queryStringBehavior;
        private @Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsGetArgs> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyQueryStringsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(Output<String> queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Output.of(Objects.requireNonNull(queryStringBehavior));
            return this;
        }

        public Builder queryStrings(@Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsGetArgs> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder queryStrings(@Nullable OriginRequestPolicyQueryStringsConfigQueryStringsGetArgs queryStrings) {
            this.queryStrings = Output.ofNullable(queryStrings);
            return this;
        }
        public OriginRequestPolicyQueryStringsConfigGetArgs build() {
            return new OriginRequestPolicyQueryStringsConfigGetArgs(queryStringBehavior, queryStrings);
        }
    }
}
