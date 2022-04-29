// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DatabaseManagement.outputs.GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsFilter;
import com.pulumi.oci.DatabaseManagement.outputs.GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsSqlTuningAdvisorTaskRecommendationCollection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsResult {
    private final String executionId;
    private final @Nullable List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String managedDatabaseId;
    private final String sqlObjectId;
    /**
     * @return The unique identifier of the task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String sqlTuningAdvisorTaskId;
    /**
     * @return The list of sql_tuning_advisor_task_recommendation_collection.
     * 
     */
    private final List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsSqlTuningAdvisorTaskRecommendationCollection> sqlTuningAdvisorTaskRecommendationCollections;

    @CustomType.Constructor
    private GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsResult(
        @CustomType.Parameter("executionId") String executionId,
        @CustomType.Parameter("filters") @Nullable List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("managedDatabaseId") String managedDatabaseId,
        @CustomType.Parameter("sqlObjectId") String sqlObjectId,
        @CustomType.Parameter("sqlTuningAdvisorTaskId") String sqlTuningAdvisorTaskId,
        @CustomType.Parameter("sqlTuningAdvisorTaskRecommendationCollections") List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsSqlTuningAdvisorTaskRecommendationCollection> sqlTuningAdvisorTaskRecommendationCollections) {
        this.executionId = executionId;
        this.filters = filters;
        this.id = id;
        this.managedDatabaseId = managedDatabaseId;
        this.sqlObjectId = sqlObjectId;
        this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
        this.sqlTuningAdvisorTaskRecommendationCollections = sqlTuningAdvisorTaskRecommendationCollections;
    }

    public String executionId() {
        return this.executionId;
    }
    public List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String managedDatabaseId() {
        return this.managedDatabaseId;
    }
    public String sqlObjectId() {
        return this.sqlObjectId;
    }
    /**
     * @return The unique identifier of the task. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String sqlTuningAdvisorTaskId() {
        return this.sqlTuningAdvisorTaskId;
    }
    /**
     * @return The list of sql_tuning_advisor_task_recommendation_collection.
     * 
     */
    public List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsSqlTuningAdvisorTaskRecommendationCollection> sqlTuningAdvisorTaskRecommendationCollections() {
        return this.sqlTuningAdvisorTaskRecommendationCollections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionId;
        private @Nullable List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsFilter> filters;
        private String id;
        private String managedDatabaseId;
        private String sqlObjectId;
        private String sqlTuningAdvisorTaskId;
        private List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsSqlTuningAdvisorTaskRecommendationCollection> sqlTuningAdvisorTaskRecommendationCollections;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionId = defaults.executionId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.managedDatabaseId = defaults.managedDatabaseId;
    	      this.sqlObjectId = defaults.sqlObjectId;
    	      this.sqlTuningAdvisorTaskId = defaults.sqlTuningAdvisorTaskId;
    	      this.sqlTuningAdvisorTaskRecommendationCollections = defaults.sqlTuningAdvisorTaskRecommendationCollections;
        }

        public Builder executionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }
        public Builder filters(@Nullable List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = Objects.requireNonNull(managedDatabaseId);
            return this;
        }
        public Builder sqlObjectId(String sqlObjectId) {
            this.sqlObjectId = Objects.requireNonNull(sqlObjectId);
            return this;
        }
        public Builder sqlTuningAdvisorTaskId(String sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = Objects.requireNonNull(sqlTuningAdvisorTaskId);
            return this;
        }
        public Builder sqlTuningAdvisorTaskRecommendationCollections(List<GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsSqlTuningAdvisorTaskRecommendationCollection> sqlTuningAdvisorTaskRecommendationCollections) {
            this.sqlTuningAdvisorTaskRecommendationCollections = Objects.requireNonNull(sqlTuningAdvisorTaskRecommendationCollections);
            return this;
        }
        public Builder sqlTuningAdvisorTaskRecommendationCollections(GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsSqlTuningAdvisorTaskRecommendationCollection... sqlTuningAdvisorTaskRecommendationCollections) {
            return sqlTuningAdvisorTaskRecommendationCollections(List.of(sqlTuningAdvisorTaskRecommendationCollections));
        }        public GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsResult build() {
            return new GetManagedDatabaseSqlTuningAdvisorTasksRecommendationsResult(executionId, filters, id, managedDatabaseId, sqlObjectId, sqlTuningAdvisorTaskId, sqlTuningAdvisorTaskRecommendationCollections);
        }
    }
}
