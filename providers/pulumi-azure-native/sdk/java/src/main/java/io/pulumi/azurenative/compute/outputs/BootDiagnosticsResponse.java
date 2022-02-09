// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BootDiagnosticsResponse {
    private final @Nullable Boolean enabled;
    private final @Nullable String storageUri;

    @OutputCustomType.Constructor({"enabled","storageUri"})
    private BootDiagnosticsResponse(
        @Nullable Boolean enabled,
        @Nullable String storageUri) {
        this.enabled = enabled;
        this.storageUri = storageUri;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getStorageUri() {
        return Optional.ofNullable(this.storageUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootDiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String storageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BootDiagnosticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.storageUri = defaults.storageUri;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setStorageUri(@Nullable String storageUri) {
            this.storageUri = storageUri;
            return this;
        }

        public BootDiagnosticsResponse build() {
            return new BootDiagnosticsResponse(enabled, storageUri);
        }
    }
}
