// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointIscseGetArgs;
import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointManagementGetArgs;
import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointNfGetArgs;
import io.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointSmbGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OntapStorageVirtualMachineEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OntapStorageVirtualMachineEndpointGetArgs Empty = new OntapStorageVirtualMachineEndpointGetArgs();

    /**
     * An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     * 
     */
    @Import(name="iscses")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointIscseGetArgs>> iscses;

    public Output<List<OntapStorageVirtualMachineEndpointIscseGetArgs>> getIscses() {
        return this.iscses == null ? Output.empty() : this.iscses;
    }

    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    @Import(name="managements")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointManagementGetArgs>> managements;

    public Output<List<OntapStorageVirtualMachineEndpointManagementGetArgs>> getManagements() {
        return this.managements == null ? Output.empty() : this.managements;
    }

    /**
     * An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     * 
     */
    @Import(name="nfs")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointNfGetArgs>> nfs;

    public Output<List<OntapStorageVirtualMachineEndpointNfGetArgs>> getNfs() {
        return this.nfs == null ? Output.empty() : this.nfs;
    }

    /**
     * An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
     * 
     */
    @Import(name="smbs")
      private final @Nullable Output<List<OntapStorageVirtualMachineEndpointSmbGetArgs>> smbs;

    public Output<List<OntapStorageVirtualMachineEndpointSmbGetArgs>> getSmbs() {
        return this.smbs == null ? Output.empty() : this.smbs;
    }

    public OntapStorageVirtualMachineEndpointGetArgs(
        @Nullable Output<List<OntapStorageVirtualMachineEndpointIscseGetArgs>> iscses,
        @Nullable Output<List<OntapStorageVirtualMachineEndpointManagementGetArgs>> managements,
        @Nullable Output<List<OntapStorageVirtualMachineEndpointNfGetArgs>> nfs,
        @Nullable Output<List<OntapStorageVirtualMachineEndpointSmbGetArgs>> smbs) {
        this.iscses = iscses;
        this.managements = managements;
        this.nfs = nfs;
        this.smbs = smbs;
    }

    private OntapStorageVirtualMachineEndpointGetArgs() {
        this.iscses = Output.empty();
        this.managements = Output.empty();
        this.nfs = Output.empty();
        this.smbs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapStorageVirtualMachineEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointIscseGetArgs>> iscses;
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointManagementGetArgs>> managements;
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointNfGetArgs>> nfs;
        private @Nullable Output<List<OntapStorageVirtualMachineEndpointSmbGetArgs>> smbs;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapStorageVirtualMachineEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iscses = defaults.iscses;
    	      this.managements = defaults.managements;
    	      this.nfs = defaults.nfs;
    	      this.smbs = defaults.smbs;
        }

        public Builder iscses(@Nullable Output<List<OntapStorageVirtualMachineEndpointIscseGetArgs>> iscses) {
            this.iscses = iscses;
            return this;
        }
        public Builder iscses(@Nullable List<OntapStorageVirtualMachineEndpointIscseGetArgs> iscses) {
            this.iscses = Output.ofNullable(iscses);
            return this;
        }
        public Builder iscses(OntapStorageVirtualMachineEndpointIscseGetArgs... iscses) {
            return iscses(List.of(iscses));
        }
        public Builder managements(@Nullable Output<List<OntapStorageVirtualMachineEndpointManagementGetArgs>> managements) {
            this.managements = managements;
            return this;
        }
        public Builder managements(@Nullable List<OntapStorageVirtualMachineEndpointManagementGetArgs> managements) {
            this.managements = Output.ofNullable(managements);
            return this;
        }
        public Builder managements(OntapStorageVirtualMachineEndpointManagementGetArgs... managements) {
            return managements(List.of(managements));
        }
        public Builder nfs(@Nullable Output<List<OntapStorageVirtualMachineEndpointNfGetArgs>> nfs) {
            this.nfs = nfs;
            return this;
        }
        public Builder nfs(@Nullable List<OntapStorageVirtualMachineEndpointNfGetArgs> nfs) {
            this.nfs = Output.ofNullable(nfs);
            return this;
        }
        public Builder nfs(OntapStorageVirtualMachineEndpointNfGetArgs... nfs) {
            return nfs(List.of(nfs));
        }
        public Builder smbs(@Nullable Output<List<OntapStorageVirtualMachineEndpointSmbGetArgs>> smbs) {
            this.smbs = smbs;
            return this;
        }
        public Builder smbs(@Nullable List<OntapStorageVirtualMachineEndpointSmbGetArgs> smbs) {
            this.smbs = Output.ofNullable(smbs);
            return this;
        }
        public Builder smbs(OntapStorageVirtualMachineEndpointSmbGetArgs... smbs) {
            return smbs(List.of(smbs));
        }        public OntapStorageVirtualMachineEndpointGetArgs build() {
            return new OntapStorageVirtualMachineEndpointGetArgs(iscses, managements, nfs, smbs);
        }
    }
}