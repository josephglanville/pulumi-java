// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkServiceConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionArgs Empty = new PrivateLinkServiceConnectionArgs();

    @InputImport(name="groupIds")
    private final @Nullable Input<List<String>> groupIds;

    public Input<List<String>> getGroupIds() {
        return this.groupIds == null ? Input.empty() : this.groupIds;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    @InputImport(name="privateLinkServiceId")
    private final @Nullable Input<String> privateLinkServiceId;

    public Input<String> getPrivateLinkServiceId() {
        return this.privateLinkServiceId == null ? Input.empty() : this.privateLinkServiceId;
    }

    @InputImport(name="requestMessage")
    private final @Nullable Input<String> requestMessage;

    public Input<String> getRequestMessage() {
        return this.requestMessage == null ? Input.empty() : this.requestMessage;
    }

    public PrivateLinkServiceConnectionArgs(
        @Nullable Input<List<String>> groupIds,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        @Nullable Input<String> privateLinkServiceId,
        @Nullable Input<String> requestMessage) {
        this.groupIds = groupIds;
        this.id = id;
        this.name = name;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.privateLinkServiceId = privateLinkServiceId;
        this.requestMessage = requestMessage;
    }

    private PrivateLinkServiceConnectionArgs() {
        this.groupIds = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.privateLinkServiceId = Input.empty();
        this.requestMessage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> groupIds;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private @Nullable Input<String> privateLinkServiceId;
        private @Nullable Input<String> requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.privateLinkServiceId = defaults.privateLinkServiceId;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder setGroupIds(@Nullable Input<List<String>> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setGroupIds(@Nullable List<String> groupIds) {
            this.groupIds = Input.ofNullable(groupIds);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setPrivateLinkServiceId(@Nullable Input<String> privateLinkServiceId) {
            this.privateLinkServiceId = privateLinkServiceId;
            return this;
        }

        public Builder setPrivateLinkServiceId(@Nullable String privateLinkServiceId) {
            this.privateLinkServiceId = Input.ofNullable(privateLinkServiceId);
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

        public PrivateLinkServiceConnectionArgs build() {
            return new PrivateLinkServiceConnectionArgs(groupIds, id, name, privateLinkServiceConnectionState, privateLinkServiceId, requestMessage);
        }
    }
}
