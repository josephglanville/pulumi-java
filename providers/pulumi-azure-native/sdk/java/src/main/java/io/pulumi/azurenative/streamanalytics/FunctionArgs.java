// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.streamanalytics.inputs.ScalarFunctionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    /**
     * The name of the function.
     * 
     */
    @InputImport(name="functionName")
      private final @Nullable Input<String> functionName;

    public Input<String> getFunctionName() {
        return this.functionName == null ? Input.empty() : this.functionName;
    }

    /**
     * The name of the streaming job.
     * 
     */
    @InputImport(name="jobName", required=true)
      private final Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName;
    }

    /**
     * Resource name
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The properties that are associated with a function.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<ScalarFunctionPropertiesArgs> properties;

    public Input<ScalarFunctionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public FunctionArgs(
        @Nullable Input<String> functionName,
        Input<String> jobName,
        @Nullable Input<String> name,
        @Nullable Input<ScalarFunctionPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.functionName = functionName;
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private FunctionArgs() {
        this.functionName = Input.empty();
        this.jobName = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> functionName;
        private Input<String> jobName;
        private @Nullable Input<String> name;
        private @Nullable Input<ScalarFunctionPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.jobName = defaults.jobName;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFunctionName(@Nullable Input<String> functionName) {
            this.functionName = functionName;
            return this;
        }

        public Builder setFunctionName(@Nullable String functionName) {
            this.functionName = Input.ofNullable(functionName);
            return this;
        }

        public Builder setJobName(Input<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Input.of(Objects.requireNonNull(jobName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProperties(@Nullable Input<ScalarFunctionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ScalarFunctionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public FunctionArgs build() {
            return new FunctionArgs(functionName, jobName, name, properties, resourceGroupName);
        }
    }
}
