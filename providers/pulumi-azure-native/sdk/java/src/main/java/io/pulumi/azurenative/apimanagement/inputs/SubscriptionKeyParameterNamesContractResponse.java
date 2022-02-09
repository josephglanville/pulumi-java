// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionKeyParameterNamesContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubscriptionKeyParameterNamesContractResponse Empty = new SubscriptionKeyParameterNamesContractResponse();

    @InputImport(name="header")
    private final @Nullable String header;

    public Optional<String> getHeader() {
        return this.header == null ? Optional.empty() : Optional.ofNullable(this.header);
    }

    @InputImport(name="query")
    private final @Nullable String query;

    public Optional<String> getQuery() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
    }

    public SubscriptionKeyParameterNamesContractResponse(
        @Nullable String header,
        @Nullable String query) {
        this.header = header;
        this.query = query;
    }

    private SubscriptionKeyParameterNamesContractResponse() {
        this.header = null;
        this.query = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionKeyParameterNamesContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String header;
        private @Nullable String query;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionKeyParameterNamesContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.query = defaults.query;
        }

        public Builder setHeader(@Nullable String header) {
            this.header = header;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = query;
            return this;
        }

        public SubscriptionKeyParameterNamesContractResponse build() {
            return new SubscriptionKeyParameterNamesContractResponse(header, query);
        }
    }
}
