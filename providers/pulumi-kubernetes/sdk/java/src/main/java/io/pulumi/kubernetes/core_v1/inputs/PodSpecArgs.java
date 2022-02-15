// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.AffinityArgs;
import io.pulumi.kubernetes.core_v1.inputs.ContainerArgs;
import io.pulumi.kubernetes.core_v1.inputs.EphemeralContainerArgs;
import io.pulumi.kubernetes.core_v1.inputs.HostAliasArgs;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodDNSConfigArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodOSArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodReadinessGateArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodSecurityContextArgs;
import io.pulumi.kubernetes.core_v1.inputs.TolerationArgs;
import io.pulumi.kubernetes.core_v1.inputs.TopologySpreadConstraintArgs;
import io.pulumi.kubernetes.core_v1.inputs.VolumeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PodSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodSpecArgs Empty = new PodSpecArgs();

    @InputImport(name="activeDeadlineSeconds")
    private final @Nullable Input<Integer> activeDeadlineSeconds;

    public Input<Integer> getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds == null ? Input.empty() : this.activeDeadlineSeconds;
    }

    @InputImport(name="affinity")
    private final @Nullable Input<AffinityArgs> affinity;

    public Input<AffinityArgs> getAffinity() {
        return this.affinity == null ? Input.empty() : this.affinity;
    }

    @InputImport(name="automountServiceAccountToken")
    private final @Nullable Input<Boolean> automountServiceAccountToken;

    public Input<Boolean> getAutomountServiceAccountToken() {
        return this.automountServiceAccountToken == null ? Input.empty() : this.automountServiceAccountToken;
    }

    @InputImport(name="containers", required=true)
    private final Input<List<ContainerArgs>> containers;

    public Input<List<ContainerArgs>> getContainers() {
        return this.containers;
    }

    @InputImport(name="dnsConfig")
    private final @Nullable Input<PodDNSConfigArgs> dnsConfig;

    public Input<PodDNSConfigArgs> getDnsConfig() {
        return this.dnsConfig == null ? Input.empty() : this.dnsConfig;
    }

    @InputImport(name="dnsPolicy")
    private final @Nullable Input<String> dnsPolicy;

    public Input<String> getDnsPolicy() {
        return this.dnsPolicy == null ? Input.empty() : this.dnsPolicy;
    }

    @InputImport(name="enableServiceLinks")
    private final @Nullable Input<Boolean> enableServiceLinks;

    public Input<Boolean> getEnableServiceLinks() {
        return this.enableServiceLinks == null ? Input.empty() : this.enableServiceLinks;
    }

    @InputImport(name="ephemeralContainers")
    private final @Nullable Input<List<EphemeralContainerArgs>> ephemeralContainers;

    public Input<List<EphemeralContainerArgs>> getEphemeralContainers() {
        return this.ephemeralContainers == null ? Input.empty() : this.ephemeralContainers;
    }

    @InputImport(name="hostAliases")
    private final @Nullable Input<List<HostAliasArgs>> hostAliases;

    public Input<List<HostAliasArgs>> getHostAliases() {
        return this.hostAliases == null ? Input.empty() : this.hostAliases;
    }

    @InputImport(name="hostIPC")
    private final @Nullable Input<Boolean> hostIPC;

    public Input<Boolean> getHostIPC() {
        return this.hostIPC == null ? Input.empty() : this.hostIPC;
    }

    @InputImport(name="hostNetwork")
    private final @Nullable Input<Boolean> hostNetwork;

    public Input<Boolean> getHostNetwork() {
        return this.hostNetwork == null ? Input.empty() : this.hostNetwork;
    }

    @InputImport(name="hostPID")
    private final @Nullable Input<Boolean> hostPID;

    public Input<Boolean> getHostPID() {
        return this.hostPID == null ? Input.empty() : this.hostPID;
    }

    @InputImport(name="hostname")
    private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    @InputImport(name="imagePullSecrets")
    private final @Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets;

    public Input<List<LocalObjectReferenceArgs>> getImagePullSecrets() {
        return this.imagePullSecrets == null ? Input.empty() : this.imagePullSecrets;
    }

    @InputImport(name="initContainers")
    private final @Nullable Input<List<ContainerArgs>> initContainers;

    public Input<List<ContainerArgs>> getInitContainers() {
        return this.initContainers == null ? Input.empty() : this.initContainers;
    }

    @InputImport(name="nodeName")
    private final @Nullable Input<String> nodeName;

    public Input<String> getNodeName() {
        return this.nodeName == null ? Input.empty() : this.nodeName;
    }

    @InputImport(name="nodeSelector")
    private final @Nullable Input<Map<String,String>> nodeSelector;

    public Input<Map<String,String>> getNodeSelector() {
        return this.nodeSelector == null ? Input.empty() : this.nodeSelector;
    }

    @InputImport(name="os")
    private final @Nullable Input<PodOSArgs> os;

    public Input<PodOSArgs> getOs() {
        return this.os == null ? Input.empty() : this.os;
    }

    @InputImport(name="overhead")
    private final @Nullable Input<Map<String,String>> overhead;

    public Input<Map<String,String>> getOverhead() {
        return this.overhead == null ? Input.empty() : this.overhead;
    }

    @InputImport(name="preemptionPolicy")
    private final @Nullable Input<String> preemptionPolicy;

    public Input<String> getPreemptionPolicy() {
        return this.preemptionPolicy == null ? Input.empty() : this.preemptionPolicy;
    }

    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="priorityClassName")
    private final @Nullable Input<String> priorityClassName;

    public Input<String> getPriorityClassName() {
        return this.priorityClassName == null ? Input.empty() : this.priorityClassName;
    }

    @InputImport(name="readinessGates")
    private final @Nullable Input<List<PodReadinessGateArgs>> readinessGates;

    public Input<List<PodReadinessGateArgs>> getReadinessGates() {
        return this.readinessGates == null ? Input.empty() : this.readinessGates;
    }

    @InputImport(name="restartPolicy")
    private final @Nullable Input<String> restartPolicy;

    public Input<String> getRestartPolicy() {
        return this.restartPolicy == null ? Input.empty() : this.restartPolicy;
    }

    @InputImport(name="runtimeClassName")
    private final @Nullable Input<String> runtimeClassName;

    public Input<String> getRuntimeClassName() {
        return this.runtimeClassName == null ? Input.empty() : this.runtimeClassName;
    }

    @InputImport(name="schedulerName")
    private final @Nullable Input<String> schedulerName;

    public Input<String> getSchedulerName() {
        return this.schedulerName == null ? Input.empty() : this.schedulerName;
    }

    @InputImport(name="securityContext")
    private final @Nullable Input<PodSecurityContextArgs> securityContext;

    public Input<PodSecurityContextArgs> getSecurityContext() {
        return this.securityContext == null ? Input.empty() : this.securityContext;
    }

    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    @InputImport(name="serviceAccountName")
    private final @Nullable Input<String> serviceAccountName;

    public Input<String> getServiceAccountName() {
        return this.serviceAccountName == null ? Input.empty() : this.serviceAccountName;
    }

    @InputImport(name="setHostnameAsFQDN")
    private final @Nullable Input<Boolean> setHostnameAsFQDN;

    public Input<Boolean> getSetHostnameAsFQDN() {
        return this.setHostnameAsFQDN == null ? Input.empty() : this.setHostnameAsFQDN;
    }

    @InputImport(name="shareProcessNamespace")
    private final @Nullable Input<Boolean> shareProcessNamespace;

    public Input<Boolean> getShareProcessNamespace() {
        return this.shareProcessNamespace == null ? Input.empty() : this.shareProcessNamespace;
    }

    @InputImport(name="subdomain")
    private final @Nullable Input<String> subdomain;

    public Input<String> getSubdomain() {
        return this.subdomain == null ? Input.empty() : this.subdomain;
    }

    @InputImport(name="terminationGracePeriodSeconds")
    private final @Nullable Input<Integer> terminationGracePeriodSeconds;

    public Input<Integer> getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds == null ? Input.empty() : this.terminationGracePeriodSeconds;
    }

    @InputImport(name="tolerations")
    private final @Nullable Input<List<TolerationArgs>> tolerations;

    public Input<List<TolerationArgs>> getTolerations() {
        return this.tolerations == null ? Input.empty() : this.tolerations;
    }

    @InputImport(name="topologySpreadConstraints")
    private final @Nullable Input<List<TopologySpreadConstraintArgs>> topologySpreadConstraints;

    public Input<List<TopologySpreadConstraintArgs>> getTopologySpreadConstraints() {
        return this.topologySpreadConstraints == null ? Input.empty() : this.topologySpreadConstraints;
    }

    @InputImport(name="volumes")
    private final @Nullable Input<List<VolumeArgs>> volumes;

    public Input<List<VolumeArgs>> getVolumes() {
        return this.volumes == null ? Input.empty() : this.volumes;
    }

    public PodSpecArgs(
        @Nullable Input<Integer> activeDeadlineSeconds,
        @Nullable Input<AffinityArgs> affinity,
        @Nullable Input<Boolean> automountServiceAccountToken,
        Input<List<ContainerArgs>> containers,
        @Nullable Input<PodDNSConfigArgs> dnsConfig,
        @Nullable Input<String> dnsPolicy,
        @Nullable Input<Boolean> enableServiceLinks,
        @Nullable Input<List<EphemeralContainerArgs>> ephemeralContainers,
        @Nullable Input<List<HostAliasArgs>> hostAliases,
        @Nullable Input<Boolean> hostIPC,
        @Nullable Input<Boolean> hostNetwork,
        @Nullable Input<Boolean> hostPID,
        @Nullable Input<String> hostname,
        @Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets,
        @Nullable Input<List<ContainerArgs>> initContainers,
        @Nullable Input<String> nodeName,
        @Nullable Input<Map<String,String>> nodeSelector,
        @Nullable Input<PodOSArgs> os,
        @Nullable Input<Map<String,String>> overhead,
        @Nullable Input<String> preemptionPolicy,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> priorityClassName,
        @Nullable Input<List<PodReadinessGateArgs>> readinessGates,
        @Nullable Input<String> restartPolicy,
        @Nullable Input<String> runtimeClassName,
        @Nullable Input<String> schedulerName,
        @Nullable Input<PodSecurityContextArgs> securityContext,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<String> serviceAccountName,
        @Nullable Input<Boolean> setHostnameAsFQDN,
        @Nullable Input<Boolean> shareProcessNamespace,
        @Nullable Input<String> subdomain,
        @Nullable Input<Integer> terminationGracePeriodSeconds,
        @Nullable Input<List<TolerationArgs>> tolerations,
        @Nullable Input<List<TopologySpreadConstraintArgs>> topologySpreadConstraints,
        @Nullable Input<List<VolumeArgs>> volumes) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.affinity = affinity;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.containers = Objects.requireNonNull(containers, "expected parameter 'containers' to be non-null");
        this.dnsConfig = dnsConfig;
        this.dnsPolicy = dnsPolicy;
        this.enableServiceLinks = enableServiceLinks;
        this.ephemeralContainers = ephemeralContainers;
        this.hostAliases = hostAliases;
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostname = hostname;
        this.imagePullSecrets = imagePullSecrets;
        this.initContainers = initContainers;
        this.nodeName = nodeName;
        this.nodeSelector = nodeSelector;
        this.os = os;
        this.overhead = overhead;
        this.preemptionPolicy = preemptionPolicy;
        this.priority = priority;
        this.priorityClassName = priorityClassName;
        this.readinessGates = readinessGates;
        this.restartPolicy = restartPolicy;
        this.runtimeClassName = runtimeClassName;
        this.schedulerName = schedulerName;
        this.securityContext = securityContext;
        this.serviceAccount = serviceAccount;
        this.serviceAccountName = serviceAccountName;
        this.setHostnameAsFQDN = setHostnameAsFQDN;
        this.shareProcessNamespace = shareProcessNamespace;
        this.subdomain = subdomain;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.tolerations = tolerations;
        this.topologySpreadConstraints = topologySpreadConstraints;
        this.volumes = volumes;
    }

    private PodSpecArgs() {
        this.activeDeadlineSeconds = Input.empty();
        this.affinity = Input.empty();
        this.automountServiceAccountToken = Input.empty();
        this.containers = Input.empty();
        this.dnsConfig = Input.empty();
        this.dnsPolicy = Input.empty();
        this.enableServiceLinks = Input.empty();
        this.ephemeralContainers = Input.empty();
        this.hostAliases = Input.empty();
        this.hostIPC = Input.empty();
        this.hostNetwork = Input.empty();
        this.hostPID = Input.empty();
        this.hostname = Input.empty();
        this.imagePullSecrets = Input.empty();
        this.initContainers = Input.empty();
        this.nodeName = Input.empty();
        this.nodeSelector = Input.empty();
        this.os = Input.empty();
        this.overhead = Input.empty();
        this.preemptionPolicy = Input.empty();
        this.priority = Input.empty();
        this.priorityClassName = Input.empty();
        this.readinessGates = Input.empty();
        this.restartPolicy = Input.empty();
        this.runtimeClassName = Input.empty();
        this.schedulerName = Input.empty();
        this.securityContext = Input.empty();
        this.serviceAccount = Input.empty();
        this.serviceAccountName = Input.empty();
        this.setHostnameAsFQDN = Input.empty();
        this.shareProcessNamespace = Input.empty();
        this.subdomain = Input.empty();
        this.terminationGracePeriodSeconds = Input.empty();
        this.tolerations = Input.empty();
        this.topologySpreadConstraints = Input.empty();
        this.volumes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> activeDeadlineSeconds;
        private @Nullable Input<AffinityArgs> affinity;
        private @Nullable Input<Boolean> automountServiceAccountToken;
        private Input<List<ContainerArgs>> containers;
        private @Nullable Input<PodDNSConfigArgs> dnsConfig;
        private @Nullable Input<String> dnsPolicy;
        private @Nullable Input<Boolean> enableServiceLinks;
        private @Nullable Input<List<EphemeralContainerArgs>> ephemeralContainers;
        private @Nullable Input<List<HostAliasArgs>> hostAliases;
        private @Nullable Input<Boolean> hostIPC;
        private @Nullable Input<Boolean> hostNetwork;
        private @Nullable Input<Boolean> hostPID;
        private @Nullable Input<String> hostname;
        private @Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets;
        private @Nullable Input<List<ContainerArgs>> initContainers;
        private @Nullable Input<String> nodeName;
        private @Nullable Input<Map<String,String>> nodeSelector;
        private @Nullable Input<PodOSArgs> os;
        private @Nullable Input<Map<String,String>> overhead;
        private @Nullable Input<String> preemptionPolicy;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> priorityClassName;
        private @Nullable Input<List<PodReadinessGateArgs>> readinessGates;
        private @Nullable Input<String> restartPolicy;
        private @Nullable Input<String> runtimeClassName;
        private @Nullable Input<String> schedulerName;
        private @Nullable Input<PodSecurityContextArgs> securityContext;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<String> serviceAccountName;
        private @Nullable Input<Boolean> setHostnameAsFQDN;
        private @Nullable Input<Boolean> shareProcessNamespace;
        private @Nullable Input<String> subdomain;
        private @Nullable Input<Integer> terminationGracePeriodSeconds;
        private @Nullable Input<List<TolerationArgs>> tolerations;
        private @Nullable Input<List<TopologySpreadConstraintArgs>> topologySpreadConstraints;
        private @Nullable Input<List<VolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.affinity = defaults.affinity;
    	      this.automountServiceAccountToken = defaults.automountServiceAccountToken;
    	      this.containers = defaults.containers;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.dnsPolicy = defaults.dnsPolicy;
    	      this.enableServiceLinks = defaults.enableServiceLinks;
    	      this.ephemeralContainers = defaults.ephemeralContainers;
    	      this.hostAliases = defaults.hostAliases;
    	      this.hostIPC = defaults.hostIPC;
    	      this.hostNetwork = defaults.hostNetwork;
    	      this.hostPID = defaults.hostPID;
    	      this.hostname = defaults.hostname;
    	      this.imagePullSecrets = defaults.imagePullSecrets;
    	      this.initContainers = defaults.initContainers;
    	      this.nodeName = defaults.nodeName;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.os = defaults.os;
    	      this.overhead = defaults.overhead;
    	      this.preemptionPolicy = defaults.preemptionPolicy;
    	      this.priority = defaults.priority;
    	      this.priorityClassName = defaults.priorityClassName;
    	      this.readinessGates = defaults.readinessGates;
    	      this.restartPolicy = defaults.restartPolicy;
    	      this.runtimeClassName = defaults.runtimeClassName;
    	      this.schedulerName = defaults.schedulerName;
    	      this.securityContext = defaults.securityContext;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.setHostnameAsFQDN = defaults.setHostnameAsFQDN;
    	      this.shareProcessNamespace = defaults.shareProcessNamespace;
    	      this.subdomain = defaults.subdomain;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.tolerations = defaults.tolerations;
    	      this.topologySpreadConstraints = defaults.topologySpreadConstraints;
    	      this.volumes = defaults.volumes;
        }

        public Builder setActiveDeadlineSeconds(@Nullable Input<Integer> activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        public Builder setActiveDeadlineSeconds(@Nullable Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Input.ofNullable(activeDeadlineSeconds);
            return this;
        }

        public Builder setAffinity(@Nullable Input<AffinityArgs> affinity) {
            this.affinity = affinity;
            return this;
        }

        public Builder setAffinity(@Nullable AffinityArgs affinity) {
            this.affinity = Input.ofNullable(affinity);
            return this;
        }

        public Builder setAutomountServiceAccountToken(@Nullable Input<Boolean> automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        public Builder setAutomountServiceAccountToken(@Nullable Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = Input.ofNullable(automountServiceAccountToken);
            return this;
        }

        public Builder setContainers(Input<List<ContainerArgs>> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }

        public Builder setContainers(List<ContainerArgs> containers) {
            this.containers = Input.of(Objects.requireNonNull(containers));
            return this;
        }

        public Builder setDnsConfig(@Nullable Input<PodDNSConfigArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setDnsConfig(@Nullable PodDNSConfigArgs dnsConfig) {
            this.dnsConfig = Input.ofNullable(dnsConfig);
            return this;
        }

        public Builder setDnsPolicy(@Nullable Input<String> dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        public Builder setDnsPolicy(@Nullable String dnsPolicy) {
            this.dnsPolicy = Input.ofNullable(dnsPolicy);
            return this;
        }

        public Builder setEnableServiceLinks(@Nullable Input<Boolean> enableServiceLinks) {
            this.enableServiceLinks = enableServiceLinks;
            return this;
        }

        public Builder setEnableServiceLinks(@Nullable Boolean enableServiceLinks) {
            this.enableServiceLinks = Input.ofNullable(enableServiceLinks);
            return this;
        }

        public Builder setEphemeralContainers(@Nullable Input<List<EphemeralContainerArgs>> ephemeralContainers) {
            this.ephemeralContainers = ephemeralContainers;
            return this;
        }

        public Builder setEphemeralContainers(@Nullable List<EphemeralContainerArgs> ephemeralContainers) {
            this.ephemeralContainers = Input.ofNullable(ephemeralContainers);
            return this;
        }

        public Builder setHostAliases(@Nullable Input<List<HostAliasArgs>> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }

        public Builder setHostAliases(@Nullable List<HostAliasArgs> hostAliases) {
            this.hostAliases = Input.ofNullable(hostAliases);
            return this;
        }

        public Builder setHostIPC(@Nullable Input<Boolean> hostIPC) {
            this.hostIPC = hostIPC;
            return this;
        }

        public Builder setHostIPC(@Nullable Boolean hostIPC) {
            this.hostIPC = Input.ofNullable(hostIPC);
            return this;
        }

        public Builder setHostNetwork(@Nullable Input<Boolean> hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        public Builder setHostNetwork(@Nullable Boolean hostNetwork) {
            this.hostNetwork = Input.ofNullable(hostNetwork);
            return this;
        }

        public Builder setHostPID(@Nullable Input<Boolean> hostPID) {
            this.hostPID = hostPID;
            return this;
        }

        public Builder setHostPID(@Nullable Boolean hostPID) {
            this.hostPID = Input.ofNullable(hostPID);
            return this;
        }

        public Builder setHostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder setImagePullSecrets(@Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        public Builder setImagePullSecrets(@Nullable List<LocalObjectReferenceArgs> imagePullSecrets) {
            this.imagePullSecrets = Input.ofNullable(imagePullSecrets);
            return this;
        }

        public Builder setInitContainers(@Nullable Input<List<ContainerArgs>> initContainers) {
            this.initContainers = initContainers;
            return this;
        }

        public Builder setInitContainers(@Nullable List<ContainerArgs> initContainers) {
            this.initContainers = Input.ofNullable(initContainers);
            return this;
        }

        public Builder setNodeName(@Nullable Input<String> nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder setNodeName(@Nullable String nodeName) {
            this.nodeName = Input.ofNullable(nodeName);
            return this;
        }

        public Builder setNodeSelector(@Nullable Input<Map<String,String>> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public Builder setNodeSelector(@Nullable Map<String,String> nodeSelector) {
            this.nodeSelector = Input.ofNullable(nodeSelector);
            return this;
        }

        public Builder setOs(@Nullable Input<PodOSArgs> os) {
            this.os = os;
            return this;
        }

        public Builder setOs(@Nullable PodOSArgs os) {
            this.os = Input.ofNullable(os);
            return this;
        }

        public Builder setOverhead(@Nullable Input<Map<String,String>> overhead) {
            this.overhead = overhead;
            return this;
        }

        public Builder setOverhead(@Nullable Map<String,String> overhead) {
            this.overhead = Input.ofNullable(overhead);
            return this;
        }

        public Builder setPreemptionPolicy(@Nullable Input<String> preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }

        public Builder setPreemptionPolicy(@Nullable String preemptionPolicy) {
            this.preemptionPolicy = Input.ofNullable(preemptionPolicy);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setPriorityClassName(@Nullable Input<String> priorityClassName) {
            this.priorityClassName = priorityClassName;
            return this;
        }

        public Builder setPriorityClassName(@Nullable String priorityClassName) {
            this.priorityClassName = Input.ofNullable(priorityClassName);
            return this;
        }

        public Builder setReadinessGates(@Nullable Input<List<PodReadinessGateArgs>> readinessGates) {
            this.readinessGates = readinessGates;
            return this;
        }

        public Builder setReadinessGates(@Nullable List<PodReadinessGateArgs> readinessGates) {
            this.readinessGates = Input.ofNullable(readinessGates);
            return this;
        }

        public Builder setRestartPolicy(@Nullable Input<String> restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder setRestartPolicy(@Nullable String restartPolicy) {
            this.restartPolicy = Input.ofNullable(restartPolicy);
            return this;
        }

        public Builder setRuntimeClassName(@Nullable Input<String> runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }

        public Builder setRuntimeClassName(@Nullable String runtimeClassName) {
            this.runtimeClassName = Input.ofNullable(runtimeClassName);
            return this;
        }

        public Builder setSchedulerName(@Nullable Input<String> schedulerName) {
            this.schedulerName = schedulerName;
            return this;
        }

        public Builder setSchedulerName(@Nullable String schedulerName) {
            this.schedulerName = Input.ofNullable(schedulerName);
            return this;
        }

        public Builder setSecurityContext(@Nullable Input<PodSecurityContextArgs> securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        public Builder setSecurityContext(@Nullable PodSecurityContextArgs securityContext) {
            this.securityContext = Input.ofNullable(securityContext);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setServiceAccountName(@Nullable Input<String> serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder setServiceAccountName(@Nullable String serviceAccountName) {
            this.serviceAccountName = Input.ofNullable(serviceAccountName);
            return this;
        }

        public Builder setSetHostnameAsFQDN(@Nullable Input<Boolean> setHostnameAsFQDN) {
            this.setHostnameAsFQDN = setHostnameAsFQDN;
            return this;
        }

        public Builder setSetHostnameAsFQDN(@Nullable Boolean setHostnameAsFQDN) {
            this.setHostnameAsFQDN = Input.ofNullable(setHostnameAsFQDN);
            return this;
        }

        public Builder setShareProcessNamespace(@Nullable Input<Boolean> shareProcessNamespace) {
            this.shareProcessNamespace = shareProcessNamespace;
            return this;
        }

        public Builder setShareProcessNamespace(@Nullable Boolean shareProcessNamespace) {
            this.shareProcessNamespace = Input.ofNullable(shareProcessNamespace);
            return this;
        }

        public Builder setSubdomain(@Nullable Input<String> subdomain) {
            this.subdomain = subdomain;
            return this;
        }

        public Builder setSubdomain(@Nullable String subdomain) {
            this.subdomain = Input.ofNullable(subdomain);
            return this;
        }

        public Builder setTerminationGracePeriodSeconds(@Nullable Input<Integer> terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        public Builder setTerminationGracePeriodSeconds(@Nullable Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = Input.ofNullable(terminationGracePeriodSeconds);
            return this;
        }

        public Builder setTolerations(@Nullable Input<List<TolerationArgs>> tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        public Builder setTolerations(@Nullable List<TolerationArgs> tolerations) {
            this.tolerations = Input.ofNullable(tolerations);
            return this;
        }

        public Builder setTopologySpreadConstraints(@Nullable Input<List<TopologySpreadConstraintArgs>> topologySpreadConstraints) {
            this.topologySpreadConstraints = topologySpreadConstraints;
            return this;
        }

        public Builder setTopologySpreadConstraints(@Nullable List<TopologySpreadConstraintArgs> topologySpreadConstraints) {
            this.topologySpreadConstraints = Input.ofNullable(topologySpreadConstraints);
            return this;
        }

        public Builder setVolumes(@Nullable Input<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder setVolumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Input.ofNullable(volumes);
            return this;
        }

        public PodSpecArgs build() {
            return new PodSpecArgs(activeDeadlineSeconds, affinity, automountServiceAccountToken, containers, dnsConfig, dnsPolicy, enableServiceLinks, ephemeralContainers, hostAliases, hostIPC, hostNetwork, hostPID, hostname, imagePullSecrets, initContainers, nodeName, nodeSelector, os, overhead, preemptionPolicy, priority, priorityClassName, readinessGates, restartPolicy, runtimeClassName, schedulerName, securityContext, serviceAccount, serviceAccountName, setHostnameAsFQDN, shareProcessNamespace, subdomain, terminationGracePeriodSeconds, tolerations, topologySpreadConstraints, volumes);
        }
    }
}