// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RetentionPolicyResponse {
    /**
     * the number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
     */
    private final Integer days;
    /**
     * a value indicating whether the retention policy is enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private RetentionPolicyResponse(
        @CustomType.Parameter("days") Integer days,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.days = days;
        this.enabled = enabled;
    }

    /**
     * the number of days for the retention in days. A value of 0 will retain the events indefinitely.
     * 
    */
    public Integer getDays() {
        return this.days;
    }
    /**
     * a value indicating whether the retention policy is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer days;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public RetentionPolicyResponse build() {
            return new RetentionPolicyResponse(days, enabled);
        }
    }
}
