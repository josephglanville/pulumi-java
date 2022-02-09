// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class OptimizedAutoscaleResponse extends io.pulumi.resources.InvokeArgs {

    public static final OptimizedAutoscaleResponse Empty = new OptimizedAutoscaleResponse();

    @InputImport(name="isEnabled", required=true)
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @InputImport(name="maximum", required=true)
    private final Integer maximum;

    public Integer getMaximum() {
        return this.maximum;
    }

    @InputImport(name="minimum", required=true)
    private final Integer minimum;

    public Integer getMinimum() {
        return this.minimum;
    }

    @InputImport(name="version", required=true)
    private final Integer version;

    public Integer getVersion() {
        return this.version;
    }

    public OptimizedAutoscaleResponse(
        Boolean isEnabled,
        Integer maximum,
        Integer minimum,
        Integer version) {
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private OptimizedAutoscaleResponse() {
        this.isEnabled = null;
        this.maximum = null;
        this.minimum = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptimizedAutoscaleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;
        private Integer maximum;
        private Integer minimum;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(OptimizedAutoscaleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.version = defaults.version;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setMaximum(Integer maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }

        public Builder setMinimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public OptimizedAutoscaleResponse build() {
            return new OptimizedAutoscaleResponse(isEnabled, maximum, minimum, version);
        }
    }
}
