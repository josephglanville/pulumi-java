// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.FilterType;
import io.pulumi.azurenative.servicebus.inputs.ActionArgs;
import io.pulumi.azurenative.servicebus.inputs.CorrelationFilterArgs;
import io.pulumi.azurenative.servicebus.inputs.SqlFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    @InputImport(name="action")
    private final @Nullable Input<ActionArgs> action;

    public Input<ActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="correlationFilter")
    private final @Nullable Input<CorrelationFilterArgs> correlationFilter;

    public Input<CorrelationFilterArgs> getCorrelationFilter() {
        return this.correlationFilter == null ? Input.empty() : this.correlationFilter;
    }

    @InputImport(name="filterType")
    private final @Nullable Input<FilterType> filterType;

    public Input<FilterType> getFilterType() {
        return this.filterType == null ? Input.empty() : this.filterType;
    }

    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="ruleName")
    private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    @InputImport(name="sqlFilter")
    private final @Nullable Input<SqlFilterArgs> sqlFilter;

    public Input<SqlFilterArgs> getSqlFilter() {
        return this.sqlFilter == null ? Input.empty() : this.sqlFilter;
    }

    @InputImport(name="subscriptionName", required=true)
    private final Input<String> subscriptionName;

    public Input<String> getSubscriptionName() {
        return this.subscriptionName;
    }

    @InputImport(name="topicName", required=true)
    private final Input<String> topicName;

    public Input<String> getTopicName() {
        return this.topicName;
    }

    public RuleArgs(
        @Nullable Input<ActionArgs> action,
        @Nullable Input<CorrelationFilterArgs> correlationFilter,
        @Nullable Input<FilterType> filterType,
        Input<String> namespaceName,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleName,
        @Nullable Input<SqlFilterArgs> sqlFilter,
        Input<String> subscriptionName,
        Input<String> topicName) {
        this.action = action;
        this.correlationFilter = correlationFilter;
        this.filterType = filterType;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.sqlFilter = sqlFilter;
        this.subscriptionName = Objects.requireNonNull(subscriptionName, "expected parameter 'subscriptionName' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private RuleArgs() {
        this.action = Input.empty();
        this.correlationFilter = Input.empty();
        this.filterType = Input.empty();
        this.namespaceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleName = Input.empty();
        this.sqlFilter = Input.empty();
        this.subscriptionName = Input.empty();
        this.topicName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ActionArgs> action;
        private @Nullable Input<CorrelationFilterArgs> correlationFilter;
        private @Nullable Input<FilterType> filterType;
        private Input<String> namespaceName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleName;
        private @Nullable Input<SqlFilterArgs> sqlFilter;
        private Input<String> subscriptionName;
        private Input<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.correlationFilter = defaults.correlationFilter;
    	      this.filterType = defaults.filterType;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.sqlFilter = defaults.sqlFilter;
    	      this.subscriptionName = defaults.subscriptionName;
    	      this.topicName = defaults.topicName;
        }

        public Builder setAction(@Nullable Input<ActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable ActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setCorrelationFilter(@Nullable Input<CorrelationFilterArgs> correlationFilter) {
            this.correlationFilter = correlationFilter;
            return this;
        }

        public Builder setCorrelationFilter(@Nullable CorrelationFilterArgs correlationFilter) {
            this.correlationFilter = Input.ofNullable(correlationFilter);
            return this;
        }

        public Builder setFilterType(@Nullable Input<FilterType> filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setFilterType(@Nullable FilterType filterType) {
            this.filterType = Input.ofNullable(filterType);
            return this;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRuleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder setRuleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }

        public Builder setSqlFilter(@Nullable Input<SqlFilterArgs> sqlFilter) {
            this.sqlFilter = sqlFilter;
            return this;
        }

        public Builder setSqlFilter(@Nullable SqlFilterArgs sqlFilter) {
            this.sqlFilter = Input.ofNullable(sqlFilter);
            return this;
        }

        public Builder setSubscriptionName(Input<String> subscriptionName) {
            this.subscriptionName = Objects.requireNonNull(subscriptionName);
            return this;
        }

        public Builder setSubscriptionName(String subscriptionName) {
            this.subscriptionName = Input.of(Objects.requireNonNull(subscriptionName));
            return this;
        }

        public Builder setTopicName(Input<String> topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Input.of(Objects.requireNonNull(topicName));
            return this;
        }

        public RuleArgs build() {
            return new RuleArgs(action, correlationFilter, filterType, namespaceName, resourceGroupName, ruleName, sqlFilter, subscriptionName, topicName);
        }
    }
}
