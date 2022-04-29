// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DatabaseManagement.inputs.GetManagedDatabaseSqlTuningAdvisorTasksFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedDatabaseSqlTuningAdvisorTasksArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabaseSqlTuningAdvisorTasksArgs Empty = new GetManagedDatabaseSqlTuningAdvisorTasksArgs();

    @Import(name="filters")
    private @Nullable List<GetManagedDatabaseSqlTuningAdvisorTasksFilter> filters;

    public Optional<List<GetManagedDatabaseSqlTuningAdvisorTasksFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    @Import(name="managedDatabaseId", required=true)
    private String managedDatabaseId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    public String managedDatabaseId() {
        return this.managedDatabaseId;
    }

    /**
     * The optional query parameter to filter the SQL Tuning Advisor task list by name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The optional query parameter to filter the SQL Tuning Advisor task list by name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The optional query parameter to filter the SQL Tuning Advisor task list by status.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The optional query parameter to filter the SQL Tuning Advisor task list by status.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The optional greater than or equal to query parameter to filter the timestamp.
     * 
     */
    @Import(name="timeGreaterThanOrEqualTo")
    private @Nullable String timeGreaterThanOrEqualTo;

    /**
     * @return The optional greater than or equal to query parameter to filter the timestamp.
     * 
     */
    public Optional<String> timeGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeGreaterThanOrEqualTo);
    }

    /**
     * The optional less than or equal to query parameter to filter the timestamp.
     * 
     */
    @Import(name="timeLessThanOrEqualTo")
    private @Nullable String timeLessThanOrEqualTo;

    /**
     * @return The optional less than or equal to query parameter to filter the timestamp.
     * 
     */
    public Optional<String> timeLessThanOrEqualTo() {
        return Optional.ofNullable(this.timeLessThanOrEqualTo);
    }

    private GetManagedDatabaseSqlTuningAdvisorTasksArgs() {}

    private GetManagedDatabaseSqlTuningAdvisorTasksArgs(GetManagedDatabaseSqlTuningAdvisorTasksArgs $) {
        this.filters = $.filters;
        this.managedDatabaseId = $.managedDatabaseId;
        this.name = $.name;
        this.status = $.status;
        this.timeGreaterThanOrEqualTo = $.timeGreaterThanOrEqualTo;
        this.timeLessThanOrEqualTo = $.timeLessThanOrEqualTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabaseSqlTuningAdvisorTasksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabaseSqlTuningAdvisorTasksArgs $;

        public Builder() {
            $ = new GetManagedDatabaseSqlTuningAdvisorTasksArgs();
        }

        public Builder(GetManagedDatabaseSqlTuningAdvisorTasksArgs defaults) {
            $ = new GetManagedDatabaseSqlTuningAdvisorTasksArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetManagedDatabaseSqlTuningAdvisorTasksFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetManagedDatabaseSqlTuningAdvisorTasksFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param managedDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            $.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * @param name The optional query parameter to filter the SQL Tuning Advisor task list by name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param status The optional query parameter to filter the SQL Tuning Advisor task list by status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param timeGreaterThanOrEqualTo The optional greater than or equal to query parameter to filter the timestamp.
         * 
         * @return builder
         * 
         */
        public Builder timeGreaterThanOrEqualTo(@Nullable String timeGreaterThanOrEqualTo) {
            $.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeLessThanOrEqualTo The optional less than or equal to query parameter to filter the timestamp.
         * 
         * @return builder
         * 
         */
        public Builder timeLessThanOrEqualTo(@Nullable String timeLessThanOrEqualTo) {
            $.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            return this;
        }

        public GetManagedDatabaseSqlTuningAdvisorTasksArgs build() {
            $.managedDatabaseId = Objects.requireNonNull($.managedDatabaseId, "expected parameter 'managedDatabaseId' to be non-null");
            return $;
        }
    }

}
