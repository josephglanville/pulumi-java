// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLRateBasedStatementAggregateKeyType;
import io.pulumi.awsnative.wafv2.inputs.WebACLForwardedIPConfiguration;
import io.pulumi.awsnative.wafv2.inputs.WebACLStatement;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebACLRateBasedStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLRateBasedStatement Empty = new WebACLRateBasedStatement();

    @InputImport(name="aggregateKeyType", required=true)
      private final WebACLRateBasedStatementAggregateKeyType aggregateKeyType;

    public WebACLRateBasedStatementAggregateKeyType getAggregateKeyType() {
        return this.aggregateKeyType;
    }

    @InputImport(name="forwardedIPConfig")
      private final @Nullable WebACLForwardedIPConfiguration forwardedIPConfig;

    public Optional<WebACLForwardedIPConfiguration> getForwardedIPConfig() {
        return this.forwardedIPConfig == null ? Optional.empty() : Optional.ofNullable(this.forwardedIPConfig);
    }

    @InputImport(name="limit", required=true)
      private final Integer limit;

    public Integer getLimit() {
        return this.limit;
    }

    @InputImport(name="scopeDownStatement")
      private final @Nullable WebACLStatement scopeDownStatement;

    public Optional<WebACLStatement> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Optional.empty() : Optional.ofNullable(this.scopeDownStatement);
    }

    public WebACLRateBasedStatement(
        WebACLRateBasedStatementAggregateKeyType aggregateKeyType,
        @Nullable WebACLForwardedIPConfiguration forwardedIPConfig,
        Integer limit,
        @Nullable WebACLStatement scopeDownStatement) {
        this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType, "expected parameter 'aggregateKeyType' to be non-null");
        this.forwardedIPConfig = forwardedIPConfig;
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
    }

    private WebACLRateBasedStatement() {
        this.aggregateKeyType = null;
        this.forwardedIPConfig = null;
        this.limit = null;
        this.scopeDownStatement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRateBasedStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLRateBasedStatementAggregateKeyType aggregateKeyType;
        private @Nullable WebACLForwardedIPConfiguration forwardedIPConfig;
        private Integer limit;
        private @Nullable WebACLStatement scopeDownStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRateBasedStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateKeyType = defaults.aggregateKeyType;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
    	      this.limit = defaults.limit;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
        }

        public Builder setAggregateKeyType(WebACLRateBasedStatementAggregateKeyType aggregateKeyType) {
            this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType);
            return this;
        }

        public Builder setForwardedIPConfig(@Nullable WebACLForwardedIPConfiguration forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }

        public Builder setScopeDownStatement(@Nullable WebACLStatement scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }
        public WebACLRateBasedStatement build() {
            return new WebACLRateBasedStatement(aggregateKeyType, forwardedIPConfig, limit, scopeDownStatement);
        }
    }
}
