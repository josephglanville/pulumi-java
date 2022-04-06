// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OntapVolumeTieringPolicyGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OntapVolumeState extends io.pulumi.resources.ResourceArgs {

    public static final OntapVolumeState Empty = new OntapVolumeState();

    /**
     * Amazon Resource Name of the volune.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Describes the file system for the volume, e.g. `fs-12345679`
     * 
     */
    @Import(name="fileSystemId")
      private final @Nullable Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId == null ? Output.empty() : this.fileSystemId;
    }

    /**
     * Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
     * 
     */
    @Import(name="flexcacheEndpointType")
      private final @Nullable Output<String> flexcacheEndpointType;

    public Output<String> getFlexcacheEndpointType() {
        return this.flexcacheEndpointType == null ? Output.empty() : this.flexcacheEndpointType;
    }

    /**
     * Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
     * 
     */
    @Import(name="junctionPath")
      private final @Nullable Output<String> junctionPath;

    public Output<String> getJunctionPath() {
        return this.junctionPath == null ? Output.empty() : this.junctionPath;
    }

    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the type of volume, Valid values are `RW`, `DP`,  and `LS`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
     * 
     */
    @Import(name="ontapVolumeType")
      private final @Nullable Output<String> ontapVolumeType;

    public Output<String> getOntapVolumeType() {
        return this.ontapVolumeType == null ? Output.empty() : this.ontapVolumeType;
    }

    /**
     * Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     * 
     */
    @Import(name="securityStyle")
      private final @Nullable Output<String> securityStyle;

    public Output<String> getSecurityStyle() {
        return this.securityStyle == null ? Output.empty() : this.securityStyle;
    }

    /**
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * 
     */
    @Import(name="sizeInMegabytes")
      private final @Nullable Output<Integer> sizeInMegabytes;

    public Output<Integer> getSizeInMegabytes() {
        return this.sizeInMegabytes == null ? Output.empty() : this.sizeInMegabytes;
    }

    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * 
     */
    @Import(name="storageEfficiencyEnabled")
      private final @Nullable Output<Boolean> storageEfficiencyEnabled;

    public Output<Boolean> getStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled == null ? Output.empty() : this.storageEfficiencyEnabled;
    }

    /**
     * Specifies the storage virtual machine in which to create the volume.
     * 
     */
    @Import(name="storageVirtualMachineId")
      private final @Nullable Output<String> storageVirtualMachineId;

    public Output<String> getStorageVirtualMachineId() {
        return this.storageVirtualMachineId == null ? Output.empty() : this.storageVirtualMachineId;
    }

    /**
     * A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    @Import(name="tieringPolicy")
      private final @Nullable Output<OntapVolumeTieringPolicyGetArgs> tieringPolicy;

    public Output<OntapVolumeTieringPolicyGetArgs> getTieringPolicy() {
        return this.tieringPolicy == null ? Output.empty() : this.tieringPolicy;
    }

    /**
     * The Volume's UUID (universally unique identifier).
     * 
     */
    @Import(name="uuid")
      private final @Nullable Output<String> uuid;

    public Output<String> getUuid() {
        return this.uuid == null ? Output.empty() : this.uuid;
    }

    /**
     * The type of volume, currently the only valid value is `ONTAP`.
     * 
     */
    @Import(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> getVolumeType() {
        return this.volumeType == null ? Output.empty() : this.volumeType;
    }

    public OntapVolumeState(
        @Nullable Output<String> arn,
        @Nullable Output<String> fileSystemId,
        @Nullable Output<String> flexcacheEndpointType,
        @Nullable Output<String> junctionPath,
        @Nullable Output<String> name,
        @Nullable Output<String> ontapVolumeType,
        @Nullable Output<String> securityStyle,
        @Nullable Output<Integer> sizeInMegabytes,
        @Nullable Output<Boolean> storageEfficiencyEnabled,
        @Nullable Output<String> storageVirtualMachineId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<OntapVolumeTieringPolicyGetArgs> tieringPolicy,
        @Nullable Output<String> uuid,
        @Nullable Output<String> volumeType) {
        this.arn = arn;
        this.fileSystemId = fileSystemId;
        this.flexcacheEndpointType = flexcacheEndpointType;
        this.junctionPath = junctionPath;
        this.name = name;
        this.ontapVolumeType = ontapVolumeType;
        this.securityStyle = securityStyle;
        this.sizeInMegabytes = sizeInMegabytes;
        this.storageEfficiencyEnabled = storageEfficiencyEnabled;
        this.storageVirtualMachineId = storageVirtualMachineId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.tieringPolicy = tieringPolicy;
        this.uuid = uuid;
        this.volumeType = volumeType;
    }

    private OntapVolumeState() {
        this.arn = Output.empty();
        this.fileSystemId = Output.empty();
        this.flexcacheEndpointType = Output.empty();
        this.junctionPath = Output.empty();
        this.name = Output.empty();
        this.ontapVolumeType = Output.empty();
        this.securityStyle = Output.empty();
        this.sizeInMegabytes = Output.empty();
        this.storageEfficiencyEnabled = Output.empty();
        this.storageVirtualMachineId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.tieringPolicy = Output.empty();
        this.uuid = Output.empty();
        this.volumeType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapVolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> fileSystemId;
        private @Nullable Output<String> flexcacheEndpointType;
        private @Nullable Output<String> junctionPath;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ontapVolumeType;
        private @Nullable Output<String> securityStyle;
        private @Nullable Output<Integer> sizeInMegabytes;
        private @Nullable Output<Boolean> storageEfficiencyEnabled;
        private @Nullable Output<String> storageVirtualMachineId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<OntapVolumeTieringPolicyGetArgs> tieringPolicy;
        private @Nullable Output<String> uuid;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapVolumeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.flexcacheEndpointType = defaults.flexcacheEndpointType;
    	      this.junctionPath = defaults.junctionPath;
    	      this.name = defaults.name;
    	      this.ontapVolumeType = defaults.ontapVolumeType;
    	      this.securityStyle = defaults.securityStyle;
    	      this.sizeInMegabytes = defaults.sizeInMegabytes;
    	      this.storageEfficiencyEnabled = defaults.storageEfficiencyEnabled;
    	      this.storageVirtualMachineId = defaults.storageVirtualMachineId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.tieringPolicy = defaults.tieringPolicy;
    	      this.uuid = defaults.uuid;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder fileSystemId(@Nullable Output<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public Builder fileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = Output.ofNullable(fileSystemId);
            return this;
        }
        public Builder flexcacheEndpointType(@Nullable Output<String> flexcacheEndpointType) {
            this.flexcacheEndpointType = flexcacheEndpointType;
            return this;
        }
        public Builder flexcacheEndpointType(@Nullable String flexcacheEndpointType) {
            this.flexcacheEndpointType = Output.ofNullable(flexcacheEndpointType);
            return this;
        }
        public Builder junctionPath(@Nullable Output<String> junctionPath) {
            this.junctionPath = junctionPath;
            return this;
        }
        public Builder junctionPath(@Nullable String junctionPath) {
            this.junctionPath = Output.ofNullable(junctionPath);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder ontapVolumeType(@Nullable Output<String> ontapVolumeType) {
            this.ontapVolumeType = ontapVolumeType;
            return this;
        }
        public Builder ontapVolumeType(@Nullable String ontapVolumeType) {
            this.ontapVolumeType = Output.ofNullable(ontapVolumeType);
            return this;
        }
        public Builder securityStyle(@Nullable Output<String> securityStyle) {
            this.securityStyle = securityStyle;
            return this;
        }
        public Builder securityStyle(@Nullable String securityStyle) {
            this.securityStyle = Output.ofNullable(securityStyle);
            return this;
        }
        public Builder sizeInMegabytes(@Nullable Output<Integer> sizeInMegabytes) {
            this.sizeInMegabytes = sizeInMegabytes;
            return this;
        }
        public Builder sizeInMegabytes(@Nullable Integer sizeInMegabytes) {
            this.sizeInMegabytes = Output.ofNullable(sizeInMegabytes);
            return this;
        }
        public Builder storageEfficiencyEnabled(@Nullable Output<Boolean> storageEfficiencyEnabled) {
            this.storageEfficiencyEnabled = storageEfficiencyEnabled;
            return this;
        }
        public Builder storageEfficiencyEnabled(@Nullable Boolean storageEfficiencyEnabled) {
            this.storageEfficiencyEnabled = Output.ofNullable(storageEfficiencyEnabled);
            return this;
        }
        public Builder storageVirtualMachineId(@Nullable Output<String> storageVirtualMachineId) {
            this.storageVirtualMachineId = storageVirtualMachineId;
            return this;
        }
        public Builder storageVirtualMachineId(@Nullable String storageVirtualMachineId) {
            this.storageVirtualMachineId = Output.ofNullable(storageVirtualMachineId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder tieringPolicy(@Nullable Output<OntapVolumeTieringPolicyGetArgs> tieringPolicy) {
            this.tieringPolicy = tieringPolicy;
            return this;
        }
        public Builder tieringPolicy(@Nullable OntapVolumeTieringPolicyGetArgs tieringPolicy) {
            this.tieringPolicy = Output.ofNullable(tieringPolicy);
            return this;
        }
        public Builder uuid(@Nullable Output<String> uuid) {
            this.uuid = uuid;
            return this;
        }
        public Builder uuid(@Nullable String uuid) {
            this.uuid = Output.ofNullable(uuid);
            return this;
        }
        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Output.ofNullable(volumeType);
            return this;
        }        public OntapVolumeState build() {
            return new OntapVolumeState(arn, fileSystemId, flexcacheEndpointType, junctionPath, name, ontapVolumeType, securityStyle, sizeInMegabytes, storageEfficiencyEnabled, storageVirtualMachineId, tags, tagsAll, tieringPolicy, uuid, volumeType);
        }
    }
}