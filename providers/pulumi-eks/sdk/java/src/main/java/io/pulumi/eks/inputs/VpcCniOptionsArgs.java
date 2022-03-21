// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the configuration options available for the Amazon VPC CNI plugin for Kubernetes.
 * 
 */
public final class VpcCniOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcCniOptionsArgs Empty = new VpcCniOptionsArgs();

    /**
     * Specifies whether ipamd should configure rp filter for primary interface. Default is `false`.
     * 
     */
    @Import(name="cniConfigureRpfilter")
      private final @Nullable Output<Boolean> cniConfigureRpfilter;

    public Output<Boolean> getCniConfigureRpfilter() {
        return this.cniConfigureRpfilter == null ? Output.empty() : this.cniConfigureRpfilter;
    }

    /**
     * Specifies that your pods may use subnets and security groups that are independent of your worker node's VPC configuration. By default, pods share the same subnet and security groups as the worker node's primary interface. Setting this variable to true causes ipamd to use the security groups and VPC subnet in a worker node's ENIConfig for elastic network interface allocation. You must create an ENIConfig custom resource for each subnet that your pods will reside in, and then annotate or label each worker node to use a specific ENIConfig (multiple worker nodes can be annotated or labelled with the same ENIConfig). Worker nodes can only be annotated with a single ENIConfig at a time, and the subnet in the ENIConfig must belong to the same Availability Zone that the worker node resides in. For more information, see CNI Custom Networking in the Amazon EKS User Guide. Default is `false`
     * 
     */
    @Import(name="cniCustomNetworkCfg")
      private final @Nullable Output<Boolean> cniCustomNetworkCfg;

    public Output<Boolean> getCniCustomNetworkCfg() {
        return this.cniCustomNetworkCfg == null ? Output.empty() : this.cniCustomNetworkCfg;
    }

    /**
     * Specifies whether an external NAT gateway should be used to provide SNAT of secondary ENI IP addresses. If set to true, the SNAT iptables rule and off-VPC IP rule are not applied, and these rules are removed if they have already been applied. Disable SNAT if you need to allow inbound communication to your pods from external VPNs, direct connections, and external VPCs, and your pods do not need to access the Internet directly via an Internet Gateway. However, your nodes must be running in a private subnet and connected to the internet through an AWS NAT Gateway or another external NAT device. Default is `false`
     * 
     */
    @Import(name="cniExternalSnat")
      private final @Nullable Output<Boolean> cniExternalSnat;

    public Output<Boolean> getCniExternalSnat() {
        return this.cniExternalSnat == null ? Output.empty() : this.cniExternalSnat;
    }

    /**
     * Specifies that your pods may use subnets and security groups (within the same VPC as your control plane resources) that are independent of your cluster's `resourcesVpcConfig`.
     * 
     * Defaults to false.
     * 
     */
    @Import(name="customNetworkConfig")
      private final @Nullable Output<Boolean> customNetworkConfig;

    public Output<Boolean> getCustomNetworkConfig() {
        return this.customNetworkConfig == null ? Output.empty() : this.customNetworkConfig;
    }

    /**
     * Allows the kubelet's liveness and readiness probes to connect via TCP when pod ENI is enabled. This will slightly increase local TCP connection latency.
     * 
     */
    @Import(name="disableTcpEarlyDemux")
      private final @Nullable Output<Boolean> disableTcpEarlyDemux;

    public Output<Boolean> getDisableTcpEarlyDemux() {
        return this.disableTcpEarlyDemux == null ? Output.empty() : this.disableTcpEarlyDemux;
    }

    /**
     * Specifies whether to allow IPAMD to add the `vpc.amazonaws.com/has-trunk-attached` label to the node if the instance has capacity to attach an additional ENI. Default is `false`. If using liveness and readiness probes, you will also need to disable TCP early demux.
     * 
     */
    @Import(name="enablePodEni")
      private final @Nullable Output<Boolean> enablePodEni;

    public Output<Boolean> getEnablePodEni() {
        return this.enablePodEni == null ? Output.empty() : this.enablePodEni;
    }

    /**
     * IPAMD will start allocating (/28) prefixes to the ENIs with ENABLE_PREFIX_DELEGATION set to true.
     * 
     */
    @Import(name="enablePrefixDelegation")
      private final @Nullable Output<Boolean> enablePrefixDelegation;

    public Output<Boolean> getEnablePrefixDelegation() {
        return this.enablePrefixDelegation == null ? Output.empty() : this.enablePrefixDelegation;
    }

    /**
     * Specifies the ENI_CONFIG_LABEL_DEF environment variable value for worker nodes. This is used to tell Kubernetes to automatically apply the ENIConfig for each Availability Zone
     * Ref: https://docs.aws.amazon.com/eks/latest/userguide/cni-custom-network.html (step 5(c))
     * 
     * Defaults to the official AWS CNI image in ECR.
     * 
     */
    @Import(name="eniConfigLabelDef")
      private final @Nullable Output<String> eniConfigLabelDef;

    public Output<String> getEniConfigLabelDef() {
        return this.eniConfigLabelDef == null ? Output.empty() : this.eniConfigLabelDef;
    }

    /**
     * Used to configure the MTU size for attached ENIs. The valid range is from 576 to 9001.
     * 
     * Defaults to 9001.
     * 
     */
    @Import(name="eniMtu")
      private final @Nullable Output<Integer> eniMtu;

    public Output<Integer> getEniMtu() {
        return this.eniMtu == null ? Output.empty() : this.eniMtu;
    }

    /**
     * Specifies whether an external NAT gateway should be used to provide SNAT of secondary ENI IP addresses. If set to true, the SNAT iptables rule and off-VPC IP rule are not applied, and these rules are removed if they have already been applied.
     * 
     * Defaults to false.
     * 
     */
    @Import(name="externalSnat")
      private final @Nullable Output<Boolean> externalSnat;

    public Output<Boolean> getExternalSnat() {
        return this.externalSnat == null ? Output.empty() : this.externalSnat;
    }

    /**
     * Specifies the container image to use in the AWS CNI cluster DaemonSet.
     * 
     * Defaults to the official AWS CNI image in ECR.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * Specifies the init container image to use in the AWS CNI cluster DaemonSet.
     * 
     * Defaults to the official AWS CNI init container image in ECR.
     * 
     */
    @Import(name="initImage")
      private final @Nullable Output<String> initImage;

    public Output<String> getInitImage() {
        return this.initImage == null ? Output.empty() : this.initImage;
    }

    /**
     * Specifies the file path used for logs.
     * 
     * Defaults to "stdout" to emit Pod logs for `kubectl logs`.
     * 
     */
    @Import(name="logFile")
      private final @Nullable Output<String> logFile;

    public Output<String> getLogFile() {
        return this.logFile == null ? Output.empty() : this.logFile;
    }

    /**
     * Specifies the log level used for logs.
     * 
     * Defaults to "DEBUG"
     * Valid values: "DEBUG", "INFO", "WARN", "ERROR", or "FATAL".
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<String> logLevel;

    public Output<String> getLogLevel() {
        return this.logLevel == null ? Output.empty() : this.logLevel;
    }

    /**
     * Specifies whether NodePort services are enabled on a worker node's primary network interface. This requires additional iptables rules and that the kernel's reverse path filter on the primary interface is set to loose.
     * 
     * Defaults to true.
     * 
     */
    @Import(name="nodePortSupport")
      private final @Nullable Output<Boolean> nodePortSupport;

    public Output<Boolean> getNodePortSupport() {
        return this.nodePortSupport == null ? Output.empty() : this.nodePortSupport;
    }

    /**
     * Pass privilege to containers securityContext. This is required when SELinux is enabled. This value will not be passed to the CNI config by default
     * 
     */
    @Import(name="securityContextPrivileged")
      private final @Nullable Output<Boolean> securityContextPrivileged;

    public Output<Boolean> getSecurityContextPrivileged() {
        return this.securityContextPrivileged == null ? Output.empty() : this.securityContextPrivileged;
    }

    /**
     * Specifies the veth prefix used to generate the host-side veth device name for the CNI.
     * 
     * The prefix can be at most 4 characters long.
     * 
     * Defaults to "eni".
     * 
     */
    @Import(name="vethPrefix")
      private final @Nullable Output<String> vethPrefix;

    public Output<String> getVethPrefix() {
        return this.vethPrefix == null ? Output.empty() : this.vethPrefix;
    }

    /**
     * Specifies the number of free elastic network interfaces (and all of their available IP addresses) that the ipamD daemon should attempt to keep available for pod assignment on the node.
     * 
     * Defaults to 1.
     * 
     */
    @Import(name="warmEniTarget")
      private final @Nullable Output<Integer> warmEniTarget;

    public Output<Integer> getWarmEniTarget() {
        return this.warmEniTarget == null ? Output.empty() : this.warmEniTarget;
    }

    /**
     * Specifies the number of free IP addresses that the ipamD daemon should attempt to keep available for pod assignment on the node.
     * 
     */
    @Import(name="warmIpTarget")
      private final @Nullable Output<Integer> warmIpTarget;

    public Output<Integer> getWarmIpTarget() {
        return this.warmIpTarget == null ? Output.empty() : this.warmIpTarget;
    }

    /**
     * WARM_PREFIX_TARGET will allocate one full (/28) prefix even if a single IP  is consumed with the existing prefix. Ref: https://github.com/aws/amazon-vpc-cni-k8s/blob/master/docs/prefix-and-ip-target.md
     * 
     */
    @Import(name="warmPrefixTarget")
      private final @Nullable Output<Integer> warmPrefixTarget;

    public Output<Integer> getWarmPrefixTarget() {
        return this.warmPrefixTarget == null ? Output.empty() : this.warmPrefixTarget;
    }

    public VpcCniOptionsArgs(
        @Nullable Output<Boolean> cniConfigureRpfilter,
        @Nullable Output<Boolean> cniCustomNetworkCfg,
        @Nullable Output<Boolean> cniExternalSnat,
        @Nullable Output<Boolean> customNetworkConfig,
        @Nullable Output<Boolean> disableTcpEarlyDemux,
        @Nullable Output<Boolean> enablePodEni,
        @Nullable Output<Boolean> enablePrefixDelegation,
        @Nullable Output<String> eniConfigLabelDef,
        @Nullable Output<Integer> eniMtu,
        @Nullable Output<Boolean> externalSnat,
        @Nullable Output<String> image,
        @Nullable Output<String> initImage,
        @Nullable Output<String> logFile,
        @Nullable Output<String> logLevel,
        @Nullable Output<Boolean> nodePortSupport,
        @Nullable Output<Boolean> securityContextPrivileged,
        @Nullable Output<String> vethPrefix,
        @Nullable Output<Integer> warmEniTarget,
        @Nullable Output<Integer> warmIpTarget,
        @Nullable Output<Integer> warmPrefixTarget) {
        this.cniConfigureRpfilter = cniConfigureRpfilter;
        this.cniCustomNetworkCfg = cniCustomNetworkCfg;
        this.cniExternalSnat = cniExternalSnat;
        this.customNetworkConfig = customNetworkConfig;
        this.disableTcpEarlyDemux = disableTcpEarlyDemux;
        this.enablePodEni = enablePodEni;
        this.enablePrefixDelegation = enablePrefixDelegation;
        this.eniConfigLabelDef = eniConfigLabelDef;
        this.eniMtu = eniMtu;
        this.externalSnat = externalSnat;
        this.image = image;
        this.initImage = initImage;
        this.logFile = logFile;
        this.logLevel = logLevel;
        this.nodePortSupport = nodePortSupport;
        this.securityContextPrivileged = securityContextPrivileged;
        this.vethPrefix = vethPrefix;
        this.warmEniTarget = warmEniTarget;
        this.warmIpTarget = warmIpTarget;
        this.warmPrefixTarget = warmPrefixTarget;
    }

    private VpcCniOptionsArgs() {
        this.cniConfigureRpfilter = Output.empty();
        this.cniCustomNetworkCfg = Output.empty();
        this.cniExternalSnat = Output.empty();
        this.customNetworkConfig = Output.empty();
        this.disableTcpEarlyDemux = Output.empty();
        this.enablePodEni = Output.empty();
        this.enablePrefixDelegation = Output.empty();
        this.eniConfigLabelDef = Output.empty();
        this.eniMtu = Output.empty();
        this.externalSnat = Output.empty();
        this.image = Output.empty();
        this.initImage = Output.empty();
        this.logFile = Output.empty();
        this.logLevel = Output.empty();
        this.nodePortSupport = Output.empty();
        this.securityContextPrivileged = Output.empty();
        this.vethPrefix = Output.empty();
        this.warmEniTarget = Output.empty();
        this.warmIpTarget = Output.empty();
        this.warmPrefixTarget = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcCniOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> cniConfigureRpfilter;
        private @Nullable Output<Boolean> cniCustomNetworkCfg;
        private @Nullable Output<Boolean> cniExternalSnat;
        private @Nullable Output<Boolean> customNetworkConfig;
        private @Nullable Output<Boolean> disableTcpEarlyDemux;
        private @Nullable Output<Boolean> enablePodEni;
        private @Nullable Output<Boolean> enablePrefixDelegation;
        private @Nullable Output<String> eniConfigLabelDef;
        private @Nullable Output<Integer> eniMtu;
        private @Nullable Output<Boolean> externalSnat;
        private @Nullable Output<String> image;
        private @Nullable Output<String> initImage;
        private @Nullable Output<String> logFile;
        private @Nullable Output<String> logLevel;
        private @Nullable Output<Boolean> nodePortSupport;
        private @Nullable Output<Boolean> securityContextPrivileged;
        private @Nullable Output<String> vethPrefix;
        private @Nullable Output<Integer> warmEniTarget;
        private @Nullable Output<Integer> warmIpTarget;
        private @Nullable Output<Integer> warmPrefixTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcCniOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cniConfigureRpfilter = defaults.cniConfigureRpfilter;
    	      this.cniCustomNetworkCfg = defaults.cniCustomNetworkCfg;
    	      this.cniExternalSnat = defaults.cniExternalSnat;
    	      this.customNetworkConfig = defaults.customNetworkConfig;
    	      this.disableTcpEarlyDemux = defaults.disableTcpEarlyDemux;
    	      this.enablePodEni = defaults.enablePodEni;
    	      this.enablePrefixDelegation = defaults.enablePrefixDelegation;
    	      this.eniConfigLabelDef = defaults.eniConfigLabelDef;
    	      this.eniMtu = defaults.eniMtu;
    	      this.externalSnat = defaults.externalSnat;
    	      this.image = defaults.image;
    	      this.initImage = defaults.initImage;
    	      this.logFile = defaults.logFile;
    	      this.logLevel = defaults.logLevel;
    	      this.nodePortSupport = defaults.nodePortSupport;
    	      this.securityContextPrivileged = defaults.securityContextPrivileged;
    	      this.vethPrefix = defaults.vethPrefix;
    	      this.warmEniTarget = defaults.warmEniTarget;
    	      this.warmIpTarget = defaults.warmIpTarget;
    	      this.warmPrefixTarget = defaults.warmPrefixTarget;
        }

        public Builder cniConfigureRpfilter(@Nullable Output<Boolean> cniConfigureRpfilter) {
            this.cniConfigureRpfilter = cniConfigureRpfilter;
            return this;
        }
        public Builder cniConfigureRpfilter(@Nullable Boolean cniConfigureRpfilter) {
            this.cniConfigureRpfilter = Output.ofNullable(cniConfigureRpfilter);
            return this;
        }
        public Builder cniCustomNetworkCfg(@Nullable Output<Boolean> cniCustomNetworkCfg) {
            this.cniCustomNetworkCfg = cniCustomNetworkCfg;
            return this;
        }
        public Builder cniCustomNetworkCfg(@Nullable Boolean cniCustomNetworkCfg) {
            this.cniCustomNetworkCfg = Output.ofNullable(cniCustomNetworkCfg);
            return this;
        }
        public Builder cniExternalSnat(@Nullable Output<Boolean> cniExternalSnat) {
            this.cniExternalSnat = cniExternalSnat;
            return this;
        }
        public Builder cniExternalSnat(@Nullable Boolean cniExternalSnat) {
            this.cniExternalSnat = Output.ofNullable(cniExternalSnat);
            return this;
        }
        public Builder customNetworkConfig(@Nullable Output<Boolean> customNetworkConfig) {
            this.customNetworkConfig = customNetworkConfig;
            return this;
        }
        public Builder customNetworkConfig(@Nullable Boolean customNetworkConfig) {
            this.customNetworkConfig = Output.ofNullable(customNetworkConfig);
            return this;
        }
        public Builder disableTcpEarlyDemux(@Nullable Output<Boolean> disableTcpEarlyDemux) {
            this.disableTcpEarlyDemux = disableTcpEarlyDemux;
            return this;
        }
        public Builder disableTcpEarlyDemux(@Nullable Boolean disableTcpEarlyDemux) {
            this.disableTcpEarlyDemux = Output.ofNullable(disableTcpEarlyDemux);
            return this;
        }
        public Builder enablePodEni(@Nullable Output<Boolean> enablePodEni) {
            this.enablePodEni = enablePodEni;
            return this;
        }
        public Builder enablePodEni(@Nullable Boolean enablePodEni) {
            this.enablePodEni = Output.ofNullable(enablePodEni);
            return this;
        }
        public Builder enablePrefixDelegation(@Nullable Output<Boolean> enablePrefixDelegation) {
            this.enablePrefixDelegation = enablePrefixDelegation;
            return this;
        }
        public Builder enablePrefixDelegation(@Nullable Boolean enablePrefixDelegation) {
            this.enablePrefixDelegation = Output.ofNullable(enablePrefixDelegation);
            return this;
        }
        public Builder eniConfigLabelDef(@Nullable Output<String> eniConfigLabelDef) {
            this.eniConfigLabelDef = eniConfigLabelDef;
            return this;
        }
        public Builder eniConfigLabelDef(@Nullable String eniConfigLabelDef) {
            this.eniConfigLabelDef = Output.ofNullable(eniConfigLabelDef);
            return this;
        }
        public Builder eniMtu(@Nullable Output<Integer> eniMtu) {
            this.eniMtu = eniMtu;
            return this;
        }
        public Builder eniMtu(@Nullable Integer eniMtu) {
            this.eniMtu = Output.ofNullable(eniMtu);
            return this;
        }
        public Builder externalSnat(@Nullable Output<Boolean> externalSnat) {
            this.externalSnat = externalSnat;
            return this;
        }
        public Builder externalSnat(@Nullable Boolean externalSnat) {
            this.externalSnat = Output.ofNullable(externalSnat);
            return this;
        }
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Output.ofNullable(image);
            return this;
        }
        public Builder initImage(@Nullable Output<String> initImage) {
            this.initImage = initImage;
            return this;
        }
        public Builder initImage(@Nullable String initImage) {
            this.initImage = Output.ofNullable(initImage);
            return this;
        }
        public Builder logFile(@Nullable Output<String> logFile) {
            this.logFile = logFile;
            return this;
        }
        public Builder logFile(@Nullable String logFile) {
            this.logFile = Output.ofNullable(logFile);
            return this;
        }
        public Builder logLevel(@Nullable Output<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = Output.ofNullable(logLevel);
            return this;
        }
        public Builder nodePortSupport(@Nullable Output<Boolean> nodePortSupport) {
            this.nodePortSupport = nodePortSupport;
            return this;
        }
        public Builder nodePortSupport(@Nullable Boolean nodePortSupport) {
            this.nodePortSupport = Output.ofNullable(nodePortSupport);
            return this;
        }
        public Builder securityContextPrivileged(@Nullable Output<Boolean> securityContextPrivileged) {
            this.securityContextPrivileged = securityContextPrivileged;
            return this;
        }
        public Builder securityContextPrivileged(@Nullable Boolean securityContextPrivileged) {
            this.securityContextPrivileged = Output.ofNullable(securityContextPrivileged);
            return this;
        }
        public Builder vethPrefix(@Nullable Output<String> vethPrefix) {
            this.vethPrefix = vethPrefix;
            return this;
        }
        public Builder vethPrefix(@Nullable String vethPrefix) {
            this.vethPrefix = Output.ofNullable(vethPrefix);
            return this;
        }
        public Builder warmEniTarget(@Nullable Output<Integer> warmEniTarget) {
            this.warmEniTarget = warmEniTarget;
            return this;
        }
        public Builder warmEniTarget(@Nullable Integer warmEniTarget) {
            this.warmEniTarget = Output.ofNullable(warmEniTarget);
            return this;
        }
        public Builder warmIpTarget(@Nullable Output<Integer> warmIpTarget) {
            this.warmIpTarget = warmIpTarget;
            return this;
        }
        public Builder warmIpTarget(@Nullable Integer warmIpTarget) {
            this.warmIpTarget = Output.ofNullable(warmIpTarget);
            return this;
        }
        public Builder warmPrefixTarget(@Nullable Output<Integer> warmPrefixTarget) {
            this.warmPrefixTarget = warmPrefixTarget;
            return this;
        }
        public Builder warmPrefixTarget(@Nullable Integer warmPrefixTarget) {
            this.warmPrefixTarget = Output.ofNullable(warmPrefixTarget);
            return this;
        }        public VpcCniOptionsArgs build() {
            return new VpcCniOptionsArgs(cniConfigureRpfilter, cniCustomNetworkCfg, cniExternalSnat, customNetworkConfig, disableTcpEarlyDemux, enablePodEni, enablePrefixDelegation, eniConfigLabelDef, eniMtu, externalSnat, image, initImage, logFile, logLevel, nodePortSupport, securityContextPrivileged, vethPrefix, warmEniTarget, warmIpTarget, warmPrefixTarget);
        }
    }
}
