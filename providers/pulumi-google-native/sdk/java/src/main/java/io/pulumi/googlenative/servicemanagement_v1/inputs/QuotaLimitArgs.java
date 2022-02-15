// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuotaLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuotaLimitArgs Empty = new QuotaLimitArgs();

    @InputImport(name="defaultLimit")
    private final @Nullable Input<String> defaultLimit;

    public Input<String> getDefaultLimit() {
        return this.defaultLimit == null ? Input.empty() : this.defaultLimit;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="duration")
    private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    @InputImport(name="freeTier")
    private final @Nullable Input<String> freeTier;

    public Input<String> getFreeTier() {
        return this.freeTier == null ? Input.empty() : this.freeTier;
    }

    @InputImport(name="maxLimit")
    private final @Nullable Input<String> maxLimit;

    public Input<String> getMaxLimit() {
        return this.maxLimit == null ? Input.empty() : this.maxLimit;
    }

    @InputImport(name="metric")
    private final @Nullable Input<String> metric;

    public Input<String> getMetric() {
        return this.metric == null ? Input.empty() : this.metric;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="unit")
    private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    @InputImport(name="values")
    private final @Nullable Input<Map<String,String>> values;

    public Input<Map<String,String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public QuotaLimitArgs(
        @Nullable Input<String> defaultLimit,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> duration,
        @Nullable Input<String> freeTier,
        @Nullable Input<String> maxLimit,
        @Nullable Input<String> metric,
        @Nullable Input<String> name,
        @Nullable Input<String> unit,
        @Nullable Input<Map<String,String>> values) {
        this.defaultLimit = defaultLimit;
        this.description = description;
        this.displayName = displayName;
        this.duration = duration;
        this.freeTier = freeTier;
        this.maxLimit = maxLimit;
        this.metric = metric;
        this.name = name;
        this.unit = unit;
        this.values = values;
    }

    private QuotaLimitArgs() {
        this.defaultLimit = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.duration = Input.empty();
        this.freeTier = Input.empty();
        this.maxLimit = Input.empty();
        this.metric = Input.empty();
        this.name = Input.empty();
        this.unit = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultLimit;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> duration;
        private @Nullable Input<String> freeTier;
        private @Nullable Input<String> maxLimit;
        private @Nullable Input<String> metric;
        private @Nullable Input<String> name;
        private @Nullable Input<String> unit;
        private @Nullable Input<Map<String,String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(QuotaLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLimit = defaults.defaultLimit;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.duration = defaults.duration;
    	      this.freeTier = defaults.freeTier;
    	      this.maxLimit = defaults.maxLimit;
    	      this.metric = defaults.metric;
    	      this.name = defaults.name;
    	      this.unit = defaults.unit;
    	      this.values = defaults.values;
        }

        public Builder setDefaultLimit(@Nullable Input<String> defaultLimit) {
            this.defaultLimit = defaultLimit;
            return this;
        }

        public Builder setDefaultLimit(@Nullable String defaultLimit) {
            this.defaultLimit = Input.ofNullable(defaultLimit);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setDuration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setFreeTier(@Nullable Input<String> freeTier) {
            this.freeTier = freeTier;
            return this;
        }

        public Builder setFreeTier(@Nullable String freeTier) {
            this.freeTier = Input.ofNullable(freeTier);
            return this;
        }

        public Builder setMaxLimit(@Nullable Input<String> maxLimit) {
            this.maxLimit = maxLimit;
            return this;
        }

        public Builder setMaxLimit(@Nullable String maxLimit) {
            this.maxLimit = Input.ofNullable(maxLimit);
            return this;
        }

        public Builder setMetric(@Nullable Input<String> metric) {
            this.metric = metric;
            return this;
        }

        public Builder setMetric(@Nullable String metric) {
            this.metric = Input.ofNullable(metric);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setUnit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }

        public Builder setValues(@Nullable Input<Map<String,String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable Map<String,String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public QuotaLimitArgs build() {
            return new QuotaLimitArgs(defaultLimit, description, displayName, duration, freeTier, maxLimit, metric, name, unit, values);
        }
    }
}