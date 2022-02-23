// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProviderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * A Microsoft Smooth Streaming (MSS) encryption configuration.
 * 
 */
public final class OriginEndpointMssEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointMssEncryptionArgs Empty = new OriginEndpointMssEncryptionArgs();

    @InputImport(name="spekeKeyProvider", required=true)
      private final Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

    public Input<OriginEndpointSpekeKeyProviderArgs> getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public OriginEndpointMssEncryptionArgs(Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private OriginEndpointMssEncryptionArgs() {
        this.spekeKeyProvider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointMssEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointMssEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setSpekeKeyProvider(Input<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public Builder setSpekeKeyProvider(OriginEndpointSpekeKeyProviderArgs spekeKeyProvider) {
            this.spekeKeyProvider = Input.of(Objects.requireNonNull(spekeKeyProvider));
            return this;
        }
        public OriginEndpointMssEncryptionArgs build() {
            return new OriginEndpointMssEncryptionArgs(spekeKeyProvider);
        }
    }
}
