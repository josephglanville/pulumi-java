// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPatchScheduleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPatchScheduleArgs Empty = new GetPatchScheduleArgs();

    /**
     * Default string modeled as parameter for auto generation to work correctly.
     * 
     */
    @Import(name="default", required=true)
      private final String $default;

    public String get$default() {
        return this.$default;
    }

    /**
     * The name of the redis cache.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPatchScheduleArgs(
        String $default,
        String name,
        String resourceGroupName) {
        this.$default = Objects.requireNonNull($default, "expected parameter '$default' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPatchScheduleArgs() {
        this.$default = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String $default;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder $default(String $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetPatchScheduleArgs build() {
            return new GetPatchScheduleArgs($default, name, resourceGroupName);
        }
    }
}
