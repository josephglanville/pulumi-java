// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.aws.codebuild.outputs.WebhookFilterGroupFilter;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WebhookFilterGroup {
    /**
     * A webhook filter for the group. Filter blocks are documented below.
     * 
     */
    private final @Nullable List<WebhookFilterGroupFilter> filters;

    @CustomType.Constructor
    private WebhookFilterGroup(@CustomType.Parameter("filters") @Nullable List<WebhookFilterGroupFilter> filters) {
        this.filters = filters;
    }

    /**
     * A webhook filter for the group. Filter blocks are documented below.
     * 
    */
    public List<WebhookFilterGroupFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilterGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WebhookFilterGroupFilter> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilterGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder filters(@Nullable List<WebhookFilterGroupFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(WebhookFilterGroupFilter... filters) {
            return filters(List.of(filters));
        }        public WebhookFilterGroup build() {
            return new WebhookFilterGroup(filters);
        }
    }
}
