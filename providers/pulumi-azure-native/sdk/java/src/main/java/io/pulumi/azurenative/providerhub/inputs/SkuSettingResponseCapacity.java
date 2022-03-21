// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SkuSettingResponseCapacity extends io.pulumi.resources.InvokeArgs {

    public static final SkuSettingResponseCapacity Empty = new SkuSettingResponseCapacity();

    @Import(name="default")
      private final @Nullable Integer $default;

    public Optional<Integer> get$default() {
        return this.$default == null ? Optional.empty() : Optional.ofNullable(this.$default);
    }

    @Import(name="maximum")
      private final @Nullable Integer maximum;

    public Optional<Integer> getMaximum() {
        return this.maximum == null ? Optional.empty() : Optional.ofNullable(this.maximum);
    }

    @Import(name="minimum", required=true)
      private final Integer minimum;

    public Integer getMinimum() {
        return this.minimum;
    }

    @Import(name="scaleType")
      private final @Nullable String scaleType;

    public Optional<String> getScaleType() {
        return this.scaleType == null ? Optional.empty() : Optional.ofNullable(this.scaleType);
    }

    public SkuSettingResponseCapacity(
        @Nullable Integer $default,
        @Nullable Integer maximum,
        Integer minimum,
        @Nullable String scaleType) {
        this.$default = $default;
        this.maximum = maximum;
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
        this.scaleType = scaleType;
    }

    private SkuSettingResponseCapacity() {
        this.$default = null;
        this.maximum = null;
        this.minimum = null;
        this.scaleType = null;
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

        public Builder $default(@Nullable Integer $default) {
            this.$default = $default;
            return this;
        }
        public Builder maximum(@Nullable Integer maximum) {
            this.maximum = maximum;
            return this;
        }
        public Builder minimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public Builder scaleType(@Nullable String scaleType) {
            this.scaleType = scaleType;
            return this;
        }        public SkuSettingResponseCapacity build() {
            return new SkuSettingResponseCapacity($default, maximum, minimum, scaleType);
        }
    }
}
