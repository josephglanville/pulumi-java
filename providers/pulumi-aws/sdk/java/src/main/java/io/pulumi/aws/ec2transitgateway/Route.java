// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.RouteArgs;
import io.pulumi.aws.ec2transitgateway.inputs.RouteState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway Route.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway_route` can be imported by using the EC2 Transit Gateway Route Table, an underscore, and the destination, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/route:Route example tgw-rtb-12345678_0.0.0.0/0
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/route:Route")
public class Route extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    @OutputExport(name="blackhole", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> blackhole;

    /**
     * @return Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    public Output</* @Nullable */ Boolean> getBlackhole() {
        return this.blackhole;
    }
    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @OutputExport(name="destinationCidrBlock", type=String.class, parameters={})
    private Output<String> destinationCidrBlock;

    /**
     * @return IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    public Output<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    @OutputExport(name="transitGatewayAttachmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitGatewayAttachmentId;

    /**
     * @return Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    public Output</* @Nullable */ String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    @OutputExport(name="transitGatewayRouteTableId", type=String.class, parameters={})
    private Output<String> transitGatewayRouteTableId;

    /**
     * @return Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    public Output<String> getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    public interface BuilderApplicator {
        public void apply(RouteArgs.Builder a);
    }
    private static io.pulumi.aws.ec2transitgateway.RouteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2transitgateway.RouteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Route(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/route:Route", name, state, makeResourceOptions(options, id));
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
    public static Route get(String name, Output<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
