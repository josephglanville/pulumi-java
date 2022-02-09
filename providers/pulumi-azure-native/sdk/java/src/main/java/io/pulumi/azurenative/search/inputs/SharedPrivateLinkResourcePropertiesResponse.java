// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedPrivateLinkResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SharedPrivateLinkResourcePropertiesResponse Empty = new SharedPrivateLinkResourcePropertiesResponse();

    @InputImport(name="groupId")
    private final @Nullable String groupId;

    public Optional<String> getGroupId() {
        return this.groupId == null ? Optional.empty() : Optional.ofNullable(this.groupId);
    }

    @InputImport(name="privateLinkResourceId")
    private final @Nullable String privateLinkResourceId;

    public Optional<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Optional.empty() : Optional.ofNullable(this.privateLinkResourceId);
    }

    @InputImport(name="provisioningState")
    private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    @InputImport(name="requestMessage")
    private final @Nullable String requestMessage;

    public Optional<String> getRequestMessage() {
        return this.requestMessage == null ? Optional.empty() : Optional.ofNullable(this.requestMessage);
    }

    @InputImport(name="resourceRegion")
    private final @Nullable String resourceRegion;

    public Optional<String> getResourceRegion() {
        return this.resourceRegion == null ? Optional.empty() : Optional.ofNullable(this.resourceRegion);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public SharedPrivateLinkResourcePropertiesResponse(
        @Nullable String groupId,
        @Nullable String privateLinkResourceId,
        @Nullable String provisioningState,
        @Nullable String requestMessage,
        @Nullable String resourceRegion,
        @Nullable String status) {
        this.groupId = groupId;
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = provisioningState;
        this.requestMessage = requestMessage;
        this.resourceRegion = resourceRegion;
        this.status = status;
    }

    private SharedPrivateLinkResourcePropertiesResponse() {
        this.groupId = null;
        this.privateLinkResourceId = null;
        this.provisioningState = null;
        this.requestMessage = null;
        this.resourceRegion = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String privateLinkResourceId;
        private @Nullable String provisioningState;
        private @Nullable String requestMessage;
        private @Nullable String resourceRegion;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestMessage = defaults.requestMessage;
    	      this.resourceRegion = defaults.resourceRegion;
    	      this.status = defaults.status;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setResourceRegion(@Nullable String resourceRegion) {
            this.resourceRegion = resourceRegion;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public SharedPrivateLinkResourcePropertiesResponse build() {
            return new SharedPrivateLinkResourcePropertiesResponse(groupId, privateLinkResourceId, provisioningState, requestMessage, resourceRegion, status);
        }
    }
}
