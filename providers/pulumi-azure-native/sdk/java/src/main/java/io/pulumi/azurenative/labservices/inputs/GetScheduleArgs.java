// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduleArgs Empty = new GetScheduleArgs();

    /**
     * The name of the lab that uniquely identifies it within containing lab account. Used in resource URIs.
     * 
     */
    @Import(name="labName", required=true)
      private final String labName;

    public String getLabName() {
        return this.labName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the schedule that uniquely identifies it within containing lab. Used in resource URIs.
     * 
     */
    @Import(name="scheduleName", required=true)
      private final String scheduleName;

    public String getScheduleName() {
        return this.scheduleName;
    }

    public GetScheduleArgs(
        String labName,
        String resourceGroupName,
        String scheduleName) {
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scheduleName = Objects.requireNonNull(scheduleName, "expected parameter 'scheduleName' to be non-null");
    }

    private GetScheduleArgs() {
        this.labName = null;
        this.resourceGroupName = null;
        this.scheduleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labName;
        private String resourceGroupName;
        private String scheduleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labName = defaults.labName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scheduleName = defaults.scheduleName;
        }

        public Builder labName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder scheduleName(String scheduleName) {
            this.scheduleName = Objects.requireNonNull(scheduleName);
            return this;
        }        public GetScheduleArgs build() {
            return new GetScheduleArgs(labName, resourceGroupName, scheduleName);
        }
    }
}
