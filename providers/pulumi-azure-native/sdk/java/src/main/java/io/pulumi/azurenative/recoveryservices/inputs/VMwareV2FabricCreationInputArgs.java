// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMwareV2 fabric provider specific settings.
 * 
 */
public final class VMwareV2FabricCreationInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final VMwareV2FabricCreationInputArgs Empty = new VMwareV2FabricCreationInputArgs();

    /**
     * Gets the class type.
     * Expected value is 'VMwareV2'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The ARM Id of the migration solution.
     * 
     */
    @Import(name="migrationSolutionId", required=true)
      private final Output<String> migrationSolutionId;

    public Output<String> getMigrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * The ARM Id of the VMware site.
     * 
     */
    @Import(name="vmwareSiteId", required=true)
      private final Output<String> vmwareSiteId;

    public Output<String> getVmwareSiteId() {
        return this.vmwareSiteId;
    }

    public VMwareV2FabricCreationInputArgs(
        @Nullable Output<String> instanceType,
        Output<String> migrationSolutionId,
        Output<String> vmwareSiteId) {
        this.instanceType = instanceType;
        this.migrationSolutionId = Objects.requireNonNull(migrationSolutionId, "expected parameter 'migrationSolutionId' to be non-null");
        this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId, "expected parameter 'vmwareSiteId' to be non-null");
    }

    private VMwareV2FabricCreationInputArgs() {
        this.instanceType = Codegen.empty();
        this.migrationSolutionId = Codegen.empty();
        this.vmwareSiteId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareV2FabricCreationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;
        private Output<String> migrationSolutionId;
        private Output<String> vmwareSiteId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareV2FabricCreationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.migrationSolutionId = defaults.migrationSolutionId;
    	      this.vmwareSiteId = defaults.vmwareSiteId;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder migrationSolutionId(Output<String> migrationSolutionId) {
            this.migrationSolutionId = Objects.requireNonNull(migrationSolutionId);
            return this;
        }
        public Builder migrationSolutionId(String migrationSolutionId) {
            this.migrationSolutionId = Output.of(Objects.requireNonNull(migrationSolutionId));
            return this;
        }
        public Builder vmwareSiteId(Output<String> vmwareSiteId) {
            this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId);
            return this;
        }
        public Builder vmwareSiteId(String vmwareSiteId) {
            this.vmwareSiteId = Output.of(Objects.requireNonNull(vmwareSiteId));
            return this;
        }        public VMwareV2FabricCreationInputArgs build() {
            return new VMwareV2FabricCreationInputArgs(instanceType, migrationSolutionId, vmwareSiteId);
        }
    }
}
