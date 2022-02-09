// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs Empty = new DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs();

    @InputImport(name="expiryDate")
    private final @Nullable Input<String> expiryDate;

    public Input<String> getExpiryDate() {
        return this.expiryDate == null ? Input.empty() : this.expiryDate;
    }

    @InputImport(name="parameterNameInStore")
    private final @Nullable Input<String> parameterNameInStore;

    public Input<String> getParameterNameInStore() {
        return this.parameterNameInStore == null ? Input.empty() : this.parameterNameInStore;
    }

    @InputImport(name="parameterStoreRegion")
    private final @Nullable Input<String> parameterStoreRegion;

    public Input<String> getParameterStoreRegion() {
        return this.parameterStoreRegion == null ? Input.empty() : this.parameterStoreRegion;
    }

    public DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs(
        @Nullable Input<String> expiryDate,
        @Nullable Input<String> parameterNameInStore,
        @Nullable Input<String> parameterStoreRegion) {
        this.expiryDate = expiryDate;
        this.parameterNameInStore = parameterNameInStore;
        this.parameterStoreRegion = parameterStoreRegion;
    }

    private DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs() {
        this.expiryDate = Input.empty();
        this.parameterNameInStore = Input.empty();
        this.parameterStoreRegion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expiryDate;
        private @Nullable Input<String> parameterNameInStore;
        private @Nullable Input<String> parameterStoreRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDate = defaults.expiryDate;
    	      this.parameterNameInStore = defaults.parameterNameInStore;
    	      this.parameterStoreRegion = defaults.parameterStoreRegion;
        }

        public Builder setExpiryDate(@Nullable Input<String> expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder setExpiryDate(@Nullable String expiryDate) {
            this.expiryDate = Input.ofNullable(expiryDate);
            return this;
        }

        public Builder setParameterNameInStore(@Nullable Input<String> parameterNameInStore) {
            this.parameterNameInStore = parameterNameInStore;
            return this;
        }

        public Builder setParameterNameInStore(@Nullable String parameterNameInStore) {
            this.parameterNameInStore = Input.ofNullable(parameterNameInStore);
            return this;
        }

        public Builder setParameterStoreRegion(@Nullable Input<String> parameterStoreRegion) {
            this.parameterStoreRegion = parameterStoreRegion;
            return this;
        }

        public Builder setParameterStoreRegion(@Nullable String parameterStoreRegion) {
            this.parameterStoreRegion = Input.ofNullable(parameterStoreRegion);
            return this;
        }

        public DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs build() {
            return new DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs(expiryDate, parameterNameInStore, parameterStoreRegion);
        }
    }
}
