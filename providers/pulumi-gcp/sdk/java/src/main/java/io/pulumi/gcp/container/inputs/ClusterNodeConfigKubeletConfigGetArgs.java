// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodeConfigKubeletConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigKubeletConfigGetArgs Empty = new ClusterNodeConfigKubeletConfigGetArgs();

    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    @InputImport(name="cpuCfsQuota")
      private final @Nullable Input<Boolean> cpuCfsQuota;

    public Input<Boolean> getCpuCfsQuota() {
        return this.cpuCfsQuota == null ? Input.empty() : this.cpuCfsQuota;
    }

    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `"300ms"`. Valid time units are "ns", "us" (or "µs"), "ms", "s", "m",
     * "h". The value must be a positive duration.
     * 
     */
    @InputImport(name="cpuCfsQuotaPeriod")
      private final @Nullable Input<String> cpuCfsQuotaPeriod;

    public Input<String> getCpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod == null ? Input.empty() : this.cpuCfsQuotaPeriod;
    }

    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `"none"` or `"static"`. Defaults to `none` when `kubelet_config` is unset.
     * 
     */
    @InputImport(name="cpuManagerPolicy", required=true)
      private final Input<String> cpuManagerPolicy;

    public Input<String> getCpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public ClusterNodeConfigKubeletConfigGetArgs(
        @Nullable Input<Boolean> cpuCfsQuota,
        @Nullable Input<String> cpuCfsQuotaPeriod,
        Input<String> cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy, "expected parameter 'cpuManagerPolicy' to be non-null");
    }

    private ClusterNodeConfigKubeletConfigGetArgs() {
        this.cpuCfsQuota = Input.empty();
        this.cpuCfsQuotaPeriod = Input.empty();
        this.cpuManagerPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigKubeletConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> cpuCfsQuota;
        private @Nullable Input<String> cpuCfsQuotaPeriod;
        private Input<String> cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigKubeletConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder setCpuCfsQuota(@Nullable Input<Boolean> cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        public Builder setCpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Input.ofNullable(cpuCfsQuota);
            return this;
        }

        public Builder setCpuCfsQuotaPeriod(@Nullable Input<String> cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        public Builder setCpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Input.ofNullable(cpuCfsQuotaPeriod);
            return this;
        }

        public Builder setCpuManagerPolicy(Input<String> cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }

        public Builder setCpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Input.of(Objects.requireNonNull(cpuManagerPolicy));
            return this;
        }
        public ClusterNodeConfigKubeletConfigGetArgs build() {
            return new ClusterNodeConfigKubeletConfigGetArgs(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
