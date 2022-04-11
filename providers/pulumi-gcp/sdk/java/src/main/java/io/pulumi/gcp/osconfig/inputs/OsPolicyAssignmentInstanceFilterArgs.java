// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterExclusionLabelArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInclusionLabelArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInventoryArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentInstanceFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentInstanceFilterArgs Empty = new OsPolicyAssignmentInstanceFilterArgs();

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    @Import(name="all")
      private final @Nullable Output<Boolean> all;

    public Output<Boolean> getAll() {
        return this.all == null ? Codegen.empty() : this.all;
    }

    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="exclusionLabels")
      private final @Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels;

    public Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> getExclusionLabels() {
        return this.exclusionLabels == null ? Codegen.empty() : this.exclusionLabels;
    }

    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="inclusionLabels")
      private final @Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels;

    public Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> getInclusionLabels() {
        return this.inclusionLabels == null ? Codegen.empty() : this.inclusionLabels;
    }

    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    @Import(name="inventories")
      private final @Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories;

    public Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> getInventories() {
        return this.inventories == null ? Codegen.empty() : this.inventories;
    }

    public OsPolicyAssignmentInstanceFilterArgs(
        @Nullable Output<Boolean> all,
        @Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels,
        @Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels,
        @Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories) {
        this.all = all;
        this.exclusionLabels = exclusionLabels;
        this.inclusionLabels = inclusionLabels;
        this.inventories = inventories;
    }

    private OsPolicyAssignmentInstanceFilterArgs() {
        this.all = Codegen.empty();
        this.exclusionLabels = Codegen.empty();
        this.inclusionLabels = Codegen.empty();
        this.inventories = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> all;
        private @Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels;
        private @Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels;
        private @Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder all(@Nullable Output<Boolean> all) {
            this.all = all;
            return this;
        }
        public Builder all(@Nullable Boolean all) {
            this.all = Codegen.ofNullable(all);
            return this;
        }
        public Builder exclusionLabels(@Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels) {
            this.exclusionLabels = exclusionLabels;
            return this;
        }
        public Builder exclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs> exclusionLabels) {
            this.exclusionLabels = Codegen.ofNullable(exclusionLabels);
            return this;
        }
        public Builder exclusionLabels(OsPolicyAssignmentInstanceFilterExclusionLabelArgs... exclusionLabels) {
            return exclusionLabels(List.of(exclusionLabels));
        }
        public Builder inclusionLabels(@Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels) {
            this.inclusionLabels = inclusionLabels;
            return this;
        }
        public Builder inclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs> inclusionLabels) {
            this.inclusionLabels = Codegen.ofNullable(inclusionLabels);
            return this;
        }
        public Builder inclusionLabels(OsPolicyAssignmentInstanceFilterInclusionLabelArgs... inclusionLabels) {
            return inclusionLabels(List.of(inclusionLabels));
        }
        public Builder inventories(@Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories) {
            this.inventories = inventories;
            return this;
        }
        public Builder inventories(@Nullable List<OsPolicyAssignmentInstanceFilterInventoryArgs> inventories) {
            this.inventories = Codegen.ofNullable(inventories);
            return this;
        }
        public Builder inventories(OsPolicyAssignmentInstanceFilterInventoryArgs... inventories) {
            return inventories(List.of(inventories));
        }        public OsPolicyAssignmentInstanceFilterArgs build() {
            return new OsPolicyAssignmentInstanceFilterArgs(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}
