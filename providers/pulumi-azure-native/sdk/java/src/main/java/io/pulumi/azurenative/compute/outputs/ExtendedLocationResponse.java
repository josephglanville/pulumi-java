// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExtendedLocationResponse {
    /**
     * The name of the extended location.
     * 
     */
    private final @Nullable String name;
    /**
     * The type of the extended location.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ExtendedLocationResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * The name of the extended location.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The type of the extended location.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ExtendedLocationResponse build() {
            return new ExtendedLocationResponse(name, type);
        }
    }
}
