// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnalyticsApplicationInputsStartingPositionConfiguration {
    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    private final @Nullable String startingPosition;

    @OutputCustomType.Constructor
    private AnalyticsApplicationInputsStartingPositionConfiguration(@OutputCustomType.Parameter("startingPosition") @Nullable String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
    */
    public Optional<String> getStartingPosition() {
        return Optional.ofNullable(this.startingPosition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsStartingPositionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String startingPosition;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsStartingPositionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startingPosition = defaults.startingPosition;
        }

        public Builder setStartingPosition(@Nullable String startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }
        public AnalyticsApplicationInputsStartingPositionConfiguration build() {
            return new AnalyticsApplicationInputsStartingPositionConfiguration(startingPosition);
        }
    }
}
