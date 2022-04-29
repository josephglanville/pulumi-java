// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Analytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs Empty = new AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs();

    /**
     * The Virtual Cloud Network OCID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The Virtual Cloud Network OCID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Source IP addresses or IP address ranges igress rules.
     * 
     */
    @Import(name="whitelistedIps")
    private @Nullable Output<List<String>> whitelistedIps;

    /**
     * @return Source IP addresses or IP address ranges igress rules.
     * 
     */
    public Optional<Output<List<String>>> whitelistedIps() {
        return Optional.ofNullable(this.whitelistedIps);
    }

    private AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs() {}

    private AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs(AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs $) {
        this.id = $.id;
        this.whitelistedIps = $.whitelistedIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs $;

        public Builder() {
            $ = new AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs();
        }

        public Builder(AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs defaults) {
            $ = new AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Virtual Cloud Network OCID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The Virtual Cloud Network OCID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param whitelistedIps Source IP addresses or IP address ranges igress rules.
         * 
         * @return builder
         * 
         */
        public Builder whitelistedIps(@Nullable Output<List<String>> whitelistedIps) {
            $.whitelistedIps = whitelistedIps;
            return this;
        }

        /**
         * @param whitelistedIps Source IP addresses or IP address ranges igress rules.
         * 
         * @return builder
         * 
         */
        public Builder whitelistedIps(List<String> whitelistedIps) {
            return whitelistedIps(Output.of(whitelistedIps));
        }

        /**
         * @param whitelistedIps Source IP addresses or IP address ranges igress rules.
         * 
         * @return builder
         * 
         */
        public Builder whitelistedIps(String... whitelistedIps) {
            return whitelistedIps(List.of(whitelistedIps));
        }

        public AnalyticsInstanceNetworkEndpointDetailsWhitelistedVcnArgs build() {
            return $;
        }
    }

}
