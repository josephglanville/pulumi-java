// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateReferenceResponse Empty = new CertificateReferenceResponse();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="storeLocation")
    private final @Nullable String storeLocation;

    public Optional<String> getStoreLocation() {
        return this.storeLocation == null ? Optional.empty() : Optional.ofNullable(this.storeLocation);
    }

    @InputImport(name="storeName")
    private final @Nullable String storeName;

    public Optional<String> getStoreName() {
        return this.storeName == null ? Optional.empty() : Optional.ofNullable(this.storeName);
    }

    @InputImport(name="visibility")
    private final @Nullable List<String> visibility;

    public List<String> getVisibility() {
        return this.visibility == null ? List.of() : this.visibility;
    }

    public CertificateReferenceResponse(
        String id,
        @Nullable String storeLocation,
        @Nullable String storeName,
        @Nullable List<String> visibility) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.storeLocation = storeLocation;
        this.storeName = storeName;
        this.visibility = visibility;
    }

    private CertificateReferenceResponse() {
        this.id = null;
        this.storeLocation = null;
        this.storeName = null;
        this.visibility = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String storeLocation;
        private @Nullable String storeName;
        private @Nullable List<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storeLocation = defaults.storeLocation;
    	      this.storeName = defaults.storeName;
    	      this.visibility = defaults.visibility;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setStoreLocation(@Nullable String storeLocation) {
            this.storeLocation = storeLocation;
            return this;
        }

        public Builder setStoreName(@Nullable String storeName) {
            this.storeName = storeName;
            return this;
        }

        public Builder setVisibility(@Nullable List<String> visibility) {
            this.visibility = visibility;
            return this;
        }

        public CertificateReferenceResponse build() {
            return new CertificateReferenceResponse(id, storeLocation, storeName, visibility);
        }
    }
}
