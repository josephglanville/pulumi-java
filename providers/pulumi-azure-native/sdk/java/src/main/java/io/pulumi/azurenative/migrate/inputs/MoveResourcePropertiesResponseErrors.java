// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.MoveResourceErrorBodyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the move resource errors.
 * 
 */
public final class MoveResourcePropertiesResponseErrors extends io.pulumi.resources.InvokeArgs {

    public static final MoveResourcePropertiesResponseErrors Empty = new MoveResourcePropertiesResponseErrors();

    /**
     * The move resource error body.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable MoveResourceErrorBodyResponse properties;

    public Optional<MoveResourceErrorBodyResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    public MoveResourcePropertiesResponseErrors(@Nullable MoveResourceErrorBodyResponse properties) {
        this.properties = properties;
    }

    private MoveResourcePropertiesResponseErrors() {
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourcePropertiesResponseErrors defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MoveResourceErrorBodyResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourcePropertiesResponseErrors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder setProperties(@Nullable MoveResourceErrorBodyResponse properties) {
            this.properties = properties;
            return this;
        }
        public MoveResourcePropertiesResponseErrors build() {
            return new MoveResourcePropertiesResponseErrors(properties);
        }
    }
}
