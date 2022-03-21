// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.ScheduledQueryMultiMeasureAttributeMapping;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduledQueryMultiMeasureMappings {
    private final List<ScheduledQueryMultiMeasureAttributeMapping> multiMeasureAttributeMappings;
    private final @Nullable String targetMultiMeasureName;

    @CustomType.Constructor
    private ScheduledQueryMultiMeasureMappings(
        @CustomType.Parameter("multiMeasureAttributeMappings") List<ScheduledQueryMultiMeasureAttributeMapping> multiMeasureAttributeMappings,
        @CustomType.Parameter("targetMultiMeasureName") @Nullable String targetMultiMeasureName) {
        this.multiMeasureAttributeMappings = multiMeasureAttributeMappings;
        this.targetMultiMeasureName = targetMultiMeasureName;
    }

    public List<ScheduledQueryMultiMeasureAttributeMapping> getMultiMeasureAttributeMappings() {
        return this.multiMeasureAttributeMappings;
    }
    public Optional<String> getTargetMultiMeasureName() {
        return Optional.ofNullable(this.targetMultiMeasureName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryMultiMeasureMappings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ScheduledQueryMultiMeasureAttributeMapping> multiMeasureAttributeMappings;
        private @Nullable String targetMultiMeasureName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryMultiMeasureMappings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiMeasureAttributeMappings = defaults.multiMeasureAttributeMappings;
    	      this.targetMultiMeasureName = defaults.targetMultiMeasureName;
        }

        public Builder multiMeasureAttributeMappings(List<ScheduledQueryMultiMeasureAttributeMapping> multiMeasureAttributeMappings) {
            this.multiMeasureAttributeMappings = Objects.requireNonNull(multiMeasureAttributeMappings);
            return this;
        }
        public Builder multiMeasureAttributeMappings(ScheduledQueryMultiMeasureAttributeMapping... multiMeasureAttributeMappings) {
            return multiMeasureAttributeMappings(List.of(multiMeasureAttributeMappings));
        }
        public Builder targetMultiMeasureName(@Nullable String targetMultiMeasureName) {
            this.targetMultiMeasureName = targetMultiMeasureName;
            return this;
        }        public ScheduledQueryMultiMeasureMappings build() {
            return new ScheduledQueryMultiMeasureMappings(multiMeasureAttributeMappings, targetMultiMeasureName);
        }
    }
}
