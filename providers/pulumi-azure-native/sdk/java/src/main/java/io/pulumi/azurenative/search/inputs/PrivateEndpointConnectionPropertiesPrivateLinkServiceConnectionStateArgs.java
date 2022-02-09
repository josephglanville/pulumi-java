// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.enums.PrivateLinkServiceConnectionStatus;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs Empty = new PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs();

    @InputImport(name="actionsRequired")
    private final @Nullable Input<String> actionsRequired;

    public Input<String> getActionsRequired() {
        return this.actionsRequired == null ? Input.empty() : this.actionsRequired;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="status")
    private final @Nullable Input<PrivateLinkServiceConnectionStatus> status;

    public Input<PrivateLinkServiceConnectionStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs(
        @Nullable Input<String> actionsRequired,
        @Nullable Input<String> description,
        @Nullable Input<PrivateLinkServiceConnectionStatus> status) {
        this.actionsRequired = actionsRequired == null ? Input.ofNullable("None") : actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs() {
        this.actionsRequired = Input.empty();
        this.description = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actionsRequired;
        private @Nullable Input<String> description;
        private @Nullable Input<PrivateLinkServiceConnectionStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(@Nullable Input<String> actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder setActionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = Input.ofNullable(actionsRequired);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setStatus(@Nullable Input<PrivateLinkServiceConnectionStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable PrivateLinkServiceConnectionStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs build() {
            return new PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
