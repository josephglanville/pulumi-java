// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultVpcDhcpOptionsState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultVpcDhcpOptionsState Empty = new DefaultVpcDhcpOptionsState();

    /**
     * The ARN of the DHCP Options Set.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    @Import(name="domainNameServers")
      private final @Nullable Output<String> domainNameServers;

    public Output<String> getDomainNameServers() {
        return this.domainNameServers == null ? Output.empty() : this.domainNameServers;
    }

    /**
     * List of NETBIOS name servers.
     * 
     */
    @Import(name="netbiosNameServers")
      private final @Nullable Output<List<String>> netbiosNameServers;

    public Output<List<String>> getNetbiosNameServers() {
        return this.netbiosNameServers == null ? Output.empty() : this.netbiosNameServers;
    }

    /**
     * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    @Import(name="netbiosNodeType")
      private final @Nullable Output<String> netbiosNodeType;

    public Output<String> getNetbiosNodeType() {
        return this.netbiosNodeType == null ? Output.empty() : this.netbiosNodeType;
    }

    @Import(name="ntpServers")
      private final @Nullable Output<String> ntpServers;

    public Output<String> getNtpServers() {
        return this.ntpServers == null ? Output.empty() : this.ntpServers;
    }

    /**
     * The ID of the AWS account that owns the DHCP options set.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public DefaultVpcDhcpOptionsState(
        @Nullable Output<String> arn,
        @Nullable Output<String> domainName,
        @Nullable Output<String> domainNameServers,
        @Nullable Output<List<String>> netbiosNameServers,
        @Nullable Output<String> netbiosNodeType,
        @Nullable Output<String> ntpServers,
        @Nullable Output<String> ownerId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.domainName = domainName;
        this.domainNameServers = domainNameServers;
        this.netbiosNameServers = netbiosNameServers;
        this.netbiosNodeType = netbiosNodeType;
        this.ntpServers = ntpServers;
        this.ownerId = ownerId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DefaultVpcDhcpOptionsState() {
        this.arn = Output.empty();
        this.domainName = Output.empty();
        this.domainNameServers = Output.empty();
        this.netbiosNameServers = Output.empty();
        this.netbiosNodeType = Output.empty();
        this.ntpServers = Output.empty();
        this.ownerId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultVpcDhcpOptionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> domainName;
        private @Nullable Output<String> domainNameServers;
        private @Nullable Output<List<String>> netbiosNameServers;
        private @Nullable Output<String> netbiosNodeType;
        private @Nullable Output<String> ntpServers;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultVpcDhcpOptionsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domainName = defaults.domainName;
    	      this.domainNameServers = defaults.domainNameServers;
    	      this.netbiosNameServers = defaults.netbiosNameServers;
    	      this.netbiosNodeType = defaults.netbiosNodeType;
    	      this.ntpServers = defaults.ntpServers;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Output.ofNullable(domainName);
            return this;
        }
        public Builder domainNameServers(@Nullable Output<String> domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public Builder domainNameServers(@Nullable String domainNameServers) {
            this.domainNameServers = Output.ofNullable(domainNameServers);
            return this;
        }
        public Builder netbiosNameServers(@Nullable Output<List<String>> netbiosNameServers) {
            this.netbiosNameServers = netbiosNameServers;
            return this;
        }
        public Builder netbiosNameServers(@Nullable List<String> netbiosNameServers) {
            this.netbiosNameServers = Output.ofNullable(netbiosNameServers);
            return this;
        }
        public Builder netbiosNameServers(String... netbiosNameServers) {
            return netbiosNameServers(List.of(netbiosNameServers));
        }
        public Builder netbiosNodeType(@Nullable Output<String> netbiosNodeType) {
            this.netbiosNodeType = netbiosNodeType;
            return this;
        }
        public Builder netbiosNodeType(@Nullable String netbiosNodeType) {
            this.netbiosNodeType = Output.ofNullable(netbiosNodeType);
            return this;
        }
        public Builder ntpServers(@Nullable Output<String> ntpServers) {
            this.ntpServers = ntpServers;
            return this;
        }
        public Builder ntpServers(@Nullable String ntpServers) {
            this.ntpServers = Output.ofNullable(ntpServers);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
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
        }        public DefaultVpcDhcpOptionsState build() {
            return new DefaultVpcDhcpOptionsState(arn, domainName, domainNameServers, netbiosNameServers, netbiosNodeType, ntpServers, ownerId, tags, tagsAll);
        }
    }
}