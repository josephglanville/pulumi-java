// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.AWSElasticBlockStoreVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.AzureDiskVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.AzureFileVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.CSIVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.CephFSVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.CinderVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ConfigMapVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.DownwardAPIVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.EmptyDirVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.EphemeralVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.FCVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.FlexVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.FlockerVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.GCEPersistentDiskVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.GitRepoVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.GlusterfsVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.HostPathVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ISCSIVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.NFSVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.PersistentVolumeClaimVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.PhotonPersistentDiskVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.PortworxVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ProjectedVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.QuobyteVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.RBDVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ScaleIOVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.SecretVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.StorageOSVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.VsphereVirtualDiskVolumeSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 * 
 */
public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @InputImport(name="awsElasticBlockStore")
      private final @Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore;

    public Input<AWSElasticBlockStoreVolumeSourceArgs> getAwsElasticBlockStore() {
        return this.awsElasticBlockStore == null ? Input.empty() : this.awsElasticBlockStore;
    }

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     * 
     */
    @InputImport(name="azureDisk")
      private final @Nullable Input<AzureDiskVolumeSourceArgs> azureDisk;

    public Input<AzureDiskVolumeSourceArgs> getAzureDisk() {
        return this.azureDisk == null ? Input.empty() : this.azureDisk;
    }

    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    @InputImport(name="azureFile")
      private final @Nullable Input<AzureFileVolumeSourceArgs> azureFile;

    public Input<AzureFileVolumeSourceArgs> getAzureFile() {
        return this.azureFile == null ? Input.empty() : this.azureFile;
    }

    /**
     * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
     * 
     */
    @InputImport(name="cephfs")
      private final @Nullable Input<CephFSVolumeSourceArgs> cephfs;

    public Input<CephFSVolumeSourceArgs> getCephfs() {
        return this.cephfs == null ? Input.empty() : this.cephfs;
    }

    /**
     * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @InputImport(name="cinder")
      private final @Nullable Input<CinderVolumeSourceArgs> cinder;

    public Input<CinderVolumeSourceArgs> getCinder() {
        return this.cinder == null ? Input.empty() : this.cinder;
    }

    /**
     * ConfigMap represents a configMap that should populate this volume
     * 
     */
    @InputImport(name="configMap")
      private final @Nullable Input<ConfigMapVolumeSourceArgs> configMap;

    public Input<ConfigMapVolumeSourceArgs> getConfigMap() {
        return this.configMap == null ? Input.empty() : this.configMap;
    }

    /**
     * CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
     * 
     */
    @InputImport(name="csi")
      private final @Nullable Input<CSIVolumeSourceArgs> csi;

    public Input<CSIVolumeSourceArgs> getCsi() {
        return this.csi == null ? Input.empty() : this.csi;
    }

    /**
     * DownwardAPI represents downward API about the pod that should populate this volume
     * 
     */
    @InputImport(name="downwardAPI")
      private final @Nullable Input<DownwardAPIVolumeSourceArgs> downwardAPI;

    public Input<DownwardAPIVolumeSourceArgs> getDownwardAPI() {
        return this.downwardAPI == null ? Input.empty() : this.downwardAPI;
    }

    /**
     * EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * 
     */
    @InputImport(name="emptyDir")
      private final @Nullable Input<EmptyDirVolumeSourceArgs> emptyDir;

    public Input<EmptyDirVolumeSourceArgs> getEmptyDir() {
        return this.emptyDir == null ? Input.empty() : this.emptyDir;
    }

    /**
     * Ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
     * 
     * Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
     *    tracking are needed,
     * c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through
     *    a PersistentVolumeClaim (see EphemeralVolumeSource for more
     *    information on the connection between this volume type
     *    and PersistentVolumeClaim).
     * 
     * Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
     * 
     * Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
     * 
     * A pod can use both types of ephemeral volumes and persistent volumes at the same time.
     * 
     */
    @InputImport(name="ephemeral")
      private final @Nullable Input<EphemeralVolumeSourceArgs> ephemeral;

    public Input<EphemeralVolumeSourceArgs> getEphemeral() {
        return this.ephemeral == null ? Input.empty() : this.ephemeral;
    }

    /**
     * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     * 
     */
    @InputImport(name="fc")
      private final @Nullable Input<FCVolumeSourceArgs> fc;

    public Input<FCVolumeSourceArgs> getFc() {
        return this.fc == null ? Input.empty() : this.fc;
    }

    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    @InputImport(name="flexVolume")
      private final @Nullable Input<FlexVolumeSourceArgs> flexVolume;

    public Input<FlexVolumeSourceArgs> getFlexVolume() {
        return this.flexVolume == null ? Input.empty() : this.flexVolume;
    }

    /**
     * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
     * 
     */
    @InputImport(name="flocker")
      private final @Nullable Input<FlockerVolumeSourceArgs> flocker;

    public Input<FlockerVolumeSourceArgs> getFlocker() {
        return this.flocker == null ? Input.empty() : this.flocker;
    }

    /**
     * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @InputImport(name="gcePersistentDisk")
      private final @Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk;

    public Input<GCEPersistentDiskVolumeSourceArgs> getGcePersistentDisk() {
        return this.gcePersistentDisk == null ? Input.empty() : this.gcePersistentDisk;
    }

    /**
     * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     * 
     */
    @InputImport(name="gitRepo")
      private final @Nullable Input<GitRepoVolumeSourceArgs> gitRepo;

    public Input<GitRepoVolumeSourceArgs> getGitRepo() {
        return this.gitRepo == null ? Input.empty() : this.gitRepo;
    }

    /**
     * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
     * 
     */
    @InputImport(name="glusterfs")
      private final @Nullable Input<GlusterfsVolumeSourceArgs> glusterfs;

    public Input<GlusterfsVolumeSourceArgs> getGlusterfs() {
        return this.glusterfs == null ? Input.empty() : this.glusterfs;
    }

    /**
     * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    @InputImport(name="hostPath")
      private final @Nullable Input<HostPathVolumeSourceArgs> hostPath;

    public Input<HostPathVolumeSourceArgs> getHostPath() {
        return this.hostPath == null ? Input.empty() : this.hostPath;
    }

    /**
     * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
     * 
     */
    @InputImport(name="iscsi")
      private final @Nullable Input<ISCSIVolumeSourceArgs> iscsi;

    public Input<ISCSIVolumeSourceArgs> getIscsi() {
        return this.iscsi == null ? Input.empty() : this.iscsi;
    }

    /**
     * Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @InputImport(name="nfs")
      private final @Nullable Input<NFSVolumeSourceArgs> nfs;

    public Input<NFSVolumeSourceArgs> getNfs() {
        return this.nfs == null ? Input.empty() : this.nfs;
    }

    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    @InputImport(name="persistentVolumeClaim")
      private final @Nullable Input<PersistentVolumeClaimVolumeSourceArgs> persistentVolumeClaim;

    public Input<PersistentVolumeClaimVolumeSourceArgs> getPersistentVolumeClaim() {
        return this.persistentVolumeClaim == null ? Input.empty() : this.persistentVolumeClaim;
    }

    /**
     * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
     * 
     */
    @InputImport(name="photonPersistentDisk")
      private final @Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk;

    public Input<PhotonPersistentDiskVolumeSourceArgs> getPhotonPersistentDisk() {
        return this.photonPersistentDisk == null ? Input.empty() : this.photonPersistentDisk;
    }

    /**
     * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
     * 
     */
    @InputImport(name="portworxVolume")
      private final @Nullable Input<PortworxVolumeSourceArgs> portworxVolume;

    public Input<PortworxVolumeSourceArgs> getPortworxVolume() {
        return this.portworxVolume == null ? Input.empty() : this.portworxVolume;
    }

    /**
     * Items for all in one resources secrets, configmaps, and downward API
     * 
     */
    @InputImport(name="projected")
      private final @Nullable Input<ProjectedVolumeSourceArgs> projected;

    public Input<ProjectedVolumeSourceArgs> getProjected() {
        return this.projected == null ? Input.empty() : this.projected;
    }

    /**
     * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
     * 
     */
    @InputImport(name="quobyte")
      private final @Nullable Input<QuobyteVolumeSourceArgs> quobyte;

    public Input<QuobyteVolumeSourceArgs> getQuobyte() {
        return this.quobyte == null ? Input.empty() : this.quobyte;
    }

    /**
     * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
     * 
     */
    @InputImport(name="rbd")
      private final @Nullable Input<RBDVolumeSourceArgs> rbd;

    public Input<RBDVolumeSourceArgs> getRbd() {
        return this.rbd == null ? Input.empty() : this.rbd;
    }

    /**
     * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     * 
     */
    @InputImport(name="scaleIO")
      private final @Nullable Input<ScaleIOVolumeSourceArgs> scaleIO;

    public Input<ScaleIOVolumeSourceArgs> getScaleIO() {
        return this.scaleIO == null ? Input.empty() : this.scaleIO;
    }

    /**
     * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    @InputImport(name="secret")
      private final @Nullable Input<SecretVolumeSourceArgs> secret;

    public Input<SecretVolumeSourceArgs> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    /**
     * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     * 
     */
    @InputImport(name="storageos")
      private final @Nullable Input<StorageOSVolumeSourceArgs> storageos;

    public Input<StorageOSVolumeSourceArgs> getStorageos() {
        return this.storageos == null ? Input.empty() : this.storageos;
    }

    /**
     * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
     * 
     */
    @InputImport(name="vsphereVolume")
      private final @Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume;

    public Input<VsphereVirtualDiskVolumeSourceArgs> getVsphereVolume() {
        return this.vsphereVolume == null ? Input.empty() : this.vsphereVolume;
    }

    public VolumeArgs(
        @Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore,
        @Nullable Input<AzureDiskVolumeSourceArgs> azureDisk,
        @Nullable Input<AzureFileVolumeSourceArgs> azureFile,
        @Nullable Input<CephFSVolumeSourceArgs> cephfs,
        @Nullable Input<CinderVolumeSourceArgs> cinder,
        @Nullable Input<ConfigMapVolumeSourceArgs> configMap,
        @Nullable Input<CSIVolumeSourceArgs> csi,
        @Nullable Input<DownwardAPIVolumeSourceArgs> downwardAPI,
        @Nullable Input<EmptyDirVolumeSourceArgs> emptyDir,
        @Nullable Input<EphemeralVolumeSourceArgs> ephemeral,
        @Nullable Input<FCVolumeSourceArgs> fc,
        @Nullable Input<FlexVolumeSourceArgs> flexVolume,
        @Nullable Input<FlockerVolumeSourceArgs> flocker,
        @Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk,
        @Nullable Input<GitRepoVolumeSourceArgs> gitRepo,
        @Nullable Input<GlusterfsVolumeSourceArgs> glusterfs,
        @Nullable Input<HostPathVolumeSourceArgs> hostPath,
        @Nullable Input<ISCSIVolumeSourceArgs> iscsi,
        Input<String> name,
        @Nullable Input<NFSVolumeSourceArgs> nfs,
        @Nullable Input<PersistentVolumeClaimVolumeSourceArgs> persistentVolumeClaim,
        @Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk,
        @Nullable Input<PortworxVolumeSourceArgs> portworxVolume,
        @Nullable Input<ProjectedVolumeSourceArgs> projected,
        @Nullable Input<QuobyteVolumeSourceArgs> quobyte,
        @Nullable Input<RBDVolumeSourceArgs> rbd,
        @Nullable Input<ScaleIOVolumeSourceArgs> scaleIO,
        @Nullable Input<SecretVolumeSourceArgs> secret,
        @Nullable Input<StorageOSVolumeSourceArgs> storageos,
        @Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume) {
        this.awsElasticBlockStore = awsElasticBlockStore;
        this.azureDisk = azureDisk;
        this.azureFile = azureFile;
        this.cephfs = cephfs;
        this.cinder = cinder;
        this.configMap = configMap;
        this.csi = csi;
        this.downwardAPI = downwardAPI;
        this.emptyDir = emptyDir;
        this.ephemeral = ephemeral;
        this.fc = fc;
        this.flexVolume = flexVolume;
        this.flocker = flocker;
        this.gcePersistentDisk = gcePersistentDisk;
        this.gitRepo = gitRepo;
        this.glusterfs = glusterfs;
        this.hostPath = hostPath;
        this.iscsi = iscsi;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nfs = nfs;
        this.persistentVolumeClaim = persistentVolumeClaim;
        this.photonPersistentDisk = photonPersistentDisk;
        this.portworxVolume = portworxVolume;
        this.projected = projected;
        this.quobyte = quobyte;
        this.rbd = rbd;
        this.scaleIO = scaleIO;
        this.secret = secret;
        this.storageos = storageos;
        this.vsphereVolume = vsphereVolume;
    }

    private VolumeArgs() {
        this.awsElasticBlockStore = Input.empty();
        this.azureDisk = Input.empty();
        this.azureFile = Input.empty();
        this.cephfs = Input.empty();
        this.cinder = Input.empty();
        this.configMap = Input.empty();
        this.csi = Input.empty();
        this.downwardAPI = Input.empty();
        this.emptyDir = Input.empty();
        this.ephemeral = Input.empty();
        this.fc = Input.empty();
        this.flexVolume = Input.empty();
        this.flocker = Input.empty();
        this.gcePersistentDisk = Input.empty();
        this.gitRepo = Input.empty();
        this.glusterfs = Input.empty();
        this.hostPath = Input.empty();
        this.iscsi = Input.empty();
        this.name = Input.empty();
        this.nfs = Input.empty();
        this.persistentVolumeClaim = Input.empty();
        this.photonPersistentDisk = Input.empty();
        this.portworxVolume = Input.empty();
        this.projected = Input.empty();
        this.quobyte = Input.empty();
        this.rbd = Input.empty();
        this.scaleIO = Input.empty();
        this.secret = Input.empty();
        this.storageos = Input.empty();
        this.vsphereVolume = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore;
        private @Nullable Input<AzureDiskVolumeSourceArgs> azureDisk;
        private @Nullable Input<AzureFileVolumeSourceArgs> azureFile;
        private @Nullable Input<CephFSVolumeSourceArgs> cephfs;
        private @Nullable Input<CinderVolumeSourceArgs> cinder;
        private @Nullable Input<ConfigMapVolumeSourceArgs> configMap;
        private @Nullable Input<CSIVolumeSourceArgs> csi;
        private @Nullable Input<DownwardAPIVolumeSourceArgs> downwardAPI;
        private @Nullable Input<EmptyDirVolumeSourceArgs> emptyDir;
        private @Nullable Input<EphemeralVolumeSourceArgs> ephemeral;
        private @Nullable Input<FCVolumeSourceArgs> fc;
        private @Nullable Input<FlexVolumeSourceArgs> flexVolume;
        private @Nullable Input<FlockerVolumeSourceArgs> flocker;
        private @Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk;
        private @Nullable Input<GitRepoVolumeSourceArgs> gitRepo;
        private @Nullable Input<GlusterfsVolumeSourceArgs> glusterfs;
        private @Nullable Input<HostPathVolumeSourceArgs> hostPath;
        private @Nullable Input<ISCSIVolumeSourceArgs> iscsi;
        private Input<String> name;
        private @Nullable Input<NFSVolumeSourceArgs> nfs;
        private @Nullable Input<PersistentVolumeClaimVolumeSourceArgs> persistentVolumeClaim;
        private @Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk;
        private @Nullable Input<PortworxVolumeSourceArgs> portworxVolume;
        private @Nullable Input<ProjectedVolumeSourceArgs> projected;
        private @Nullable Input<QuobyteVolumeSourceArgs> quobyte;
        private @Nullable Input<RBDVolumeSourceArgs> rbd;
        private @Nullable Input<ScaleIOVolumeSourceArgs> scaleIO;
        private @Nullable Input<SecretVolumeSourceArgs> secret;
        private @Nullable Input<StorageOSVolumeSourceArgs> storageos;
        private @Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsElasticBlockStore = defaults.awsElasticBlockStore;
    	      this.azureDisk = defaults.azureDisk;
    	      this.azureFile = defaults.azureFile;
    	      this.cephfs = defaults.cephfs;
    	      this.cinder = defaults.cinder;
    	      this.configMap = defaults.configMap;
    	      this.csi = defaults.csi;
    	      this.downwardAPI = defaults.downwardAPI;
    	      this.emptyDir = defaults.emptyDir;
    	      this.ephemeral = defaults.ephemeral;
    	      this.fc = defaults.fc;
    	      this.flexVolume = defaults.flexVolume;
    	      this.flocker = defaults.flocker;
    	      this.gcePersistentDisk = defaults.gcePersistentDisk;
    	      this.gitRepo = defaults.gitRepo;
    	      this.glusterfs = defaults.glusterfs;
    	      this.hostPath = defaults.hostPath;
    	      this.iscsi = defaults.iscsi;
    	      this.name = defaults.name;
    	      this.nfs = defaults.nfs;
    	      this.persistentVolumeClaim = defaults.persistentVolumeClaim;
    	      this.photonPersistentDisk = defaults.photonPersistentDisk;
    	      this.portworxVolume = defaults.portworxVolume;
    	      this.projected = defaults.projected;
    	      this.quobyte = defaults.quobyte;
    	      this.rbd = defaults.rbd;
    	      this.scaleIO = defaults.scaleIO;
    	      this.secret = defaults.secret;
    	      this.storageos = defaults.storageos;
    	      this.vsphereVolume = defaults.vsphereVolume;
        }

        public Builder setAwsElasticBlockStore(@Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        public Builder setAwsElasticBlockStore(@Nullable AWSElasticBlockStoreVolumeSourceArgs awsElasticBlockStore) {
            this.awsElasticBlockStore = Input.ofNullable(awsElasticBlockStore);
            return this;
        }

        public Builder setAzureDisk(@Nullable Input<AzureDiskVolumeSourceArgs> azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        public Builder setAzureDisk(@Nullable AzureDiskVolumeSourceArgs azureDisk) {
            this.azureDisk = Input.ofNullable(azureDisk);
            return this;
        }

        public Builder setAzureFile(@Nullable Input<AzureFileVolumeSourceArgs> azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        public Builder setAzureFile(@Nullable AzureFileVolumeSourceArgs azureFile) {
            this.azureFile = Input.ofNullable(azureFile);
            return this;
        }

        public Builder setCephfs(@Nullable Input<CephFSVolumeSourceArgs> cephfs) {
            this.cephfs = cephfs;
            return this;
        }

        public Builder setCephfs(@Nullable CephFSVolumeSourceArgs cephfs) {
            this.cephfs = Input.ofNullable(cephfs);
            return this;
        }

        public Builder setCinder(@Nullable Input<CinderVolumeSourceArgs> cinder) {
            this.cinder = cinder;
            return this;
        }

        public Builder setCinder(@Nullable CinderVolumeSourceArgs cinder) {
            this.cinder = Input.ofNullable(cinder);
            return this;
        }

        public Builder setConfigMap(@Nullable Input<ConfigMapVolumeSourceArgs> configMap) {
            this.configMap = configMap;
            return this;
        }

        public Builder setConfigMap(@Nullable ConfigMapVolumeSourceArgs configMap) {
            this.configMap = Input.ofNullable(configMap);
            return this;
        }

        public Builder setCsi(@Nullable Input<CSIVolumeSourceArgs> csi) {
            this.csi = csi;
            return this;
        }

        public Builder setCsi(@Nullable CSIVolumeSourceArgs csi) {
            this.csi = Input.ofNullable(csi);
            return this;
        }

        public Builder setDownwardAPI(@Nullable Input<DownwardAPIVolumeSourceArgs> downwardAPI) {
            this.downwardAPI = downwardAPI;
            return this;
        }

        public Builder setDownwardAPI(@Nullable DownwardAPIVolumeSourceArgs downwardAPI) {
            this.downwardAPI = Input.ofNullable(downwardAPI);
            return this;
        }

        public Builder setEmptyDir(@Nullable Input<EmptyDirVolumeSourceArgs> emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        public Builder setEmptyDir(@Nullable EmptyDirVolumeSourceArgs emptyDir) {
            this.emptyDir = Input.ofNullable(emptyDir);
            return this;
        }

        public Builder setEphemeral(@Nullable Input<EphemeralVolumeSourceArgs> ephemeral) {
            this.ephemeral = ephemeral;
            return this;
        }

        public Builder setEphemeral(@Nullable EphemeralVolumeSourceArgs ephemeral) {
            this.ephemeral = Input.ofNullable(ephemeral);
            return this;
        }

        public Builder setFc(@Nullable Input<FCVolumeSourceArgs> fc) {
            this.fc = fc;
            return this;
        }

        public Builder setFc(@Nullable FCVolumeSourceArgs fc) {
            this.fc = Input.ofNullable(fc);
            return this;
        }

        public Builder setFlexVolume(@Nullable Input<FlexVolumeSourceArgs> flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        public Builder setFlexVolume(@Nullable FlexVolumeSourceArgs flexVolume) {
            this.flexVolume = Input.ofNullable(flexVolume);
            return this;
        }

        public Builder setFlocker(@Nullable Input<FlockerVolumeSourceArgs> flocker) {
            this.flocker = flocker;
            return this;
        }

        public Builder setFlocker(@Nullable FlockerVolumeSourceArgs flocker) {
            this.flocker = Input.ofNullable(flocker);
            return this;
        }

        public Builder setGcePersistentDisk(@Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        public Builder setGcePersistentDisk(@Nullable GCEPersistentDiskVolumeSourceArgs gcePersistentDisk) {
            this.gcePersistentDisk = Input.ofNullable(gcePersistentDisk);
            return this;
        }

        public Builder setGitRepo(@Nullable Input<GitRepoVolumeSourceArgs> gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        public Builder setGitRepo(@Nullable GitRepoVolumeSourceArgs gitRepo) {
            this.gitRepo = Input.ofNullable(gitRepo);
            return this;
        }

        public Builder setGlusterfs(@Nullable Input<GlusterfsVolumeSourceArgs> glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        public Builder setGlusterfs(@Nullable GlusterfsVolumeSourceArgs glusterfs) {
            this.glusterfs = Input.ofNullable(glusterfs);
            return this;
        }

        public Builder setHostPath(@Nullable Input<HostPathVolumeSourceArgs> hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        public Builder setHostPath(@Nullable HostPathVolumeSourceArgs hostPath) {
            this.hostPath = Input.ofNullable(hostPath);
            return this;
        }

        public Builder setIscsi(@Nullable Input<ISCSIVolumeSourceArgs> iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        public Builder setIscsi(@Nullable ISCSIVolumeSourceArgs iscsi) {
            this.iscsi = Input.ofNullable(iscsi);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNfs(@Nullable Input<NFSVolumeSourceArgs> nfs) {
            this.nfs = nfs;
            return this;
        }

        public Builder setNfs(@Nullable NFSVolumeSourceArgs nfs) {
            this.nfs = Input.ofNullable(nfs);
            return this;
        }

        public Builder setPersistentVolumeClaim(@Nullable Input<PersistentVolumeClaimVolumeSourceArgs> persistentVolumeClaim) {
            this.persistentVolumeClaim = persistentVolumeClaim;
            return this;
        }

        public Builder setPersistentVolumeClaim(@Nullable PersistentVolumeClaimVolumeSourceArgs persistentVolumeClaim) {
            this.persistentVolumeClaim = Input.ofNullable(persistentVolumeClaim);
            return this;
        }

        public Builder setPhotonPersistentDisk(@Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        public Builder setPhotonPersistentDisk(@Nullable PhotonPersistentDiskVolumeSourceArgs photonPersistentDisk) {
            this.photonPersistentDisk = Input.ofNullable(photonPersistentDisk);
            return this;
        }

        public Builder setPortworxVolume(@Nullable Input<PortworxVolumeSourceArgs> portworxVolume) {
            this.portworxVolume = portworxVolume;
            return this;
        }

        public Builder setPortworxVolume(@Nullable PortworxVolumeSourceArgs portworxVolume) {
            this.portworxVolume = Input.ofNullable(portworxVolume);
            return this;
        }

        public Builder setProjected(@Nullable Input<ProjectedVolumeSourceArgs> projected) {
            this.projected = projected;
            return this;
        }

        public Builder setProjected(@Nullable ProjectedVolumeSourceArgs projected) {
            this.projected = Input.ofNullable(projected);
            return this;
        }

        public Builder setQuobyte(@Nullable Input<QuobyteVolumeSourceArgs> quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        public Builder setQuobyte(@Nullable QuobyteVolumeSourceArgs quobyte) {
            this.quobyte = Input.ofNullable(quobyte);
            return this;
        }

        public Builder setRbd(@Nullable Input<RBDVolumeSourceArgs> rbd) {
            this.rbd = rbd;
            return this;
        }

        public Builder setRbd(@Nullable RBDVolumeSourceArgs rbd) {
            this.rbd = Input.ofNullable(rbd);
            return this;
        }

        public Builder setScaleIO(@Nullable Input<ScaleIOVolumeSourceArgs> scaleIO) {
            this.scaleIO = scaleIO;
            return this;
        }

        public Builder setScaleIO(@Nullable ScaleIOVolumeSourceArgs scaleIO) {
            this.scaleIO = Input.ofNullable(scaleIO);
            return this;
        }

        public Builder setSecret(@Nullable Input<SecretVolumeSourceArgs> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable SecretVolumeSourceArgs secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public Builder setStorageos(@Nullable Input<StorageOSVolumeSourceArgs> storageos) {
            this.storageos = storageos;
            return this;
        }

        public Builder setStorageos(@Nullable StorageOSVolumeSourceArgs storageos) {
            this.storageos = Input.ofNullable(storageos);
            return this;
        }

        public Builder setVsphereVolume(@Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        public Builder setVsphereVolume(@Nullable VsphereVirtualDiskVolumeSourceArgs vsphereVolume) {
            this.vsphereVolume = Input.ofNullable(vsphereVolume);
            return this;
        }
        public VolumeArgs build() {
            return new VolumeArgs(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardAPI, emptyDir, ephemeral, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, name, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
        }
    }
}
