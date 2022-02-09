// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataPathAssetReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataPathAssetReferenceResponse Empty = new DataPathAssetReferenceResponse();

    @InputImport(name="datastoreId")
    private final @Nullable String datastoreId;

    public Optional<String> getDatastoreId() {
        return this.datastoreId == null ? Optional.empty() : Optional.ofNullable(this.datastoreId);
    }

    @InputImport(name="path")
    private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    @InputImport(name="referenceType", required=true)
    private final String referenceType;

    public String getReferenceType() {
        return this.referenceType;
    }

    public DataPathAssetReferenceResponse(
        @Nullable String datastoreId,
        @Nullable String path,
        String referenceType) {
        this.datastoreId = datastoreId;
        this.path = path;
        this.referenceType = Objects.requireNonNull(referenceType, "expected parameter 'referenceType' to be non-null");
    }

    private DataPathAssetReferenceResponse() {
        this.datastoreId = null;
        this.path = null;
        this.referenceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPathAssetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String path;
        private String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPathAssetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.path = defaults.path;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder setDatastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setReferenceType(String referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }

        public DataPathAssetReferenceResponse build() {
            return new DataPathAssetReferenceResponse(datastoreId, path, referenceType);
        }
    }
}
