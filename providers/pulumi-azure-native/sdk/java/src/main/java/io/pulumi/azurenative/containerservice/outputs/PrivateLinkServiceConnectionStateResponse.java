// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkServiceConnectionStateResponse {
    /**
     * The private link service connection description.
     * 
     */
    private final @Nullable String description;
    /**
     * The private link service connection status.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private PrivateLinkServiceConnectionStateResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("status") @Nullable String status) {
        this.description = description;
        this.status = status;
    }

    /**
     * The private link service connection description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The private link service connection status.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(description, status);
        }
    }
}
