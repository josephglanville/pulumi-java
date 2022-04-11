// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelConditionArgs Empty = new AccessLevelConditionArgs();

    /**
     * The name of the Access Level to add this condition to.
     * 
     */
    @Import(name="accessLevel", required=true)
      private final Output<String> accessLevel;

    public Output<String> getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    @Import(name="devicePolicy")
      private final @Nullable Output<AccessLevelConditionDevicePolicyArgs> devicePolicy;

    public Output<AccessLevelConditionDevicePolicyArgs> getDevicePolicy() {
        return this.devicePolicy == null ? Codegen.empty() : this.devicePolicy;
    }

    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    @Import(name="ipSubnetworks")
      private final @Nullable Output<List<String>> ipSubnetworks;

    public Output<List<String>> getIpSubnetworks() {
        return this.ipSubnetworks == null ? Codegen.empty() : this.ipSubnetworks;
    }

    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    @Import(name="negate")
      private final @Nullable Output<Boolean> negate;

    public Output<Boolean> getNegate() {
        return this.negate == null ? Codegen.empty() : this.negate;
    }

    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    @Import(name="regions")
      private final @Nullable Output<List<String>> regions;

    public Output<List<String>> getRegions() {
        return this.regions == null ? Codegen.empty() : this.regions;
    }

    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    @Import(name="requiredAccessLevels")
      private final @Nullable Output<List<String>> requiredAccessLevels;

    public Output<List<String>> getRequiredAccessLevels() {
        return this.requiredAccessLevels == null ? Codegen.empty() : this.requiredAccessLevels;
    }

    public AccessLevelConditionArgs(
        Output<String> accessLevel,
        @Nullable Output<AccessLevelConditionDevicePolicyArgs> devicePolicy,
        @Nullable Output<List<String>> ipSubnetworks,
        @Nullable Output<List<String>> members,
        @Nullable Output<Boolean> negate,
        @Nullable Output<List<String>> regions,
        @Nullable Output<List<String>> requiredAccessLevels) {
        this.accessLevel = Objects.requireNonNull(accessLevel, "expected parameter 'accessLevel' to be non-null");
        this.devicePolicy = devicePolicy;
        this.ipSubnetworks = ipSubnetworks;
        this.members = members;
        this.negate = negate;
        this.regions = regions;
        this.requiredAccessLevels = requiredAccessLevels;
    }

    private AccessLevelConditionArgs() {
        this.accessLevel = Codegen.empty();
        this.devicePolicy = Codegen.empty();
        this.ipSubnetworks = Codegen.empty();
        this.members = Codegen.empty();
        this.negate = Codegen.empty();
        this.regions = Codegen.empty();
        this.requiredAccessLevels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accessLevel;
        private @Nullable Output<AccessLevelConditionDevicePolicyArgs> devicePolicy;
        private @Nullable Output<List<String>> ipSubnetworks;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<Boolean> negate;
        private @Nullable Output<List<String>> regions;
        private @Nullable Output<List<String>> requiredAccessLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.ipSubnetworks = defaults.ipSubnetworks;
    	      this.members = defaults.members;
    	      this.negate = defaults.negate;
    	      this.regions = defaults.regions;
    	      this.requiredAccessLevels = defaults.requiredAccessLevels;
        }

        public Builder accessLevel(Output<String> accessLevel) {
            this.accessLevel = Objects.requireNonNull(accessLevel);
            return this;
        }
        public Builder accessLevel(String accessLevel) {
            this.accessLevel = Output.of(Objects.requireNonNull(accessLevel));
            return this;
        }
        public Builder devicePolicy(@Nullable Output<AccessLevelConditionDevicePolicyArgs> devicePolicy) {
            this.devicePolicy = devicePolicy;
            return this;
        }
        public Builder devicePolicy(@Nullable AccessLevelConditionDevicePolicyArgs devicePolicy) {
            this.devicePolicy = Codegen.ofNullable(devicePolicy);
            return this;
        }
        public Builder ipSubnetworks(@Nullable Output<List<String>> ipSubnetworks) {
            this.ipSubnetworks = ipSubnetworks;
            return this;
        }
        public Builder ipSubnetworks(@Nullable List<String> ipSubnetworks) {
            this.ipSubnetworks = Codegen.ofNullable(ipSubnetworks);
            return this;
        }
        public Builder ipSubnetworks(String... ipSubnetworks) {
            return ipSubnetworks(List.of(ipSubnetworks));
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder negate(@Nullable Output<Boolean> negate) {
            this.negate = negate;
            return this;
        }
        public Builder negate(@Nullable Boolean negate) {
            this.negate = Codegen.ofNullable(negate);
            return this;
        }
        public Builder regions(@Nullable Output<List<String>> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(@Nullable List<String> regions) {
            this.regions = Codegen.ofNullable(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public Builder requiredAccessLevels(@Nullable Output<List<String>> requiredAccessLevels) {
            this.requiredAccessLevels = requiredAccessLevels;
            return this;
        }
        public Builder requiredAccessLevels(@Nullable List<String> requiredAccessLevels) {
            this.requiredAccessLevels = Codegen.ofNullable(requiredAccessLevels);
            return this;
        }
        public Builder requiredAccessLevels(String... requiredAccessLevels) {
            return requiredAccessLevels(List.of(requiredAccessLevels));
        }        public AccessLevelConditionArgs build() {
            return new AccessLevelConditionArgs(accessLevel, devicePolicy, ipSubnetworks, members, negate, regions, requiredAccessLevels);
        }
    }
}
