// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool;

import io.pulumi.azurenative.storagepool.inputs.TargetPortalGroupCreateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IscsiTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IscsiTargetArgs Empty = new IscsiTargetArgs();

    /**
     * The name of the Disk pool.
     * 
     */
    @Import(name="diskPoolName", required=true)
      private final Output<String> diskPoolName;

    public Output<String> getDiskPoolName() {
        return this.diskPoolName;
    }

    /**
     * The name of the iSCSI target.
     * 
     */
    @Import(name="iscsiTargetName")
      private final @Nullable Output<String> iscsiTargetName;

    public Output<String> getIscsiTargetName() {
        return this.iscsiTargetName == null ? Codegen.empty() : this.iscsiTargetName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * iSCSI target IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:server".
     * 
     */
    @Import(name="targetIqn")
      private final @Nullable Output<String> targetIqn;

    public Output<String> getTargetIqn() {
        return this.targetIqn == null ? Codegen.empty() : this.targetIqn;
    }

    /**
     * List of iSCSI target portal groups. Can have 1 portal group at most.
     * 
     */
    @Import(name="tpgs", required=true)
      private final Output<List<TargetPortalGroupCreateArgs>> tpgs;

    public Output<List<TargetPortalGroupCreateArgs>> getTpgs() {
        return this.tpgs;
    }

    public IscsiTargetArgs(
        Output<String> diskPoolName,
        @Nullable Output<String> iscsiTargetName,
        Output<String> resourceGroupName,
        @Nullable Output<String> targetIqn,
        Output<List<TargetPortalGroupCreateArgs>> tpgs) {
        this.diskPoolName = Objects.requireNonNull(diskPoolName, "expected parameter 'diskPoolName' to be non-null");
        this.iscsiTargetName = iscsiTargetName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetIqn = targetIqn;
        this.tpgs = Objects.requireNonNull(tpgs, "expected parameter 'tpgs' to be non-null");
    }

    private IscsiTargetArgs() {
        this.diskPoolName = Codegen.empty();
        this.iscsiTargetName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.targetIqn = Codegen.empty();
        this.tpgs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IscsiTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> diskPoolName;
        private @Nullable Output<String> iscsiTargetName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> targetIqn;
        private Output<List<TargetPortalGroupCreateArgs>> tpgs;

        public Builder() {
    	      // Empty
        }

        public Builder(IscsiTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskPoolName = defaults.diskPoolName;
    	      this.iscsiTargetName = defaults.iscsiTargetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetIqn = defaults.targetIqn;
    	      this.tpgs = defaults.tpgs;
        }

        public Builder diskPoolName(Output<String> diskPoolName) {
            this.diskPoolName = Objects.requireNonNull(diskPoolName);
            return this;
        }
        public Builder diskPoolName(String diskPoolName) {
            this.diskPoolName = Output.of(Objects.requireNonNull(diskPoolName));
            return this;
        }
        public Builder iscsiTargetName(@Nullable Output<String> iscsiTargetName) {
            this.iscsiTargetName = iscsiTargetName;
            return this;
        }
        public Builder iscsiTargetName(@Nullable String iscsiTargetName) {
            this.iscsiTargetName = Codegen.ofNullable(iscsiTargetName);
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
        public Builder targetIqn(@Nullable Output<String> targetIqn) {
            this.targetIqn = targetIqn;
            return this;
        }
        public Builder targetIqn(@Nullable String targetIqn) {
            this.targetIqn = Codegen.ofNullable(targetIqn);
            return this;
        }
        public Builder tpgs(Output<List<TargetPortalGroupCreateArgs>> tpgs) {
            this.tpgs = Objects.requireNonNull(tpgs);
            return this;
        }
        public Builder tpgs(List<TargetPortalGroupCreateArgs> tpgs) {
            this.tpgs = Output.of(Objects.requireNonNull(tpgs));
            return this;
        }
        public Builder tpgs(TargetPortalGroupCreateArgs... tpgs) {
            return tpgs(List.of(tpgs));
        }        public IscsiTargetArgs build() {
            return new IscsiTargetArgs(diskPoolName, iscsiTargetName, resourceGroupName, targetIqn, tpgs);
        }
    }
}
