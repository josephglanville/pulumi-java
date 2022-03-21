// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.enums.PrivateLinkServiceConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The private link service connection state.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Whether there is further actions.
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable Output<String> actionsRequired;

    public Output<String> getActionsRequired() {
        return this.actionsRequired == null ? Output.empty() : this.actionsRequired;
    }

    /**
     * The optional description of the status.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The concrete private link service connection.
     * 
     */
    @Import(name="status", required=true)
      private final Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

    public Output<Either<String,PrivateLinkServiceConnectionStatus>> getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Output<String> actionsRequired,
        @Nullable Output<String> description,
        Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PrivateLinkServiceConnectionStateArgs() {
        this.actionsRequired = Output.empty();
        this.description = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionsRequired;
        private @Nullable Output<String> description;
        private Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }
        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = Output.ofNullable(actionsRequired);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder status(Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(Either<String,PrivateLinkServiceConnectionStatus> status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
