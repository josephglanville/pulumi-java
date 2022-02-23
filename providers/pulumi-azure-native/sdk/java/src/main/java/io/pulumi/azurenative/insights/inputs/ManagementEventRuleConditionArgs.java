// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ManagementEventAggregationConditionArgs;
import io.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.RuleMetricDataSourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A management event rule condition.
 * 
 */
public final class ManagementEventRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementEventRuleConditionArgs Empty = new ManagementEventRuleConditionArgs();

    /**
     * How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
     */
    @InputImport(name="aggregation")
      private final @Nullable Input<ManagementEventAggregationConditionArgs> aggregation;

    public Input<ManagementEventAggregationConditionArgs> getAggregation() {
        return this.aggregation == null ? Input.empty() : this.aggregation;
    }

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @InputImport(name="dataSource")
      private final @Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;

    public Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> getDataSource() {
        return this.dataSource == null ? Input.empty() : this.dataSource;
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public ManagementEventRuleConditionArgs(
        @Nullable Input<ManagementEventAggregationConditionArgs> aggregation,
        @Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource,
        Input<String> odataType) {
        this.aggregation = aggregation;
        this.dataSource = dataSource;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ManagementEventRuleConditionArgs() {
        this.aggregation = Input.empty();
        this.dataSource = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagementEventAggregationConditionArgs> aggregation;
        private @Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.dataSource = defaults.dataSource;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAggregation(@Nullable Input<ManagementEventAggregationConditionArgs> aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        public Builder setAggregation(@Nullable ManagementEventAggregationConditionArgs aggregation) {
            this.aggregation = Input.ofNullable(aggregation);
            return this;
        }

        public Builder setDataSource(@Nullable Input<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataSource(@Nullable Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs> dataSource) {
            this.dataSource = Input.ofNullable(dataSource);
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
        public ManagementEventRuleConditionArgs build() {
            return new ManagementEventRuleConditionArgs(aggregation, dataSource, odataType);
        }
    }
}
