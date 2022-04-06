// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverRuleArgs Empty = new ResolverRuleArgs();

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Import(name="resolverEndpointId")
      private final @Nullable Output<String> resolverEndpointId;

    public Output<String> getResolverEndpointId() {
        return this.resolverEndpointId == null ? Output.empty() : this.resolverEndpointId;
    }

    /**
     * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<String> ruleType;

    public Output<String> getRuleType() {
        return this.ruleType;
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
     * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Import(name="targetIps")
      private final @Nullable Output<List<ResolverRuleTargetIpArgs>> targetIps;

    public Output<List<ResolverRuleTargetIpArgs>> getTargetIps() {
        return this.targetIps == null ? Output.empty() : this.targetIps;
    }

    public ResolverRuleArgs(
        Output<String> domainName,
        @Nullable Output<String> name,
        @Nullable Output<String> resolverEndpointId,
        Output<String> ruleType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<ResolverRuleTargetIpArgs>> targetIps) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.name = name;
        this.resolverEndpointId = resolverEndpointId;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.tags = tags;
        this.targetIps = targetIps;
    }

    private ResolverRuleArgs() {
        this.domainName = Output.empty();
        this.name = Output.empty();
        this.resolverEndpointId = Output.empty();
        this.ruleType = Output.empty();
        this.tags = Output.empty();
        this.targetIps = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resolverEndpointId;
        private Output<String> ruleType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<ResolverRuleTargetIpArgs>> targetIps;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.name = defaults.name;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.ruleType = defaults.ruleType;
    	      this.tags = defaults.tags;
    	      this.targetIps = defaults.targetIps;
        }

        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
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
        public Builder resolverEndpointId(@Nullable Output<String> resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }
        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = Output.ofNullable(resolverEndpointId);
            return this;
        }
        public Builder ruleType(Output<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
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
        public Builder targetIps(@Nullable Output<List<ResolverRuleTargetIpArgs>> targetIps) {
            this.targetIps = targetIps;
            return this;
        }
        public Builder targetIps(@Nullable List<ResolverRuleTargetIpArgs> targetIps) {
            this.targetIps = Output.ofNullable(targetIps);
            return this;
        }
        public Builder targetIps(ResolverRuleTargetIpArgs... targetIps) {
            return targetIps(List.of(targetIps));
        }        public ResolverRuleArgs build() {
            return new ResolverRuleArgs(domainName, name, resolverEndpointId, ruleType, tags, targetIps);
        }
    }
}