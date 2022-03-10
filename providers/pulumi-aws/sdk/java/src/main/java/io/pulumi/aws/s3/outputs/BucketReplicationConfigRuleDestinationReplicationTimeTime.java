// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class BucketReplicationConfigRuleDestinationReplicationTimeTime {
    /**
     * Time in minutes. Valid values: `15`.
     * 
     */
    private final Integer minutes;

    @OutputCustomType.Constructor
    private BucketReplicationConfigRuleDestinationReplicationTimeTime(@OutputCustomType.Parameter("minutes") Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * Time in minutes. Valid values: `15`.
     * 
    */
    public Integer getMinutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationReplicationTimeTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationReplicationTimeTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
        }

        public Builder setMinutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public BucketReplicationConfigRuleDestinationReplicationTimeTime build() {
            return new BucketReplicationConfigRuleDestinationReplicationTimeTime(minutes);
        }
    }
}
