// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationSpekeKeyProvider;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * A CMAF encryption configuration.
 * 
 */
public final class PackagingConfigurationCmafEncryption extends io.pulumi.resources.InvokeArgs {

    public static final PackagingConfigurationCmafEncryption Empty = new PackagingConfigurationCmafEncryption();

    @Import(name="spekeKeyProvider", required=true)
      private final PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

    public PackagingConfigurationSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public PackagingConfigurationCmafEncryption(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private PackagingConfigurationCmafEncryption() {
        this.spekeKeyProvider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationCmafEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationCmafEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder spekeKeyProvider(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }        public PackagingConfigurationCmafEncryption build() {
            return new PackagingConfigurationCmafEncryption(spekeKeyProvider);
        }
    }
}
