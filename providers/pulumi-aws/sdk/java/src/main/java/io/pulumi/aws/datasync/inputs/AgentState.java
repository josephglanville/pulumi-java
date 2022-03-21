// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AgentState extends io.pulumi.resources.ResourceArgs {

    public static final AgentState Empty = new AgentState();

    /**
     * DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
     * 
     */
    @Import(name="activationKey")
      private final @Nullable Output<String> activationKey;

    public Output<String> getActivationKey() {
        return this.activationKey == null ? Output.empty() : this.activationKey;
    }

    /**
     * Amazon Resource Name (ARN) of the DataSync Agent.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * Name of the DataSync Agent.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
     * 
     */
    @Import(name="privateLinkEndpoint")
      private final @Nullable Output<String> privateLinkEndpoint;

    public Output<String> getPrivateLinkEndpoint() {
        return this.privateLinkEndpoint == null ? Output.empty() : this.privateLinkEndpoint;
    }

    /**
     * The ARNs of the security groups used to protect your data transfer task subnets.
     * 
     */
    @Import(name="securityGroupArns")
      private final @Nullable Output<List<String>> securityGroupArns;

    public Output<List<String>> getSecurityGroupArns() {
        return this.securityGroupArns == null ? Output.empty() : this.securityGroupArns;
    }

    /**
     * The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    @Import(name="subnetArns")
      private final @Nullable Output<List<String>> subnetArns;

    public Output<List<String>> getSubnetArns() {
        return this.subnetArns == null ? Output.empty() : this.subnetArns;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
     * 
     */
    @Import(name="vpcEndpointId")
      private final @Nullable Output<String> vpcEndpointId;

    public Output<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Output.empty() : this.vpcEndpointId;
    }

    public AgentState(
        @Nullable Output<String> activationKey,
        @Nullable Output<String> arn,
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> name,
        @Nullable Output<String> privateLinkEndpoint,
        @Nullable Output<List<String>> securityGroupArns,
        @Nullable Output<List<String>> subnetArns,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpcEndpointId) {
        this.activationKey = activationKey;
        this.arn = arn;
        this.ipAddress = ipAddress;
        this.name = name;
        this.privateLinkEndpoint = privateLinkEndpoint;
        this.securityGroupArns = securityGroupArns;
        this.subnetArns = subnetArns;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcEndpointId = vpcEndpointId;
    }

    private AgentState() {
        this.activationKey = Output.empty();
        this.arn = Output.empty();
        this.ipAddress = Output.empty();
        this.name = Output.empty();
        this.privateLinkEndpoint = Output.empty();
        this.securityGroupArns = Output.empty();
        this.subnetArns = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.vpcEndpointId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activationKey;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> name;
        private @Nullable Output<String> privateLinkEndpoint;
        private @Nullable Output<List<String>> securityGroupArns;
        private @Nullable Output<List<String>> subnetArns;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpcEndpointId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.arn = defaults.arn;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.privateLinkEndpoint = defaults.privateLinkEndpoint;
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArns = defaults.subnetArns;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
        }

        public Builder activationKey(@Nullable Output<String> activationKey) {
            this.activationKey = activationKey;
            return this;
        }
        public Builder activationKey(@Nullable String activationKey) {
            this.activationKey = Output.ofNullable(activationKey);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder privateLinkEndpoint(@Nullable Output<String> privateLinkEndpoint) {
            this.privateLinkEndpoint = privateLinkEndpoint;
            return this;
        }
        public Builder privateLinkEndpoint(@Nullable String privateLinkEndpoint) {
            this.privateLinkEndpoint = Output.ofNullable(privateLinkEndpoint);
            return this;
        }
        public Builder securityGroupArns(@Nullable Output<List<String>> securityGroupArns) {
            this.securityGroupArns = securityGroupArns;
            return this;
        }
        public Builder securityGroupArns(@Nullable List<String> securityGroupArns) {
            this.securityGroupArns = Output.ofNullable(securityGroupArns);
            return this;
        }
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }
        public Builder subnetArns(@Nullable Output<List<String>> subnetArns) {
            this.subnetArns = subnetArns;
            return this;
        }
        public Builder subnetArns(@Nullable List<String> subnetArns) {
            this.subnetArns = Output.ofNullable(subnetArns);
            return this;
        }
        public Builder subnetArns(String... subnetArns) {
            return subnetArns(List.of(subnetArns));
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
        }
        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Output.ofNullable(vpcEndpointId);
            return this;
        }        public AgentState build() {
            return new AgentState(activationKey, arn, ipAddress, name, privateLinkEndpoint, securityGroupArns, subnetArns, tags, tagsAll, vpcEndpointId);
        }
    }
}
