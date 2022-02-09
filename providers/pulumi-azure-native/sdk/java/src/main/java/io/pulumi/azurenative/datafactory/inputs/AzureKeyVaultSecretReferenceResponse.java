// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureKeyVaultSecretReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureKeyVaultSecretReferenceResponse Empty = new AzureKeyVaultSecretReferenceResponse();

    @InputImport(name="secretName", required=true)
    private final Object secretName;

    public Object getSecretName() {
        return this.secretName;
    }

    @InputImport(name="secretVersion")
    private final @Nullable Object secretVersion;

    public Optional<Object> getSecretVersion() {
        return this.secretVersion == null ? Optional.empty() : Optional.ofNullable(this.secretVersion);
    }

    @InputImport(name="store", required=true)
    private final LinkedServiceReferenceResponse store;

    public LinkedServiceReferenceResponse getStore() {
        return this.store;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AzureKeyVaultSecretReferenceResponse(
        Object secretName,
        @Nullable Object secretVersion,
        LinkedServiceReferenceResponse store,
        String type) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
        this.secretVersion = secretVersion;
        this.store = Objects.requireNonNull(store, "expected parameter 'store' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureKeyVaultSecretReferenceResponse() {
        this.secretName = null;
        this.secretVersion = null;
        this.store = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureKeyVaultSecretReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object secretName;
        private @Nullable Object secretVersion;
        private LinkedServiceReferenceResponse store;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureKeyVaultSecretReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.store = defaults.store;
    	      this.type = defaults.type;
        }

        public Builder setSecretName(Object secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public Builder setSecretVersion(@Nullable Object secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder setStore(LinkedServiceReferenceResponse store) {
            this.store = Objects.requireNonNull(store);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureKeyVaultSecretReferenceResponse build() {
            return new AzureKeyVaultSecretReferenceResponse(secretName, secretVersion, store, type);
        }
    }
}
