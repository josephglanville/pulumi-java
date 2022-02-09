// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SkuCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuCapacityArgs Empty = new SkuCapacityArgs();

    @InputImport(name="default")
    private final @Nullable Input<Integer> $default;

    public Input<Integer> get$default() {
        return this.$default == null ? Input.empty() : this.$default;
    }

    @InputImport(name="elasticMaximum")
    private final @Nullable Input<Integer> elasticMaximum;

    public Input<Integer> getElasticMaximum() {
        return this.elasticMaximum == null ? Input.empty() : this.elasticMaximum;
    }

    @InputImport(name="maximum")
    private final @Nullable Input<Integer> maximum;

    public Input<Integer> getMaximum() {
        return this.maximum == null ? Input.empty() : this.maximum;
    }

    @InputImport(name="minimum")
    private final @Nullable Input<Integer> minimum;

    public Input<Integer> getMinimum() {
        return this.minimum == null ? Input.empty() : this.minimum;
    }

    @InputImport(name="scaleType")
    private final @Nullable Input<String> scaleType;

    public Input<String> getScaleType() {
        return this.scaleType == null ? Input.empty() : this.scaleType;
    }

    public SkuCapacityArgs(
        @Nullable Input<Integer> $default,
        @Nullable Input<Integer> elasticMaximum,
        @Nullable Input<Integer> maximum,
        @Nullable Input<Integer> minimum,
        @Nullable Input<String> scaleType) {
        this.$default = $default;
        this.elasticMaximum = elasticMaximum;
        this.maximum = maximum;
        this.minimum = minimum;
        this.scaleType = scaleType;
    }

    private SkuCapacityArgs() {
        this.$default = Input.empty();
        this.elasticMaximum = Input.empty();
        this.maximum = Input.empty();
        this.minimum = Input.empty();
        this.scaleType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> $default;
        private @Nullable Input<Integer> elasticMaximum;
        private @Nullable Input<Integer> maximum;
        private @Nullable Input<Integer> minimum;
        private @Nullable Input<String> scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.elasticMaximum = defaults.elasticMaximum;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder set$default(@Nullable Input<Integer> $default) {
            this.$default = $default;
            return this;
        }

        public Builder set$default(@Nullable Integer $default) {
            this.$default = Input.ofNullable($default);
            return this;
        }

        public Builder setElasticMaximum(@Nullable Input<Integer> elasticMaximum) {
            this.elasticMaximum = elasticMaximum;
            return this;
        }

        public Builder setElasticMaximum(@Nullable Integer elasticMaximum) {
            this.elasticMaximum = Input.ofNullable(elasticMaximum);
            return this;
        }

        public Builder setMaximum(@Nullable Input<Integer> maximum) {
            this.maximum = maximum;
            return this;
        }

        public Builder setMaximum(@Nullable Integer maximum) {
            this.maximum = Input.ofNullable(maximum);
            return this;
        }

        public Builder setMinimum(@Nullable Input<Integer> minimum) {
            this.minimum = minimum;
            return this;
        }

        public Builder setMinimum(@Nullable Integer minimum) {
            this.minimum = Input.ofNullable(minimum);
            return this;
        }

        public Builder setScaleType(@Nullable Input<String> scaleType) {
            this.scaleType = scaleType;
            return this;
        }

        public Builder setScaleType(@Nullable String scaleType) {
            this.scaleType = Input.ofNullable(scaleType);
            return this;
        }

        public SkuCapacityArgs build() {
            return new SkuCapacityArgs($default, elasticMaximum, maximum, minimum, scaleType);
        }
    }
}
