// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the source resource that this restore point collection is created from.
 * 
 */
public final class RestorePointCollectionSourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestorePointCollectionSourcePropertiesResponse Empty = new RestorePointCollectionSourcePropertiesResponse();

    /**
     * Resource Id of the source resource used to create this restore point collection
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Location of the source resource used to create this restore point collection.
     * 
     */
    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    public RestorePointCollectionSourcePropertiesResponse(
        @Nullable String id,
        String location) {
        this.id = id;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private RestorePointCollectionSourcePropertiesResponse() {
        this.id = null;
        this.location = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointCollectionSourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointCollectionSourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public RestorePointCollectionSourcePropertiesResponse build() {
            return new RestorePointCollectionSourcePropertiesResponse(id, location);
        }
    }
}
