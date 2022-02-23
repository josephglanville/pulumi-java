// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of an existing Shared Private Link Resource to use when connecting to a private origin.
 * 
 */
public final class SharedPrivateLinkResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SharedPrivateLinkResourcePropertiesResponse Empty = new SharedPrivateLinkResourcePropertiesResponse();

    /**
     * The group id from the provider of resource the shared private link resource is for.
     * 
     */
    @InputImport(name="groupId")
      private final @Nullable String groupId;

    public Optional<String> getGroupId() {
        return this.groupId == null ? Optional.empty() : Optional.ofNullable(this.groupId);
    }

    /**
     * The resource id of the resource the shared private link resource is for.
     * 
     */
    @InputImport(name="privateLink")
      private final @Nullable ResourceReferenceResponse privateLink;

    public Optional<ResourceReferenceResponse> getPrivateLink() {
        return this.privateLink == null ? Optional.empty() : Optional.ofNullable(this.privateLink);
    }

    /**
     * The location of the shared private link resource
     * 
     */
    @InputImport(name="privateLinkLocation")
      private final @Nullable String privateLinkLocation;

    public Optional<String> getPrivateLinkLocation() {
        return this.privateLinkLocation == null ? Optional.empty() : Optional.ofNullable(this.privateLinkLocation);
    }

    /**
     * The request message for requesting approval of the shared private link resource.
     * 
     */
    @InputImport(name="requestMessage")
      private final @Nullable String requestMessage;

    public Optional<String> getRequestMessage() {
        return this.requestMessage == null ? Optional.empty() : Optional.ofNullable(this.requestMessage);
    }

    /**
     * Status of the shared private link resource. Can be Pending, Approved, Rejected, Disconnected, or Timeout.
     * 
     */
    @InputImport(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public SharedPrivateLinkResourcePropertiesResponse(
        @Nullable String groupId,
        @Nullable ResourceReferenceResponse privateLink,
        @Nullable String privateLinkLocation,
        @Nullable String requestMessage,
        @Nullable String status) {
        this.groupId = groupId;
        this.privateLink = privateLink;
        this.privateLinkLocation = privateLinkLocation;
        this.requestMessage = requestMessage;
        this.status = status;
    }

    private SharedPrivateLinkResourcePropertiesResponse() {
        this.groupId = null;
        this.privateLink = null;
        this.privateLinkLocation = null;
        this.requestMessage = null;
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
        private @Nullable ResourceReferenceResponse privateLink;
        private @Nullable String privateLinkLocation;
        private @Nullable String requestMessage;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.privateLink = defaults.privateLink;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.requestMessage = defaults.requestMessage;
    	      this.status = defaults.status;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setPrivateLink(@Nullable ResourceReferenceResponse privateLink) {
            this.privateLink = privateLink;
            return this;
        }

        public Builder setPrivateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public SharedPrivateLinkResourcePropertiesResponse build() {
            return new SharedPrivateLinkResourcePropertiesResponse(groupId, privateLink, privateLinkLocation, requestMessage, status);
        }
    }
}
