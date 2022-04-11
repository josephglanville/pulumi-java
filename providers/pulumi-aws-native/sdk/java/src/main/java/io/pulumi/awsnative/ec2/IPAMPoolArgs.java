// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.IPAMPoolProvisionedCidrArgs;
import io.pulumi.awsnative.ec2.inputs.IPAMPoolTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IPAMPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAMPoolArgs Empty = new IPAMPoolArgs();

    /**
     * The address family of the address space in this pool. Either IPv4 or IPv6.
     * 
     */
    @Import(name="addressFamily", required=true)
      private final Output<String> addressFamily;

    public Output<String> getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn't specified.
     * 
     */
    @Import(name="allocationDefaultNetmaskLength")
      private final @Nullable Output<Integer> allocationDefaultNetmaskLength;

    public Output<Integer> getAllocationDefaultNetmaskLength() {
        return this.allocationDefaultNetmaskLength == null ? Codegen.empty() : this.allocationDefaultNetmaskLength;
    }

    /**
     * The maximum allowed netmask length for allocations made from this pool.
     * 
     */
    @Import(name="allocationMaxNetmaskLength")
      private final @Nullable Output<Integer> allocationMaxNetmaskLength;

    public Output<Integer> getAllocationMaxNetmaskLength() {
        return this.allocationMaxNetmaskLength == null ? Codegen.empty() : this.allocationMaxNetmaskLength;
    }

    /**
     * The minimum allowed netmask length for allocations made from this pool.
     * 
     */
    @Import(name="allocationMinNetmaskLength")
      private final @Nullable Output<Integer> allocationMinNetmaskLength;

    public Output<Integer> getAllocationMinNetmaskLength() {
        return this.allocationMinNetmaskLength == null ? Codegen.empty() : this.allocationMinNetmaskLength;
    }

    /**
     * When specified, an allocation will not be allowed unless a resource has a matching set of tags.
     * 
     */
    @Import(name="allocationResourceTags")
      private final @Nullable Output<List<IPAMPoolTagArgs>> allocationResourceTags;

    public Output<List<IPAMPoolTagArgs>> getAllocationResourceTags() {
        return this.allocationResourceTags == null ? Codegen.empty() : this.allocationResourceTags;
    }

    /**
     * Determines what to do if IPAM discovers resources that haven't been assigned an allocation. If set to true, an allocation will be made automatically.
     * 
     */
    @Import(name="autoImport")
      private final @Nullable Output<Boolean> autoImport;

    public Output<Boolean> getAutoImport() {
        return this.autoImport == null ? Codegen.empty() : this.autoImport;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The Id of the scope this pool is a part of.
     * 
     */
    @Import(name="ipamScopeId", required=true)
      private final Output<String> ipamScopeId;

    public Output<String> getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * The region of this pool. If not set, this will default to "None" which will disable non-custom allocations. If the locale has been specified for the source pool, this value must match.
     * 
     */
    @Import(name="locale")
      private final @Nullable Output<String> locale;

    public Output<String> getLocale() {
        return this.locale == null ? Codegen.empty() : this.locale;
    }

    /**
     * A list of cidrs representing the address space available for allocation in this pool.
     * 
     */
    @Import(name="provisionedCidrs")
      private final @Nullable Output<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs;

    public Output<List<IPAMPoolProvisionedCidrArgs>> getProvisionedCidrs() {
        return this.provisionedCidrs == null ? Codegen.empty() : this.provisionedCidrs;
    }

    /**
     * Determines whether or not address space from this pool is publicly advertised. Must be set if and only if the pool is IPv6.
     * 
     */
    @Import(name="publiclyAdvertisable")
      private final @Nullable Output<Boolean> publiclyAdvertisable;

    public Output<Boolean> getPubliclyAdvertisable() {
        return this.publiclyAdvertisable == null ? Codegen.empty() : this.publiclyAdvertisable;
    }

    /**
     * The Id of this pool's source. If set, all space provisioned in this pool must be free space provisioned in the parent pool.
     * 
     */
    @Import(name="sourceIpamPoolId")
      private final @Nullable Output<String> sourceIpamPoolId;

    public Output<String> getSourceIpamPoolId() {
        return this.sourceIpamPoolId == null ? Codegen.empty() : this.sourceIpamPoolId;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<IPAMPoolTagArgs>> tags;

    public Output<List<IPAMPoolTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public IPAMPoolArgs(
        Output<String> addressFamily,
        @Nullable Output<Integer> allocationDefaultNetmaskLength,
        @Nullable Output<Integer> allocationMaxNetmaskLength,
        @Nullable Output<Integer> allocationMinNetmaskLength,
        @Nullable Output<List<IPAMPoolTagArgs>> allocationResourceTags,
        @Nullable Output<Boolean> autoImport,
        @Nullable Output<String> description,
        Output<String> ipamScopeId,
        @Nullable Output<String> locale,
        @Nullable Output<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs,
        @Nullable Output<Boolean> publiclyAdvertisable,
        @Nullable Output<String> sourceIpamPoolId,
        @Nullable Output<List<IPAMPoolTagArgs>> tags) {
        this.addressFamily = Objects.requireNonNull(addressFamily, "expected parameter 'addressFamily' to be non-null");
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
        this.allocationResourceTags = allocationResourceTags;
        this.autoImport = autoImport;
        this.description = description;
        this.ipamScopeId = Objects.requireNonNull(ipamScopeId, "expected parameter 'ipamScopeId' to be non-null");
        this.locale = locale;
        this.provisionedCidrs = provisionedCidrs;
        this.publiclyAdvertisable = publiclyAdvertisable;
        this.sourceIpamPoolId = sourceIpamPoolId;
        this.tags = tags;
    }

    private IPAMPoolArgs() {
        this.addressFamily = Codegen.empty();
        this.allocationDefaultNetmaskLength = Codegen.empty();
        this.allocationMaxNetmaskLength = Codegen.empty();
        this.allocationMinNetmaskLength = Codegen.empty();
        this.allocationResourceTags = Codegen.empty();
        this.autoImport = Codegen.empty();
        this.description = Codegen.empty();
        this.ipamScopeId = Codegen.empty();
        this.locale = Codegen.empty();
        this.provisionedCidrs = Codegen.empty();
        this.publiclyAdvertisable = Codegen.empty();
        this.sourceIpamPoolId = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> addressFamily;
        private @Nullable Output<Integer> allocationDefaultNetmaskLength;
        private @Nullable Output<Integer> allocationMaxNetmaskLength;
        private @Nullable Output<Integer> allocationMinNetmaskLength;
        private @Nullable Output<List<IPAMPoolTagArgs>> allocationResourceTags;
        private @Nullable Output<Boolean> autoImport;
        private @Nullable Output<String> description;
        private Output<String> ipamScopeId;
        private @Nullable Output<String> locale;
        private @Nullable Output<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs;
        private @Nullable Output<Boolean> publiclyAdvertisable;
        private @Nullable Output<String> sourceIpamPoolId;
        private @Nullable Output<List<IPAMPoolTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.allocationDefaultNetmaskLength = defaults.allocationDefaultNetmaskLength;
    	      this.allocationMaxNetmaskLength = defaults.allocationMaxNetmaskLength;
    	      this.allocationMinNetmaskLength = defaults.allocationMinNetmaskLength;
    	      this.allocationResourceTags = defaults.allocationResourceTags;
    	      this.autoImport = defaults.autoImport;
    	      this.description = defaults.description;
    	      this.ipamScopeId = defaults.ipamScopeId;
    	      this.locale = defaults.locale;
    	      this.provisionedCidrs = defaults.provisionedCidrs;
    	      this.publiclyAdvertisable = defaults.publiclyAdvertisable;
    	      this.sourceIpamPoolId = defaults.sourceIpamPoolId;
    	      this.tags = defaults.tags;
        }

        public Builder addressFamily(Output<String> addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }
        public Builder addressFamily(String addressFamily) {
            this.addressFamily = Output.of(Objects.requireNonNull(addressFamily));
            return this;
        }
        public Builder allocationDefaultNetmaskLength(@Nullable Output<Integer> allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            return this;
        }
        public Builder allocationDefaultNetmaskLength(@Nullable Integer allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = Codegen.ofNullable(allocationDefaultNetmaskLength);
            return this;
        }
        public Builder allocationMaxNetmaskLength(@Nullable Output<Integer> allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
            return this;
        }
        public Builder allocationMaxNetmaskLength(@Nullable Integer allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = Codegen.ofNullable(allocationMaxNetmaskLength);
            return this;
        }
        public Builder allocationMinNetmaskLength(@Nullable Output<Integer> allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = allocationMinNetmaskLength;
            return this;
        }
        public Builder allocationMinNetmaskLength(@Nullable Integer allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = Codegen.ofNullable(allocationMinNetmaskLength);
            return this;
        }
        public Builder allocationResourceTags(@Nullable Output<List<IPAMPoolTagArgs>> allocationResourceTags) {
            this.allocationResourceTags = allocationResourceTags;
            return this;
        }
        public Builder allocationResourceTags(@Nullable List<IPAMPoolTagArgs> allocationResourceTags) {
            this.allocationResourceTags = Codegen.ofNullable(allocationResourceTags);
            return this;
        }
        public Builder allocationResourceTags(IPAMPoolTagArgs... allocationResourceTags) {
            return allocationResourceTags(List.of(allocationResourceTags));
        }
        public Builder autoImport(@Nullable Output<Boolean> autoImport) {
            this.autoImport = autoImport;
            return this;
        }
        public Builder autoImport(@Nullable Boolean autoImport) {
            this.autoImport = Codegen.ofNullable(autoImport);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipamScopeId(Output<String> ipamScopeId) {
            this.ipamScopeId = Objects.requireNonNull(ipamScopeId);
            return this;
        }
        public Builder ipamScopeId(String ipamScopeId) {
            this.ipamScopeId = Output.of(Objects.requireNonNull(ipamScopeId));
            return this;
        }
        public Builder locale(@Nullable Output<String> locale) {
            this.locale = locale;
            return this;
        }
        public Builder locale(@Nullable String locale) {
            this.locale = Codegen.ofNullable(locale);
            return this;
        }
        public Builder provisionedCidrs(@Nullable Output<List<IPAMPoolProvisionedCidrArgs>> provisionedCidrs) {
            this.provisionedCidrs = provisionedCidrs;
            return this;
        }
        public Builder provisionedCidrs(@Nullable List<IPAMPoolProvisionedCidrArgs> provisionedCidrs) {
            this.provisionedCidrs = Codegen.ofNullable(provisionedCidrs);
            return this;
        }
        public Builder provisionedCidrs(IPAMPoolProvisionedCidrArgs... provisionedCidrs) {
            return provisionedCidrs(List.of(provisionedCidrs));
        }
        public Builder publiclyAdvertisable(@Nullable Output<Boolean> publiclyAdvertisable) {
            this.publiclyAdvertisable = publiclyAdvertisable;
            return this;
        }
        public Builder publiclyAdvertisable(@Nullable Boolean publiclyAdvertisable) {
            this.publiclyAdvertisable = Codegen.ofNullable(publiclyAdvertisable);
            return this;
        }
        public Builder sourceIpamPoolId(@Nullable Output<String> sourceIpamPoolId) {
            this.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }
        public Builder sourceIpamPoolId(@Nullable String sourceIpamPoolId) {
            this.sourceIpamPoolId = Codegen.ofNullable(sourceIpamPoolId);
            return this;
        }
        public Builder tags(@Nullable Output<List<IPAMPoolTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<IPAMPoolTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(IPAMPoolTagArgs... tags) {
            return tags(List.of(tags));
        }        public IPAMPoolArgs build() {
            return new IPAMPoolArgs(addressFamily, allocationDefaultNetmaskLength, allocationMaxNetmaskLength, allocationMinNetmaskLength, allocationResourceTags, autoImport, description, ipamScopeId, locale, provisionedCidrs, publiclyAdvertisable, sourceIpamPoolId, tags);
        }
    }
}
