// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Blockchain.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Blockchain.inputs.BlockchainPlatformComponentDetailOsnOcpuAllocationParamArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlockchainPlatformComponentDetailOsnArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlockchainPlatformComponentDetailOsnArgs Empty = new BlockchainPlatformComponentDetailOsnArgs();

    /**
     * Availability Domain of peer
     * 
     */
    @Import(name="ad")
    private @Nullable Output<String> ad;

    /**
     * @return Availability Domain of peer
     * 
     */
    public Optional<Output<String>> ad() {
        return Optional.ofNullable(this.ad);
    }

    /**
     * OCPU allocation parameter
     * 
     */
    @Import(name="ocpuAllocationParams")
    private @Nullable Output<List<BlockchainPlatformComponentDetailOsnOcpuAllocationParamArgs>> ocpuAllocationParams;

    /**
     * @return OCPU allocation parameter
     * 
     */
    public Optional<Output<List<BlockchainPlatformComponentDetailOsnOcpuAllocationParamArgs>>> ocpuAllocationParams() {
        return Optional.ofNullable(this.ocpuAllocationParams);
    }

    /**
     * OSN identifier
     * 
     */
    @Import(name="osnKey")
    private @Nullable Output<String> osnKey;

    /**
     * @return OSN identifier
     * 
     */
    public Optional<Output<String>> osnKey() {
        return Optional.ofNullable(this.osnKey);
    }

    /**
     * The current state of the Platform Instance.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the Platform Instance.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private BlockchainPlatformComponentDetailOsnArgs() {}

    private BlockchainPlatformComponentDetailOsnArgs(BlockchainPlatformComponentDetailOsnArgs $) {
        this.ad = $.ad;
        this.ocpuAllocationParams = $.ocpuAllocationParams;
        this.osnKey = $.osnKey;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlockchainPlatformComponentDetailOsnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlockchainPlatformComponentDetailOsnArgs $;

        public Builder() {
            $ = new BlockchainPlatformComponentDetailOsnArgs();
        }

        public Builder(BlockchainPlatformComponentDetailOsnArgs defaults) {
            $ = new BlockchainPlatformComponentDetailOsnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ad Availability Domain of peer
         * 
         * @return builder
         * 
         */
        public Builder ad(@Nullable Output<String> ad) {
            $.ad = ad;
            return this;
        }

        /**
         * @param ad Availability Domain of peer
         * 
         * @return builder
         * 
         */
        public Builder ad(String ad) {
            return ad(Output.of(ad));
        }

        /**
         * @param ocpuAllocationParams OCPU allocation parameter
         * 
         * @return builder
         * 
         */
        public Builder ocpuAllocationParams(@Nullable Output<List<BlockchainPlatformComponentDetailOsnOcpuAllocationParamArgs>> ocpuAllocationParams) {
            $.ocpuAllocationParams = ocpuAllocationParams;
            return this;
        }

        /**
         * @param ocpuAllocationParams OCPU allocation parameter
         * 
         * @return builder
         * 
         */
        public Builder ocpuAllocationParams(List<BlockchainPlatformComponentDetailOsnOcpuAllocationParamArgs> ocpuAllocationParams) {
            return ocpuAllocationParams(Output.of(ocpuAllocationParams));
        }

        /**
         * @param ocpuAllocationParams OCPU allocation parameter
         * 
         * @return builder
         * 
         */
        public Builder ocpuAllocationParams(BlockchainPlatformComponentDetailOsnOcpuAllocationParamArgs... ocpuAllocationParams) {
            return ocpuAllocationParams(List.of(ocpuAllocationParams));
        }

        /**
         * @param osnKey OSN identifier
         * 
         * @return builder
         * 
         */
        public Builder osnKey(@Nullable Output<String> osnKey) {
            $.osnKey = osnKey;
            return this;
        }

        /**
         * @param osnKey OSN identifier
         * 
         * @return builder
         * 
         */
        public Builder osnKey(String osnKey) {
            return osnKey(Output.of(osnKey));
        }

        /**
         * @param state The current state of the Platform Instance.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the Platform Instance.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public BlockchainPlatformComponentDetailOsnArgs build() {
            return $;
        }
    }

}
