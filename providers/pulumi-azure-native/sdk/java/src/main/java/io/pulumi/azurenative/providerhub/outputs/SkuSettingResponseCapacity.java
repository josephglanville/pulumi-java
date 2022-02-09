// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SkuSettingResponseCapacity {
    private final @Nullable Integer $default;
    private final @Nullable Integer maximum;
    private final Integer minimum;
    private final @Nullable String scaleType;

    @OutputCustomType.Constructor({"$default","maximum","minimum","scaleType"})
    private SkuSettingResponseCapacity(
        @Nullable Integer $default,
        @Nullable Integer maximum,
        Integer minimum,
        @Nullable String scaleType) {
        this.$default = $default;
        this.maximum = maximum;
        this.minimum = Objects.requireNonNull(minimum);
        this.scaleType = scaleType;
    }

    public Optional<Integer> get$default() {
        return Optional.ofNullable(this.$default);
    }
    public Optional<Integer> getMaximum() {
        return Optional.ofNullable(this.maximum);
    }
    public Integer getMinimum() {
        return this.minimum;
    }
    public Optional<String> getScaleType() {
        return Optional.ofNullable(this.scaleType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuSettingResponseCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer $default;
        private @Nullable Integer maximum;
        private Integer minimum;
        private @Nullable String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuSettingResponseCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder set$default(@Nullable Integer $default) {
            this.$default = $default;
            return this;
        }

        public Builder setMaximum(@Nullable Integer maximum) {
            this.maximum = maximum;
            return this;
        }

        public Builder setMinimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }

        public Builder setScaleType(@Nullable String scaleType) {
            this.scaleType = scaleType;
            return this;
        }

        public SkuSettingResponseCapacity build() {
            return new SkuSettingResponseCapacity($default, maximum, minimum, scaleType);
        }
    }
}
