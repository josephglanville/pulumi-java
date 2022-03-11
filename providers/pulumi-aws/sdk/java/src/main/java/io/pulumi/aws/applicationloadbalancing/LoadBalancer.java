// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.applicationloadbalancing.LoadBalancerArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.LoadBalancerState;
import io.pulumi.aws.applicationloadbalancing.outputs.LoadBalancerAccessLogs;
import io.pulumi.aws.applicationloadbalancing.outputs.LoadBalancerSubnetMapping;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Load Balancer resource.
 * 
 * > **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * LBs can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:applicationloadbalancing/loadBalancer:LoadBalancer bar arn:aws:elasticloadbalancing:us-west-2:123456789012:loadbalancer/app/my-load-balancer/50dc6c495c0c9188
 * ```
 * 
 * @Deprecated
 * aws.applicationloadbalancing.LoadBalancer has been deprecated in favor of aws.alb.LoadBalancer
 * 
 */
@Deprecated /* aws.applicationloadbalancing.LoadBalancer has been deprecated in favor of aws.alb.LoadBalancer */
@ResourceType(type="aws:applicationloadbalancing/loadBalancer:LoadBalancer")
public class LoadBalancer extends io.pulumi.resources.CustomResource {
    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @OutputExport(name="accessLogs", type=LoadBalancerAccessLogs.class, parameters={})
    private Output</* @Nullable */ LoadBalancerAccessLogs> accessLogs;

    /**
     * @return An Access Logs block. Access Logs documented below.
     * 
     */
    public Output</* @Nullable */ LoadBalancerAccessLogs> getAccessLogs() {
        return this.accessLogs;
    }
    /**
     * The ARN of the load balancer (matches `id`).
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the load balancer (matches `id`).
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ARN suffix for use with CloudWatch Metrics.
     * 
     */
    @OutputExport(name="arnSuffix", type=String.class, parameters={})
    private Output<String> arnSuffix;

    /**
     * @return The ARN suffix for use with CloudWatch Metrics.
     * 
     */
    public Output<String> getArnSuffix() {
        return this.arnSuffix;
    }
    /**
     * The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    @OutputExport(name="customerOwnedIpv4Pool", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    /**
     * @return The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    public Output</* @Nullable */ String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @OutputExport(name="desyncMitigationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> desyncMitigationMode;

    /**
     * @return Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    public Output</* @Nullable */ String> getDesyncMitigationMode() {
        return this.desyncMitigationMode;
    }
    /**
     * The DNS name of the load balancer.
     * 
     */
    @OutputExport(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of the load balancer.
     * 
     */
    public Output<String> getDnsName() {
        return this.dnsName;
    }
    /**
     * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    @OutputExport(name="dropInvalidHeaderFields", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dropInvalidHeaderFields;

    /**
     * @return Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    public Output</* @Nullable */ Boolean> getDropInvalidHeaderFields() {
        return this.dropInvalidHeaderFields;
    }
    /**
     * If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    @OutputExport(name="enableCrossZoneLoadBalancing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableCrossZoneLoadBalancing;

    /**
     * @return If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableCrossZoneLoadBalancing() {
        return this.enableCrossZoneLoadBalancing;
    }
    /**
     * If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    @OutputExport(name="enableDeletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDeletionProtection;

    /**
     * @return If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableDeletionProtection() {
        return this.enableDeletionProtection;
    }
    /**
     * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
     * 
     */
    @OutputExport(name="enableHttp2", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableHttp2;

    /**
     * @return Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableHttp2() {
        return this.enableHttp2;
    }
    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    @OutputExport(name="enableWafFailOpen", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableWafFailOpen;

    /**
     * @return Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableWafFailOpen() {
        return this.enableWafFailOpen;
    }
    /**
     * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    @OutputExport(name="idleTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeout;

    /**
     * @return The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    public Output</* @Nullable */ Integer> getIdleTimeout() {
        return this.idleTimeout;
    }
    /**
     * If true, the LB will be internal.
     * 
     */
    @OutputExport(name="internal", type=Boolean.class, parameters={})
    private Output<Boolean> internal;

    /**
     * @return If true, the LB will be internal.
     * 
     */
    public Output<Boolean> getInternal() {
        return this.internal;
    }
    /**
     * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    @OutputExport(name="ipAddressType", type=String.class, parameters={})
    private Output<String> ipAddressType;

    /**
     * @return The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    public Output<String> getIpAddressType() {
        return this.ipAddressType;
    }
    /**
     * The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
     * 
     */
    @OutputExport(name="loadBalancerType", type=String.class, parameters={})
    private Output</* @Nullable */ String> loadBalancerType;

    /**
     * @return The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
     * 
     */
    public Output</* @Nullable */ String> getLoadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
     * 
     */
    @OutputExport(name="securityGroups", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroups;

    /**
     * @return A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
     * 
     */
    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * A subnet mapping block as documented below.
     * 
     */
    @OutputExport(name="subnetMappings", type=List.class, parameters={LoadBalancerSubnetMapping.class})
    private Output<List<LoadBalancerSubnetMapping>> subnetMappings;

    /**
     * @return A subnet mapping block as documented below.
     * 
     */
    public Output<List<LoadBalancerSubnetMapping>> getSubnetMappings() {
        return this.subnetMappings;
    }
    /**
     * A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    @OutputExport(name="subnets", type=List.class, parameters={String.class})
    private Output<List<String>> subnets;

    /**
     * @return A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    public Output<List<String>> getSubnets() {
        return this.subnets;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }
    /**
     * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
     * * `subnet_mapping.*.outpost_id` - ID of the Outpost containing the load balancer.
     * 
     */
    @OutputExport(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
     * * `subnet_mapping.*.outpost_id` - ID of the Outpost containing the load balancer.
     * 
     */
    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable LoadBalancerArgs.Builder a);
    }
    private static io.pulumi.aws.applicationloadbalancing.LoadBalancerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.applicationloadbalancing.LoadBalancerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LoadBalancer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(String name, @Nullable LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, @Nullable LoadBalancerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:applicationloadbalancing/loadBalancer:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:applicationloadbalancing/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancer get(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
