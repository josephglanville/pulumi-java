// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterOptionsKubernetesNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterOptionsKubernetesNetworkConfigArgs Empty = new ClusterOptionsKubernetesNetworkConfigArgs();

    /**
     * The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
     * 
     */
    @Import(name="podsCidr")
    private @Nullable Output<String> podsCidr;

    /**
     * @return The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
     * 
     */
    public Optional<Output<String>> podsCidr() {
        return Optional.ofNullable(this.podsCidr);
    }

    /**
     * The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
     * 
     */
    @Import(name="servicesCidr")
    private @Nullable Output<String> servicesCidr;

    /**
     * @return The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
     * 
     */
    public Optional<Output<String>> servicesCidr() {
        return Optional.ofNullable(this.servicesCidr);
    }

    private ClusterOptionsKubernetesNetworkConfigArgs() {}

    private ClusterOptionsKubernetesNetworkConfigArgs(ClusterOptionsKubernetesNetworkConfigArgs $) {
        this.podsCidr = $.podsCidr;
        this.servicesCidr = $.servicesCidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterOptionsKubernetesNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOptionsKubernetesNetworkConfigArgs $;

        public Builder() {
            $ = new ClusterOptionsKubernetesNetworkConfigArgs();
        }

        public Builder(ClusterOptionsKubernetesNetworkConfigArgs defaults) {
            $ = new ClusterOptionsKubernetesNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param podsCidr The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
         * 
         * @return builder
         * 
         */
        public Builder podsCidr(@Nullable Output<String> podsCidr) {
            $.podsCidr = podsCidr;
            return this;
        }

        /**
         * @param podsCidr The CIDR block for Kubernetes pods. Optional, defaults to 10.244.0.0/16.
         * 
         * @return builder
         * 
         */
        public Builder podsCidr(String podsCidr) {
            return podsCidr(Output.of(podsCidr));
        }

        /**
         * @param servicesCidr The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
         * 
         * @return builder
         * 
         */
        public Builder servicesCidr(@Nullable Output<String> servicesCidr) {
            $.servicesCidr = servicesCidr;
            return this;
        }

        /**
         * @param servicesCidr The CIDR block for Kubernetes services. Optional, defaults to 10.96.0.0/16.
         * 
         * @return builder
         * 
         */
        public Builder servicesCidr(String servicesCidr) {
            return servicesCidr(Output.of(servicesCidr));
        }

        public ClusterOptionsKubernetesNetworkConfigArgs build() {
            return $;
        }
    }

}
