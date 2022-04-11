// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Resource Access Rule.
 * 
 */
public final class ResourceAccessRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceAccessRuleArgs Empty = new ResourceAccessRuleArgs();

    /**
     * Resource Id
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    /**
     * Tenant Id
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    public ResourceAccessRuleArgs(
        @Nullable Output<String> resourceId,
        @Nullable Output<String> tenantId) {
        this.resourceId = resourceId;
        this.tenantId = tenantId;
    }

    private ResourceAccessRuleArgs() {
        this.resourceId = Codegen.empty();
        this.tenantId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceId;
        private @Nullable Output<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAccessRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }        public ResourceAccessRuleArgs build() {
            return new ResourceAccessRuleArgs(resourceId, tenantId);
        }
    }
}
