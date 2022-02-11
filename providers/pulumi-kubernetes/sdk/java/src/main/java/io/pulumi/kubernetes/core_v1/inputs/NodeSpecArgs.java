// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.NodeConfigSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.TaintArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeSpecArgs Empty = new NodeSpecArgs();

    @InputImport(name="configSource")
    private final @Nullable Input<NodeConfigSourceArgs> configSource;

    public Input<NodeConfigSourceArgs> getConfigSource() {
        return this.configSource == null ? Input.empty() : this.configSource;
    }

    @InputImport(name="externalID")
    private final @Nullable Input<String> externalID;

    public Input<String> getExternalID() {
        return this.externalID == null ? Input.empty() : this.externalID;
    }

    @InputImport(name="podCIDR")
    private final @Nullable Input<String> podCIDR;

    public Input<String> getPodCIDR() {
        return this.podCIDR == null ? Input.empty() : this.podCIDR;
    }

    @InputImport(name="podCIDRs")
    private final @Nullable Input<List<String>> podCIDRs;

    public Input<List<String>> getPodCIDRs() {
        return this.podCIDRs == null ? Input.empty() : this.podCIDRs;
    }

    @InputImport(name="providerID")
    private final @Nullable Input<String> providerID;

    public Input<String> getProviderID() {
        return this.providerID == null ? Input.empty() : this.providerID;
    }

    @InputImport(name="taints")
    private final @Nullable Input<List<TaintArgs>> taints;

    public Input<List<TaintArgs>> getTaints() {
        return this.taints == null ? Input.empty() : this.taints;
    }

    @InputImport(name="unschedulable")
    private final @Nullable Input<Boolean> unschedulable;

    public Input<Boolean> getUnschedulable() {
        return this.unschedulable == null ? Input.empty() : this.unschedulable;
    }

    public NodeSpecArgs(
        @Nullable Input<NodeConfigSourceArgs> configSource,
        @Nullable Input<String> externalID,
        @Nullable Input<String> podCIDR,
        @Nullable Input<List<String>> podCIDRs,
        @Nullable Input<String> providerID,
        @Nullable Input<List<TaintArgs>> taints,
        @Nullable Input<Boolean> unschedulable) {
        this.configSource = configSource;
        this.externalID = externalID;
        this.podCIDR = podCIDR;
        this.podCIDRs = podCIDRs;
        this.providerID = providerID;
        this.taints = taints;
        this.unschedulable = unschedulable;
    }

    private NodeSpecArgs() {
        this.configSource = Input.empty();
        this.externalID = Input.empty();
        this.podCIDR = Input.empty();
        this.podCIDRs = Input.empty();
        this.providerID = Input.empty();
        this.taints = Input.empty();
        this.unschedulable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodeConfigSourceArgs> configSource;
        private @Nullable Input<String> externalID;
        private @Nullable Input<String> podCIDR;
        private @Nullable Input<List<String>> podCIDRs;
        private @Nullable Input<String> providerID;
        private @Nullable Input<List<TaintArgs>> taints;
        private @Nullable Input<Boolean> unschedulable;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configSource = defaults.configSource;
    	      this.externalID = defaults.externalID;
    	      this.podCIDR = defaults.podCIDR;
    	      this.podCIDRs = defaults.podCIDRs;
    	      this.providerID = defaults.providerID;
    	      this.taints = defaults.taints;
    	      this.unschedulable = defaults.unschedulable;
        }

        public Builder setConfigSource(@Nullable Input<NodeConfigSourceArgs> configSource) {
            this.configSource = configSource;
            return this;
        }

        public Builder setConfigSource(@Nullable NodeConfigSourceArgs configSource) {
            this.configSource = Input.ofNullable(configSource);
            return this;
        }

        public Builder setExternalID(@Nullable Input<String> externalID) {
            this.externalID = externalID;
            return this;
        }

        public Builder setExternalID(@Nullable String externalID) {
            this.externalID = Input.ofNullable(externalID);
            return this;
        }

        public Builder setPodCIDR(@Nullable Input<String> podCIDR) {
            this.podCIDR = podCIDR;
            return this;
        }

        public Builder setPodCIDR(@Nullable String podCIDR) {
            this.podCIDR = Input.ofNullable(podCIDR);
            return this;
        }

        public Builder setPodCIDRs(@Nullable Input<List<String>> podCIDRs) {
            this.podCIDRs = podCIDRs;
            return this;
        }

        public Builder setPodCIDRs(@Nullable List<String> podCIDRs) {
            this.podCIDRs = Input.ofNullable(podCIDRs);
            return this;
        }

        public Builder setProviderID(@Nullable Input<String> providerID) {
            this.providerID = providerID;
            return this;
        }

        public Builder setProviderID(@Nullable String providerID) {
            this.providerID = Input.ofNullable(providerID);
            return this;
        }

        public Builder setTaints(@Nullable Input<List<TaintArgs>> taints) {
            this.taints = taints;
            return this;
        }

        public Builder setTaints(@Nullable List<TaintArgs> taints) {
            this.taints = Input.ofNullable(taints);
            return this;
        }

        public Builder setUnschedulable(@Nullable Input<Boolean> unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }

        public Builder setUnschedulable(@Nullable Boolean unschedulable) {
            this.unschedulable = Input.ofNullable(unschedulable);
            return this;
        }

        public NodeSpecArgs build() {
            return new NodeSpecArgs(configSource, externalID, podCIDR, podCIDRs, providerID, taints, unschedulable);
        }
    }
}
