// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.ResolverRuleArgs;
import io.pulumi.awsnative.route53resolver.enums.ResolverRuleRuleType;
import io.pulumi.awsnative.route53resolver.outputs.ResolverRuleTag;
import io.pulumi.awsnative.route53resolver.outputs.ResolverRuleTargetAddress;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Route53Resolver::ResolverRule
 * 
 */
@ResourceType(type="aws-native:route53resolver:ResolverRule")
public class ResolverRule extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the resolver rule.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the resolver rule.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The name for the Resolver rule
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name for the Resolver rule
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    @Export(name="resolverEndpointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resolverEndpointId;

    /**
     * @return The ID of the endpoint that the rule is associated with.
     * 
     */
    public Output</* @Nullable */ String> getResolverEndpointId() {
        return this.resolverEndpointId;
    }
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    @Export(name="resolverRuleId", type=String.class, parameters={})
    private Output<String> resolverRuleId;

    /**
     * @return The ID of the endpoint that the rule is associated with.
     * 
     */
    public Output<String> getResolverRuleId() {
        return this.resolverRuleId;
    }
    /**
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM.
     * 
     */
    @Export(name="ruleType", type=ResolverRuleRuleType.class, parameters={})
    private Output<ResolverRuleRuleType> ruleType;

    /**
     * @return When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM.
     * 
     */
    public Output<ResolverRuleRuleType> getRuleType() {
        return this.ruleType;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ResolverRuleTag.class})
    private Output</* @Nullable */ List<ResolverRuleTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ResolverRuleTag>> getTags() {
        return this.tags;
    }
    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
     */
    @Export(name="targetIps", type=List.class, parameters={ResolverRuleTargetAddress.class})
    private Output</* @Nullable */ List<ResolverRuleTargetAddress>> targetIps;

    /**
     * @return An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
     */
    public Output</* @Nullable */ List<ResolverRuleTargetAddress>> getTargetIps() {
        return this.targetIps;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverRule(String name) {
        this(name, ResolverRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverRule(String name, ResolverRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverRule(String name, ResolverRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverRule", name, args == null ? ResolverRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResolverRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverRule(name, id, options);
    }
}
