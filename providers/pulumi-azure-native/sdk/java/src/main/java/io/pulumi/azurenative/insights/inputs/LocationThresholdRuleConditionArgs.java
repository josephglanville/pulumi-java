// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.RuleMetricDataSourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationThresholdRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationThresholdRuleConditionArgs Empty = new LocationThresholdRuleConditionArgs();

    @InputImport(name="dataSource")
    private final @Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;

    public Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> getDataSource() {
        return this.dataSource == null ? Input.empty() : this.dataSource;
    }

    @InputImport(name="failedLocationCount", required=true)
    private final Input<Integer> failedLocationCount;

    public Input<Integer> getFailedLocationCount() {
        return this.failedLocationCount;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    @InputImport(name="windowSize")
    private final @Nullable Input<String> windowSize;

    public Input<String> getWindowSize() {
        return this.windowSize == null ? Input.empty() : this.windowSize;
    }

    public LocationThresholdRuleConditionArgs(
        @Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource,
        Input<Integer> failedLocationCount,
        Input<String> odataType,
        @Nullable Input<String> windowSize) {
        this.dataSource = dataSource;
        this.failedLocationCount = Objects.requireNonNull(failedLocationCount, "expected parameter 'failedLocationCount' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.windowSize = windowSize;
    }

    private LocationThresholdRuleConditionArgs() {
        this.dataSource = Input.empty();
        this.failedLocationCount = Input.empty();
        this.odataType = Input.empty();
        this.windowSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationThresholdRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;
        private Input<Integer> failedLocationCount;
        private Input<String> odataType;
        private @Nullable Input<String> windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationThresholdRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.failedLocationCount = defaults.failedLocationCount;
    	      this.odataType = defaults.odataType;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder setDataSource(@Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataSource(@Nullable Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs> dataSource) {
            this.dataSource = Input.ofNullable(dataSource);
            return this;
        }

        public Builder setFailedLocationCount(Input<Integer> failedLocationCount) {
            this.failedLocationCount = Objects.requireNonNull(failedLocationCount);
            return this;
        }

        public Builder setFailedLocationCount(Integer failedLocationCount) {
            this.failedLocationCount = Input.of(Objects.requireNonNull(failedLocationCount));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setWindowSize(@Nullable Input<String> windowSize) {
            this.windowSize = windowSize;
            return this;
        }

        public Builder setWindowSize(@Nullable String windowSize) {
            this.windowSize = Input.ofNullable(windowSize);
            return this;
        }

        public LocationThresholdRuleConditionArgs build() {
            return new LocationThresholdRuleConditionArgs(dataSource, failedLocationCount, odataType, windowSize);
        }
    }
}
