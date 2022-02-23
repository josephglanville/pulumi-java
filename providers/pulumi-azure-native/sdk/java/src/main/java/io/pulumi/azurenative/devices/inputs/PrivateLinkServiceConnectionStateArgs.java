// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.PrivateLinkServiceConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The current state of a private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Actions required for a private endpoint connection
     * 
     */
    @InputImport(name="actionsRequired")
      private final @Nullable Input<String> actionsRequired;

    public Input<String> getActionsRequired() {
        return this.actionsRequired == null ? Input.empty() : this.actionsRequired;
    }

    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    @InputImport(name="description", required=true)
      private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * The status of a private endpoint connection
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<Either<String,PrivateLinkServiceConnectionStatus>> status;

    public Input<Either<String,PrivateLinkServiceConnectionStatus>> getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Input<String> actionsRequired,
        Input<String> description,
        Input<Either<String,PrivateLinkServiceConnectionStatus>> status) {
        this.actionsRequired = actionsRequired;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
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
        private Input<String> description;
        private Input<Either<String,PrivateLinkServiceConnectionStatus>> status;

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

        public Builder setDescription(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder setStatus(Input<Either<String,PrivateLinkServiceConnectionStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(Either<String,PrivateLinkServiceConnectionStatus> status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
