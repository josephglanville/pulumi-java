// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketObjectLockConfigurationRuleDefaultRetention {
    /**
     * The number of days that you want to specify for the default retention period.
     * 
     */
    private final @Nullable Integer days;
    /**
     * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    private final String mode;
    /**
     * The number of years that you want to specify for the default retention period.
     * 
     */
    private final @Nullable Integer years;

    @CustomType.Constructor
    private BucketObjectLockConfigurationRuleDefaultRetention(
        @CustomType.Parameter("days") @Nullable Integer days,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("years") @Nullable Integer years) {
        this.days = days;
        this.mode = mode;
        this.years = years;
    }

    /**
     * The number of days that you want to specify for the default retention period.
     * 
    */
    public Optional<Integer> getDays() {
        return Optional.ofNullable(this.days);
    }
    /**
     * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * The number of years that you want to specify for the default retention period.
     * 
    */
    public Optional<Integer> getYears() {
        return Optional.ofNullable(this.years);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockConfigurationRuleDefaultRetention defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private String mode;
        private @Nullable Integer years;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockConfigurationRuleDefaultRetention defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.mode = defaults.mode;
    	      this.years = defaults.years;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder years(@Nullable Integer years) {
            this.years = years;
            return this;
        }        public BucketObjectLockConfigurationRuleDefaultRetention build() {
            return new BucketObjectLockConfigurationRuleDefaultRetention(days, mode, years);
        }
    }
}
