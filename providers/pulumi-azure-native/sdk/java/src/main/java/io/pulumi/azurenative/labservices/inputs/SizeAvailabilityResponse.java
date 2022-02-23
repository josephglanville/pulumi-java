// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the size information
 * 
 */
public final class SizeAvailabilityResponse extends io.pulumi.resources.InvokeArgs {

    public static final SizeAvailabilityResponse Empty = new SizeAvailabilityResponse();

    /**
     * Whether or not this size category is available
     * 
     */
    @InputImport(name="isAvailable")
      private final @Nullable Boolean isAvailable;

    public Optional<Boolean> getIsAvailable() {
        return this.isAvailable == null ? Optional.empty() : Optional.ofNullable(this.isAvailable);
    }

    /**
     * The category of the size (Basic, Standard, Performance).
     * 
     */
    @InputImport(name="sizeCategory")
      private final @Nullable String sizeCategory;

    public Optional<String> getSizeCategory() {
        return this.sizeCategory == null ? Optional.empty() : Optional.ofNullable(this.sizeCategory);
    }

    public SizeAvailabilityResponse(
        @Nullable Boolean isAvailable,
        @Nullable String sizeCategory) {
        this.isAvailable = isAvailable;
        this.sizeCategory = sizeCategory;
    }

    private SizeAvailabilityResponse() {
        this.isAvailable = null;
        this.sizeCategory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeAvailabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isAvailable;
        private @Nullable String sizeCategory;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeAvailabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isAvailable = defaults.isAvailable;
    	      this.sizeCategory = defaults.sizeCategory;
        }

        public Builder setIsAvailable(@Nullable Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public Builder setSizeCategory(@Nullable String sizeCategory) {
            this.sizeCategory = sizeCategory;
            return this;
        }
        public SizeAvailabilityResponse build() {
            return new SizeAvailabilityResponse(isAvailable, sizeCategory);
        }
    }
}
