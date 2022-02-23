// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The gallery artifact version source.
 * 
 */
public final class GalleryArtifactVersionSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryArtifactVersionSourceArgs Empty = new GalleryArtifactVersionSourceArgs();

    /**
     * The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     * 
     */
    @InputImport(name="uri")
      private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public GalleryArtifactVersionSourceArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> uri) {
        this.id = id;
        this.uri = uri;
    }

    private GalleryArtifactVersionSourceArgs() {
        this.id = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryArtifactVersionSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryArtifactVersionSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.uri = defaults.uri;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public GalleryArtifactVersionSourceArgs build() {
            return new GalleryArtifactVersionSourceArgs(id, uri);
        }
    }
}
