// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the gallery unique name.
 * 
 */
public final class GalleryIdentifierResponse extends io.pulumi.resources.InvokeArgs {

    public static final GalleryIdentifierResponse Empty = new GalleryIdentifierResponse();

    /**
     * The unique name of the Shared Image Gallery. This name is generated automatically by Azure.
     * 
     */
    @Import(name="uniqueName", required=true)
      private final String uniqueName;

    public String getUniqueName() {
        return this.uniqueName;
    }

    public GalleryIdentifierResponse(String uniqueName) {
        this.uniqueName = Objects.requireNonNull(uniqueName, "expected parameter 'uniqueName' to be non-null");
    }

    private GalleryIdentifierResponse() {
        this.uniqueName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String uniqueName;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uniqueName = defaults.uniqueName;
        }

        public Builder uniqueName(String uniqueName) {
            this.uniqueName = Objects.requireNonNull(uniqueName);
            return this;
        }        public GalleryIdentifierResponse build() {
            return new GalleryIdentifierResponse(uniqueName);
        }
    }
}
