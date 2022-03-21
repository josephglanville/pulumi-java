// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapabilityResponse {
    /**
     * Name of the SKU capability.
     * 
     */
    private final @Nullable String name;
    /**
     * Reason of the SKU capability.
     * 
     */
    private final @Nullable String reason;
    /**
     * Value of the SKU capability.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private CapabilityResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.reason = reason;
        this.value = value;
    }

    /**
     * Name of the SKU capability.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Reason of the SKU capability.
     * 
    */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * Value of the SKU capability.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String reason;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CapabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.reason = defaults.reason;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public CapabilityResponse build() {
            return new CapabilityResponse(name, reason, value);
        }
    }
}
