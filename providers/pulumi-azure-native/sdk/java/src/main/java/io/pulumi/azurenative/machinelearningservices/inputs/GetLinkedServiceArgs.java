// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinkedServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLinkedServiceArgs Empty = new GetLinkedServiceArgs();

    /**
     * Friendly name of the linked workspace
     * 
     */
    @Import(name="linkName", required=true)
      private final String linkName;

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetLinkedServiceArgs(
        String linkName,
        String resourceGroupName,
        String workspaceName) {
        this.linkName = Objects.requireNonNull(linkName, "expected parameter 'linkName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetLinkedServiceArgs() {
        this.linkName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkName = defaults.linkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder linkName(String linkName) {
            this.linkName = Objects.requireNonNull(linkName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetLinkedServiceArgs build() {
            return new GetLinkedServiceArgs(linkName, resourceGroupName, workspaceName);
        }
    }
}
