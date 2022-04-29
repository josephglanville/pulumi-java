// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetSensitiveDataModelsSensitiveColumnsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSensitiveDataModelsSensitiveColumnsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSensitiveDataModelsSensitiveColumnsArgs Empty = new GetSensitiveDataModelsSensitiveColumnsArgs();

    /**
     * A filter to return only the sensitive columns that belong to the specified column group.
     * 
     */
    @Import(name="columnGroup")
    private @Nullable String columnGroup;

    /**
     * @return A filter to return only the sensitive columns that belong to the specified column group.
     * 
     */
    public Optional<String> columnGroup() {
        return Optional.ofNullable(this.columnGroup);
    }

    /**
     * A filter to return only a specific column based on column name.
     * 
     */
    @Import(name="columnNames")
    private @Nullable List<String> columnNames;

    /**
     * @return A filter to return only a specific column based on column name.
     * 
     */
    public Optional<List<String>> columnNames() {
        return Optional.ofNullable(this.columnNames);
    }

    /**
     * A filter to return only the resources that match the specified data types.
     * 
     */
    @Import(name="dataTypes")
    private @Nullable List<String> dataTypes;

    /**
     * @return A filter to return only the resources that match the specified data types.
     * 
     */
    public Optional<List<String>> dataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }

    @Import(name="filters")
    private @Nullable List<GetSensitiveDataModelsSensitiveColumnsFilter> filters;

    public Optional<List<GetSensitiveDataModelsSensitiveColumnsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only items related to a specific object type.
     * 
     */
    @Import(name="objectTypes")
    private @Nullable List<String> objectTypes;

    /**
     * @return A filter to return only items related to a specific object type.
     * 
     */
    public Optional<List<String>> objectTypes() {
        return Optional.ofNullable(this.objectTypes);
    }

    /**
     * A filter to return only items related to a specific object name.
     * 
     */
    @Import(name="objects")
    private @Nullable List<String> objects;

    /**
     * @return A filter to return only items related to a specific object name.
     * 
     */
    public Optional<List<String>> objects() {
        return Optional.ofNullable(this.objects);
    }

    /**
     * A filter to return only the sensitive columns that are children of one of the columns identified by the specified keys.
     * 
     */
    @Import(name="parentColumnKeys")
    private @Nullable List<String> parentColumnKeys;

    /**
     * @return A filter to return only the sensitive columns that are children of one of the columns identified by the specified keys.
     * 
     */
    public Optional<List<String>> parentColumnKeys() {
        return Optional.ofNullable(this.parentColumnKeys);
    }

    /**
     * A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE, it returns the sensitive columns that do not have any parent. The response includes the parent columns as well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED, it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
     * 
     */
    @Import(name="relationTypes")
    private @Nullable List<String> relationTypes;

    /**
     * @return A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE, it returns the sensitive columns that do not have any parent. The response includes the parent columns as well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED, it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
     * 
     */
    public Optional<List<String>> relationTypes() {
        return Optional.ofNullable(this.relationTypes);
    }

    /**
     * A filter to return only items related to specific schema name.
     * 
     */
    @Import(name="schemaNames")
    private @Nullable List<String> schemaNames;

    /**
     * @return A filter to return only items related to specific schema name.
     * 
     */
    public Optional<List<String>> schemaNames() {
        return Optional.ofNullable(this.schemaNames);
    }

    /**
     * Filters the sensitive column resources with the given lifecycle state values.
     * 
     */
    @Import(name="sensitiveColumnLifecycleState")
    private @Nullable String sensitiveColumnLifecycleState;

    /**
     * @return Filters the sensitive column resources with the given lifecycle state values.
     * 
     */
    public Optional<String> sensitiveColumnLifecycleState() {
        return Optional.ofNullable(this.sensitiveColumnLifecycleState);
    }

    /**
     * The OCID of the sensitive data model.
     * 
     */
    @Import(name="sensitiveDataModelId", required=true)
    private String sensitiveDataModelId;

    /**
     * @return The OCID of the sensitive data model.
     * 
     */
    public String sensitiveDataModelId() {
        return this.sensitiveDataModelId;
    }

    /**
     * A filter to return only the sensitive columns that are associated with one of the sensitive types identified by the specified OCIDs.
     * 
     */
    @Import(name="sensitiveTypeIds")
    private @Nullable List<String> sensitiveTypeIds;

    /**
     * @return A filter to return only the sensitive columns that are associated with one of the sensitive types identified by the specified OCIDs.
     * 
     */
    public Optional<List<String>> sensitiveTypeIds() {
        return Optional.ofNullable(this.sensitiveTypeIds);
    }

    /**
     * A filter to return only the sensitive columns that match the specified status.
     * 
     */
    @Import(name="statuses")
    private @Nullable List<String> statuses;

    /**
     * @return A filter to return only the sensitive columns that match the specified status.
     * 
     */
    public Optional<List<String>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * A filter to return only the resources that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after that date.
     * 
     */
    @Import(name="timeCreatedGreaterThanOrEqualTo")
    private @Nullable String timeCreatedGreaterThanOrEqualTo;

    /**
     * @return A filter to return only the resources that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after that date.
     * 
     */
    public Optional<String> timeCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeCreatedGreaterThanOrEqualTo);
    }

    /**
     * Search for resources that were created before a specific date. Specifying this parameter corresponding `timeCreatedLessThan` parameter will retrieve all resources created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    @Import(name="timeCreatedLessThan")
    private @Nullable String timeCreatedLessThan;

    /**
     * @return Search for resources that were created before a specific date. Specifying this parameter corresponding `timeCreatedLessThan` parameter will retrieve all resources created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    public Optional<String> timeCreatedLessThan() {
        return Optional.ofNullable(this.timeCreatedLessThan);
    }

    /**
     * Search for resources that were updated after a specific date. Specifying this parameter corresponding `timeUpdatedGreaterThanOrEqualTo` parameter will retrieve all resources updated after the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    @Import(name="timeUpdatedGreaterThanOrEqualTo")
    private @Nullable String timeUpdatedGreaterThanOrEqualTo;

    /**
     * @return Search for resources that were updated after a specific date. Specifying this parameter corresponding `timeUpdatedGreaterThanOrEqualTo` parameter will retrieve all resources updated after the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    public Optional<String> timeUpdatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeUpdatedGreaterThanOrEqualTo);
    }

    /**
     * Search for resources that were updated before a specific date. Specifying this parameter corresponding `timeUpdatedLessThan` parameter will retrieve all resources updated before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    @Import(name="timeUpdatedLessThan")
    private @Nullable String timeUpdatedLessThan;

    /**
     * @return Search for resources that were updated before a specific date. Specifying this parameter corresponding `timeUpdatedLessThan` parameter will retrieve all resources updated before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    public Optional<String> timeUpdatedLessThan() {
        return Optional.ofNullable(this.timeUpdatedLessThan);
    }

    private GetSensitiveDataModelsSensitiveColumnsArgs() {}

    private GetSensitiveDataModelsSensitiveColumnsArgs(GetSensitiveDataModelsSensitiveColumnsArgs $) {
        this.columnGroup = $.columnGroup;
        this.columnNames = $.columnNames;
        this.dataTypes = $.dataTypes;
        this.filters = $.filters;
        this.objectTypes = $.objectTypes;
        this.objects = $.objects;
        this.parentColumnKeys = $.parentColumnKeys;
        this.relationTypes = $.relationTypes;
        this.schemaNames = $.schemaNames;
        this.sensitiveColumnLifecycleState = $.sensitiveColumnLifecycleState;
        this.sensitiveDataModelId = $.sensitiveDataModelId;
        this.sensitiveTypeIds = $.sensitiveTypeIds;
        this.statuses = $.statuses;
        this.timeCreatedGreaterThanOrEqualTo = $.timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = $.timeCreatedLessThan;
        this.timeUpdatedGreaterThanOrEqualTo = $.timeUpdatedGreaterThanOrEqualTo;
        this.timeUpdatedLessThan = $.timeUpdatedLessThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSensitiveDataModelsSensitiveColumnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSensitiveDataModelsSensitiveColumnsArgs $;

        public Builder() {
            $ = new GetSensitiveDataModelsSensitiveColumnsArgs();
        }

        public Builder(GetSensitiveDataModelsSensitiveColumnsArgs defaults) {
            $ = new GetSensitiveDataModelsSensitiveColumnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnGroup A filter to return only the sensitive columns that belong to the specified column group.
         * 
         * @return builder
         * 
         */
        public Builder columnGroup(@Nullable String columnGroup) {
            $.columnGroup = columnGroup;
            return this;
        }

        /**
         * @param columnNames A filter to return only a specific column based on column name.
         * 
         * @return builder
         * 
         */
        public Builder columnNames(@Nullable List<String> columnNames) {
            $.columnNames = columnNames;
            return this;
        }

        /**
         * @param columnNames A filter to return only a specific column based on column name.
         * 
         * @return builder
         * 
         */
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }

        /**
         * @param dataTypes A filter to return only the resources that match the specified data types.
         * 
         * @return builder
         * 
         */
        public Builder dataTypes(@Nullable List<String> dataTypes) {
            $.dataTypes = dataTypes;
            return this;
        }

        /**
         * @param dataTypes A filter to return only the resources that match the specified data types.
         * 
         * @return builder
         * 
         */
        public Builder dataTypes(String... dataTypes) {
            return dataTypes(List.of(dataTypes));
        }

        public Builder filters(@Nullable List<GetSensitiveDataModelsSensitiveColumnsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetSensitiveDataModelsSensitiveColumnsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param objectTypes A filter to return only items related to a specific object type.
         * 
         * @return builder
         * 
         */
        public Builder objectTypes(@Nullable List<String> objectTypes) {
            $.objectTypes = objectTypes;
            return this;
        }

        /**
         * @param objectTypes A filter to return only items related to a specific object type.
         * 
         * @return builder
         * 
         */
        public Builder objectTypes(String... objectTypes) {
            return objectTypes(List.of(objectTypes));
        }

        /**
         * @param objects A filter to return only items related to a specific object name.
         * 
         * @return builder
         * 
         */
        public Builder objects(@Nullable List<String> objects) {
            $.objects = objects;
            return this;
        }

        /**
         * @param objects A filter to return only items related to a specific object name.
         * 
         * @return builder
         * 
         */
        public Builder objects(String... objects) {
            return objects(List.of(objects));
        }

        /**
         * @param parentColumnKeys A filter to return only the sensitive columns that are children of one of the columns identified by the specified keys.
         * 
         * @return builder
         * 
         */
        public Builder parentColumnKeys(@Nullable List<String> parentColumnKeys) {
            $.parentColumnKeys = parentColumnKeys;
            return this;
        }

        /**
         * @param parentColumnKeys A filter to return only the sensitive columns that are children of one of the columns identified by the specified keys.
         * 
         * @return builder
         * 
         */
        public Builder parentColumnKeys(String... parentColumnKeys) {
            return parentColumnKeys(List.of(parentColumnKeys));
        }

        /**
         * @param relationTypes A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE, it returns the sensitive columns that do not have any parent. The response includes the parent columns as well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED, it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
         * 
         * @return builder
         * 
         */
        public Builder relationTypes(@Nullable List<String> relationTypes) {
            $.relationTypes = relationTypes;
            return this;
        }

        /**
         * @param relationTypes A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE, it returns the sensitive columns that do not have any parent. The response includes the parent columns as well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED, it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
         * 
         * @return builder
         * 
         */
        public Builder relationTypes(String... relationTypes) {
            return relationTypes(List.of(relationTypes));
        }

        /**
         * @param schemaNames A filter to return only items related to specific schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaNames(@Nullable List<String> schemaNames) {
            $.schemaNames = schemaNames;
            return this;
        }

        /**
         * @param schemaNames A filter to return only items related to specific schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaNames(String... schemaNames) {
            return schemaNames(List.of(schemaNames));
        }

        /**
         * @param sensitiveColumnLifecycleState Filters the sensitive column resources with the given lifecycle state values.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveColumnLifecycleState(@Nullable String sensitiveColumnLifecycleState) {
            $.sensitiveColumnLifecycleState = sensitiveColumnLifecycleState;
            return this;
        }

        /**
         * @param sensitiveDataModelId The OCID of the sensitive data model.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            $.sensitiveDataModelId = sensitiveDataModelId;
            return this;
        }

        /**
         * @param sensitiveTypeIds A filter to return only the sensitive columns that are associated with one of the sensitive types identified by the specified OCIDs.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveTypeIds(@Nullable List<String> sensitiveTypeIds) {
            $.sensitiveTypeIds = sensitiveTypeIds;
            return this;
        }

        /**
         * @param sensitiveTypeIds A filter to return only the sensitive columns that are associated with one of the sensitive types identified by the specified OCIDs.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveTypeIds(String... sensitiveTypeIds) {
            return sensitiveTypeIds(List.of(sensitiveTypeIds));
        }

        /**
         * @param statuses A filter to return only the sensitive columns that match the specified status.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable List<String> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses A filter to return only the sensitive columns that match the specified status.
         * 
         * @return builder
         * 
         */
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param timeCreatedGreaterThanOrEqualTo A filter to return only the resources that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after that date.
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedGreaterThanOrEqualTo(@Nullable String timeCreatedGreaterThanOrEqualTo) {
            $.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeCreatedLessThan Search for resources that were created before a specific date. Specifying this parameter corresponding `timeCreatedLessThan` parameter will retrieve all resources created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedLessThan(@Nullable String timeCreatedLessThan) {
            $.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * @param timeUpdatedGreaterThanOrEqualTo Search for resources that were updated after a specific date. Specifying this parameter corresponding `timeUpdatedGreaterThanOrEqualTo` parameter will retrieve all resources updated after the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(@Nullable String timeUpdatedGreaterThanOrEqualTo) {
            $.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeUpdatedLessThan Search for resources that were updated before a specific date. Specifying this parameter corresponding `timeUpdatedLessThan` parameter will retrieve all resources updated before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdatedLessThan(@Nullable String timeUpdatedLessThan) {
            $.timeUpdatedLessThan = timeUpdatedLessThan;
            return this;
        }

        public GetSensitiveDataModelsSensitiveColumnsArgs build() {
            $.sensitiveDataModelId = Objects.requireNonNull($.sensitiveDataModelId, "expected parameter 'sensitiveDataModelId' to be non-null");
            return $;
        }
    }

}
