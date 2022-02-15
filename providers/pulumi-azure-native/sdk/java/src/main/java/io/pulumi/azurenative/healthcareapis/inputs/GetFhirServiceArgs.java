// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFhirServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFhirServiceArgs Empty = new GetFhirServiceArgs();

    @InputImport(name="fhirServiceName", required=true)
    private final String fhirServiceName;

    public String getFhirServiceName() {
        return this.fhirServiceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetFhirServiceArgs(
        String fhirServiceName,
        String resourceGroupName,
        String workspaceName) {
        this.fhirServiceName = Objects.requireNonNull(fhirServiceName, "expected parameter 'fhirServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetFhirServiceArgs() {
        this.fhirServiceName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFhirServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fhirServiceName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFhirServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fhirServiceName = defaults.fhirServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setFhirServiceName(String fhirServiceName) {
            this.fhirServiceName = Objects.requireNonNull(fhirServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetFhirServiceArgs build() {
            return new GetFhirServiceArgs(fhirServiceName, resourceGroupName, workspaceName);
        }
    }
}