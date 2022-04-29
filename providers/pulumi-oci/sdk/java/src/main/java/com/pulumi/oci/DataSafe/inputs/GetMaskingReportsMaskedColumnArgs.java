// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMaskingReportsMaskedColumnArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMaskingReportsMaskedColumnArgs Empty = new GetMaskingReportsMaskedColumnArgs();

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
     * A filter to return only the resources that match the specified masking column group.
     * 
     */
    @Import(name="maskingColumnGroups")
    private @Nullable List<String> maskingColumnGroups;

    /**
     * @return A filter to return only the resources that match the specified masking column group.
     * 
     */
    public Optional<List<String>> maskingColumnGroups() {
        return Optional.ofNullable(this.maskingColumnGroups);
    }

    /**
     * The OCID of the masking report.
     * 
     */
    @Import(name="maskingReportId", required=true)
    private String maskingReportId;

    /**
     * @return The OCID of the masking report.
     * 
     */
    public String maskingReportId() {
        return this.maskingReportId;
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
     * A filter to return only items related to a specific sensitive type OCID.
     * 
     */
    @Import(name="sensitiveTypeId")
    private @Nullable String sensitiveTypeId;

    /**
     * @return A filter to return only items related to a specific sensitive type OCID.
     * 
     */
    public Optional<String> sensitiveTypeId() {
        return Optional.ofNullable(this.sensitiveTypeId);
    }

    private GetMaskingReportsMaskedColumnArgs() {}

    private GetMaskingReportsMaskedColumnArgs(GetMaskingReportsMaskedColumnArgs $) {
        this.columnNames = $.columnNames;
        this.maskingColumnGroups = $.maskingColumnGroups;
        this.maskingReportId = $.maskingReportId;
        this.objectTypes = $.objectTypes;
        this.objects = $.objects;
        this.schemaNames = $.schemaNames;
        this.sensitiveTypeId = $.sensitiveTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMaskingReportsMaskedColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMaskingReportsMaskedColumnArgs $;

        public Builder() {
            $ = new GetMaskingReportsMaskedColumnArgs();
        }

        public Builder(GetMaskingReportsMaskedColumnArgs defaults) {
            $ = new GetMaskingReportsMaskedColumnArgs(Objects.requireNonNull(defaults));
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
         * @param maskingColumnGroups A filter to return only the resources that match the specified masking column group.
         * 
         * @return builder
         * 
         */
        public Builder maskingColumnGroups(@Nullable List<String> maskingColumnGroups) {
            $.maskingColumnGroups = maskingColumnGroups;
            return this;
        }

        /**
         * @param maskingColumnGroups A filter to return only the resources that match the specified masking column group.
         * 
         * @return builder
         * 
         */
        public Builder maskingColumnGroups(String... maskingColumnGroups) {
            return maskingColumnGroups(List.of(maskingColumnGroups));
        }

        /**
         * @param maskingReportId The OCID of the masking report.
         * 
         * @return builder
         * 
         */
        public Builder maskingReportId(String maskingReportId) {
            $.maskingReportId = maskingReportId;
            return this;
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
         * @param sensitiveTypeId A filter to return only items related to a specific sensitive type OCID.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveTypeId(@Nullable String sensitiveTypeId) {
            $.sensitiveTypeId = sensitiveTypeId;
            return this;
        }

        public GetMaskingReportsMaskedColumnArgs build() {
            $.maskingReportId = Objects.requireNonNull($.maskingReportId, "expected parameter 'maskingReportId' to be non-null");
            return $;
        }
    }

}
