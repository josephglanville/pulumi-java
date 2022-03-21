// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.outputs;

import io.pulumi.aws.globalaccelerator.outputs.GetAcceleratorAttribute;
import io.pulumi.aws.globalaccelerator.outputs.GetAcceleratorIpSet;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAcceleratorResult {
    private final String arn;
    private final List<GetAcceleratorAttribute> attributes;
    private final String dnsName;
    private final Boolean enabled;
    private final String hostedZoneId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String ipAddressType;
    private final List<GetAcceleratorIpSet> ipSets;
    private final String name;
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetAcceleratorResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("attributes") List<GetAcceleratorAttribute> attributes,
        @CustomType.Parameter("dnsName") String dnsName,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("hostedZoneId") String hostedZoneId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddressType") String ipAddressType,
        @CustomType.Parameter("ipSets") List<GetAcceleratorIpSet> ipSets,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.attributes = attributes;
        this.dnsName = dnsName;
        this.enabled = enabled;
        this.hostedZoneId = hostedZoneId;
        this.id = id;
        this.ipAddressType = ipAddressType;
        this.ipSets = ipSets;
        this.name = name;
        this.tags = tags;
    }

    public String getArn() {
        return this.arn;
    }
    public List<GetAcceleratorAttribute> getAttributes() {
        return this.attributes;
    }
    public String getDnsName() {
        return this.dnsName;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getIpAddressType() {
        return this.ipAddressType;
    }
    public List<GetAcceleratorIpSet> getIpSets() {
        return this.ipSets;
    }
    public String getName() {
        return this.name;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetAcceleratorAttribute> attributes;
        private String dnsName;
        private Boolean enabled;
        private String hostedZoneId;
        private String id;
        private String ipAddressType;
        private List<GetAcceleratorIpSet> ipSets;
        private String name;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAcceleratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attributes = defaults.attributes;
    	      this.dnsName = defaults.dnsName;
    	      this.enabled = defaults.enabled;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.id = defaults.id;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.ipSets = defaults.ipSets;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder attributes(List<GetAcceleratorAttribute> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(GetAcceleratorAttribute... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder hostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddressType(String ipAddressType) {
            this.ipAddressType = Objects.requireNonNull(ipAddressType);
            return this;
        }
        public Builder ipSets(List<GetAcceleratorIpSet> ipSets) {
            this.ipSets = Objects.requireNonNull(ipSets);
            return this;
        }
        public Builder ipSets(GetAcceleratorIpSet... ipSets) {
            return ipSets(List.of(ipSets));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetAcceleratorResult build() {
            return new GetAcceleratorResult(arn, attributes, dnsName, enabled, hostedZoneId, id, ipAddressType, ipSets, name, tags);
        }
    }
}
