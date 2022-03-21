// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDicomServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDicomServiceArgs Empty = new GetDicomServiceArgs();

    /**
     * The name of DICOM Service resource.
     * 
     */
    @Import(name="dicomServiceName", required=true)
      private final String dicomServiceName;

    public String getDicomServiceName() {
        return this.dicomServiceName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetDicomServiceArgs(
        String dicomServiceName,
        String resourceGroupName,
        String workspaceName) {
        this.dicomServiceName = Objects.requireNonNull(dicomServiceName, "expected parameter 'dicomServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetDicomServiceArgs() {
        this.dicomServiceName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDicomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dicomServiceName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDicomServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dicomServiceName = defaults.dicomServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dicomServiceName(String dicomServiceName) {
            this.dicomServiceName = Objects.requireNonNull(dicomServiceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetDicomServiceArgs build() {
            return new GetDicomServiceArgs(dicomServiceName, resourceGroupName, workspaceName);
        }
    }
}
