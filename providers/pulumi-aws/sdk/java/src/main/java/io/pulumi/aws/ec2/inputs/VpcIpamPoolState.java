// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamPoolState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolState Empty = new VpcIpamPoolState();

    /**
     * The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
     * 
     */
    @Import(name="addressFamily")
      private final @Nullable Output<String> addressFamily;

    public Output<String> getAddressFamily() {
        return this.addressFamily == null ? Output.empty() : this.addressFamily;
    }

    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
     * 
     */
    @Import(name="allocationDefaultNetmaskLength")
      private final @Nullable Output<Integer> allocationDefaultNetmaskLength;

    public Output<Integer> getAllocationDefaultNetmaskLength() {
        return this.allocationDefaultNetmaskLength == null ? Output.empty() : this.allocationDefaultNetmaskLength;
    }

    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    @Import(name="allocationMaxNetmaskLength")
      private final @Nullable Output<Integer> allocationMaxNetmaskLength;

    public Output<Integer> getAllocationMaxNetmaskLength() {
        return this.allocationMaxNetmaskLength == null ? Output.empty() : this.allocationMaxNetmaskLength;
    }

    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    @Import(name="allocationMinNetmaskLength")
      private final @Nullable Output<Integer> allocationMinNetmaskLength;

    public Output<Integer> getAllocationMinNetmaskLength() {
        return this.allocationMinNetmaskLength == null ? Output.empty() : this.allocationMinNetmaskLength;
    }

    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     * 
     */
    @Import(name="allocationResourceTags")
      private final @Nullable Output<Map<String,String>> allocationResourceTags;

    public Output<Map<String,String>> getAllocationResourceTags() {
        return this.allocationResourceTags == null ? Output.empty() : this.allocationResourceTags;
    }

    /**
     * Amazon Resource Name (ARN) of IPAM
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
     * within the CIDR range in the pool.
     * 
     */
    @Import(name="autoImport")
      private final @Nullable Output<Boolean> autoImport;

    public Output<Boolean> getAutoImport() {
        return this.autoImport == null ? Output.empty() : this.autoImport;
    }

    /**
     * Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
     * 
     */
    @Import(name="awsService")
      private final @Nullable Output<String> awsService;

    public Output<String> getAwsService() {
        return this.awsService == null ? Output.empty() : this.awsService;
    }

    /**
     * A description for the IPAM pool.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     * 
     */
    @Import(name="ipamScopeId")
      private final @Nullable Output<String> ipamScopeId;

    public Output<String> getIpamScopeId() {
        return this.ipamScopeId == null ? Output.empty() : this.ipamScopeId;
    }

    @Import(name="ipamScopeType")
      private final @Nullable Output<String> ipamScopeType;

    public Output<String> getIpamScopeType() {
        return this.ipamScopeType == null ? Output.empty() : this.ipamScopeType;
    }

    /**
     * The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
     * 
     */
    @Import(name="locale")
      private final @Nullable Output<String> locale;

    public Output<String> getLocale() {
        return this.locale == null ? Output.empty() : this.locale;
    }

    @Import(name="poolDepth")
      private final @Nullable Output<Integer> poolDepth;

    public Output<Integer> getPoolDepth() {
        return this.poolDepth == null ? Output.empty() : this.poolDepth;
    }

    /**
     * Defines whether or not IPv6 pool space is publicly advertisable over the internet. This option is not available for IPv4 pool space.
     * 
     */
    @Import(name="publiclyAdvertisable")
      private final @Nullable Output<Boolean> publiclyAdvertisable;

    public Output<Boolean> getPubliclyAdvertisable() {
        return this.publiclyAdvertisable == null ? Output.empty() : this.publiclyAdvertisable;
    }

    /**
     * The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
     * 
     */
    @Import(name="sourceIpamPoolId")
      private final @Nullable Output<String> sourceIpamPoolId;

    public Output<String> getSourceIpamPoolId() {
        return this.sourceIpamPoolId == null ? Output.empty() : this.sourceIpamPoolId;
    }

    /**
     * The ID of the IPAM
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public VpcIpamPoolState(
        @Nullable Output<String> addressFamily,
        @Nullable Output<Integer> allocationDefaultNetmaskLength,
        @Nullable Output<Integer> allocationMaxNetmaskLength,
        @Nullable Output<Integer> allocationMinNetmaskLength,
        @Nullable Output<Map<String,String>> allocationResourceTags,
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> autoImport,
        @Nullable Output<String> awsService,
        @Nullable Output<String> description,
        @Nullable Output<String> ipamScopeId,
        @Nullable Output<String> ipamScopeType,
        @Nullable Output<String> locale,
        @Nullable Output<Integer> poolDepth,
        @Nullable Output<Boolean> publiclyAdvertisable,
        @Nullable Output<String> sourceIpamPoolId,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.addressFamily = addressFamily;
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
        this.allocationResourceTags = allocationResourceTags;
        this.arn = arn;
        this.autoImport = autoImport;
        this.awsService = awsService;
        this.description = description;
        this.ipamScopeId = ipamScopeId;
        this.ipamScopeType = ipamScopeType;
        this.locale = locale;
        this.poolDepth = poolDepth;
        this.publiclyAdvertisable = publiclyAdvertisable;
        this.sourceIpamPoolId = sourceIpamPoolId;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcIpamPoolState() {
        this.addressFamily = Output.empty();
        this.allocationDefaultNetmaskLength = Output.empty();
        this.allocationMaxNetmaskLength = Output.empty();
        this.allocationMinNetmaskLength = Output.empty();
        this.allocationResourceTags = Output.empty();
        this.arn = Output.empty();
        this.autoImport = Output.empty();
        this.awsService = Output.empty();
        this.description = Output.empty();
        this.ipamScopeId = Output.empty();
        this.ipamScopeType = Output.empty();
        this.locale = Output.empty();
        this.poolDepth = Output.empty();
        this.publiclyAdvertisable = Output.empty();
        this.sourceIpamPoolId = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addressFamily;
        private @Nullable Output<Integer> allocationDefaultNetmaskLength;
        private @Nullable Output<Integer> allocationMaxNetmaskLength;
        private @Nullable Output<Integer> allocationMinNetmaskLength;
        private @Nullable Output<Map<String,String>> allocationResourceTags;
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> autoImport;
        private @Nullable Output<String> awsService;
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipamScopeId;
        private @Nullable Output<String> ipamScopeType;
        private @Nullable Output<String> locale;
        private @Nullable Output<Integer> poolDepth;
        private @Nullable Output<Boolean> publiclyAdvertisable;
        private @Nullable Output<String> sourceIpamPoolId;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamPoolState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.allocationDefaultNetmaskLength = defaults.allocationDefaultNetmaskLength;
    	      this.allocationMaxNetmaskLength = defaults.allocationMaxNetmaskLength;
    	      this.allocationMinNetmaskLength = defaults.allocationMinNetmaskLength;
    	      this.allocationResourceTags = defaults.allocationResourceTags;
    	      this.arn = defaults.arn;
    	      this.autoImport = defaults.autoImport;
    	      this.awsService = defaults.awsService;
    	      this.description = defaults.description;
    	      this.ipamScopeId = defaults.ipamScopeId;
    	      this.ipamScopeType = defaults.ipamScopeType;
    	      this.locale = defaults.locale;
    	      this.poolDepth = defaults.poolDepth;
    	      this.publiclyAdvertisable = defaults.publiclyAdvertisable;
    	      this.sourceIpamPoolId = defaults.sourceIpamPoolId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder addressFamily(@Nullable Output<String> addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public Builder addressFamily(@Nullable String addressFamily) {
            this.addressFamily = Output.ofNullable(addressFamily);
            return this;
        }
        public Builder allocationDefaultNetmaskLength(@Nullable Output<Integer> allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            return this;
        }
        public Builder allocationDefaultNetmaskLength(@Nullable Integer allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = Output.ofNullable(allocationDefaultNetmaskLength);
            return this;
        }
        public Builder allocationMaxNetmaskLength(@Nullable Output<Integer> allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
            return this;
        }
        public Builder allocationMaxNetmaskLength(@Nullable Integer allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = Output.ofNullable(allocationMaxNetmaskLength);
            return this;
        }
        public Builder allocationMinNetmaskLength(@Nullable Output<Integer> allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = allocationMinNetmaskLength;
            return this;
        }
        public Builder allocationMinNetmaskLength(@Nullable Integer allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = Output.ofNullable(allocationMinNetmaskLength);
            return this;
        }
        public Builder allocationResourceTags(@Nullable Output<Map<String,String>> allocationResourceTags) {
            this.allocationResourceTags = allocationResourceTags;
            return this;
        }
        public Builder allocationResourceTags(@Nullable Map<String,String> allocationResourceTags) {
            this.allocationResourceTags = Output.ofNullable(allocationResourceTags);
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
        public Builder autoImport(@Nullable Output<Boolean> autoImport) {
            this.autoImport = autoImport;
            return this;
        }
        public Builder autoImport(@Nullable Boolean autoImport) {
            this.autoImport = Output.ofNullable(autoImport);
            return this;
        }
        public Builder awsService(@Nullable Output<String> awsService) {
            this.awsService = awsService;
            return this;
        }
        public Builder awsService(@Nullable String awsService) {
            this.awsService = Output.ofNullable(awsService);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder ipamScopeId(@Nullable Output<String> ipamScopeId) {
            this.ipamScopeId = ipamScopeId;
            return this;
        }
        public Builder ipamScopeId(@Nullable String ipamScopeId) {
            this.ipamScopeId = Output.ofNullable(ipamScopeId);
            return this;
        }
        public Builder ipamScopeType(@Nullable Output<String> ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }
        public Builder ipamScopeType(@Nullable String ipamScopeType) {
            this.ipamScopeType = Output.ofNullable(ipamScopeType);
            return this;
        }
        public Builder locale(@Nullable Output<String> locale) {
            this.locale = locale;
            return this;
        }
        public Builder locale(@Nullable String locale) {
            this.locale = Output.ofNullable(locale);
            return this;
        }
        public Builder poolDepth(@Nullable Output<Integer> poolDepth) {
            this.poolDepth = poolDepth;
            return this;
        }
        public Builder poolDepth(@Nullable Integer poolDepth) {
            this.poolDepth = Output.ofNullable(poolDepth);
            return this;
        }
        public Builder publiclyAdvertisable(@Nullable Output<Boolean> publiclyAdvertisable) {
            this.publiclyAdvertisable = publiclyAdvertisable;
            return this;
        }
        public Builder publiclyAdvertisable(@Nullable Boolean publiclyAdvertisable) {
            this.publiclyAdvertisable = Output.ofNullable(publiclyAdvertisable);
            return this;
        }
        public Builder sourceIpamPoolId(@Nullable Output<String> sourceIpamPoolId) {
            this.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }
        public Builder sourceIpamPoolId(@Nullable String sourceIpamPoolId) {
            this.sourceIpamPoolId = Output.ofNullable(sourceIpamPoolId);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
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
        }        public VpcIpamPoolState build() {
            return new VpcIpamPoolState(addressFamily, allocationDefaultNetmaskLength, allocationMaxNetmaskLength, allocationMinNetmaskLength, allocationResourceTags, arn, autoImport, awsService, description, ipamScopeId, ipamScopeType, locale, poolDepth, publiclyAdvertisable, sourceIpamPoolId, state, tags, tagsAll);
        }
    }
}
