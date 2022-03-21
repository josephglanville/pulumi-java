// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the properties for automatic resolution.
 * 
 */
public final class AutomaticResolutionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomaticResolutionPropertiesResponse Empty = new AutomaticResolutionPropertiesResponse();

    /**
     * Gets the MoveResource ARM ID of
     * the dependent resource if the resolution type is Automatic.
     * 
     */
    @Import(name="moveResourceId")
      private final @Nullable String moveResourceId;

    public Optional<String> getMoveResourceId() {
        return this.moveResourceId == null ? Optional.empty() : Optional.ofNullable(this.moveResourceId);
    }

    public AutomaticResolutionPropertiesResponse(@Nullable String moveResourceId) {
        this.moveResourceId = moveResourceId;
    }

    private AutomaticResolutionPropertiesResponse() {
        this.moveResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticResolutionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String moveResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticResolutionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moveResourceId = defaults.moveResourceId;
        }

        public Builder moveResourceId(@Nullable String moveResourceId) {
            this.moveResourceId = moveResourceId;
            return this;
        }        public AutomaticResolutionPropertiesResponse build() {
            return new AutomaticResolutionPropertiesResponse(moveResourceId);
        }
    }
}
