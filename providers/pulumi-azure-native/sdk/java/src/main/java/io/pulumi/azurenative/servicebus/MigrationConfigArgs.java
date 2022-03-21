// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigrationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrationConfigArgs Empty = new MigrationConfigArgs();

    /**
     * The configuration name. Should always be "$default".
     * 
     */
    @Import(name="configName")
      private final @Nullable Output<String> configName;

    public Output<String> getConfigName() {
        return this.configName == null ? Output.empty() : this.configName;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name to access Standard Namespace after migration
     * 
     */
    @Import(name="postMigrationName", required=true)
      private final Output<String> postMigrationName;

    public Output<String> getPostMigrationName() {
        return this.postMigrationName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    @Import(name="targetNamespace", required=true)
      private final Output<String> targetNamespace;

    public Output<String> getTargetNamespace() {
        return this.targetNamespace;
    }

    public MigrationConfigArgs(
        @Nullable Output<String> configName,
        Output<String> namespaceName,
        Output<String> postMigrationName,
        Output<String> resourceGroupName,
        Output<String> targetNamespace) {
        this.configName = configName;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.postMigrationName = Objects.requireNonNull(postMigrationName, "expected parameter 'postMigrationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetNamespace = Objects.requireNonNull(targetNamespace, "expected parameter 'targetNamespace' to be non-null");
    }

    private MigrationConfigArgs() {
        this.configName = Output.empty();
        this.namespaceName = Output.empty();
        this.postMigrationName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.targetNamespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configName;
        private Output<String> namespaceName;
        private Output<String> postMigrationName;
        private Output<String> resourceGroupName;
        private Output<String> targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configName = defaults.configName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.postMigrationName = defaults.postMigrationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder configName(@Nullable Output<String> configName) {
            this.configName = configName;
            return this;
        }
        public Builder configName(@Nullable String configName) {
            this.configName = Output.ofNullable(configName);
            return this;
        }
        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }
        public Builder postMigrationName(Output<String> postMigrationName) {
            this.postMigrationName = Objects.requireNonNull(postMigrationName);
            return this;
        }
        public Builder postMigrationName(String postMigrationName) {
            this.postMigrationName = Output.of(Objects.requireNonNull(postMigrationName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder targetNamespace(Output<String> targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }
        public Builder targetNamespace(String targetNamespace) {
            this.targetNamespace = Output.of(Objects.requireNonNull(targetNamespace));
            return this;
        }        public MigrationConfigArgs build() {
            return new MigrationConfigArgs(configName, namespaceName, postMigrationName, resourceGroupName, targetNamespace);
        }
    }
}
