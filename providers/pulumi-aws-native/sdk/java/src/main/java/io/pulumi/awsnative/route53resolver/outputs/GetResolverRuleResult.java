// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.outputs.ResolverRuleTag;
import io.pulumi.awsnative.route53resolver.outputs.ResolverRuleTargetAddress;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResolverRuleResult {
    /**
     * The Amazon Resource Name (ARN) of the resolver rule.
     * 
     */
    private final @Nullable String arn;
    /**
     * The name for the Resolver rule
     * 
     */
    private final @Nullable String name;
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    private final @Nullable String resolverEndpointId;
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    private final @Nullable String resolverRuleId;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<ResolverRuleTag> tags;
    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
     */
    private final @Nullable List<ResolverRuleTargetAddress> targetIps;

    @CustomType.Constructor
    private GetResolverRuleResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("resolverEndpointId") @Nullable String resolverEndpointId,
        @CustomType.Parameter("resolverRuleId") @Nullable String resolverRuleId,
        @CustomType.Parameter("tags") @Nullable List<ResolverRuleTag> tags,
        @CustomType.Parameter("targetIps") @Nullable List<ResolverRuleTargetAddress> targetIps) {
        this.arn = arn;
        this.name = name;
        this.resolverEndpointId = resolverEndpointId;
        this.resolverRuleId = resolverRuleId;
        this.tags = tags;
        this.targetIps = targetIps;
    }

    /**
     * The Amazon Resource Name (ARN) of the resolver rule.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The name for the Resolver rule
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
    */
    public Optional<String> getResolverEndpointId() {
        return Optional.ofNullable(this.resolverEndpointId);
    }
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
    */
    public Optional<String> getResolverRuleId() {
        return Optional.ofNullable(this.resolverRuleId);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<ResolverRuleTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
    */
    public List<ResolverRuleTargetAddress> getTargetIps() {
        return this.targetIps == null ? List.of() : this.targetIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private @Nullable String resolverEndpointId;
        private @Nullable String resolverRuleId;
        private @Nullable List<ResolverRuleTag> tags;
        private @Nullable List<ResolverRuleTargetAddress> targetIps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.resolverRuleId = defaults.resolverRuleId;
    	      this.tags = defaults.tags;
    	      this.targetIps = defaults.targetIps;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }
        public Builder resolverRuleId(@Nullable String resolverRuleId) {
            this.resolverRuleId = resolverRuleId;
            return this;
        }
        public Builder tags(@Nullable List<ResolverRuleTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ResolverRuleTag... tags) {
            return tags(List.of(tags));
        }
        public Builder targetIps(@Nullable List<ResolverRuleTargetAddress> targetIps) {
            this.targetIps = targetIps;
            return this;
        }
        public Builder targetIps(ResolverRuleTargetAddress... targetIps) {
            return targetIps(List.of(targetIps));
        }        public GetResolverRuleResult build() {
            return new GetResolverRuleResult(arn, name, resolverEndpointId, resolverRuleId, tags, targetIps);
        }
    }
}
