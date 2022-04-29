// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetDeployEnvironmentsDeployEnvironmentCollection;
import com.pulumi.oci.DevOps.outputs.GetDeployEnvironmentsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeployEnvironmentsResult {
    /**
     * @return The OCID of a compartment.
     * 
     */
    private final @Nullable String compartmentId;
    /**
     * @return The list of deploy_environment_collection.
     * 
     */
    private final List<GetDeployEnvironmentsDeployEnvironmentCollection> deployEnvironmentCollections;
    /**
     * @return Deployment environment display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetDeployEnvironmentsFilter> filters;
    /**
     * @return Unique identifier that is immutable on creation.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The OCID of a project.
     * 
     */
    private final @Nullable String projectId;
    /**
     * @return The current state of the deployment environment.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetDeployEnvironmentsResult(
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("deployEnvironmentCollections") List<GetDeployEnvironmentsDeployEnvironmentCollection> deployEnvironmentCollections,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetDeployEnvironmentsFilter> filters,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("projectId") @Nullable String projectId,
        @CustomType.Parameter("state") @Nullable String state) {
        this.compartmentId = compartmentId;
        this.deployEnvironmentCollections = deployEnvironmentCollections;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.projectId = projectId;
        this.state = state;
    }

    /**
     * @return The OCID of a compartment.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    /**
     * @return The list of deploy_environment_collection.
     * 
     */
    public List<GetDeployEnvironmentsDeployEnvironmentCollection> deployEnvironmentCollections() {
        return this.deployEnvironmentCollections;
    }
    /**
     * @return Deployment environment display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetDeployEnvironmentsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Unique identifier that is immutable on creation.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The OCID of a project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return The current state of the deployment environment.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployEnvironmentsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compartmentId;
        private List<GetDeployEnvironmentsDeployEnvironmentCollection> deployEnvironmentCollections;
        private @Nullable String displayName;
        private @Nullable List<GetDeployEnvironmentsFilter> filters;
        private @Nullable String id;
        private @Nullable String projectId;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployEnvironmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.deployEnvironmentCollections = defaults.deployEnvironmentCollections;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
        }

        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder deployEnvironmentCollections(List<GetDeployEnvironmentsDeployEnvironmentCollection> deployEnvironmentCollections) {
            this.deployEnvironmentCollections = Objects.requireNonNull(deployEnvironmentCollections);
            return this;
        }
        public Builder deployEnvironmentCollections(GetDeployEnvironmentsDeployEnvironmentCollection... deployEnvironmentCollections) {
            return deployEnvironmentCollections(List.of(deployEnvironmentCollections));
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetDeployEnvironmentsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetDeployEnvironmentsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetDeployEnvironmentsResult build() {
            return new GetDeployEnvironmentsResult(compartmentId, deployEnvironmentCollections, displayName, filters, id, projectId, state);
        }
    }
}
