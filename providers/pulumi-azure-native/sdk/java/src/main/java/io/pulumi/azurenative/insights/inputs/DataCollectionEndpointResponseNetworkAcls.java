// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCollectionEndpointResponseNetworkAcls extends io.pulumi.resources.InvokeArgs {

    public static final DataCollectionEndpointResponseNetworkAcls Empty = new DataCollectionEndpointResponseNetworkAcls();

    @InputImport(name="publicNetworkAccess")
    private final @Nullable String publicNetworkAccess;

    public Optional<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.publicNetworkAccess);
    }

    public DataCollectionEndpointResponseNetworkAcls(@Nullable String publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
    }

    private DataCollectionEndpointResponseNetworkAcls() {
        this.publicNetworkAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionEndpointResponseNetworkAcls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionEndpointResponseNetworkAcls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public DataCollectionEndpointResponseNetworkAcls build() {
            return new DataCollectionEndpointResponseNetworkAcls(publicNetworkAccess);
        }
    }
}
