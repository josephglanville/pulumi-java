// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elb.LoadBalancerArgs;
import io.pulumi.aws.elb.inputs.LoadBalancerState;
import io.pulumi.aws.elb.outputs.LoadBalancerAccessLogs;
import io.pulumi.aws.elb.outputs.LoadBalancerHealthCheck;
import io.pulumi.aws.elb.outputs.LoadBalancerListener;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Load Balancer resource, also known as a "Classic
 * Load Balancer" after the release of
 * `Application/Network Load Balancers`.
 * 
 * > **NOTE on ELB Instances and ELB Attachments:** This provider currently
 * provides both a standalone ELB Attachment resource
 * (describing an instance attached to an ELB), and an ELB resource with
 * `instances` defined in-line. At this time you cannot use an ELB with in-line
 * instances in conjunction with a ELB Attachment resources. Doing so will cause a
 * conflict and will overwrite attachments.
 * 
 * ## Example Usage
 * ## Note on ECDSA Key Algorithm
 * 
 * If the ARN of the `ssl_certificate_id` that is pointed to references a
 * certificate that was signed by an ECDSA key, note that ELB only supports the
 * P256 and P384 curves.  Using a certificate signed by a key using a different
 * curve could produce the error `ERR_SSL_VERSION_OR_CIPHER_MISMATCH` in your
 * browser.
 * 
 * ## Import
 * 
 * ELBs can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elb/loadBalancer:LoadBalancer bar elb-production-12345
 * ```
 * 
 */
@ResourceType(type="aws:elb/loadBalancer:LoadBalancer")
public class LoadBalancer extends io.pulumi.resources.CustomResource {
    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @Export(name="accessLogs", type=LoadBalancerAccessLogs.class, parameters={})
    private Output</* @Nullable */ LoadBalancerAccessLogs> accessLogs;

    /**
     * @return An Access Logs block. Access Logs documented below.
     * 
     */
    public Output</* @Nullable */ LoadBalancerAccessLogs> getAccessLogs() {
        return this.accessLogs;
    }
    /**
     * The ARN of the ELB
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the ELB
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The AZ's to serve traffic in.
     * 
     */
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    /**
     * @return The AZ's to serve traffic in.
     * 
     */
    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * Boolean to enable connection draining. Default: `false`
     * 
     */
    @Export(name="connectionDraining", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> connectionDraining;

    /**
     * @return Boolean to enable connection draining. Default: `false`
     * 
     */
    public Output</* @Nullable */ Boolean> getConnectionDraining() {
        return this.connectionDraining;
    }
    /**
     * The time in seconds to allow for connections to drain. Default: `300`
     * 
     */
    @Export(name="connectionDrainingTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> connectionDrainingTimeout;

    /**
     * @return The time in seconds to allow for connections to drain. Default: `300`
     * 
     */
    public Output</* @Nullable */ Integer> getConnectionDrainingTimeout() {
        return this.connectionDrainingTimeout;
    }
    /**
     * Enable cross-zone load balancing. Default: `true`
     * 
     */
    @Export(name="crossZoneLoadBalancing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> crossZoneLoadBalancing;

    /**
     * @return Enable cross-zone load balancing. Default: `true`
     * 
     */
    public Output</* @Nullable */ Boolean> getCrossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing;
    }
    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @Export(name="desyncMitigationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> desyncMitigationMode;

    /**
     * @return Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    public Output</* @Nullable */ String> getDesyncMitigationMode() {
        return this.desyncMitigationMode;
    }
    /**
     * The DNS name of the ELB
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of the ELB
     * 
     */
    public Output<String> getDnsName() {
        return this.dnsName;
    }
    /**
     * A health_check block. Health Check documented below.
     * 
     */
    @Export(name="healthCheck", type=LoadBalancerHealthCheck.class, parameters={})
    private Output<LoadBalancerHealthCheck> healthCheck;

    /**
     * @return A health_check block. Health Check documented below.
     * 
     */
    public Output<LoadBalancerHealthCheck> getHealthCheck() {
        return this.healthCheck;
    }
    /**
     * The time in seconds that the connection is allowed to be idle. Default: `60`
     * 
     */
    @Export(name="idleTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeout;

    /**
     * @return The time in seconds that the connection is allowed to be idle. Default: `60`
     * 
     */
    public Output</* @Nullable */ Integer> getIdleTimeout() {
        return this.idleTimeout;
    }
    /**
     * A list of instance ids to place in the ELB pool.
     * 
     */
    @Export(name="instances", type=List.class, parameters={String.class})
    private Output<List<String>> instances;

    /**
     * @return A list of instance ids to place in the ELB pool.
     * 
     */
    public Output<List<String>> getInstances() {
        return this.instances;
    }
    /**
     * If true, ELB will be an internal ELB.
     * 
     */
    @Export(name="internal", type=Boolean.class, parameters={})
    private Output<Boolean> internal;

    /**
     * @return If true, ELB will be an internal ELB.
     * 
     */
    public Output<Boolean> getInternal() {
        return this.internal;
    }
    /**
     * A list of listener blocks. Listeners documented below.
     * 
     */
    @Export(name="listeners", type=List.class, parameters={LoadBalancerListener.class})
    private Output<List<LoadBalancerListener>> listeners;

    /**
     * @return A list of listener blocks. Listeners documented below.
     * 
     */
    public Output<List<LoadBalancerListener>> getListeners() {
        return this.listeners;
    }
    /**
     * The name of the ELB. By default generated by this provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ELB. By default generated by this provider.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * A list of security group IDs to assign to the ELB.
     * Only valid if creating an ELB within a VPC
     * 
     */
    @Export(name="securityGroups", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroups;

    /**
     * @return A list of security group IDs to assign to the ELB.
     * Only valid if creating an ELB within a VPC
     * 
     */
    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * The name of the security group that you can use as
     * part of your inbound rules for your load balancer's back-end application
     * instances. Use this for Classic or Default VPC only.
     * 
     */
    @Export(name="sourceSecurityGroup", type=String.class, parameters={})
    private Output<String> sourceSecurityGroup;

    /**
     * @return The name of the security group that you can use as
     * part of your inbound rules for your load balancer's back-end application
     * instances. Use this for Classic or Default VPC only.
     * 
     */
    public Output<String> getSourceSecurityGroup() {
        return this.sourceSecurityGroup;
    }
    /**
     * The ID of the security group that you can use as
     * part of your inbound rules for your load balancer's back-end application
     * instances. Only available on ELBs launched in a VPC.
     * 
     */
    @Export(name="sourceSecurityGroupId", type=String.class, parameters={})
    private Output<String> sourceSecurityGroupId;

    /**
     * @return The ID of the security group that you can use as
     * part of your inbound rules for your load balancer's back-end application
     * instances. Only available on ELBs launched in a VPC.
     * 
     */
    public Output<String> getSourceSecurityGroupId() {
        return this.sourceSecurityGroupId;
    }
    /**
     * A list of subnet IDs to attach to the ELB.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={String.class})
    private Output<List<String>> subnets;

    /**
     * @return A list of subnet IDs to attach to the ELB.
     * 
     */
    public Output<List<String>> getSubnets() {
        return this.subnets;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
     * 
     */
    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public interface BuilderApplicator {
        public void apply(LoadBalancerArgs.Builder a);
    }
    private static io.pulumi.aws.elb.LoadBalancerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elb.LoadBalancerArgs.builder();
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
    public LoadBalancer(String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, LoadBalancerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/loadBalancer:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancing/loadBalancer:LoadBalancer").build())
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
    public static LoadBalancer get(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
