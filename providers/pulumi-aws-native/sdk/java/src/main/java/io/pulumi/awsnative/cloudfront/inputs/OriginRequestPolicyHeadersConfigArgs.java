// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginRequestPolicyHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyHeadersConfigArgs Empty = new OriginRequestPolicyHeadersConfigArgs();

    @Import(name="headerBehavior", required=true)
      private final Output<String> headerBehavior;

    public Output<String> getHeaderBehavior() {
        return this.headerBehavior;
    }

    @Import(name="headers")
      private final @Nullable Output<List<String>> headers;

    public Output<List<String>> getHeaders() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    public OriginRequestPolicyHeadersConfigArgs(
        Output<String> headerBehavior,
        @Nullable Output<List<String>> headers) {
        this.headerBehavior = Objects.requireNonNull(headerBehavior, "expected parameter 'headerBehavior' to be non-null");
        this.headers = headers;
    }

    private OriginRequestPolicyHeadersConfigArgs() {
        this.headerBehavior = Codegen.empty();
        this.headers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> headerBehavior;
        private @Nullable Output<List<String>> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder headerBehavior(Output<String> headerBehavior) {
            this.headerBehavior = Objects.requireNonNull(headerBehavior);
            return this;
        }
        public Builder headerBehavior(String headerBehavior) {
            this.headerBehavior = Output.of(Objects.requireNonNull(headerBehavior));
            return this;
        }
        public Builder headers(@Nullable Output<List<String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }        public OriginRequestPolicyHeadersConfigArgs build() {
            return new OriginRequestPolicyHeadersConfigArgs(headerBehavior, headers);
        }
    }
}
