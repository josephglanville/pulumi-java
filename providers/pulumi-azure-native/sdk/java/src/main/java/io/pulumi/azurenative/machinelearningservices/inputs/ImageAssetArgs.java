// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Image asset.
 * 
 */
public final class ImageAssetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageAssetArgs Empty = new ImageAssetArgs();

    /**
     * The Asset Id.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The mime type.
     * 
     */
    @Import(name="mimeType")
      private final @Nullable Output<String> mimeType;

    public Output<String> getMimeType() {
        return this.mimeType == null ? Output.empty() : this.mimeType;
    }

    /**
     * Whether the Asset is unpacked.
     * 
     */
    @Import(name="unpack")
      private final @Nullable Output<Boolean> unpack;

    public Output<Boolean> getUnpack() {
        return this.unpack == null ? Output.empty() : this.unpack;
    }

    /**
     * The Url of the Asset.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public ImageAssetArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> mimeType,
        @Nullable Output<Boolean> unpack,
        @Nullable Output<String> url) {
        this.id = id;
        this.mimeType = mimeType;
        this.unpack = unpack;
        this.url = url;
    }

    private ImageAssetArgs() {
        this.id = Output.empty();
        this.mimeType = Output.empty();
        this.unpack = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageAssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> mimeType;
        private @Nullable Output<Boolean> unpack;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageAssetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mimeType = defaults.mimeType;
    	      this.unpack = defaults.unpack;
    	      this.url = defaults.url;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder mimeType(@Nullable Output<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = Output.ofNullable(mimeType);
            return this;
        }
        public Builder unpack(@Nullable Output<Boolean> unpack) {
            this.unpack = unpack;
            return this;
        }
        public Builder unpack(@Nullable Boolean unpack) {
            this.unpack = Output.ofNullable(unpack);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }        public ImageAssetArgs build() {
            return new ImageAssetArgs(id, mimeType, unpack, url);
        }
    }
}
