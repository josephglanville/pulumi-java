// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AssetFileEncryptionMetadataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssetEncryptionKeyResult {
    /**
     * Asset File encryption metadata.
     * 
     */
    private final @Nullable List<AssetFileEncryptionMetadataResponse> assetFileEncryptionMetadata;
    /**
     * The Asset File storage encryption key.
     * 
     */
    private final @Nullable String key;

    @CustomType.Constructor
    private GetAssetEncryptionKeyResult(
        @CustomType.Parameter("assetFileEncryptionMetadata") @Nullable List<AssetFileEncryptionMetadataResponse> assetFileEncryptionMetadata,
        @CustomType.Parameter("key") @Nullable String key) {
        this.assetFileEncryptionMetadata = assetFileEncryptionMetadata;
        this.key = key;
    }

    /**
     * Asset File encryption metadata.
     * 
    */
    public List<AssetFileEncryptionMetadataResponse> getAssetFileEncryptionMetadata() {
        return this.assetFileEncryptionMetadata == null ? List.of() : this.assetFileEncryptionMetadata;
    }
    /**
     * The Asset File storage encryption key.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetEncryptionKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AssetFileEncryptionMetadataResponse> assetFileEncryptionMetadata;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetEncryptionKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetFileEncryptionMetadata = defaults.assetFileEncryptionMetadata;
    	      this.key = defaults.key;
        }

        public Builder assetFileEncryptionMetadata(@Nullable List<AssetFileEncryptionMetadataResponse> assetFileEncryptionMetadata) {
            this.assetFileEncryptionMetadata = assetFileEncryptionMetadata;
            return this;
        }
        public Builder assetFileEncryptionMetadata(AssetFileEncryptionMetadataResponse... assetFileEncryptionMetadata) {
            return assetFileEncryptionMetadata(List.of(assetFileEncryptionMetadata));
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }        public GetAssetEncryptionKeyResult build() {
            return new GetAssetEncryptionKeyResult(assetFileEncryptionMetadata, key);
        }
    }
}
