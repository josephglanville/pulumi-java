// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RouterBgpAdvertisedIpRangeGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterBgpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterBgpGetArgs Empty = new RouterBgpGetArgs();

    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `CUSTOM`.
     * 
     */
    @InputImport(name="advertiseMode")
      private final @Nullable Input<String> advertiseMode;

    public Input<String> getAdvertiseMode() {
        return this.advertiseMode == null ? Input.empty() : this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom mode.
     * This field can only be populated if advertiseMode is CUSTOM and
     * is advertised to all peers of the router. These groups will be
     * advertised in addition to any specified prefixes. Leave this field
     * blank to advertise no custom groups.
     * This enum field has the one valid value: ALL_SUBNETS
     * 
     */
    @InputImport(name="advertisedGroups")
      private final @Nullable Input<List<String>> advertisedGroups;

    public Input<List<String>> getAdvertisedGroups() {
        return this.advertisedGroups == null ? Input.empty() : this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is CUSTOM and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * 
     */
    @InputImport(name="advertisedIpRanges")
      private final @Nullable Input<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges;

    public Input<List<RouterBgpAdvertisedIpRangeGetArgs>> getAdvertisedIpRanges() {
        return this.advertisedIpRanges == null ? Input.empty() : this.advertisedIpRanges;
    }

    /**
     * Local BGP Autonomous System Number (ASN). Must be an RFC6996
     * private ASN, either 16-bit or 32-bit. The value will be fixed for
     * this router resource. All VPN tunnels that link to this router
     * will have the same local ASN.
     * 
     */
    @InputImport(name="asn", required=true)
      private final Input<Integer> asn;

    public Input<Integer> getAsn() {
        return this.asn;
    }

    public RouterBgpGetArgs(
        @Nullable Input<String> advertiseMode,
        @Nullable Input<List<String>> advertisedGroups,
        @Nullable Input<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges,
        Input<Integer> asn) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.asn = Objects.requireNonNull(asn, "expected parameter 'asn' to be non-null");
    }

    private RouterBgpGetArgs() {
        this.advertiseMode = Input.empty();
        this.advertisedGroups = Input.empty();
        this.advertisedIpRanges = Input.empty();
        this.asn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> advertiseMode;
        private @Nullable Input<List<String>> advertisedGroups;
        private @Nullable Input<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges;
        private Input<Integer> asn;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.asn = defaults.asn;
        }

        public Builder setAdvertiseMode(@Nullable Input<String> advertiseMode) {
            this.advertiseMode = advertiseMode;
            return this;
        }

        public Builder setAdvertiseMode(@Nullable String advertiseMode) {
            this.advertiseMode = Input.ofNullable(advertiseMode);
            return this;
        }

        public Builder setAdvertisedGroups(@Nullable Input<List<String>> advertisedGroups) {
            this.advertisedGroups = advertisedGroups;
            return this;
        }

        public Builder setAdvertisedGroups(@Nullable List<String> advertisedGroups) {
            this.advertisedGroups = Input.ofNullable(advertisedGroups);
            return this;
        }

        public Builder setAdvertisedIpRanges(@Nullable Input<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges) {
            this.advertisedIpRanges = advertisedIpRanges;
            return this;
        }

        public Builder setAdvertisedIpRanges(@Nullable List<RouterBgpAdvertisedIpRangeGetArgs> advertisedIpRanges) {
            this.advertisedIpRanges = Input.ofNullable(advertisedIpRanges);
            return this;
        }

        public Builder setAsn(Input<Integer> asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }

        public Builder setAsn(Integer asn) {
            this.asn = Input.of(Objects.requireNonNull(asn));
            return this;
        }
        public RouterBgpGetArgs build() {
            return new RouterBgpGetArgs(advertiseMode, advertisedGroups, advertisedIpRanges, asn);
        }
    }
}
