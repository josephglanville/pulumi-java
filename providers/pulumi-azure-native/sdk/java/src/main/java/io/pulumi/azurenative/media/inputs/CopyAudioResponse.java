// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CopyAudioResponse extends io.pulumi.resources.InvokeArgs {

    public static final CopyAudioResponse Empty = new CopyAudioResponse();

    @InputImport(name="label")
    private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public CopyAudioResponse(
        @Nullable String label,
        String odataType) {
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private CopyAudioResponse() {
        this.label = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String label;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public CopyAudioResponse build() {
            return new CopyAudioResponse(label, odataType);
        }
    }
}
