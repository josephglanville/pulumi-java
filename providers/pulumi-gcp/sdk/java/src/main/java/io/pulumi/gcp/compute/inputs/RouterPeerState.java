// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RouterPeerAdvertisedIpRangeGetArgs;
import io.pulumi.gcp.compute.inputs.RouterPeerBfdGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterPeerState extends io.pulumi.resources.ResourceArgs {

    public static final RouterPeerState Empty = new RouterPeerState();

    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * Valid values of this enum field are: `DEFAULT`, `CUSTOM`
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `CUSTOM`.
     * 
     */
    @Import(name="advertiseMode")
      private final @Nullable Output<String> advertiseMode;

    public Output<String> getAdvertiseMode() {
        return this.advertiseMode == null ? Output.empty() : this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom
     * mode, which can take one of the following options:
     * * `ALL_SUBNETS`: Advertises all available subnets, including peer VPC subnets.
     * * `ALL_VPC_SUBNETS`: Advertises the router's own VPC subnets.
     * * `ALL_PEER_VPC_SUBNETS`: Advertises peer subnets of the router's VPC network.
     * 
     */
    @Import(name="advertisedGroups")
      private final @Nullable Output<List<String>> advertisedGroups;

    public Output<List<String>> getAdvertisedGroups() {
        return this.advertisedGroups == null ? Output.empty() : this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is `CUSTOM` and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * 
     */
    @Import(name="advertisedIpRanges")
      private final @Nullable Output<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges;

    public Output<List<RouterPeerAdvertisedIpRangeGetArgs>> getAdvertisedIpRanges() {
        return this.advertisedIpRanges == null ? Output.empty() : this.advertisedIpRanges;
    }

    /**
     * The priority of routes advertised to this BGP peer.
     * Where there is more than one matching route of maximum
     * length, the routes with the lowest priority value win.
     * 
     */
    @Import(name="advertisedRoutePriority")
      private final @Nullable Output<Integer> advertisedRoutePriority;

    public Output<Integer> getAdvertisedRoutePriority() {
        return this.advertisedRoutePriority == null ? Output.empty() : this.advertisedRoutePriority;
    }

    /**
     * BFD configuration for the BGP peering.
     * Structure is documented below.
     * 
     */
    @Import(name="bfd")
      private final @Nullable Output<RouterPeerBfdGetArgs> bfd;

    public Output<RouterPeerBfdGetArgs> getBfd() {
        return this.bfd == null ? Output.empty() : this.bfd;
    }

    /**
     * The status of the BGP peer connection. If set to false, any active session
     * with the peer is terminated and all associated routing information is removed.
     * If set to true, the peer connection can be established with routing information.
     * The default is true.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable == null ? Output.empty() : this.enable;
    }

    /**
     * Name of the interface the BGP peer is associated with.
     * 
     */
    @Import(name="interface")
      private final @Nullable Output<String> $interface;

    public Output<String> get$interface() {
        return this.$interface == null ? Output.empty() : this.$interface;
    }

    /**
     * IP address of the interface inside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * The resource that configures and manages this BGP peer. * 'MANAGED_BY_USER' is the default value and can be managed by
     * you or other users * 'MANAGED_BY_ATTACHMENT' is a BGP peer that is configured and managed by Cloud Interconnect,
     * specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type
     * of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    @Import(name="managementType")
      private final @Nullable Output<String> managementType;

    public Output<String> getManagementType() {
        return this.managementType == null ? Output.empty() : this.managementType;
    }

    /**
     * Name of this BGP peer. The name must be 1-63 characters long,
     * and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Peer BGP Autonomous System Number (ASN).
     * Each BGP interface may use a different value.
     * 
     */
    @Import(name="peerAsn")
      private final @Nullable Output<Integer> peerAsn;

    public Output<Integer> getPeerAsn() {
        return this.peerAsn == null ? Output.empty() : this.peerAsn;
    }

    /**
     * IP address of the BGP interface outside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    @Import(name="peerIpAddress")
      private final @Nullable Output<String> peerIpAddress;

    public Output<String> getPeerIpAddress() {
        return this.peerIpAddress == null ? Output.empty() : this.peerIpAddress;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Region where the router and BgpPeer reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The name of the Cloud Router in which this BgpPeer will be configured.
     * 
     */
    @Import(name="router")
      private final @Nullable Output<String> router;

    public Output<String> getRouter() {
        return this.router == null ? Output.empty() : this.router;
    }

    public RouterPeerState(
        @Nullable Output<String> advertiseMode,
        @Nullable Output<List<String>> advertisedGroups,
        @Nullable Output<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges,
        @Nullable Output<Integer> advertisedRoutePriority,
        @Nullable Output<RouterPeerBfdGetArgs> bfd,
        @Nullable Output<Boolean> enable,
        @Nullable Output<String> $interface,
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> managementType,
        @Nullable Output<String> name,
        @Nullable Output<Integer> peerAsn,
        @Nullable Output<String> peerIpAddress,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> router) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.advertisedRoutePriority = advertisedRoutePriority;
        this.bfd = bfd;
        this.enable = enable;
        this.$interface = $interface;
        this.ipAddress = ipAddress;
        this.managementType = managementType;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIpAddress = peerIpAddress;
        this.project = project;
        this.region = region;
        this.router = router;
    }

    private RouterPeerState() {
        this.advertiseMode = Output.empty();
        this.advertisedGroups = Output.empty();
        this.advertisedIpRanges = Output.empty();
        this.advertisedRoutePriority = Output.empty();
        this.bfd = Output.empty();
        this.enable = Output.empty();
        this.$interface = Output.empty();
        this.ipAddress = Output.empty();
        this.managementType = Output.empty();
        this.name = Output.empty();
        this.peerAsn = Output.empty();
        this.peerIpAddress = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.router = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterPeerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> advertiseMode;
        private @Nullable Output<List<String>> advertisedGroups;
        private @Nullable Output<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges;
        private @Nullable Output<Integer> advertisedRoutePriority;
        private @Nullable Output<RouterPeerBfdGetArgs> bfd;
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<String> $interface;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> managementType;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> peerAsn;
        private @Nullable Output<String> peerIpAddress;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> router;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterPeerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.advertisedRoutePriority = defaults.advertisedRoutePriority;
    	      this.bfd = defaults.bfd;
    	      this.enable = defaults.enable;
    	      this.$interface = defaults.$interface;
    	      this.ipAddress = defaults.ipAddress;
    	      this.managementType = defaults.managementType;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.router = defaults.router;
        }

        public Builder advertiseMode(@Nullable Output<String> advertiseMode) {
            this.advertiseMode = advertiseMode;
            return this;
        }
        public Builder advertiseMode(@Nullable String advertiseMode) {
            this.advertiseMode = Output.ofNullable(advertiseMode);
            return this;
        }
        public Builder advertisedGroups(@Nullable Output<List<String>> advertisedGroups) {
            this.advertisedGroups = advertisedGroups;
            return this;
        }
        public Builder advertisedGroups(@Nullable List<String> advertisedGroups) {
            this.advertisedGroups = Output.ofNullable(advertisedGroups);
            return this;
        }
        public Builder advertisedGroups(String... advertisedGroups) {
            return advertisedGroups(List.of(advertisedGroups));
        }
        public Builder advertisedIpRanges(@Nullable Output<List<RouterPeerAdvertisedIpRangeGetArgs>> advertisedIpRanges) {
            this.advertisedIpRanges = advertisedIpRanges;
            return this;
        }
        public Builder advertisedIpRanges(@Nullable List<RouterPeerAdvertisedIpRangeGetArgs> advertisedIpRanges) {
            this.advertisedIpRanges = Output.ofNullable(advertisedIpRanges);
            return this;
        }
        public Builder advertisedIpRanges(RouterPeerAdvertisedIpRangeGetArgs... advertisedIpRanges) {
            return advertisedIpRanges(List.of(advertisedIpRanges));
        }
        public Builder advertisedRoutePriority(@Nullable Output<Integer> advertisedRoutePriority) {
            this.advertisedRoutePriority = advertisedRoutePriority;
            return this;
        }
        public Builder advertisedRoutePriority(@Nullable Integer advertisedRoutePriority) {
            this.advertisedRoutePriority = Output.ofNullable(advertisedRoutePriority);
            return this;
        }
        public Builder bfd(@Nullable Output<RouterPeerBfdGetArgs> bfd) {
            this.bfd = bfd;
            return this;
        }
        public Builder bfd(@Nullable RouterPeerBfdGetArgs bfd) {
            this.bfd = Output.ofNullable(bfd);
            return this;
        }
        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Output.ofNullable(enable);
            return this;
        }
        public Builder $interface(@Nullable Output<String> $interface) {
            this.$interface = $interface;
            return this;
        }
        public Builder $interface(@Nullable String $interface) {
            this.$interface = Output.ofNullable($interface);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }
        public Builder managementType(@Nullable Output<String> managementType) {
            this.managementType = managementType;
            return this;
        }
        public Builder managementType(@Nullable String managementType) {
            this.managementType = Output.ofNullable(managementType);
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
        public Builder peerAsn(@Nullable Output<Integer> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Builder peerAsn(@Nullable Integer peerAsn) {
            this.peerAsn = Output.ofNullable(peerAsn);
            return this;
        }
        public Builder peerIpAddress(@Nullable Output<String> peerIpAddress) {
            this.peerIpAddress = peerIpAddress;
            return this;
        }
        public Builder peerIpAddress(@Nullable String peerIpAddress) {
            this.peerIpAddress = Output.ofNullable(peerIpAddress);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder router(@Nullable Output<String> router) {
            this.router = router;
            return this;
        }
        public Builder router(@Nullable String router) {
            this.router = Output.ofNullable(router);
            return this;
        }        public RouterPeerState build() {
            return new RouterPeerState(advertiseMode, advertisedGroups, advertisedIpRanges, advertisedRoutePriority, bfd, enable, $interface, ipAddress, managementType, name, peerAsn, peerIpAddress, project, region, router);
        }
    }
}
