// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.SecurityProfileMetricDimensionOperator;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The dimension of a metric.
 * 
 */
public final class SecurityProfileMetricDimension extends io.pulumi.resources.InvokeArgs {

    public static final SecurityProfileMetricDimension Empty = new SecurityProfileMetricDimension();

    /**
     * A unique identifier for the dimension.
     * 
     */
    @Import(name="dimensionName", required=true)
      private final String dimensionName;

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * Defines how the dimensionValues of a dimension are interpreted.
     * 
     */
    @Import(name="operator")
      private final @Nullable SecurityProfileMetricDimensionOperator operator;

    public Optional<SecurityProfileMetricDimensionOperator> getOperator() {
        return this.operator == null ? Optional.empty() : Optional.ofNullable(this.operator);
    }

    public SecurityProfileMetricDimension(
        String dimensionName,
        @Nullable SecurityProfileMetricDimensionOperator operator) {
        this.dimensionName = Objects.requireNonNull(dimensionName, "expected parameter 'dimensionName' to be non-null");
        this.operator = operator;
    }

    private SecurityProfileMetricDimension() {
        this.dimensionName = null;
        this.operator = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dimensionName;
        private @Nullable SecurityProfileMetricDimensionOperator operator;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionName = defaults.dimensionName;
    	      this.operator = defaults.operator;
        }

        public Builder dimensionName(String dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }
        public Builder operator(@Nullable SecurityProfileMetricDimensionOperator operator) {
            this.operator = operator;
            return this;
        }        public SecurityProfileMetricDimension build() {
            return new SecurityProfileMetricDimension(dimensionName, operator);
        }
    }
}
