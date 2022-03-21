// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.enums.InstancePeeringCidrRange;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Optional. Description of the instance.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only. Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    @Import(name="diskEncryptionKeyName")
      private final @Nullable Output<String> diskEncryptionKeyName;

    public Output<String> getDiskEncryptionKeyName() {
        return this.diskEncryptionKeyName == null ? Output.empty() : this.diskEncryptionKeyName;
    }

    /**
     * Optional. Display name for the instance.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Optional. IP range represents the customer-provided CIDR block of length 22 that will be used for the Apigee instance creation. This optional range, if provided, should be freely available as part of larger named range the customer has allocated to the Service Networking peering. If this is not provided, Apigee will automatically request for any available /22 CIDR block from Service Networking. The customer should use this CIDR block for configuring their firewall needs to allow traffic from Apigee. Input format: "a.b.c.d/22", Output format: a.b.c.d/22, e.f.g.h/28"
     * 
     */
    @Import(name="ipRange")
      private final @Nullable Output<String> ipRange;

    public Output<String> getIpRange() {
        return this.ipRange == null ? Output.empty() : this.ipRange;
    }

    /**
     * Compute Engine location where the instance resides.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Resource ID of the instance. Values must match the regular expression `^a-z{0,30}[a-z\d]$`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Optional. Size of the CIDR block range that will be reserved by the instance. PAID organizations support `SLASH_16` to `SLASH_20` and defaults to `SLASH_16`. Evaluation organizations support only `SLASH_23`.
     * 
     */
    @Import(name="peeringCidrRange")
      private final @Nullable Output<InstancePeeringCidrRange> peeringCidrRange;

    public Output<InstancePeeringCidrRange> getPeeringCidrRange() {
        return this.peeringCidrRange == null ? Output.empty() : this.peeringCidrRange;
    }

    public InstanceArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> diskEncryptionKeyName,
        @Nullable Output<String> displayName,
        @Nullable Output<String> ipRange,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        Output<String> organizationId,
        @Nullable Output<InstancePeeringCidrRange> peeringCidrRange) {
        this.description = description;
        this.diskEncryptionKeyName = diskEncryptionKeyName;
        this.displayName = displayName;
        this.ipRange = ipRange;
        this.location = location;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.peeringCidrRange = peeringCidrRange;
    }

    private InstanceArgs() {
        this.description = Output.empty();
        this.diskEncryptionKeyName = Output.empty();
        this.displayName = Output.empty();
        this.ipRange = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
        this.peeringCidrRange = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> diskEncryptionKeyName;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> ipRange;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private @Nullable Output<InstancePeeringCidrRange> peeringCidrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskEncryptionKeyName = defaults.diskEncryptionKeyName;
    	      this.displayName = defaults.displayName;
    	      this.ipRange = defaults.ipRange;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.peeringCidrRange = defaults.peeringCidrRange;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder diskEncryptionKeyName(@Nullable Output<String> diskEncryptionKeyName) {
            this.diskEncryptionKeyName = diskEncryptionKeyName;
            return this;
        }
        public Builder diskEncryptionKeyName(@Nullable String diskEncryptionKeyName) {
            this.diskEncryptionKeyName = Output.ofNullable(diskEncryptionKeyName);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder ipRange(@Nullable Output<String> ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        public Builder ipRange(@Nullable String ipRange) {
            this.ipRange = Output.ofNullable(ipRange);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder peeringCidrRange(@Nullable Output<InstancePeeringCidrRange> peeringCidrRange) {
            this.peeringCidrRange = peeringCidrRange;
            return this;
        }
        public Builder peeringCidrRange(@Nullable InstancePeeringCidrRange peeringCidrRange) {
            this.peeringCidrRange = Output.ofNullable(peeringCidrRange);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(description, diskEncryptionKeyName, displayName, ipRange, location, name, organizationId, peeringCidrRange);
        }
    }
}
