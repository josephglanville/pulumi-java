// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ScaleCapacityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScaleCapacityResponse Empty = new ScaleCapacityResponse();

    @InputImport(name="default", required=true)
    private final String $default;

    public String get$default() {
        return this.$default;
    }

    @InputImport(name="maximum", required=true)
    private final String maximum;

    public String getMaximum() {
        return this.maximum;
    }

    @InputImport(name="minimum", required=true)
    private final String minimum;

    public String getMinimum() {
        return this.minimum;
    }

    public ScaleCapacityResponse(
        String $default,
        String maximum,
        String minimum) {
        this.$default = Objects.requireNonNull($default, "expected parameter '$default' to be non-null");
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
    }

    private ScaleCapacityResponse() {
        this.$default = null;
        this.maximum = null;
        this.minimum = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String $default;
        private String maximum;
        private String minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder set$default(String $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }

        public Builder setMaximum(String maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }

        public Builder setMinimum(String minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }

        public ScaleCapacityResponse build() {
            return new ScaleCapacityResponse($default, maximum, minimum);
        }
    }
}
