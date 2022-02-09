// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoindexer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MediaServicesForPutRequestResponse {
    private final @Nullable String resourceId;
    private final @Nullable String userAssignedIdentity;

    @OutputCustomType.Constructor({"resourceId","userAssignedIdentity"})
    private MediaServicesForPutRequestResponse(
        @Nullable String resourceId,
        @Nullable String userAssignedIdentity) {
        this.resourceId = resourceId;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    public Optional<String> getUserAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaServicesForPutRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaServicesForPutRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setUserAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        public MediaServicesForPutRequestResponse build() {
            return new MediaServicesForPutRequestResponse(resourceId, userAssignedIdentity);
        }
    }
}
