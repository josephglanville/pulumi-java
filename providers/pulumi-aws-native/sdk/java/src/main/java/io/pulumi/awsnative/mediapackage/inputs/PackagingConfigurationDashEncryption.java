// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationSpekeKeyProvider;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
 * 
 */
public final class PackagingConfigurationDashEncryption extends io.pulumi.resources.InvokeArgs {

    public static final PackagingConfigurationDashEncryption Empty = new PackagingConfigurationDashEncryption();

    @InputImport(name="spekeKeyProvider", required=true)
      private final PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

    public PackagingConfigurationSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public PackagingConfigurationDashEncryption(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private PackagingConfigurationDashEncryption() {
        this.spekeKeyProvider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationDashEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationDashEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setSpekeKeyProvider(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }
        public PackagingConfigurationDashEncryption build() {
            return new PackagingConfigurationDashEncryption(spekeKeyProvider);
        }
    }
}
