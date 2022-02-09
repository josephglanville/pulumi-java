// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlPoolWorkloadGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlPoolWorkloadGroupArgs Empty = new SqlPoolWorkloadGroupArgs();

    @InputImport(name="importance")
    private final @Nullable Input<String> importance;

    public Input<String> getImportance() {
        return this.importance == null ? Input.empty() : this.importance;
    }

    @InputImport(name="maxResourcePercent", required=true)
    private final Input<Integer> maxResourcePercent;

    public Input<Integer> getMaxResourcePercent() {
        return this.maxResourcePercent;
    }

    @InputImport(name="maxResourcePercentPerRequest")
    private final @Nullable Input<Double> maxResourcePercentPerRequest;

    public Input<Double> getMaxResourcePercentPerRequest() {
        return this.maxResourcePercentPerRequest == null ? Input.empty() : this.maxResourcePercentPerRequest;
    }

    @InputImport(name="minResourcePercent", required=true)
    private final Input<Integer> minResourcePercent;

    public Input<Integer> getMinResourcePercent() {
        return this.minResourcePercent;
    }

    @InputImport(name="minResourcePercentPerRequest", required=true)
    private final Input<Double> minResourcePercentPerRequest;

    public Input<Double> getMinResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }

    @InputImport(name="queryExecutionTimeout")
    private final @Nullable Input<Integer> queryExecutionTimeout;

    public Input<Integer> getQueryExecutionTimeout() {
        return this.queryExecutionTimeout == null ? Input.empty() : this.queryExecutionTimeout;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sqlPoolName", required=true)
    private final Input<String> sqlPoolName;

    public Input<String> getSqlPoolName() {
        return this.sqlPoolName;
    }

    @InputImport(name="workloadGroupName")
    private final @Nullable Input<String> workloadGroupName;

    public Input<String> getWorkloadGroupName() {
        return this.workloadGroupName == null ? Input.empty() : this.workloadGroupName;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public SqlPoolWorkloadGroupArgs(
        @Nullable Input<String> importance,
        Input<Integer> maxResourcePercent,
        @Nullable Input<Double> maxResourcePercentPerRequest,
        Input<Integer> minResourcePercent,
        Input<Double> minResourcePercentPerRequest,
        @Nullable Input<Integer> queryExecutionTimeout,
        Input<String> resourceGroupName,
        Input<String> sqlPoolName,
        @Nullable Input<String> workloadGroupName,
        Input<String> workspaceName) {
        this.importance = importance;
        this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent, "expected parameter 'maxResourcePercent' to be non-null");
        this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
        this.minResourcePercent = Objects.requireNonNull(minResourcePercent, "expected parameter 'minResourcePercent' to be non-null");
        this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest, "expected parameter 'minResourcePercentPerRequest' to be non-null");
        this.queryExecutionTimeout = queryExecutionTimeout;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlPoolName = Objects.requireNonNull(sqlPoolName, "expected parameter 'sqlPoolName' to be non-null");
        this.workloadGroupName = workloadGroupName;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private SqlPoolWorkloadGroupArgs() {
        this.importance = Input.empty();
        this.maxResourcePercent = Input.empty();
        this.maxResourcePercentPerRequest = Input.empty();
        this.minResourcePercent = Input.empty();
        this.minResourcePercentPerRequest = Input.empty();
        this.queryExecutionTimeout = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sqlPoolName = Input.empty();
        this.workloadGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlPoolWorkloadGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> importance;
        private Input<Integer> maxResourcePercent;
        private @Nullable Input<Double> maxResourcePercentPerRequest;
        private Input<Integer> minResourcePercent;
        private Input<Double> minResourcePercentPerRequest;
        private @Nullable Input<Integer> queryExecutionTimeout;
        private Input<String> resourceGroupName;
        private Input<String> sqlPoolName;
        private @Nullable Input<String> workloadGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlPoolWorkloadGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importance = defaults.importance;
    	      this.maxResourcePercent = defaults.maxResourcePercent;
    	      this.maxResourcePercentPerRequest = defaults.maxResourcePercentPerRequest;
    	      this.minResourcePercent = defaults.minResourcePercent;
    	      this.minResourcePercentPerRequest = defaults.minResourcePercentPerRequest;
    	      this.queryExecutionTimeout = defaults.queryExecutionTimeout;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlPoolName = defaults.sqlPoolName;
    	      this.workloadGroupName = defaults.workloadGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setImportance(@Nullable Input<String> importance) {
            this.importance = importance;
            return this;
        }

        public Builder setImportance(@Nullable String importance) {
            this.importance = Input.ofNullable(importance);
            return this;
        }

        public Builder setMaxResourcePercent(Input<Integer> maxResourcePercent) {
            this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent);
            return this;
        }

        public Builder setMaxResourcePercent(Integer maxResourcePercent) {
            this.maxResourcePercent = Input.of(Objects.requireNonNull(maxResourcePercent));
            return this;
        }

        public Builder setMaxResourcePercentPerRequest(@Nullable Input<Double> maxResourcePercentPerRequest) {
            this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
            return this;
        }

        public Builder setMaxResourcePercentPerRequest(@Nullable Double maxResourcePercentPerRequest) {
            this.maxResourcePercentPerRequest = Input.ofNullable(maxResourcePercentPerRequest);
            return this;
        }

        public Builder setMinResourcePercent(Input<Integer> minResourcePercent) {
            this.minResourcePercent = Objects.requireNonNull(minResourcePercent);
            return this;
        }

        public Builder setMinResourcePercent(Integer minResourcePercent) {
            this.minResourcePercent = Input.of(Objects.requireNonNull(minResourcePercent));
            return this;
        }

        public Builder setMinResourcePercentPerRequest(Input<Double> minResourcePercentPerRequest) {
            this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest);
            return this;
        }

        public Builder setMinResourcePercentPerRequest(Double minResourcePercentPerRequest) {
            this.minResourcePercentPerRequest = Input.of(Objects.requireNonNull(minResourcePercentPerRequest));
            return this;
        }

        public Builder setQueryExecutionTimeout(@Nullable Input<Integer> queryExecutionTimeout) {
            this.queryExecutionTimeout = queryExecutionTimeout;
            return this;
        }

        public Builder setQueryExecutionTimeout(@Nullable Integer queryExecutionTimeout) {
            this.queryExecutionTimeout = Input.ofNullable(queryExecutionTimeout);
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

        public Builder setSqlPoolName(Input<String> sqlPoolName) {
            this.sqlPoolName = Objects.requireNonNull(sqlPoolName);
            return this;
        }

        public Builder setSqlPoolName(String sqlPoolName) {
            this.sqlPoolName = Input.of(Objects.requireNonNull(sqlPoolName));
            return this;
        }

        public Builder setWorkloadGroupName(@Nullable Input<String> workloadGroupName) {
            this.workloadGroupName = workloadGroupName;
            return this;
        }

        public Builder setWorkloadGroupName(@Nullable String workloadGroupName) {
            this.workloadGroupName = Input.ofNullable(workloadGroupName);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public SqlPoolWorkloadGroupArgs build() {
            return new SqlPoolWorkloadGroupArgs(importance, maxResourcePercent, maxResourcePercentPerRequest, minResourcePercent, minResourcePercentPerRequest, queryExecutionTimeout, resourceGroupName, sqlPoolName, workloadGroupName, workspaceName);
        }
    }
}
