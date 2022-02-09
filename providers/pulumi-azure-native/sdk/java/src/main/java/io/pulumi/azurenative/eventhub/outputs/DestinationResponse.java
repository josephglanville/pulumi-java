// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DestinationResponse {
    private final @Nullable String archiveNameFormat;
    private final @Nullable String blobContainer;
    private final @Nullable String name;
    private final @Nullable String storageAccountResourceId;

    @OutputCustomType.Constructor({"archiveNameFormat","blobContainer","name","storageAccountResourceId"})
    private DestinationResponse(
        @Nullable String archiveNameFormat,
        @Nullable String blobContainer,
        @Nullable String name,
        @Nullable String storageAccountResourceId) {
        this.archiveNameFormat = archiveNameFormat;
        this.blobContainer = blobContainer;
        this.name = name;
        this.storageAccountResourceId = storageAccountResourceId;
    }

    public Optional<String> getArchiveNameFormat() {
        return Optional.ofNullable(this.archiveNameFormat);
    }
    public Optional<String> getBlobContainer() {
        return Optional.ofNullable(this.blobContainer);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getStorageAccountResourceId() {
        return Optional.ofNullable(this.storageAccountResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String archiveNameFormat;
        private @Nullable String blobContainer;
        private @Nullable String name;
        private @Nullable String storageAccountResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveNameFormat = defaults.archiveNameFormat;
    	      this.blobContainer = defaults.blobContainer;
    	      this.name = defaults.name;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
        }

        public Builder setArchiveNameFormat(@Nullable String archiveNameFormat) {
            this.archiveNameFormat = archiveNameFormat;
            return this;
        }

        public Builder setBlobContainer(@Nullable String blobContainer) {
            this.blobContainer = blobContainer;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStorageAccountResourceId(@Nullable String storageAccountResourceId) {
            this.storageAccountResourceId = storageAccountResourceId;
            return this;
        }

        public DestinationResponse build() {
            return new DestinationResponse(archiveNameFormat, blobContainer, name, storageAccountResourceId);
        }
    }
}
