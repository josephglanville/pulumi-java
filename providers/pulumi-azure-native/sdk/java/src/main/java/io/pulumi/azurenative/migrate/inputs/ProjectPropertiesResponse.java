// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProjectPropertiesResponse Empty = new ProjectPropertiesResponse();

    @InputImport(name="assessmentSolutionId")
    private final @Nullable String assessmentSolutionId;

    public Optional<String> getAssessmentSolutionId() {
        return this.assessmentSolutionId == null ? Optional.empty() : Optional.ofNullable(this.assessmentSolutionId);
    }

    @InputImport(name="createdTimestamp", required=true)
    private final String createdTimestamp;

    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    @InputImport(name="customerStorageAccountArmId")
    private final @Nullable String customerStorageAccountArmId;

    public Optional<String> getCustomerStorageAccountArmId() {
        return this.customerStorageAccountArmId == null ? Optional.empty() : Optional.ofNullable(this.customerStorageAccountArmId);
    }

    @InputImport(name="customerWorkspaceId")
    private final @Nullable String customerWorkspaceId;

    public Optional<String> getCustomerWorkspaceId() {
        return this.customerWorkspaceId == null ? Optional.empty() : Optional.ofNullable(this.customerWorkspaceId);
    }

    @InputImport(name="customerWorkspaceLocation")
    private final @Nullable String customerWorkspaceLocation;

    public Optional<String> getCustomerWorkspaceLocation() {
        return this.customerWorkspaceLocation == null ? Optional.empty() : Optional.ofNullable(this.customerWorkspaceLocation);
    }

    @InputImport(name="lastAssessmentTimestamp", required=true)
    private final String lastAssessmentTimestamp;

    public String getLastAssessmentTimestamp() {
        return this.lastAssessmentTimestamp;
    }

    @InputImport(name="numberOfAssessments", required=true)
    private final Integer numberOfAssessments;

    public Integer getNumberOfAssessments() {
        return this.numberOfAssessments;
    }

    @InputImport(name="numberOfGroups", required=true)
    private final Integer numberOfGroups;

    public Integer getNumberOfGroups() {
        return this.numberOfGroups;
    }

    @InputImport(name="numberOfMachines", required=true)
    private final Integer numberOfMachines;

    public Integer getNumberOfMachines() {
        return this.numberOfMachines;
    }

    @InputImport(name="privateEndpointConnections", required=true)
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;

    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    @InputImport(name="projectStatus")
    private final @Nullable String projectStatus;

    public Optional<String> getProjectStatus() {
        return this.projectStatus == null ? Optional.empty() : Optional.ofNullable(this.projectStatus);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="publicNetworkAccess")
    private final @Nullable String publicNetworkAccess;

    public Optional<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.publicNetworkAccess);
    }

    @InputImport(name="serviceEndpoint", required=true)
    private final String serviceEndpoint;

    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    @InputImport(name="updatedTimestamp", required=true)
    private final String updatedTimestamp;

    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public ProjectPropertiesResponse(
        @Nullable String assessmentSolutionId,
        String createdTimestamp,
        @Nullable String customerStorageAccountArmId,
        @Nullable String customerWorkspaceId,
        @Nullable String customerWorkspaceLocation,
        String lastAssessmentTimestamp,
        Integer numberOfAssessments,
        Integer numberOfGroups,
        Integer numberOfMachines,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @Nullable String projectStatus,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        String serviceEndpoint,
        String updatedTimestamp) {
        this.assessmentSolutionId = assessmentSolutionId;
        this.createdTimestamp = Objects.requireNonNull(createdTimestamp, "expected parameter 'createdTimestamp' to be non-null");
        this.customerStorageAccountArmId = customerStorageAccountArmId;
        this.customerWorkspaceId = customerWorkspaceId;
        this.customerWorkspaceLocation = customerWorkspaceLocation;
        this.lastAssessmentTimestamp = Objects.requireNonNull(lastAssessmentTimestamp, "expected parameter 'lastAssessmentTimestamp' to be non-null");
        this.numberOfAssessments = Objects.requireNonNull(numberOfAssessments, "expected parameter 'numberOfAssessments' to be non-null");
        this.numberOfGroups = Objects.requireNonNull(numberOfGroups, "expected parameter 'numberOfGroups' to be non-null");
        this.numberOfMachines = Objects.requireNonNull(numberOfMachines, "expected parameter 'numberOfMachines' to be non-null");
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections, "expected parameter 'privateEndpointConnections' to be non-null");
        this.projectStatus = projectStatus;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicNetworkAccess = publicNetworkAccess;
        this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint, "expected parameter 'serviceEndpoint' to be non-null");
        this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp, "expected parameter 'updatedTimestamp' to be non-null");
    }

    private ProjectPropertiesResponse() {
        this.assessmentSolutionId = null;
        this.createdTimestamp = null;
        this.customerStorageAccountArmId = null;
        this.customerWorkspaceId = null;
        this.customerWorkspaceLocation = null;
        this.lastAssessmentTimestamp = null;
        this.numberOfAssessments = null;
        this.numberOfGroups = null;
        this.numberOfMachines = null;
        this.privateEndpointConnections = List.of();
        this.projectStatus = null;
        this.provisioningState = null;
        this.publicNetworkAccess = null;
        this.serviceEndpoint = null;
        this.updatedTimestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assessmentSolutionId;
        private String createdTimestamp;
        private @Nullable String customerStorageAccountArmId;
        private @Nullable String customerWorkspaceId;
        private @Nullable String customerWorkspaceLocation;
        private String lastAssessmentTimestamp;
        private Integer numberOfAssessments;
        private Integer numberOfGroups;
        private Integer numberOfMachines;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable String projectStatus;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private String serviceEndpoint;
        private String updatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentSolutionId = defaults.assessmentSolutionId;
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.customerStorageAccountArmId = defaults.customerStorageAccountArmId;
    	      this.customerWorkspaceId = defaults.customerWorkspaceId;
    	      this.customerWorkspaceLocation = defaults.customerWorkspaceLocation;
    	      this.lastAssessmentTimestamp = defaults.lastAssessmentTimestamp;
    	      this.numberOfAssessments = defaults.numberOfAssessments;
    	      this.numberOfGroups = defaults.numberOfGroups;
    	      this.numberOfMachines = defaults.numberOfMachines;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.projectStatus = defaults.projectStatus;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
        }

        public Builder setAssessmentSolutionId(@Nullable String assessmentSolutionId) {
            this.assessmentSolutionId = assessmentSolutionId;
            return this;
        }

        public Builder setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }

        public Builder setCustomerStorageAccountArmId(@Nullable String customerStorageAccountArmId) {
            this.customerStorageAccountArmId = customerStorageAccountArmId;
            return this;
        }

        public Builder setCustomerWorkspaceId(@Nullable String customerWorkspaceId) {
            this.customerWorkspaceId = customerWorkspaceId;
            return this;
        }

        public Builder setCustomerWorkspaceLocation(@Nullable String customerWorkspaceLocation) {
            this.customerWorkspaceLocation = customerWorkspaceLocation;
            return this;
        }

        public Builder setLastAssessmentTimestamp(String lastAssessmentTimestamp) {
            this.lastAssessmentTimestamp = Objects.requireNonNull(lastAssessmentTimestamp);
            return this;
        }

        public Builder setNumberOfAssessments(Integer numberOfAssessments) {
            this.numberOfAssessments = Objects.requireNonNull(numberOfAssessments);
            return this;
        }

        public Builder setNumberOfGroups(Integer numberOfGroups) {
            this.numberOfGroups = Objects.requireNonNull(numberOfGroups);
            return this;
        }

        public Builder setNumberOfMachines(Integer numberOfMachines) {
            this.numberOfMachines = Objects.requireNonNull(numberOfMachines);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProjectStatus(@Nullable String projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setServiceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }

        public Builder setUpdatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }

        public ProjectPropertiesResponse build() {
            return new ProjectPropertiesResponse(assessmentSolutionId, createdTimestamp, customerStorageAccountArmId, customerWorkspaceId, customerWorkspaceLocation, lastAssessmentTimestamp, numberOfAssessments, numberOfGroups, numberOfMachines, privateEndpointConnections, projectStatus, provisioningState, publicNetworkAccess, serviceEndpoint, updatedTimestamp);
        }
    }
}
