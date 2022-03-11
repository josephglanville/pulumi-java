// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.inputs;

import io.pulumi.azurenative.appconfiguration.enums.ConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The state of a private link service connection.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * The private link service connection description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<Either<String,ConnectionStatus>> status;

    public Output<Either<String,ConnectionStatus>> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Output<String> description,
        @Nullable Output<Either<String,ConnectionStatus>> status) {
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateArgs() {
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
        private @Nullable Output<String> description;
        private @Nullable Output<Either<String,ConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder status(@Nullable Output<Either<String,ConnectionStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Either<String,ConnectionStatus> status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(description, status);
        }
    }
}
