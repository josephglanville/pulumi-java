// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListJobCredentialsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListJobCredentialsArgs Empty = new ListJobCredentialsArgs();

    /**
     * The name of the job Resource within the specified resource group. job names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @InputImport(name="jobName", required=true)
      private final String jobName;

    public String getJobName() {
        return this.jobName;
    }

    /**
     * The Resource Group Name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListJobCredentialsArgs(
        String jobName,
        String resourceGroupName) {
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListJobCredentialsArgs() {
        this.jobName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListJobCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListJobCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListJobCredentialsArgs build() {
            return new ListJobCredentialsArgs(jobName, resourceGroupName);
        }
    }
}
