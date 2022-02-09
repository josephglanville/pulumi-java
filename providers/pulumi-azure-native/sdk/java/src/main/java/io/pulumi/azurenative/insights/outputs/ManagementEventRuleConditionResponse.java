// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.ManagementEventAggregationConditionResponse;
import io.pulumi.azurenative.insights.outputs.RuleManagementEventDataSourceResponse;
import io.pulumi.azurenative.insights.outputs.RuleMetricDataSourceResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementEventRuleConditionResponse {
    private final @Nullable ManagementEventAggregationConditionResponse aggregation;
    private final @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
    private final String odataType;

    @OutputCustomType.Constructor({"aggregation","dataSource","odataType"})
    private ManagementEventRuleConditionResponse(
        @Nullable ManagementEventAggregationConditionResponse aggregation,
        @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource,
        String odataType) {
        this.aggregation = aggregation;
        this.dataSource = dataSource;
        this.odataType = Objects.requireNonNull(odataType);
    }

    public Optional<ManagementEventAggregationConditionResponse> getAggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    public Optional<Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse>> getDataSource() {
        return Optional.ofNullable(this.dataSource);
    }
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagementEventAggregationConditionResponse aggregation;
        private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.dataSource = defaults.dataSource;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAggregation(@Nullable ManagementEventAggregationConditionResponse aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        public Builder setDataSource(@Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public ManagementEventRuleConditionResponse build() {
            return new ManagementEventRuleConditionResponse(aggregation, dataSource, odataType);
        }
    }
}
