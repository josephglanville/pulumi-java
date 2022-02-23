// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.PrivateEndpointServiceConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SharedPrivateLinkResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedPrivateLinkResourceArgs Empty = new SharedPrivateLinkResourceArgs();

    /**
     * The private link resource group id.
     * 
     */
    @InputImport(name="groupId")
      private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    /**
     * Unique name of the private link.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource id that private link links to.
     * 
     */
    @InputImport(name="privateLinkResourceId")
      private final @Nullable Input<String> privateLinkResourceId;

    public Input<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Input.empty() : this.privateLinkResourceId;
    }

    /**
     * Request message.
     * 
     */
    @InputImport(name="requestMessage")
      private final @Nullable Input<String> requestMessage;

    public Input<String> getRequestMessage() {
        return this.requestMessage == null ? Input.empty() : this.requestMessage;
    }

    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status;

    public Input<Either<String,PrivateEndpointServiceConnectionStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public SharedPrivateLinkResourceArgs(
        @Nullable Input<String> groupId,
        @Nullable Input<String> name,
        @Nullable Input<String> privateLinkResourceId,
        @Nullable Input<String> requestMessage,
        @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
        this.groupId = groupId;
        this.name = name;
        this.privateLinkResourceId = privateLinkResourceId;
        this.requestMessage = requestMessage;
        this.status = status;
    }

    private SharedPrivateLinkResourceArgs() {
        this.groupId = Input.empty();
        this.name = Input.empty();
        this.privateLinkResourceId = Input.empty();
        this.requestMessage = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> privateLinkResourceId;
        private @Nullable Input<String> requestMessage;
        private @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.name = defaults.name;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.requestMessage = defaults.requestMessage;
    	      this.status = defaults.status;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable Input<String> privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = Input.ofNullable(privateLinkResourceId);
            return this;
        }

        public Builder setRequestMessage(@Nullable Input<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = Input.ofNullable(requestMessage);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,PrivateEndpointServiceConnectionStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public SharedPrivateLinkResourceArgs build() {
            return new SharedPrivateLinkResourceArgs(groupId, name, privateLinkResourceId, requestMessage, status);
        }
    }
}
