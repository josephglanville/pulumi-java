// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.GetDeploymentsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentsArgs Empty = new GetDeploymentsArgs();

    /**
     * The OCID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The OCID of the compartment in which to list resources.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The ID of the parent pipeline.
     * 
     */
    @Import(name="deployPipelineId")
    private @Nullable String deployPipelineId;

    /**
     * @return The ID of the parent pipeline.
     * 
     */
    public Optional<String> deployPipelineId() {
        return Optional.ofNullable(this.deployPipelineId);
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetDeploymentsFilter> filters;

    public Optional<List<GetDeploymentsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * unique project identifier
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return unique project identifier
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * A filter to return only Deployments that matches the given lifecycleState.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only Deployments that matches the given lifecycleState.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Search for DevOps resources that were created after a specific date. Specifying this parameter corresponding to `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all security assessments created after the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    @Import(name="timeCreatedGreaterThanOrEqualTo")
    private @Nullable String timeCreatedGreaterThanOrEqualTo;

    /**
     * @return Search for DevOps resources that were created after a specific date. Specifying this parameter corresponding to `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all security assessments created after the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    public Optional<String> timeCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeCreatedGreaterThanOrEqualTo);
    }

    /**
     * Search for DevOps resources that were created before a specific date. Specifying this parameter corresponding to `timeCreatedLessThan` parameter will retrieve all assessments created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    @Import(name="timeCreatedLessThan")
    private @Nullable String timeCreatedLessThan;

    /**
     * @return Search for DevOps resources that were created before a specific date. Specifying this parameter corresponding to `timeCreatedLessThan` parameter will retrieve all assessments created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    public Optional<String> timeCreatedLessThan() {
        return Optional.ofNullable(this.timeCreatedLessThan);
    }

    private GetDeploymentsArgs() {}

    private GetDeploymentsArgs(GetDeploymentsArgs $) {
        this.compartmentId = $.compartmentId;
        this.deployPipelineId = $.deployPipelineId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.projectId = $.projectId;
        this.state = $.state;
        this.timeCreatedGreaterThanOrEqualTo = $.timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = $.timeCreatedLessThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentsArgs $;

        public Builder() {
            $ = new GetDeploymentsArgs();
        }

        public Builder(GetDeploymentsArgs defaults) {
            $ = new GetDeploymentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param deployPipelineId The ID of the parent pipeline.
         * 
         * @return builder
         * 
         */
        public Builder deployPipelineId(@Nullable String deployPipelineId) {
            $.deployPipelineId = deployPipelineId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetDeploymentsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDeploymentsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Unique identifier or OCID for listing a single resource by ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param projectId unique project identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param state A filter to return only Deployments that matches the given lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param timeCreatedGreaterThanOrEqualTo Search for DevOps resources that were created after a specific date. Specifying this parameter corresponding to `timeCreatedGreaterThanOrEqualTo` parameter will retrieve all security assessments created after the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedGreaterThanOrEqualTo(@Nullable String timeCreatedGreaterThanOrEqualTo) {
            $.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * @param timeCreatedLessThan Search for DevOps resources that were created before a specific date. Specifying this parameter corresponding to `timeCreatedLessThan` parameter will retrieve all assessments created before the specified created date, in &#34;YYYY-MM-ddThh:mmZ&#34; format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedLessThan(@Nullable String timeCreatedLessThan) {
            $.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        public GetDeploymentsArgs build() {
            return $;
        }
    }

}
