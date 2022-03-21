// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data used when creating a target resource from a source resource.
 * 
 */
public final class CreationDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final CreationDataResponse Empty = new CreationDataResponse();

    /**
     * This is the ARM ID of the source object to be used to create the target object.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    public CreationDataResponse(@Nullable String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    private CreationDataResponse() {
        this.sourceResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }        public CreationDataResponse build() {
            return new CreationDataResponse(sourceResourceId);
        }
    }
}
