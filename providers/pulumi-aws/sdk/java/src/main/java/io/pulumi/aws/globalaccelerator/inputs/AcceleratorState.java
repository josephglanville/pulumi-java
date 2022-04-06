// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesGetArgs;
import io.pulumi.aws.globalaccelerator.inputs.AcceleratorIpSetGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AcceleratorState extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorState Empty = new AcceleratorState();

    /**
     * The attributes of the accelerator. Fields documented below.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<AcceleratorAttributesGetArgs> attributes;

    public Output<AcceleratorAttributesGetArgs> getAttributes() {
        return this.attributes == null ? Output.empty() : this.attributes;
    }

    /**
     * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
     * * `hosted_zone_id` --  The Global Accelerator Route 53 zone ID that can be used to
     *   route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
     *   is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
     * 
     */
    @Import(name="dnsName")
      private final @Nullable Output<String> dnsName;

    public Output<String> getDnsName() {
        return this.dnsName == null ? Output.empty() : this.dnsName;
    }

    /**
     * Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    @Import(name="hostedZoneId")
      private final @Nullable Output<String> hostedZoneId;

    public Output<String> getHostedZoneId() {
        return this.hostedZoneId == null ? Output.empty() : this.hostedZoneId;
    }

    /**
     * The value for the address type. Defaults to `IPV4`. Valid values: `IPV4`.
     * 
     */
    @Import(name="ipAddressType")
      private final @Nullable Output<String> ipAddressType;

    public Output<String> getIpAddressType() {
        return this.ipAddressType == null ? Output.empty() : this.ipAddressType;
    }

    /**
     * IP address set associated with the accelerator.
     * 
     */
    @Import(name="ipSets")
      private final @Nullable Output<List<AcceleratorIpSetGetArgs>> ipSets;

    public Output<List<AcceleratorIpSetGetArgs>> getIpSets() {
        return this.ipSets == null ? Output.empty() : this.ipSets;
    }

    /**
     * The name of the accelerator.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public AcceleratorState(
        @Nullable Output<AcceleratorAttributesGetArgs> attributes,
        @Nullable Output<String> dnsName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> hostedZoneId,
        @Nullable Output<String> ipAddressType,
        @Nullable Output<List<AcceleratorIpSetGetArgs>> ipSets,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.attributes = attributes;
        this.dnsName = dnsName;
        this.enabled = enabled;
        this.hostedZoneId = hostedZoneId;
        this.ipAddressType = ipAddressType;
        this.ipSets = ipSets;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AcceleratorState() {
        this.attributes = Output.empty();
        this.dnsName = Output.empty();
        this.enabled = Output.empty();
        this.hostedZoneId = Output.empty();
        this.ipAddressType = Output.empty();
        this.ipSets = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AcceleratorAttributesGetArgs> attributes;
        private @Nullable Output<String> dnsName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> hostedZoneId;
        private @Nullable Output<String> ipAddressType;
        private @Nullable Output<List<AcceleratorIpSetGetArgs>> ipSets;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.dnsName = defaults.dnsName;
    	      this.enabled = defaults.enabled;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.ipSets = defaults.ipSets;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder attributes(@Nullable Output<AcceleratorAttributesGetArgs> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable AcceleratorAttributesGetArgs attributes) {
            this.attributes = Output.ofNullable(attributes);
            return this;
        }
        public Builder dnsName(@Nullable Output<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Output.ofNullable(dnsName);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }
        public Builder hostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = Output.ofNullable(hostedZoneId);
            return this;
        }
        public Builder ipAddressType(@Nullable Output<String> ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }
        public Builder ipAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = Output.ofNullable(ipAddressType);
            return this;
        }
        public Builder ipSets(@Nullable Output<List<AcceleratorIpSetGetArgs>> ipSets) {
            this.ipSets = ipSets;
            return this;
        }
        public Builder ipSets(@Nullable List<AcceleratorIpSetGetArgs> ipSets) {
            this.ipSets = Output.ofNullable(ipSets);
            return this;
        }
        public Builder ipSets(AcceleratorIpSetGetArgs... ipSets) {
            return ipSets(List.of(ipSets));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public AcceleratorState build() {
            return new AcceleratorState(attributes, dnsName, enabled, hostedZoneId, ipAddressType, ipSets, name, tags, tagsAll);
        }
    }
}