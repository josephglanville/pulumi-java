// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.inputs;

import io.pulumi.azurenative.m365securityandcompliance.enums.PrivateEndpointServiceConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A collection of information about the state of the connection between service consumer and provider.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @InputImport(name="actionsRequired")
      private final @Nullable Input<String> actionsRequired;

    public Input<String> getActionsRequired() {
        return this.actionsRequired == null ? Input.empty() : this.actionsRequired;
    }

    /**
     * The reason for approval/rejection of the connection.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
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

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Input<String> actionsRequired,
        @Nullable Input<String> description,
        @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateArgs() {
        this.actionsRequired = Input.empty();
        this.description = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actionsRequired;
        private @Nullable Input<String> description;
        private @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
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

        public Builder setStatus(@Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,PrivateEndpointServiceConnectionStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
