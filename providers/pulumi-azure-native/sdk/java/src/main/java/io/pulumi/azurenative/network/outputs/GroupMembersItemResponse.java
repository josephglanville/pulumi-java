// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupMembersItemResponse {
    /**
     * Resource Id.
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private GroupMembersItemResponse(@CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Resource Id.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembersItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembersItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public GroupMembersItemResponse build() {
            return new GroupMembersItemResponse(resourceId);
        }
    }
}
