// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private link scope resource reference.
 * 
 */
public final class PrivateLinkScopedResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkScopedResourceResponse Empty = new PrivateLinkScopedResourceResponse();

    /**
     * The full resource Id of the private link scope resource.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * The private link scope unique Identifier.
     * 
     */
    @InputImport(name="scopeId")
      private final @Nullable String scopeId;

    public Optional<String> getScopeId() {
        return this.scopeId == null ? Optional.empty() : Optional.ofNullable(this.scopeId);
    }

    public PrivateLinkScopedResourceResponse(
        @Nullable String resourceId,
        @Nullable String scopeId) {
        this.resourceId = resourceId;
        this.scopeId = scopeId;
    }

    private PrivateLinkScopedResourceResponse() {
        this.resourceId = null;
        this.scopeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkScopedResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String scopeId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkScopedResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.scopeId = defaults.scopeId;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setScopeId(@Nullable String scopeId) {
            this.scopeId = scopeId;
            return this;
        }
        public PrivateLinkScopedResourceResponse build() {
            return new PrivateLinkScopedResourceResponse(resourceId, scopeId);
        }
    }
}
