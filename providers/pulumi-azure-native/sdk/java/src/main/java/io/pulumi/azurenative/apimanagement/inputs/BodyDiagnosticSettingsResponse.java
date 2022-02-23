// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Body logging settings.
 * 
 */
public final class BodyDiagnosticSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BodyDiagnosticSettingsResponse Empty = new BodyDiagnosticSettingsResponse();

    /**
     * Number of request body bytes to log.
     * 
     */
    @InputImport(name="bytes")
      private final @Nullable Integer bytes;

    public Optional<Integer> getBytes() {
        return this.bytes == null ? Optional.empty() : Optional.ofNullable(this.bytes);
    }

    public BodyDiagnosticSettingsResponse(@Nullable Integer bytes) {
        this.bytes = bytes;
    }

    private BodyDiagnosticSettingsResponse() {
        this.bytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BodyDiagnosticSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bytes;

        public Builder() {
    	      // Empty
        }

        public Builder(BodyDiagnosticSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytes = defaults.bytes;
        }

        public Builder setBytes(@Nullable Integer bytes) {
            this.bytes = bytes;
            return this;
        }
        public BodyDiagnosticSettingsResponse build() {
            return new BodyDiagnosticSettingsResponse(bytes);
        }
    }
}
