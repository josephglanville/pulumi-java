// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.OptionsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CollectionOverrideResponse {
    /**
     * The collection that identifies this resource within its service.
     * 
     */
    private final String collection;
    /**
     * The options to apply to this resource-level override
     * 
     */
    private final OptionsResponse options;

    @CustomType.Constructor
    private CollectionOverrideResponse(
        @CustomType.Parameter("collection") String collection,
        @CustomType.Parameter("options") OptionsResponse options) {
        this.collection = collection;
        this.options = options;
    }

    /**
     * The collection that identifies this resource within its service.
     * 
    */
    public String getCollection() {
        return this.collection;
    }
    /**
     * The options to apply to this resource-level override
     * 
    */
    public OptionsResponse getOptions() {
        return this.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectionOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collection;
        private OptionsResponse options;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectionOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.options = defaults.options;
        }

        public Builder collection(String collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }
        public Builder options(OptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }        public CollectionOverrideResponse build() {
            return new CollectionOverrideResponse(collection, options);
        }
    }
}
