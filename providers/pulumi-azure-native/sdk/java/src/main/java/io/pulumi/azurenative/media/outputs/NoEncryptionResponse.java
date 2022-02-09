// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.EnabledProtocolsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NoEncryptionResponse {
    private final @Nullable EnabledProtocolsResponse enabledProtocols;

    @OutputCustomType.Constructor({"enabledProtocols"})
    private NoEncryptionResponse(@Nullable EnabledProtocolsResponse enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
    }

    public Optional<EnabledProtocolsResponse> getEnabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EnabledProtocolsResponse enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(NoEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        public Builder setEnabledProtocols(@Nullable EnabledProtocolsResponse enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }

        public NoEncryptionResponse build() {
            return new NoEncryptionResponse(enabledProtocols);
        }
    }
}
