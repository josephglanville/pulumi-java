// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketRedirectAllRequestsTo;
import io.pulumi.awsnative.s3.outputs.BucketRoutingRule;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketWebsiteConfiguration {
    /**
     * The name of the error document for the website.
     * 
     */
    private final @Nullable String errorDocument;
    /**
     * The name of the index document for the website.
     * 
     */
    private final @Nullable String indexDocument;
    private final @Nullable BucketRedirectAllRequestsTo redirectAllRequestsTo;
    private final @Nullable List<BucketRoutingRule> routingRules;

    @CustomType.Constructor
    private BucketWebsiteConfiguration(
        @CustomType.Parameter("errorDocument") @Nullable String errorDocument,
        @CustomType.Parameter("indexDocument") @Nullable String indexDocument,
        @CustomType.Parameter("redirectAllRequestsTo") @Nullable BucketRedirectAllRequestsTo redirectAllRequestsTo,
        @CustomType.Parameter("routingRules") @Nullable List<BucketRoutingRule> routingRules) {
        this.errorDocument = errorDocument;
        this.indexDocument = indexDocument;
        this.redirectAllRequestsTo = redirectAllRequestsTo;
        this.routingRules = routingRules;
    }

    /**
     * The name of the error document for the website.
     * 
    */
    public Optional<String> getErrorDocument() {
        return Optional.ofNullable(this.errorDocument);
    }
    /**
     * The name of the index document for the website.
     * 
    */
    public Optional<String> getIndexDocument() {
        return Optional.ofNullable(this.indexDocument);
    }
    public Optional<BucketRedirectAllRequestsTo> getRedirectAllRequestsTo() {
        return Optional.ofNullable(this.redirectAllRequestsTo);
    }
    public List<BucketRoutingRule> getRoutingRules() {
        return this.routingRules == null ? List.of() : this.routingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorDocument;
        private @Nullable String indexDocument;
        private @Nullable BucketRedirectAllRequestsTo redirectAllRequestsTo;
        private @Nullable List<BucketRoutingRule> routingRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsiteConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDocument = defaults.errorDocument;
    	      this.indexDocument = defaults.indexDocument;
    	      this.redirectAllRequestsTo = defaults.redirectAllRequestsTo;
    	      this.routingRules = defaults.routingRules;
        }

        public Builder errorDocument(@Nullable String errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }
        public Builder indexDocument(@Nullable String indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }
        public Builder redirectAllRequestsTo(@Nullable BucketRedirectAllRequestsTo redirectAllRequestsTo) {
            this.redirectAllRequestsTo = redirectAllRequestsTo;
            return this;
        }
        public Builder routingRules(@Nullable List<BucketRoutingRule> routingRules) {
            this.routingRules = routingRules;
            return this;
        }
        public Builder routingRules(BucketRoutingRule... routingRules) {
            return routingRules(List.of(routingRules));
        }        public BucketWebsiteConfiguration build() {
            return new BucketWebsiteConfiguration(errorDocument, indexDocument, redirectAllRequestsTo, routingRules);
        }
    }
}
