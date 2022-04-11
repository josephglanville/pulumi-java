// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the SQL Server resource settings.
 * 
 */
public final class SqlServerResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerResourceSettingsArgs Empty = new SqlServerResourceSettingsArgs();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Sql/servers'.
     * 
     */
    @Import(name="resourceType", required=true)
      private final Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
      private final Output<String> targetResourceName;

    public Output<String> getTargetResourceName() {
        return this.targetResourceName;
    }

    public SqlServerResourceSettingsArgs(
        Output<String> resourceType,
        Output<String> targetResourceName) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private SqlServerResourceSettingsArgs() {
        this.resourceType = Codegen.empty();
        this.targetResourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceType;
        private Output<String> targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder resourceType(Output<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Output.of(Objects.requireNonNull(resourceType));
            return this;
        }
        public Builder targetResourceName(Output<String> targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Output.of(Objects.requireNonNull(targetResourceName));
            return this;
        }        public SqlServerResourceSettingsArgs build() {
            return new SqlServerResourceSettingsArgs(resourceType, targetResourceName);
        }
    }
}
