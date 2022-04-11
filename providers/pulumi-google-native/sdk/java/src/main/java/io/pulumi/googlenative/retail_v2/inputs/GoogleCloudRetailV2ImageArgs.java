// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Product thumbnail/detail image.
 * 
 */
public final class GoogleCloudRetailV2ImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2ImageArgs Empty = new GoogleCloudRetailV2ImageArgs();

    /**
     * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="height")
      private final @Nullable Output<Integer> height;

    public Output<Integer> getHeight() {
        return this.height == null ? Codegen.empty() : this.height;
    }

    /**
     * URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    /**
     * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="width")
      private final @Nullable Output<Integer> width;

    public Output<Integer> getWidth() {
        return this.width == null ? Codegen.empty() : this.width;
    }

    public GoogleCloudRetailV2ImageArgs(
        @Nullable Output<Integer> height,
        Output<String> uri,
        @Nullable Output<Integer> width) {
        this.height = height;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.width = width;
    }

    private GoogleCloudRetailV2ImageArgs() {
        this.height = Codegen.empty();
        this.uri = Codegen.empty();
        this.width = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> height;
        private Output<String> uri;
        private @Nullable Output<Integer> width;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2ImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.uri = defaults.uri;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable Output<Integer> height) {
            this.height = height;
            return this;
        }
        public Builder height(@Nullable Integer height) {
            this.height = Codegen.ofNullable(height);
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }
        public Builder width(@Nullable Output<Integer> width) {
            this.width = width;
            return this;
        }
        public Builder width(@Nullable Integer width) {
            this.width = Codegen.ofNullable(width);
            return this;
        }        public GoogleCloudRetailV2ImageArgs build() {
            return new GoogleCloudRetailV2ImageArgs(height, uri, width);
        }
    }
}
