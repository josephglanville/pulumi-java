// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTablePointInTimeRecoverySpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTablePointInTimeRecoverySpecificationArgs Empty = new GlobalTablePointInTimeRecoverySpecificationArgs();

    @Import(name="pointInTimeRecoveryEnabled")
      private final @Nullable Output<Boolean> pointInTimeRecoveryEnabled;

    public Output<Boolean> getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled == null ? Output.empty() : this.pointInTimeRecoveryEnabled;
    }

    public GlobalTablePointInTimeRecoverySpecificationArgs(@Nullable Output<Boolean> pointInTimeRecoveryEnabled) {
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
    }

    private GlobalTablePointInTimeRecoverySpecificationArgs() {
        this.pointInTimeRecoveryEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTablePointInTimeRecoverySpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> pointInTimeRecoveryEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTablePointInTimeRecoverySpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
        }

        public Builder pointInTimeRecoveryEnabled(@Nullable Output<Boolean> pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }
        public Builder pointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Output.ofNullable(pointInTimeRecoveryEnabled);
            return this;
        }        public GlobalTablePointInTimeRecoverySpecificationArgs build() {
            return new GlobalTablePointInTimeRecoverySpecificationArgs(pointInTimeRecoveryEnabled);
        }
    }
}
