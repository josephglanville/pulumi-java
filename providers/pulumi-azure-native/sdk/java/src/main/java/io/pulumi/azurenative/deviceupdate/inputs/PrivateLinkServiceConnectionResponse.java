// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkServiceConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionResponse Empty = new PrivateLinkServiceConnectionResponse();

    @InputImport(name="groupIds")
    private final @Nullable List<String> groupIds;

    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="requestMessage")
    private final @Nullable String requestMessage;

    public Optional<String> getRequestMessage() {
        return this.requestMessage == null ? Optional.empty() : Optional.ofNullable(this.requestMessage);
    }

    public PrivateLinkServiceConnectionResponse(
        @Nullable List<String> groupIds,
        @Nullable String name,
        @Nullable String requestMessage) {
        this.groupIds = groupIds;
        this.name = name;
        this.requestMessage = requestMessage;
    }

    private PrivateLinkServiceConnectionResponse() {
        this.groupIds = List.of();
        this.name = null;
        this.requestMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private @Nullable String name;
        private @Nullable String requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.name = defaults.name;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder setGroupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public PrivateLinkServiceConnectionResponse build() {
            return new PrivateLinkServiceConnectionResponse(groupIds, name, requestMessage);
        }
    }
}
