// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMigrateProjectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMigrateProjectArgs Empty = new GetMigrateProjectArgs();

    @InputImport(name="migrateProjectName", required=true)
    private final String migrateProjectName;

    public String getMigrateProjectName() {
        return this.migrateProjectName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetMigrateProjectArgs(
        String migrateProjectName,
        String resourceGroupName) {
        this.migrateProjectName = Objects.requireNonNull(migrateProjectName, "expected parameter 'migrateProjectName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMigrateProjectArgs() {
        this.migrateProjectName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrateProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String migrateProjectName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrateProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrateProjectName = defaults.migrateProjectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setMigrateProjectName(String migrateProjectName) {
            this.migrateProjectName = Objects.requireNonNull(migrateProjectName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetMigrateProjectArgs build() {
            return new GetMigrateProjectArgs(migrateProjectName, resourceGroupName);
        }
    }
}
