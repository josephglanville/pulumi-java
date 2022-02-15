// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetResolverRuleAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResolverRuleAssociationArgs Empty = new GetResolverRuleAssociationArgs();

    @InputImport(name="resolverRuleAssociationId", required=true)
    private final String resolverRuleAssociationId;

    public String getResolverRuleAssociationId() {
        return this.resolverRuleAssociationId;
    }

    public GetResolverRuleAssociationArgs(String resolverRuleAssociationId) {
        this.resolverRuleAssociationId = Objects.requireNonNull(resolverRuleAssociationId, "expected parameter 'resolverRuleAssociationId' to be non-null");
    }

    private GetResolverRuleAssociationArgs() {
        this.resolverRuleAssociationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverRuleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resolverRuleAssociationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverRuleAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolverRuleAssociationId = defaults.resolverRuleAssociationId;
        }

        public Builder setResolverRuleAssociationId(String resolverRuleAssociationId) {
            this.resolverRuleAssociationId = Objects.requireNonNull(resolverRuleAssociationId);
            return this;
        }

        public GetResolverRuleAssociationArgs build() {
            return new GetResolverRuleAssociationArgs(resolverRuleAssociationId);
        }
    }
}