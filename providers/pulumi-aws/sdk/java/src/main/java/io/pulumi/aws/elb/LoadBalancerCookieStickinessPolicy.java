// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elb.LoadBalancerCookieStickinessPolicyArgs;
import io.pulumi.aws.elb.inputs.LoadBalancerCookieStickinessPolicyState;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a load balancer cookie stickiness policy, which allows an ELB to control the sticky session lifetime of the browser.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:elb/loadBalancerCookieStickinessPolicy:LoadBalancerCookieStickinessPolicy")
public class LoadBalancerCookieStickinessPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The time period after which
     * the session cookie should be considered stale, expressed in seconds.
     * 
     */
    @Export(name="cookieExpirationPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cookieExpirationPeriod;

    /**
     * @return The time period after which
     * the session cookie should be considered stale, expressed in seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getCookieExpirationPeriod() {
        return this.cookieExpirationPeriod;
    }
    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Export(name="lbPort", type=Integer.class, parameters={})
    private Output<Integer> lbPort;

    /**
     * @return The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    public Output<Integer> getLbPort() {
        return this.lbPort;
    }
    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Export(name="loadBalancer", type=String.class, parameters={})
    private Output<String> loadBalancer;

    /**
     * @return The load balancer to which the policy
     * should be attached.
     * 
     */
    public Output<String> getLoadBalancer() {
        return this.loadBalancer;
    }
    /**
     * The name of the stickiness policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the stickiness policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(LoadBalancerCookieStickinessPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.elb.LoadBalancerCookieStickinessPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elb.LoadBalancerCookieStickinessPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LoadBalancerCookieStickinessPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerCookieStickinessPolicy(String name) {
        this(name, LoadBalancerCookieStickinessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerCookieStickinessPolicy(String name, LoadBalancerCookieStickinessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerCookieStickinessPolicy(String name, LoadBalancerCookieStickinessPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/loadBalancerCookieStickinessPolicy:LoadBalancerCookieStickinessPolicy", name, args == null ? LoadBalancerCookieStickinessPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LoadBalancerCookieStickinessPolicy(String name, Output<String> id, @Nullable LoadBalancerCookieStickinessPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/loadBalancerCookieStickinessPolicy:LoadBalancerCookieStickinessPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancing/loadBalancerCookieStickinessPolicy:LoadBalancerCookieStickinessPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancerCookieStickinessPolicy get(String name, Output<String> id, @Nullable LoadBalancerCookieStickinessPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerCookieStickinessPolicy(name, id, state, options);
    }
}
