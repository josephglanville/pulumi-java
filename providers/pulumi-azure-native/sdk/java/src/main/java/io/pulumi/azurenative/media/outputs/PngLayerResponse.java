// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PngLayerResponse {
    private final @Nullable String height;
    private final @Nullable String label;
    private final String odataType;
    private final @Nullable String width;

    @OutputCustomType.Constructor({"height","label","odataType","width"})
    private PngLayerResponse(
        @Nullable String height,
        @Nullable String label,
        String odataType,
        @Nullable String width) {
        this.height = height;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType);
        this.width = width;
    }

    public Optional<String> getHeight() {
        return Optional.ofNullable(this.height);
    }
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    public String getOdataType() {
        return this.odataType;
    }
    public Optional<String> getWidth() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PngLayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String height;
        private @Nullable String label;
        private String odataType;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(PngLayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.width = defaults.width;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = height;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = width;
            return this;
        }

        public PngLayerResponse build() {
            return new PngLayerResponse(height, label, odataType, width);
        }
    }
}