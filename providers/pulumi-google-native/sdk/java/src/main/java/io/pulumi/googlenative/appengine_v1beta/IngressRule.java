// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.appengine_v1beta.IngressRuleArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a firewall rule for the application.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:appengine/v1beta:IngressRule")
public class IngressRule extends io.pulumi.resources.CustomResource {
    /**
     * The action to take on matched requests.
     * 
     */
    @OutputExport(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The action to take on matched requests.
     * 
     */
    public Output<String> getAction() {
        return this.action;
    }
    /**
     * An optional string description of this rule. This field has a maximum length of 400 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional string description of this rule. This field has a maximum length of 400 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
     * 
     */
    @OutputExport(name="sourceRange", type=String.class, parameters={})
    private Output<String> sourceRange;

    /**
     * @return IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32 or 2001:0db8:0000:0042:0000:8a2e:0370:7334. Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
     * 
     */
    public Output<String> getSourceRange() {
        return this.sourceRange;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IngressRule(String name) {
        this(name, IngressRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IngressRule(String name, IngressRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IngressRule(String name, IngressRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1beta:IngressRule", name, args == null ? IngressRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IngressRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1beta:IngressRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static IngressRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IngressRule(name, id, options);
    }
}
