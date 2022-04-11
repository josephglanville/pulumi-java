// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigQueryStringsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginRequestPolicyQueryStringsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyQueryStringsConfigArgs Empty = new OriginRequestPolicyQueryStringsConfigArgs();

    @Import(name="queryStringBehavior", required=true)
      private final Output<String> queryStringBehavior;

    public Output<String> getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    @Import(name="queryStrings")
      private final @Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs> queryStrings;

    public Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs> getQueryStrings() {
        return this.queryStrings == null ? Codegen.empty() : this.queryStrings;
    }

    public OriginRequestPolicyQueryStringsConfigArgs(
        Output<String> queryStringBehavior,
        @Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
        this.queryStrings = queryStrings;
    }

    private OriginRequestPolicyQueryStringsConfigArgs() {
        this.queryStringBehavior = Codegen.empty();
        this.queryStrings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyQueryStringsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> queryStringBehavior;
        private @Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyQueryStringsConfigArgs defaults) {
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
        public Builder queryStrings(@Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }
        public Builder queryStrings(@Nullable OriginRequestPolicyQueryStringsConfigQueryStringsArgs queryStrings) {
            this.queryStrings = Codegen.ofNullable(queryStrings);
            return this;
        }        public OriginRequestPolicyQueryStringsConfigArgs build() {
            return new OriginRequestPolicyQueryStringsConfigArgs(queryStringBehavior, queryStrings);
        }
    }
}
