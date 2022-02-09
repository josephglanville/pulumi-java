// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceCosmosDbConfigurationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCosmosDbConfigurationInfoArgs Empty = new ServiceCosmosDbConfigurationInfoArgs();

    @InputImport(name="keyVaultKeyUri")
    private final @Nullable Input<String> keyVaultKeyUri;

    public Input<String> getKeyVaultKeyUri() {
        return this.keyVaultKeyUri == null ? Input.empty() : this.keyVaultKeyUri;
    }

    @InputImport(name="offerThroughput")
    private final @Nullable Input<Integer> offerThroughput;

    public Input<Integer> getOfferThroughput() {
        return this.offerThroughput == null ? Input.empty() : this.offerThroughput;
    }

    public ServiceCosmosDbConfigurationInfoArgs(
        @Nullable Input<String> keyVaultKeyUri,
        @Nullable Input<Integer> offerThroughput) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        this.offerThroughput = offerThroughput;
    }

    private ServiceCosmosDbConfigurationInfoArgs() {
        this.keyVaultKeyUri = Input.empty();
        this.offerThroughput = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCosmosDbConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyVaultKeyUri;
        private @Nullable Input<Integer> offerThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCosmosDbConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultKeyUri = defaults.keyVaultKeyUri;
    	      this.offerThroughput = defaults.offerThroughput;
        }

        public Builder setKeyVaultKeyUri(@Nullable Input<String> keyVaultKeyUri) {
            this.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }

        public Builder setKeyVaultKeyUri(@Nullable String keyVaultKeyUri) {
            this.keyVaultKeyUri = Input.ofNullable(keyVaultKeyUri);
            return this;
        }

        public Builder setOfferThroughput(@Nullable Input<Integer> offerThroughput) {
            this.offerThroughput = offerThroughput;
            return this;
        }

        public Builder setOfferThroughput(@Nullable Integer offerThroughput) {
            this.offerThroughput = Input.ofNullable(offerThroughput);
            return this;
        }

        public ServiceCosmosDbConfigurationInfoArgs build() {
            return new ServiceCosmosDbConfigurationInfoArgs(keyVaultKeyUri, offerThroughput);
        }
    }
}
